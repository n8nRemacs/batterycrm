package x4;

import TV0.d;
import Y61.k;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import kotlin.Metadata;
import x4.InterfaceC49759a.b;
import x4.c;

/* compiled from: AdvertDetailsAutotekaTeaserPresenterCommon.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\b\u0002\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0005*\b\b\u0003\u0010\b*\u00020\u00072\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\u00020\n:\u0001\u000b¨\u0006\f"}, d2 = {"Lx4/a;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItem;", "ItemResponse", "Lx4/c;", "View", "Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "Item", "Lx4/a$b;", "Router", "LTV0/d;", "Lx4/c$a;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC49759a<ItemResponse extends AutotekaTeaserItem, View extends c, Item extends AdvertDetailsAutotekaTeaserItemCommon<ItemResponse>, Router extends b> extends d<View, Item>, c.a {

    /* compiled from: AdvertDetailsAutotekaTeaserPresenterCommon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x4.a$a, reason: collision with other inner class name */
    public static final class C12841a {
    }

    /* compiled from: AdvertDetailsAutotekaTeaserPresenterCommon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx4/a$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x4.a$b */
    public interface b {
        void a(@k DeepLink deepLink);

        void b();

        void o(@k CpoDescription cpoDescription);
    }

    void V5(@k W0 w02);

    void c0();

    void e0();
}
