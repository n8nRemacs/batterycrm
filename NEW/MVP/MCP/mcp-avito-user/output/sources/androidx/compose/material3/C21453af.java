package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21453af extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21522df f36036l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Wf f36037m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f36038n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Te f36039o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f36040p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f36041q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21453af(C21522df c21522df, Wf wf2, v.a aVar, Te te2, boolean z12, int i12) {
        super(2);
        this.f36036l = c21522df;
        this.f36037m = wf2;
        this.f36038n = aVar;
        this.f36039o = te2;
        this.f36040p = z12;
        this.f36041q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36041q | 1);
        Wf wf2 = this.f36037m;
        v.a aVar = this.f36038n;
        this.f36036l.c(wf2, aVar, this.f36039o, this.f36040p, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
