package androidx.compose.foundation;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class K extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.T f26742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f26743m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f26744n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f26745o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f26746p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f26747q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f26748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26749s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(androidx.compose.ui.window.T t12, C22096n c22096n, Y y12, androidx.compose.ui.v vVar, boolean z12, boolean z13, C22096n c22096n2, int i12) {
        super(2);
        this.f26742l = t12;
        this.f26743m = c22096n;
        this.f26744n = y12;
        this.f26745o = vVar;
        this.f26746p = z12;
        this.f26747q = z13;
        this.f26748r = c22096n2;
        this.f26749s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f26749s | 1);
        C22096n c22096n = this.f26748r;
        X.a(this.f26742l, this.f26743m, this.f26744n, this.f26745o, this.f26746p, this.f26747q, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
