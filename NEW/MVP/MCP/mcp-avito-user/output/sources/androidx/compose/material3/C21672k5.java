package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21672k5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36714l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f36715m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36716n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f36717o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f36718p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f36719q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y3 f36720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f36721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f36722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21672k5(androidx.compose.ui.v vVar, boolean z12, boolean z13, Y41.a aVar, boolean z14, String str, Y3 y32, C22096n c22096n, int i12) {
        super(2);
        this.f36714l = vVar;
        this.f36715m = z12;
        this.f36716n = z13;
        this.f36717o = aVar;
        this.f36718p = z14;
        this.f36719q = str;
        this.f36720r = y32;
        this.f36721s = c22096n;
        this.f36722t = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36722t | 1);
        C22096n c22096n = this.f36721s;
        String str = this.f36719q;
        V4.h(this.f36714l, this.f36715m, this.f36716n, this.f36717o, this.f36718p, str, this.f36720r, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
