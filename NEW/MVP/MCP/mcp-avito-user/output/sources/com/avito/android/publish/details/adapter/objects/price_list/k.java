package com.avito.android.publish.details.adapter.objects.price_list;

import android.content.Context;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: PriceListPreviewItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/price_list/k;", "LTV0/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface k extends TV0.e {

    /* compiled from: PriceListPreviewItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void F3(@InterfaceC42165v int i12, @Y61.k Y41.a aVar, @Y61.k String str);

    void H(@Y61.l CharSequence charSequence);

    void Xb(@Y61.k String str, @Y61.k String str2);

    void clearItems();

    @Y61.k
    /* renamed from: getContext */
    Context getF233382c();

    void k(@Y61.l AttributedText attributedText);

    void s(@Y61.k String str);

    void setTitle(@Y61.l CharSequence charSequence);

    void u(@Y61.l CharSequence charSequence);
}
