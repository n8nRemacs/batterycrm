package rF;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiLocationDistrictsV3Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"LrF/c;", "", "", "", "districtIds", "", "fullName", "id", "shortName", "<init>", "(Ljava/util/List;Ljava/lang/String;JLjava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "c", "()J", "d", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rF.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47534c {

    @com.google.gson.annotations.c("districtIds")
    @k
    private final List<Long> districtIds;

    @com.google.gson.annotations.c("fullName")
    @k
    private final String fullName;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("shortName")
    @k
    private final String shortName;

    public C47534c(@k List<Long> list, @k String str, long j12, @k String str2) {
        this.districtIds = list;
        this.fullName = str;
        this.id = j12;
        this.shortName = str2;
    }

    @k
    public final List<Long> a() {
        return this.districtIds;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }
}
