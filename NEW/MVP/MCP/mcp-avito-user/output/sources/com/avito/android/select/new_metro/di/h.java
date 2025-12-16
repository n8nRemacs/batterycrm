package com.avito.android.select.new_metro.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.select.new_metro.SelectMetroFragment;
import com.avito.android.select.new_metro.SelectMetroParams;
import h31.d;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SelectMetroFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/di/h;", "", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: SelectMetroFragmentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/di/h$a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a a(@Y61.k SelectMetroFragment selectMetroFragment);

        @h31.b
        @Y61.k
        a b(@Y61.k ArrayList arrayList);

        @Y61.k
        h build();

        @h31.b
        @Y61.k
        a c(@Y61.k C28478k c28478k);

        @Y61.k
        a d(@Y61.k g gVar);

        @h31.b
        @Y61.k
        a e(@Y61.k SelectMetroParams selectMetroParams);
    }

    void a(@Y61.k SelectMetroFragment selectMetroFragment);
}
