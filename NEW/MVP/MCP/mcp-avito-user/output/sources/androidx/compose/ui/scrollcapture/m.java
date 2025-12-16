package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.X0;
import androidx.compose.ui.layout.B;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.scrollcapture.a;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.t;
import j.X;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ScrollCapture.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/scrollcapture/m;", "Landroidx/compose/ui/scrollcapture/a$a;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class m implements a.InterfaceC1680a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f41710a = C22126m3.g(Boolean.FALSE);

    public final void a(@Y61.k AndroidComposeView androidComposeView, @Y61.k w wVar, @Y61.k CoroutineContext coroutineContext, @Y61.k Consumer consumer) {
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new n[16], 0);
        o.a(wVar.a(), 0, new j(1, eVar, androidx.compose.runtime.collection.e.class, "add", "add(Ljava/lang/Object;)Z", 8));
        eVar.n(kotlin.comparisons.a.a(k.f41708l, l.f41709l));
        int i12 = eVar.f38262d;
        n nVar = (n) (i12 == 0 ? null : eVar.f38260b[i12 - 1]);
        if (nVar == null) {
            return;
        }
        C43238h c43238hA = U.a(coroutineContext);
        u uVar = nVar.f41711a;
        s sVar = nVar.f41713c;
        a aVar = new a(uVar, sVar, c43238hA, this, androidComposeView);
        AbstractC22443w0 abstractC22443w0 = nVar.f41714d;
        l0.j jVarP = B.c(abstractC22443w0).P(abstractC22443w0, true);
        long jC2 = sVar.c();
        Rect rectA = X0.a(t.b(jVarP));
        q.a aVar2 = q.f42862b;
        ScrollCaptureTarget scrollCaptureTargetJ = Is0.d.j(androidComposeView, rectA, new Point((int) (jC2 >> 32), (int) (jC2 & 4294967295L)), aVar);
        scrollCaptureTargetJ.setScrollBounds(X0.a(sVar));
        consumer.accept(scrollCaptureTargetJ);
    }
}
