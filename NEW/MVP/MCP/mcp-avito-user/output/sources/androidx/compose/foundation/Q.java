package androidx.compose.foundation;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f26817l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f26818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f26819n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f26820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f26821p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(boolean z12, Y y12, androidx.compose.ui.v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f26817l = z12;
        this.f26818m = y12;
        this.f26819n = vVar;
        this.f26820o = c22096n;
        this.f26821p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f26821p | 1);
        C22096n c22096n = this.f26820o;
        Y y12 = this.f26818m;
        androidx.compose.ui.v vVar = this.f26819n;
        X.d(this.f26817l, y12, vVar, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
