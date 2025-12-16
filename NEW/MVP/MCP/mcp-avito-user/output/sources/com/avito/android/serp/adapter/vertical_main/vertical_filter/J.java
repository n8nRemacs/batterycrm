package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerticalFilterView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/J;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface J {
    void AQ(@Y61.l StyleBlock styleBlock);

    void HW(@Y61.k Y41.a aVar);

    void OD(@Y61.l Integer num);

    void Of(@Y61.l String str, boolean z12);

    void Sj();

    void YI(@Y61.l Integer num);

    void bg(@Y61.k View.OnClickListener onClickListener);

    void c20(@Y61.l BottomContent bottomContent, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void s1(@Y61.k List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e> list);

    void setTitle(@Y61.l String str);

    void xO(int i12, @Y61.k Y41.a aVar, @Y61.k String str);

    void yM(@InterfaceC42150f int i12, @j.I int i13);
}
