package W4;

import Y61.k;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationButtonFilter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW4/a;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f17736e;

    @Inject
    public a(@k com.avito.android.advert_core.analytics.a aVar) {
        super(true, true, 0.0f, 0L, 12, null);
        this.f17736e = aVar;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        Parcelable parcelable;
        List<? extends ContactBar.Button> list;
        Object next;
        AdvertDetailsContactBarItem advertDetailsContactBarItem = interfaceC10495b instanceof AdvertDetailsContactBarItem ? (AdvertDetailsContactBarItem) interfaceC10495b : null;
        if (advertDetailsContactBarItem == null || (list = advertDetailsContactBarItem.f74864f) == null) {
            parcelable = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ContactBar.Button button = (ContactBar.Button) next;
                if ((button instanceof ContactBar.Button.Target) && ((ContactBar.Button.Target) button).f125081i == ContactBar.Button.Target.Type.f125091h) {
                    break;
                }
            }
            parcelable = (ContactBar.Button) next;
        }
        return (parcelable instanceof ContactBar.Button.Target ? (ContactBar.Button.Target) parcelable : null) != null;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        this.f17736e.A6(null, "item_contact_block", null);
    }
}
