package hb0;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VerticalProfileInfoV2Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Lhb0/a;", "", "", "name", "", "specificId", "userHash", "", "verified", "verticalId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "Ljava/lang/Boolean;", "getVerified", "()Ljava/lang/Boolean;", "d", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40908a {

    @c("name")
    @l
    private final String name;

    @c("specificId")
    @l
    private final Long specificId;

    @c("userHash")
    @l
    private final String userHash;

    @c("verified")
    @l
    private final Boolean verified;

    @c("verticalId")
    @l
    private final Long verticalId;

    public C40908a(@l String str, @l Long l12, @l String str2, @l Boolean bool, @l Long l13) {
        this.name = str;
        this.specificId = l12;
        this.userHash = str2;
        this.verified = bool;
        this.verticalId = l13;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getSpecificId() {
        return this.specificId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getUserHash() {
        return this.userHash;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getVerticalId() {
        return this.verticalId;
    }
}
