package Z51;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.base_components.android.ComposeWebViewKt;

/* loaded from: classes8.dex */
public final class k extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12) {
        super(2);
        this.f19918l = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f19918l | 1);
        B bE2 = ((A) obj).E(-406206180);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            F31.e.a(null, bE2, 0);
            ComposeWebViewKt.ComposeWebView("https://ya.ru", null, bE2, 6, 2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(iA2);
        }
        return G0.f406611a;
    }
}
