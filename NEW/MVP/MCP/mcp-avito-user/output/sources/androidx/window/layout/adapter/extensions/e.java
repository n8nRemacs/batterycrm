package androidx.window.layout.adapter.extensions;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.c;
import androidx.window.layout.d;
import androidx.window.layout.n;
import androidx.window.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/adapter/extensions/e;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f55269a = new e();

    @l
    public static androidx.window.layout.d a(@k o oVar, @k FoldingFeature foldingFeature) {
        d.b bVarA;
        c.C1945c c1945c;
        int type = foldingFeature.getType();
        if (type == 1) {
            d.b.f55319b.getClass();
            bVarA = d.b.a.a();
        } else {
            if (type != 2) {
                return null;
            }
            d.b.f55319b.getClass();
            bVarA = d.b.a.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c1945c = c.C1945c.f55312b;
        } else {
            if (state != 2) {
                return null;
            }
            c1945c = c.C1945c.f55313c;
        }
        androidx.window.core.c cVar = new androidx.window.core.c(foldingFeature.getBounds());
        Rect rectC = oVar.f55343a.c();
        if (cVar.a() == 0 && cVar.b() == 0) {
            return null;
        }
        if (cVar.b() != rectC.width() && cVar.a() != rectC.height()) {
            return null;
        }
        if (cVar.b() < rectC.width() && cVar.a() < rectC.height()) {
            return null;
        }
        if (cVar.b() == rectC.width() && cVar.a() == rectC.height()) {
            return null;
        }
        return new androidx.window.layout.d(new androidx.window.core.c(foldingFeature.getBounds()), bVarA, c1945c);
    }

    @k
    public static n b(@k o oVar, @k WindowLayoutInfo windowLayoutInfo) {
        androidx.window.layout.d dVarA;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                f55269a.getClass();
                dVarA = a(oVar, foldingFeature);
            } else {
                dVarA = null;
            }
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        return new n(arrayList);
    }
}
