package c6;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageCalculationFilter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc6/e;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC26946a f57646e;

    @Inject
    public e(@k InterfaceC26946a interfaceC26946a) {
        super(true, true, 0.0f, 0L, 12, null);
        this.f57646e = interfaceC26946a;
    }

    public static ContactBar.Button.Target c(b.InterfaceC10495b interfaceC10495b) {
        ContactBar.Button button;
        List<? extends ContactBar.Button> list;
        Object next;
        AdvertDetailsContactBarItem advertDetailsContactBarItem = interfaceC10495b instanceof AdvertDetailsContactBarItem ? (AdvertDetailsContactBarItem) interfaceC10495b : null;
        if (advertDetailsContactBarItem == null || (list = advertDetailsContactBarItem.f74864f) == null) {
            button = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ContactBar.Button button2 = (ContactBar.Button) next;
                if ((button2 instanceof ContactBar.Button.Target) && ((ContactBar.Button.Target) button2).f125081i == ContactBar.Button.Target.Type.f125092i) {
                    break;
                }
            }
            button = (ContactBar.Button) next;
        }
        if (button instanceof ContactBar.Button.Target) {
            return (ContactBar.Button.Target) button;
        }
        return null;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return c(interfaceC10495b) != null;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        ContactBar.Button.Target targetC = c(interfaceC10495b);
        if (targetC == null) {
            return;
        }
        this.f57646e.b(targetC.f125074b);
    }
}
