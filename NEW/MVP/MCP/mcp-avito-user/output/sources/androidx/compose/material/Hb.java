package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Hb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f32748l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f32749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32750n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f32751o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f32752p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hb(long j12, androidx.compose.ui.text.x0 x0Var, Y41.p pVar, int i12, int i13) {
        super(2);
        this.f32748l = j12;
        this.f32749m = x0Var;
        this.f32750n = pVar;
        this.f32751o = i12;
        this.f32752p = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f32751o | 1);
        androidx.compose.ui.text.x0 x0Var = this.f32749m;
        Bb.b(this.f32748l, x0Var, this.f32750n, a12, iA2, this.f32752p);
        return kotlin.G0.f406611a;
    }
}
