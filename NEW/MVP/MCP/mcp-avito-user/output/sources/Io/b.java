package IO;

import Y61.k;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemSpaceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIO/b;", "LIO/e;", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f8161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8165e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8166f;

    public b() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    @Override // IO.e
    public final void a(@k c cVar) {
        cVar.f8167a = this.f8161a;
        cVar.f8168b = this.f8162b;
        cVar.f8169c = this.f8163c;
        cVar.f8170d = this.f8164d;
        cVar.f8171e = this.f8165e;
        cVar.f8172f = this.f8166f;
    }

    public b(@U int i12, @U int i13, @U int i14, @U int i15, @U int i16, @U int i17) {
        this.f8161a = i12;
        this.f8162b = i13;
        this.f8163c = i14;
        this.f8164d = i15;
        this.f8165e = i16;
        this.f8166f = i17;
    }

    public /* synthetic */ b(int i12, int i13, int i14, int i15, int i16, int i17, int i18, C42822w c42822w) {
        this((i18 & 1) != 0 ? 0 : i12, (i18 & 2) != 0 ? 0 : i13, (i18 & 4) != 0 ? 0 : i14, (i18 & 8) != 0 ? 0 : i15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? 0 : i17);
    }
}
