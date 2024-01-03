# coding: utf-8

"""
    lakeFS API

    lakeFS HTTP API

    The version of the OpenAPI document: 1.0.0
    Contact: services@treeverse.io
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

import lakefs_sdk
from lakefs_sdk.models.import_creation import ImportCreation  # noqa: E501
from lakefs_sdk.rest import ApiException

class TestImportCreation(unittest.TestCase):
    """ImportCreation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ImportCreation
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ImportCreation`
        """
        model = lakefs_sdk.models.import_creation.ImportCreation()  # noqa: E501
        if include_optional :
            return ImportCreation(
                paths = [
                    lakefs_sdk.models.import_location.ImportLocation(
                        type = 'common_prefix', 
                        path = 's3://my-bucket/production/collections/', 
                        destination = 'collections/', )
                    ], 
                commit = lakefs_sdk.models.commit_creation.CommitCreation(
                    message = '', 
                    metadata = {
                        'key' : ''
                        }, 
                    date = 56, 
                    allow_empty = True, 
                    force = True, ), 
                force = True
            )
        else :
            return ImportCreation(
                paths = [
                    lakefs_sdk.models.import_location.ImportLocation(
                        type = 'common_prefix', 
                        path = 's3://my-bucket/production/collections/', 
                        destination = 'collections/', )
                    ],
                commit = lakefs_sdk.models.commit_creation.CommitCreation(
                    message = '', 
                    metadata = {
                        'key' : ''
                        }, 
                    date = 56, 
                    allow_empty = True, 
                    force = True, ),
        )
        """

    def testImportCreation(self):
        """Test ImportCreation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
