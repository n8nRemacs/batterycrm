package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21966x5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f37703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f37704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f37705n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f37706o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f37707p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21966x5(int i12, Y41.a aVar, C22096n c22096n, v.a aVar2, boolean z12) {
        super(2);
        this.f37703l = aVar;
        this.f37704m = z12;
        this.f37705n = aVar2;
        this.f37706o = c22096n;
        this.f37707p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f37707p | 1);
        C22096n c22096n = this.f37706o;
        Y41.a<kotlin.G0> aVar = this.f37703l;
        V4.j(iA2, aVar, a12, c22096n, this.f37705n, this.f37704m);
        return kotlin.G0.f406611a;
    }
}
