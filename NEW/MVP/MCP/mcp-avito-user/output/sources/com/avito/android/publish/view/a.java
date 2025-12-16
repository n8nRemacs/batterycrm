package com.avito.android.publish.view;

import android.os.Bundle;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.details.j;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.view.m;
import kotlin.Metadata;

/* compiled from: BasicParameterClickListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/a;", "Lcom/avito/android/details/a;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a extends com.avito.android.details.a {

    /* compiled from: BasicParameterClickListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.view.a$a, reason: collision with other inner class name */
    public static final class C7357a {
    }

    /* compiled from: BasicParameterClickListener.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/a$b;", "Lcom/avito/android/publish/view/m$a;", "Lcom/avito/android/details/j$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends m.a, j.b {

        /* compiled from: BasicParameterClickListener.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.view.a$b$a, reason: collision with other inner class name */
        public static final class C7358a {
        }

        void K2(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle);
    }

    void F(@Y61.k com.avito.android.details.a aVar);

    void G(@Y61.k com.avito.conveyor_item.a aVar);

    void Q9(@Y61.k ItemWithAdditionalButton itemWithAdditionalButton);

    void U7(@Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12);

    void Z2(@Y61.k com.avito.android.items.d dVar, @Y61.k String str, boolean z12);

    void be(@Y61.k ParameterElement.C29376d c29376d, @Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12, boolean z12, boolean z13);

    void c0();

    void e(@Y61.k b bVar);
}
