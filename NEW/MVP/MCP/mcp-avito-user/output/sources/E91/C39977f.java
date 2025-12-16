package e91;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GetUsersResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Le91/f;", "", "", "id", "", "isStubName", "label", "", "lastActionTime", "name", "Le91/e;", "publicUserProfile", "", "rating", "statusId", "timeDiff", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Le91/e;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "()Z", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "d", "Le91/e;", "e", "()Le91/e;", "Ljava/lang/Double;", "getRating", "()Ljava/lang/Double;", "getStatusId", "f", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e91.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39977f {

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isStubName")
    private final boolean isStubName;

    @com.google.gson.annotations.c("label")
    @l
    private final String label;

    @com.google.gson.annotations.c("lastActionTime")
    @l
    private final Long lastActionTime;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("publicUserProfile")
    @l
    private final C39976e publicUserProfile;

    @com.google.gson.annotations.c("rating")
    @l
    private final Double rating;

    @com.google.gson.annotations.c("statusId")
    @l
    private final Long statusId;

    @com.google.gson.annotations.c("timeDiff")
    @l
    private final Long timeDiff;

    public C39977f(@k String str, boolean z12, @l String str2, @l Long l12, @k String str3, @l C39976e c39976e, @l Double d12, @l Long l13, @l Long l14) {
        this.id = str;
        this.isStubName = z12;
        this.label = str2;
        this.lastActionTime = l12;
        this.name = str3;
        this.publicUserProfile = c39976e;
        this.rating = d12;
        this.statusId = l13;
        this.timeDiff = l14;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getLastActionTime() {
        return this.lastActionTime;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C39976e getPublicUserProfile() {
        return this.publicUserProfile;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Long getTimeDiff() {
        return this.timeDiff;
    }
}
