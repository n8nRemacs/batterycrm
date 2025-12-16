package M11;

import android.util.Log;
import androidx.compose.runtime.I3;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.fragment.app.Fragment;
import androidx.view.C23395u;
import androidx.view.C23397v;
import androidx.view.C23485c;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.fragment.i;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import io.reactivex.rxjava3.core.B;
import java.util.Iterator;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10347c;

    public /* synthetic */ d(Object obj, int i12) {
        this.f10346b = i12;
        this.f10347c = obj;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
        Object obj = this.f10347c;
        switch (this.f10346b) {
            case 0:
                GroupSubscriptionAnalytics.SheetScreenShown$lambda$9$lambda$8$lambda$6((I3) obj, interfaceC22983P, event);
                break;
            case 1:
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ((AbstractC22450a) obj).d();
                    break;
                }
                break;
            case 2:
                boolean z12 = C23397v.f53198G;
                C23397v c23397v = (C23397v) obj;
                c23397v.f53223s = event.a();
                if (c23397v.f53207c != null) {
                    Iterator<C23395u> it = c23397v.f53211g.iterator();
                    while (it.hasNext()) {
                        C23395u next = it.next();
                        next.getClass();
                        next.f53184e = event.a();
                        next.c();
                    }
                    break;
                }
                break;
            case 3:
                int i12 = i.f53137j;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Fragment fragment = (Fragment) interfaceC22983P;
                    i iVar = (i) obj;
                    Object obj2 = null;
                    for (Object obj3 : iVar.b().f52866f.getValue()) {
                        if (L.f(((C23395u) obj3).f53186g, fragment.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    C23395u c23395u = (C23395u) obj2;
                    if (c23395u != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            c23395u.toString();
                            interfaceC22983P.toString();
                        }
                        iVar.b().b(c23395u);
                        break;
                    }
                }
                break;
            case 4:
                int i13 = C23485c.f54425g;
                C23485c c23485c = (C23485c) obj;
                if (event == Lifecycle.Event.ON_START) {
                    c23485c.f54431f = true;
                    break;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    c23485c.f54431f = false;
                    break;
                }
                break;
            default:
                ((B) obj).onNext(event);
                break;
        }
    }
}
