package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.i;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f28401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20585k.m f28402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20585k.e f28403n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i.a f28404o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F0 f28405p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f28406q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f28407r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(androidx.compose.ui.v vVar, C20585k.m mVar, C20585k.e eVar, i.a aVar, F0 f02, C22096n c22096n, int i12) {
        super(2);
        this.f28401l = vVar;
        this.f28402m = mVar;
        this.f28403n = eVar;
        this.f28404o = aVar;
        this.f28405p = f02;
        this.f28406q = c22096n;
        this.f28407r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f28407r | 1);
        C22096n c22096n = this.f28406q;
        C20585k.e eVar = this.f28403n;
        i.a aVar = this.f28404o;
        S0.b(this.f28401l, this.f28402m, eVar, aVar, this.f28405p, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
