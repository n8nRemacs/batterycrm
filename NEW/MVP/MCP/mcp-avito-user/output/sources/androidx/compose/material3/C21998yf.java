package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21998yf extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Wf f37786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f37787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f37788n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Te f37789o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f37790p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f37791q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f37792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f37793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21998yf(Wf wf2, androidx.compose.ui.v vVar, boolean z12, Te te2, androidx.compose.foundation.interaction.m mVar, C22096n c22096n, C22096n c22096n2, int i12) {
        super(2);
        this.f37786l = wf2;
        this.f37787m = vVar;
        this.f37788n = z12;
        this.f37789o = te2;
        this.f37790p = mVar;
        this.f37791q = c22096n;
        this.f37792r = c22096n2;
        this.f37793s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f37793s | 1);
        C22096n c22096n = this.f37791q;
        C22096n c22096n2 = this.f37792r;
        Wf wf2 = this.f37786l;
        Te te2 = this.f37789o;
        androidx.compose.foundation.interaction.m mVar = this.f37790p;
        Tf.c(wf2, this.f37787m, this.f37788n, te2, mVar, c22096n, c22096n2, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
