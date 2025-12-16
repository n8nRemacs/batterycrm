package androidx.compose.material;

import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H8 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f32728l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32729m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f32730n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32731o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21184g8 f32732p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f32733q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f32734r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32735s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H8(C20644z c20644z, androidx.compose.ui.v vVar, float f12, androidx.compose.foundation.interaction.m mVar, InterfaceC21184g8 interfaceC21184g8, boolean z12, float f13, int i12) {
        super(2);
        this.f32728l = c20644z;
        this.f32729m = vVar;
        this.f32730n = f12;
        this.f32731o = mVar;
        this.f32732p = interfaceC21184g8;
        this.f32733q = z12;
        this.f32734r = f13;
        this.f32735s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f32735s | 1);
        androidx.compose.foundation.interaction.m mVar = this.f32731o;
        InterfaceC21184g8 interfaceC21184g8 = this.f32732p;
        I8.a(this.f32728l, this.f32729m, this.f32730n, mVar, interfaceC21184g8, this.f32733q, this.f32734r, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
