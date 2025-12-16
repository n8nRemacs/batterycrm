package oi0;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxSuggestLocationPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Loi0/b;", "", "", "", "bound", "", "genitiveName", "", "id", "name", "regionName", "<init>", "(Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "getGenitiveName", "()Ljava/lang/String;", "J", "b", "()J", "c", "d", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oi0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44783b {

    @c("bound")
    @k
    private final List<List<Double>> bound;

    @c("genitiveName")
    @k
    private final String genitiveName;

    @c("id")
    private final long id;

    @c("name")
    @k
    private final String name;

    @c("regionName")
    @l
    private final String regionName;

    /* JADX WARN: Multi-variable type inference failed */
    public C44783b(@k List<? extends List<Double>> list, @k String str, long j12, @k String str2, @l String str3) {
        this.bound = list;
        this.genitiveName = str;
        this.id = j12;
        this.name = str2;
        this.regionName = str3;
    }

    @k
    public final List<List<Double>> a() {
        return this.bound;
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

    @l
    /* renamed from: d, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }
}
