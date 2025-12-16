package rF;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ApiLocationDistrictsV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LrF/b;", "", "", "altName", "", "id", "name", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "J", "b", "()J", "c", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rF.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47533b {

    @com.google.gson.annotations.c("altName")
    @k
    private final String altName;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public C47533b(@k String str, long j12, @k String str2) {
        this.altName = str;
        this.id = j12;
        this.name = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAltName() {
        return this.altName;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
