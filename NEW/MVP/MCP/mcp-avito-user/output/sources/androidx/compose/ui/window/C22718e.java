package androidx.compose.ui.window;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidDialog.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22718e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f43080l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f43081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f43082n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f43083o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22718e(Y41.a aVar, H h12, C22096n c22096n, int i12) {
        super(2);
        this.f43080l = aVar;
        this.f43081m = h12;
        this.f43082n = c22096n;
        this.f43083o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f43083o | 1);
        C22096n c22096n = this.f43082n;
        C22724k.a(this.f43080l, this.f43081m, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
