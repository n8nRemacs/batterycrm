package androidx.compose.ui.window;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidPopup.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22726m extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.i f43094l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f43095m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f43096n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ U f43097o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f43098p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22726m(androidx.compose.ui.i iVar, long j12, Y41.a aVar, U u12, C22096n c22096n, int i12) {
        super(2);
        this.f43094l = iVar;
        this.f43095m = j12;
        this.f43096n = aVar;
        this.f43097o = u12;
        this.f43098p = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(27655);
        U u12 = this.f43097o;
        C22096n c22096n = this.f43098p;
        long j12 = this.f43095m;
        Y41.a<G0> aVar = this.f43096n;
        C22725l.b(this.f43094l, j12, aVar, u12, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
