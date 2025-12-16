package com.avito.android.publish.details.adapter.objects;

import android.content.Context;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiStateObjectsItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/i;", "LTV0/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface i extends TV0.e {

    /* compiled from: MultiStateObjectsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Q60(@Y61.k String str, @Y61.k Y41.a<G0> aVar);

    void clearItems();

    @Y61.k
    /* renamed from: getContext */
    Context getF233340c();

    void k(@Y61.l AttributedText attributedText);

    void ma(@Y61.l CharSequence charSequence, @Y61.k int[] iArr);

    void ns(int i12, @Y61.k Y41.a aVar, @Y61.k String str);

    void s(@Y61.k String str);

    void setTitle(@Y61.l CharSequence charSequence);

    void u(@Y61.l CharSequence charSequence);

    void yo(@Y61.k Y41.a<G0> aVar);
}
