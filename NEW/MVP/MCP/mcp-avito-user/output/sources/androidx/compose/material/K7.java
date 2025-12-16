package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class K7 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f32834l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f32835m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f32836n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f32837o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C21273n6 f32838p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f32839q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f32840r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T7 f32841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(int i12, C22096n c22096n, C22096n c22096n2, C22096n c22096n3, C21273n6 c21273n6, C22096n c22096n4, C22096n c22096n5, T7 t72) {
        super(2);
        this.f32834l = i12;
        this.f32835m = c22096n;
        this.f32836n = c22096n2;
        this.f32837o = c22096n3;
        this.f32838p = c21273n6;
        this.f32839q = c22096n4;
        this.f32840r = c22096n5;
        this.f32841s = t72;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            E7.c(this.f32834l, this.f32835m, this.f32836n, androidx.compose.runtime.internal.r.c(433906483, new J7(this.f32840r, this.f32841s), a13), this.f32837o, this.f32838p, this.f32839q, a13, 24576);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
