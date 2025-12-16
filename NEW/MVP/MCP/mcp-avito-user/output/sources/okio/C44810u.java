package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FileMetadata.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/u;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44810u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f420153a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f420154b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final S f420155c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f420156d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Long f420157e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f420158f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f420159g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.d<?>, Object> f420160h;

    public C44810u() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    @Y61.k
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f420153a) {
            arrayList.add("isRegularFile");
        }
        if (this.f420154b) {
            arrayList.add("isDirectory");
        }
        Long l12 = this.f420156d;
        if (l12 != null) {
            arrayList.add("byteCount=" + l12);
        }
        Long l13 = this.f420157e;
        if (l13 != null) {
            arrayList.add("createdAt=" + l13);
        }
        Long l14 = this.f420158f;
        if (l14 != null) {
            arrayList.add("lastModifiedAt=" + l14);
        }
        Long l15 = this.f420159g;
        if (l15 != null) {
            arrayList.add("lastAccessedAt=" + l15);
        }
        Map<kotlin.reflect.d<?>, Object> map = this.f420160h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C42745f0.O(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public C44810u(boolean z12, boolean z13, @Y61.l S s5, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14, @Y61.l Long l15, @Y61.k Map<kotlin.reflect.d<?>, ? extends Object> map) {
        this.f420153a = z12;
        this.f420154b = z13;
        this.f420155c = s5;
        this.f420156d = l12;
        this.f420157e = l13;
        this.f420158f = l14;
        this.f420159g = l15;
        this.f420160h = P0.q(map);
    }

    public /* synthetic */ C44810u(boolean z12, boolean z13, S s5, Long l12, Long l13, Long l14, Long l15, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) == 0 ? z13 : false, (i12 & 4) != 0 ? null : s5, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? null : l13, (i12 & 32) != 0 ? null : l14, (i12 & 64) == 0 ? l15 : null, (i12 & 128) != 0 ? P0.c() : map);
    }
}
