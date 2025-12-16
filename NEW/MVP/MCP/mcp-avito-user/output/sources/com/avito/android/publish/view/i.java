package com.avito.android.publish.view;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.publish.details.D;
import com.avito.android.publish.view.a;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import kotlin.Metadata;

/* compiled from: ItemDetailsParameterClickListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/i;", "Lcom/avito/android/publish/view/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface i extends com.avito.android.publish.view.a {

    /* compiled from: ItemDetailsParameterClickListener.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/i$a;", "Lcom/avito/android/publish/view/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends a.b {

        /* compiled from: ItemDetailsParameterClickListener.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.view.i$a$a, reason: collision with other inner class name */
        public static final class C7360a {
        }

        void L0();

        void M2();

        void Q2(@Y61.k ObjectsParameter objectsParameter);

        void h4(@Y61.k ObjectsParameter objectsParameter, @Y61.l Integer num);

        void m2(@Y61.k DistrictParameter districtParameter);

        void p2(@Y61.k MetroParameter metroParameter, @Y61.l Integer num, @Y61.l String str);
    }

    void A(@Y61.k D.a aVar);

    void P9(@Y61.k ParameterElement.w wVar, int i12);

    void U3(@Y61.k ParameterElement.w wVar);

    void g2(@Y61.k ParameterElement.w wVar);
}
