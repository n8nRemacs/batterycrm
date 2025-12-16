package com.avito.android.search.filter.location_filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/location_filter/f;", "", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f {

    /* compiled from: LocationFiltersPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: LocationFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/f$b;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    void a(@Y61.k Context context);

    void b();

    void c(@Y61.k Context context);

    void c0();

    void d(@Y61.l String str);

    @Y61.k
    Bundle d0();

    void e(@Y61.k ActivityC22955m activityC22955m);

    void e0();

    @Y61.k
    SearchParams f();

    void g(@Y61.l ArrayList arrayList);

    void h(@Y61.l View view);

    void i(@Y61.k u uVar);

    void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list);

    /* renamed from: k */
    boolean getF263667n();

    void l(@Y61.l Location location);

    void m(@Y61.l Location location);

    void n(@Y61.k LocationFiltersDialogFragment locationFiltersDialogFragment);

    void o(@Y61.l Radius radius);

    @Y61.l
    /* renamed from: p */
    ParametersTreeWithAdditional getF263665l();
}
