package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BoxWithConstraints.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f28221l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.i f28222m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f28223n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f28224o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f28225p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f28226q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(androidx.compose.ui.v vVar, androidx.compose.ui.i iVar, boolean z12, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f28221l = vVar;
        this.f28222m = iVar;
        this.f28223n = z12;
        this.f28224o = c22096n;
        this.f28225p = i12;
        this.f28226q = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f28225p | 1);
        androidx.compose.ui.i iVar = this.f28222m;
        E.a(this.f28221l, iVar, this.f28223n, this.f28224o, a12, iA2, this.f28226q);
        return kotlin.G0.f406611a;
    }
}
