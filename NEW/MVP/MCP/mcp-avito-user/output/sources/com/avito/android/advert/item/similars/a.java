package com.avito.android.advert.item.similars;

import com.avito.android.advert.item.I1;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.section.chips.f;
import com.avito.android.section.horizontal.button.e;
import com.avito.android.section.placeholder.e;
import com.avito.android.section.title.with_action.redesign.f;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;

/* compiled from: AdvertAsyncComplementaryPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/similars/a;", "Lcom/avito/android/serp/adapter/recomendations/o;", "Lcom/avito/android/section/skeleton/a;", "Lcom/avito/android/section/chips/f$b;", "Lcom/avito/android/section/placeholder/e$a;", "Lcom/avito/android/section/horizontal/button/e$a;", "Lcom/avito/android/section/title/with_action/redesign/f$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a extends com.avito.android.serp.adapter.recomendations.o, com.avito.android.section.skeleton.a, f.b, e.a, e.a, f.b {
    @Y61.k
    ArrayList a();

    void clearItems();

    @Y61.k
    Kundle d0();

    void e();

    void e0();

    void f0(@Y61.l Kundle kundle);

    void g();

    int getSpanCount();

    @Y61.k
    e2 h();

    void i();

    void j();

    void k(@Y61.k I1 i12);

    void l(@Y61.l AdvertDetails advertDetails);

    void m(@Y61.k String str);

    @Y61.k
    InterfaceC43160i<m> n();

    void onCleared();

    void t6(@Y61.l AdvertDetails advertDetails);
}
