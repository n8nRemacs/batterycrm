package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Xb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ cc f33363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EnumC21129c5 f33364m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f33365n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f33366o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.q<EnumC21129c5, androidx.compose.runtime.A, Integer, androidx.compose.ui.graphics.T> f33367p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f33368q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f33369r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(cc ccVar, EnumC21129c5 enumC21129c5, long j12, long j13, Y41.q qVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f33363l = ccVar;
        this.f33364m = enumC21129c5;
        this.f33365n = j12;
        this.f33366o = j13;
        this.f33367p = qVar;
        this.f33368q = z12;
        this.f33369r = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1769473);
        C22096n c22096n = this.f33369r;
        EnumC21129c5 enumC21129c5 = this.f33364m;
        Y41.q<EnumC21129c5, androidx.compose.runtime.A, Integer, androidx.compose.ui.graphics.T> qVar = this.f33367p;
        this.f33363l.a(enumC21129c5, this.f33365n, this.f33366o, qVar, this.f33368q, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
