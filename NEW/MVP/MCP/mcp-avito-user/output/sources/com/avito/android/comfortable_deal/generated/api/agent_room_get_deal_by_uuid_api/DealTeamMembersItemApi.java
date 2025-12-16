package com.avito.android.comfortable_deal.generated.api.agent_room_get_deal_by_uuid_api;

import Mp.j;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi;", "", "Lcom/avito/android/remote/model/Image;", "avatar", "", "id", "", "mail", "name", "LMp/j;", "phone", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi$Role;", "role", "<init>", "(Lcom/avito/android/remote/model/Image;JLjava/lang/String;Ljava/lang/String;LMp/j;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi$Role;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "J", "b", "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "LMp/j;", "e", "()LMp/j;", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi$Role;", "f", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi$Role;", "Role", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealTeamMembersItemApi {

    @c("avatar")
    @l
    private final Image avatar;

    @c("id")
    private final long id;

    @c("mail")
    @l
    private final String mail;

    @c("name")
    @k
    private final String name;

    @c("phone")
    @l
    private final j phone;

    @c("role")
    @k
    private final Role role;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi$Role;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Agent", "HeadAgent", "Seller", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Role {

        @c("agent")
        public static final Role Agent;

        @c("head_agent")
        public static final Role HeadAgent;

        @c("seller")
        public static final Role Seller;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Role[] f122385c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f122386d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122387b;

        static {
            Role role = new Role("Agent", 0, "agent");
            Agent = role;
            Role role2 = new Role("HeadAgent", 1, "head_agent");
            HeadAgent = role2;
            Role role3 = new Role("Seller", 2, "seller");
            Seller = role3;
            Role[] roleArr = {role, role2, role3};
            f122385c = roleArr;
            f122386d = kotlin.enums.c.a(roleArr);
        }

        private Role(String str, int i12, String str2) {
            this.f122387b = str2;
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) f122385c.clone();
        }
    }

    public DealTeamMembersItemApi(@l Image image, long j12, @l String str, @k String str2, @l j jVar, @k Role role) {
        this.avatar = image;
        this.id = j12;
        this.mail = str;
        this.name = str2;
        this.phone = jVar;
        this.role = role;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getMail() {
        return this.mail;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final j getPhone() {
        return this.phone;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final Role getRole() {
        return this.role;
    }
}
