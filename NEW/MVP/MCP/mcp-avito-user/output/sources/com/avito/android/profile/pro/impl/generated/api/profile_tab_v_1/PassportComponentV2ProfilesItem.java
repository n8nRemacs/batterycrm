package com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001#BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006$"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem;", "", "Lcom/avito/android/remote/model/Image;", "avatar", "", "avatarDefaultUrl", "description", "", "isCurrent", "name", "", "profileId", "Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem$Status;", "status", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem$Status;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getAvatarDefaultUrl", "()Ljava/lang/String;", "b", "Z", "g", "()Z", "c", "J", "d", "()J", "Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem$Status;", "e", "()Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem$Status;", "f", "Status", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PassportComponentV2ProfilesItem {

    @c("avatar")
    @l
    private final Image avatar;

    @c("avatarDefaultUrl")
    @l
    private final String avatarDefaultUrl;

    @c("description")
    @l
    private final String description;

    @c("isCurrent")
    private final boolean isCurrent;

    @c("name")
    @k
    private final String name;

    @c("profileId")
    private final long profileId;

    @c("status")
    @l
    private final Status status;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileTabV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Warning", "Pending", "Finalized", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("finalized")
        public static final Status Finalized;

        @c("pending")
        public static final Status Pending;

        @c(ConstraintKt.WARNING)
        public static final Status Warning;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f222668b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f222669c;

        static {
            Status status = new Status("Warning", 0, ConstraintKt.WARNING);
            Warning = status;
            Status status2 = new Status("Pending", 1, "pending");
            Pending = status2;
            Status status3 = new Status("Finalized", 2, "finalized");
            Finalized = status3;
            Status[] statusArr = {status, status2, status3};
            f222668b = statusArr;
            f222669c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f222668b.clone();
        }
    }

    public PassportComponentV2ProfilesItem(@l Image image, @l String str, @l String str2, boolean z12, @k String str3, long j12, @l Status status, @k String str4) {
        this.avatar = image;
        this.avatarDefaultUrl = str;
        this.description = str2;
        this.isCurrent = z12;
        this.name = str3;
        this.profileId = j12;
        this.status = status;
        this.title = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final long getProfileId() {
        return this.profileId;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }
}
