# coding: utf-8

"""
    lakeFS API

    lakeFS HTTP API  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from lakefs_client import schemas  # noqa: F401


class ActionRun(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "start_time",
            "event_type",
            "run_id",
            "branch",
            "commit_id",
            "status",
        }
        
        class properties:
            run_id = schemas.StrSchema
            branch = schemas.StrSchema
            start_time = schemas.DateTimeSchema
            event_type = schemas.StrSchema
            
            
            class status(
                schemas.EnumBase,
                schemas.StrSchema
            ):
                
                @schemas.classproperty
                def FAILED(cls):
                    return cls("failed")
                
                @schemas.classproperty
                def COMPLETED(cls):
                    return cls("completed")
            commit_id = schemas.StrSchema
            end_time = schemas.DateTimeSchema
            __annotations__ = {
                "run_id": run_id,
                "branch": branch,
                "start_time": start_time,
                "event_type": event_type,
                "status": status,
                "commit_id": commit_id,
                "end_time": end_time,
            }
    
    start_time: MetaOapg.properties.start_time
    event_type: MetaOapg.properties.event_type
    run_id: MetaOapg.properties.run_id
    branch: MetaOapg.properties.branch
    commit_id: MetaOapg.properties.commit_id
    status: MetaOapg.properties.status
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["run_id"]) -> MetaOapg.properties.run_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["branch"]) -> MetaOapg.properties.branch: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["start_time"]) -> MetaOapg.properties.start_time: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["event_type"]) -> MetaOapg.properties.event_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["commit_id"]) -> MetaOapg.properties.commit_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["end_time"]) -> MetaOapg.properties.end_time: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["run_id", "branch", "start_time", "event_type", "status", "commit_id", "end_time", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["run_id"]) -> MetaOapg.properties.run_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["branch"]) -> MetaOapg.properties.branch: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["start_time"]) -> MetaOapg.properties.start_time: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["event_type"]) -> MetaOapg.properties.event_type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["commit_id"]) -> MetaOapg.properties.commit_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["end_time"]) -> typing.Union[MetaOapg.properties.end_time, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["run_id", "branch", "start_time", "event_type", "status", "commit_id", "end_time", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        start_time: typing.Union[MetaOapg.properties.start_time, str, datetime, ],
        event_type: typing.Union[MetaOapg.properties.event_type, str, ],
        run_id: typing.Union[MetaOapg.properties.run_id, str, ],
        branch: typing.Union[MetaOapg.properties.branch, str, ],
        commit_id: typing.Union[MetaOapg.properties.commit_id, str, ],
        status: typing.Union[MetaOapg.properties.status, str, ],
        end_time: typing.Union[MetaOapg.properties.end_time, str, datetime, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ActionRun':
        return super().__new__(
            cls,
            *_args,
            start_time=start_time,
            event_type=event_type,
            run_id=run_id,
            branch=branch,
            commit_id=commit_id,
            status=status,
            end_time=end_time,
            _configuration=_configuration,
            **kwargs,
        )