package androidx.compose.ui.window;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidPopup.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22734v extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f43120l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f43121m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f43122n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f43123o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f43124p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f43125q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22734v(T t12, Y41.a aVar, U u12, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f43120l = t12;
        this.f43121m = aVar;
        this.f43122n = u12;
        this.f43123o = c22096n;
        this.f43124p = i12;
        this.f43125q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f43124p | 1);
        C22096n c22096n = this.f43123o;
        Y41.a<G0> aVar = this.f43121m;
        C22725l.a(this.f43120l, aVar, this.f43122n, c22096n, a12, iA2, this.f43125q);
        return G0.f406611a;
    }
}
