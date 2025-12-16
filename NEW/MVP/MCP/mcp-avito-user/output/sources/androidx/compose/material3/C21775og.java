package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21775og extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f36991l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36992m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f36993n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f36994o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f36995p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f36996q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f36997r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21775og(C22096n c22096n, Y41.p pVar, C22096n c22096n2, androidx.compose.ui.text.x0 x0Var, long j12, long j13, int i12) {
        super(2);
        this.f36991l = c22096n;
        this.f36992m = pVar;
        this.f36993n = c22096n2;
        this.f36994o = x0Var;
        this.f36995p = j12;
        this.f36996q = j13;
        this.f36997r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36997r | 1);
        C22096n c22096n = this.f36991l;
        C22096n c22096n2 = this.f36993n;
        androidx.compose.ui.text.x0 x0Var = this.f36994o;
        Bg.c(c22096n, this.f36992m, c22096n2, x0Var, this.f36995p, this.f36996q, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
