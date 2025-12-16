package com.avito.android.serp.adapter.witcher;

import android.os.Parcelable;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.witcher.WitcherItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WitcherItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/D;", "LTV0/e;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/advert/viewed/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface D extends TV0.e, com.avito.android.favorite.s, com.avito.android.advert.viewed.j {

    /* compiled from: WitcherItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> A1();

    void CZ(@Y61.k Appearance appearance);

    void ET(@Y61.k Appearance appearance);

    void Fe(@Y61.k Appearance appearance);

    void GB(@Y61.k Appearance appearance);

    void Hu(@Y61.l WitcherItem.Action action, boolean z12);

    void L4();

    void Qj(@Y61.k Appearance appearance);

    void SK();

    boolean T70();

    void W4(@Y61.l Parcelable parcelable);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Y9();

    void Z5(int i12);

    void ce(@Y61.k UV0.c cVar);

    void f(@Y61.l String str);

    void k30(@Y61.k Appearance appearance);

    void s(@Y61.l String str);

    void setTitle(@Y61.k String str);

    void t(@Y61.k Y41.a<G0> aVar);

    void xc(@Y61.k UV0.c cVar, int i12, @Y61.l SerpDisplayType serpDisplayType);

    void zb(@Y61.k UV0.c cVar);
}
