package com.avito.android.serp.adapter.auto_model_widget;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.auto_model.AutoModelButton;
import com.avito.android.remote.model.auto_model.AutoModelRating;
import com.avito.android.remote.model.auto_model.Description;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoModelWidgetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/auto_model_widget/l;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l extends TV0.e {

    /* compiled from: AutoModelWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void AD(@Y61.l AutoModelRating autoModelRating, @Y61.k Y41.a<G0> aVar);

    void M50(@Y61.l List<Description> list);

    void N2(@Y61.l String str);

    void a(@Y61.k Y41.a<G0> aVar);

    void ej(@Y61.l List<AutoModelButton> list, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2);

    void l(@Y61.l Image image);

    void setTitle(@Y61.k String str);
}
