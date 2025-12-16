package androidx.compose.foundation;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class P extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.T f26810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f26811m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f26812n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f26813o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f26814p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f26815q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(androidx.compose.ui.window.T t12, Y y12, kotlinx.coroutines.T t13, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f26810l = t12;
        this.f26811m = y12;
        this.f26812n = t13;
        this.f26813o = z12;
        this.f26814p = c22096n;
        this.f26815q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f26815q | 1);
        C22096n c22096n = this.f26814p;
        X.c(this.f26810l, this.f26811m, this.f26812n, this.f26813o, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
