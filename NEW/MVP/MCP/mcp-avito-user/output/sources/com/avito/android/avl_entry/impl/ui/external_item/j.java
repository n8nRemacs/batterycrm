package com.avito.android.avl_entry.impl.ui.external_item;

import android.os.Parcelable;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import com.avito.android.avl_entry.impl.util.a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortVideosView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/j;", "LTV0/e;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface j extends TV0.e {

    /* compiled from: ShortVideosView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2);

    void GV(int i12);

    void Jq(boolean z12);

    void Ug(@Y61.k ArrayList arrayList, @Y61.k com.avito.android.avl_entry.impl.util.d dVar, @Y61.k List list);

    void d(@Y61.l Y41.a<G0> aVar);

    void e3(@Y61.l Parcelable parcelable);

    void iU(@Y61.l Y41.a<G0> aVar);

    @Y61.l
    Parcelable l1();

    void oR(@Y61.k com.avito.android.avl_entry.impl.util.d dVar);

    boolean r80();

    void s4(int i12);

    void setTitle(@Y61.k String str);

    @Y61.k
    z<a.InterfaceC2959a> v40();

    void wX(@Y61.k List<? extends ShortVideosWidgetCarouselItem> list);
}
