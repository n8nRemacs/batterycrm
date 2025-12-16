package com.avito.android.widget_filters.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/b;", "", "a", "b", "c", "d", "Lcom/avito/android/widget_filters/mvi/entity/b$b;", "Lcom/avito/android/widget_filters/mvi/entity/b$c;", "Lcom/avito/android/widget_filters/mvi/entity/b$d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f330087a = a.f330088a;

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/b$a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f330088a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f330089b = new c(LoadingType.f329980b);
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/b$b;", "Lcom/avito/android/widget_filters/mvi/entity/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C10253b implements b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f330090b;

        public C10253b(@k ApiError apiError) {
            this.f330090b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10253b) && L.f(this.f330090b, ((C10253b) obj).f330090b);
        }

        public final int hashCode() {
            return this.f330090b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f330090b, ')');
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/b$c;", "Lcom/avito/android/widget_filters/mvi/entity/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LoadingType f330091b;

        public c(@k LoadingType loadingType) {
            this.f330091b = loadingType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f330091b == ((c) obj).f330091b;
        }

        public final int hashCode() {
            return this.f330091b.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(loadingType=" + this.f330091b + ')';
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/b$d;", "Lcom/avito/android/widget_filters/mvi/entity/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WidgetFiltersResponse f330092b;

        public d(@k WidgetFiltersResponse widgetFiltersResponse) {
            this.f330092b = widgetFiltersResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f330092b, ((d) obj).f330092b);
        }

        public final int hashCode() {
            return this.f330092b.hashCode();
        }

        @k
        public final String toString() {
            return "Success(data=" + this.f330092b + ')';
        }
    }
}
