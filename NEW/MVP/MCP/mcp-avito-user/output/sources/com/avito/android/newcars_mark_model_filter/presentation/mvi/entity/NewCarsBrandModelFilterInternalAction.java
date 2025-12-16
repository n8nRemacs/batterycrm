package com.avito.android.newcars_mark_model_filter.presentation.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NewCarsBrandModelFilterInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Apply", "BrandsLoaded", "CancelSelection", "HideLoader", "LoadError", "ModelsLoaded", "Search", "SelectModel", "ShowLoader", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$Apply;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$BrandsLoaded;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$CancelSelection;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$HideLoader;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$LoadError;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$ModelsLoaded;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$Search;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$SelectModel;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$ShowLoader;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface NewCarsBrandModelFilterInternalAction extends n {

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$Apply;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Apply implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f207328b;

        public Apply(@k DeepLink deepLink) {
            this.f207328b = deepLink;
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$BrandsLoaded;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BrandsLoaded implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f207329b;

        public BrandsLoaded(@k List<a> list) {
            this.f207329b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BrandsLoaded) && L.f(this.f207329b, ((BrandsLoaded) obj).f207329b);
        }

        public final int hashCode() {
            return this.f207329b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("BrandsLoaded(sections="), this.f207329b, ')');
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$CancelSelection;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CancelSelection implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CancelSelection f207330b = new CancelSelection();

        private CancelSelection() {
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$HideLoader;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideLoader implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideLoader f207331b = new HideLoader();

        private HideLoader() {
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$LoadError;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadError implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f207332b;

        public LoadError(@k Throwable th2) {
            this.f207332b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadError) && L.f(this.f207332b, ((LoadError) obj).f207332b);
        }

        public final int hashCode() {
            return this.f207332b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadError(error="), this.f207332b, ')');
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$ModelsLoaded;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ModelsLoaded implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> f207333b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<Long> f207334c;

        public ModelsLoaded(@k List<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> list, @k List<Long> list2) {
            this.f207333b = list;
            this.f207334c = list2;
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$Search;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Search implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f207335b;

        public Search(@k String str) {
            this.f207335b = str;
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$SelectModel;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectModel implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f207336b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f207337c;

        public SelectModel(long j12, boolean z12) {
            this.f207336b = j12;
            this.f207337c = z12;
        }
    }

    /* compiled from: NewCarsBrandModelFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction$ShowLoader;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoader implements NewCarsBrandModelFilterInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoader f207338b = new ShowLoader();

        private ShowLoader() {
        }
    }
}
