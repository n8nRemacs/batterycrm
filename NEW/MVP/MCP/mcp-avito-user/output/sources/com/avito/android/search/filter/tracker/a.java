package com.avito.android.search.filter.tracker;

import Y61.k;
import androidx.fragment.app.Fragment;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: FiltersTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/tracker/a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    void a(long j12);

    void b();

    void c();

    void d();

    void e();

    void f(@k ApiError apiError);

    void g(@k Throwable th2);

    void h(@k ApiError apiError);

    void i(@k Throwable th2);

    void j();

    void k();

    void l(@k f.a aVar, @k Fragment fragment);
}
