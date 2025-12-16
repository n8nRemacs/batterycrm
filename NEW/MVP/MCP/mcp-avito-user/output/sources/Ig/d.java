package Ig;

import Y61.k;
import Y61.l;
import com.avito.android.avl_entry.impl.ui.external_item.ShortVideosItemImpl;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: ShortVideosItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LIg/d;", "Lcom/avito/android/serp/adapter/l1;", "Lqs0/a;", "_avito_avl-entry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d extends l1, InterfaceC47435a {

    /* compiled from: ShortVideosItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    List<BaseAvlVideoItem> d1();

    /* renamed from: f2 */
    boolean getF98495b();

    @l
    /* renamed from: getAnalytics */
    Analytics getF98496c();

    @l
    String getCategoryId();

    @k
    String getTitle();

    @l
    String getXHash();

    @k
    ShortVideosItemImpl h1(@k ArrayList arrayList, boolean z12);

    /* renamed from: isNew */
    boolean getIsNew();
}
