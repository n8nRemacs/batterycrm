package com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1;

import Y61.k;
import com.google.gson.annotations.c;
import iO0.f;
import kotlin.Metadata;

/* compiled from: GetInvitationApiV1Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response;", "", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/a;", "details", "LiO0/f;", "process", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response$Status;", "status", "<init>", "(Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/a;LiO0/f;Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response$Status;)V", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/a;", "a", "()Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/a;", "LiO0/f;", "b", "()LiO0/f;", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response$Status;", "c", "()Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response$Status;", "Status", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetInvitationApiV1Response {

    @c("details")
    @k
    private final a details;

    @c("process")
    @k
    private final f process;

    @c("status")
    @k
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetInvitationApiV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Active", "Outdated", "Rejected", "Withdrawn", "Accepted", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("accepted")
        public static final Status Accepted;

        @c("active")
        public static final Status Active;

        @c("outdated")
        public static final Status Outdated;

        @c("rejected")
        public static final Status Rejected;

        @c("withdrawn")
        public static final Status Withdrawn;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Status[] f326926c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f326927d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326928b;

        static {
            Status status = new Status("Active", 0, "active");
            Active = status;
            Status status2 = new Status("Outdated", 1, "outdated");
            Outdated = status2;
            Status status3 = new Status("Rejected", 2, "rejected");
            Rejected = status3;
            Status status4 = new Status("Withdrawn", 3, "withdrawn");
            Withdrawn = status4;
            Status status5 = new Status("Accepted", 4, "accepted");
            Accepted = status5;
            Status[] statusArr = {status, status2, status3, status4, status5};
            f326926c = statusArr;
            f326927d = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
            this.f326928b = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f326926c.clone();
        }
    }

    public GetInvitationApiV1Response(@k a aVar, @k f fVar, @k Status status) {
        this.details = aVar;
        this.process = fVar;
        this.status = status;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getDetails() {
        return this.details;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final f getProcess() {
        return this.process;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }
}
