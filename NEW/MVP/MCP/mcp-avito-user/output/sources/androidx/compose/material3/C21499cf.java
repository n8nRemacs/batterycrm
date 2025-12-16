package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21499cf extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21522df f36167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21589gd f36168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f36169n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Te f36170o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f36171p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f36172q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21499cf(C21522df c21522df, C21589gd c21589gd, v.a aVar, Te te2, boolean z12, int i12) {
        super(2);
        this.f36167l = c21522df;
        this.f36168m = c21589gd;
        this.f36169n = aVar;
        this.f36170o = te2;
        this.f36171p = z12;
        this.f36172q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36172q | 1);
        C21589gd c21589gd = this.f36168m;
        v.a aVar = this.f36169n;
        this.f36167l.b(c21589gd, aVar, this.f36170o, this.f36171p, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
