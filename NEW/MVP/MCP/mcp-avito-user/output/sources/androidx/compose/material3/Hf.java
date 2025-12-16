package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Hf extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f34851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Wf f34852m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f34853n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f34854o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f34855p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f34856q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f34857r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hf(androidx.compose.ui.v vVar, Wf wf2, boolean z12, androidx.compose.foundation.interaction.m mVar, C22096n c22096n, C22096n c22096n2, int i12) {
        super(2);
        this.f34851l = vVar;
        this.f34852m = wf2;
        this.f34853n = z12;
        this.f34854o = mVar;
        this.f34855p = c22096n;
        this.f34856q = c22096n2;
        this.f34857r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f34857r | 1);
        C22096n c22096n = this.f34855p;
        C22096n c22096n2 = this.f34856q;
        Wf wf2 = this.f34852m;
        boolean z12 = this.f34853n;
        androidx.compose.foundation.interaction.m mVar = this.f34854o;
        Tf.d(this.f34851l, wf2, z12, mVar, c22096n, c22096n2, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
