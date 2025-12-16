package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuUi.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class u extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f27060l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f27061m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f27062n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g gVar, androidx.compose.ui.v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f27060l = gVar;
        this.f27061m = vVar;
        this.f27062n = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        C22096n c22096n = this.f27062n;
        B.a(this.f27060l, this.f27061m, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
