package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.FriendRelationship;
import test.model.FriendRelationshipExample;

public interface FriendRelationshipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int countByExample(FriendRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int deleteByExample(FriendRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long friendRelationshipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int insert(FriendRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int insertSelective(FriendRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    List<FriendRelationship> selectByExample(FriendRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    FriendRelationship selectByPrimaryKey(Long friendRelationshipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FriendRelationship record, @Param("example") FriendRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FriendRelationship record, @Param("example") FriendRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FriendRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_relationship
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FriendRelationship record);
}