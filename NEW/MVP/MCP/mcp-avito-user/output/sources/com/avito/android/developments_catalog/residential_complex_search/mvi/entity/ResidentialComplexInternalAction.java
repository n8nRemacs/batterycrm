package com.avito.android.developments_catalog.residential_complex_search.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import jx.C42440b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearSearchField", "CloseScreen", "Error", "ReturnItemResult", "SearchDataLoaded", "SearchFieldInput", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$ClearSearchField;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$CloseScreen;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$Error;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$ReturnItemResult;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$SearchDataLoaded;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$SearchFieldInput;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ResidentialComplexInternalAction extends n {

    /* compiled from: ResidentialComplexInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$ClearSearchField;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearSearchField implements ResidentialComplexInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSearchField f139207b = new ClearSearchField();

        private ClearSearchField() {
        }
    }

    /* compiled from: ResidentialComplexInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$CloseScreen;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements ResidentialComplexInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f139208b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: ResidentialComplexInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$Error;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ResidentialComplexInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f139209b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f139210c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f139211d;

        public Error(@k ApiError apiError, @k String str) {
            this.f139209b = str;
            this.f139210c = apiError;
            this.f139211d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f139209b, error.f139209b) && L.f(this.f139210c, error.f139210c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF213835c() {
            return this.f139211d;
        }

        public final int hashCode() {
            return this.f139210c.hashCode() + (this.f139209b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f139209b);
            sb2.append(", error=");
            return c.n(sb2, this.f139210c, ')');
        }
    }

    /* compiled from: ResidentialComplexInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$ReturnItemResult;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReturnItemResult implements ResidentialComplexInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f139212b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f139213c;

        public ReturnItemResult(int i12, @k String str) {
            this.f139212b = i12;
            this.f139213c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReturnItemResult)) {
                return false;
            }
            ReturnItemResult returnItemResult = (ReturnItemResult) obj;
            return this.f139212b == returnItemResult.f139212b && L.f(this.f139213c, returnItemResult.f139213c);
        }

        public final int hashCode() {
            return this.f139213c.hashCode() + (Integer.hashCode(this.f139212b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReturnItemResult(id=");
            sb2.append(this.f139212b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f139213c, ')');
        }
    }

    /* compiled from: ResidentialComplexInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$SearchDataLoaded;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchDataLoaded implements ResidentialComplexInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f139214b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f139215c;

        public SearchDataLoaded(@k List<C42440b> list, @k String str) {
            this.f139214b = list;
            this.f139215c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchDataLoaded)) {
                return false;
            }
            SearchDataLoaded searchDataLoaded = (SearchDataLoaded) obj;
            return L.f(this.f139214b, searchDataLoaded.f139214b) && L.f(this.f139215c, searchDataLoaded.f139215c);
        }

        public final int hashCode() {
            return this.f139215c.hashCode() + (this.f139214b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchDataLoaded(items=");
            sb2.append(this.f139214b);
            sb2.append(", searchValue=");
            return C22026a.c(sb2, this.f139215c, ')');
        }
    }

    /* compiled from: ResidentialComplexInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction$SearchFieldInput;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchFieldInput implements ResidentialComplexInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f139216b;

        public SearchFieldInput(@k String str) {
            this.f139216b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchFieldInput) && L.f(this.f139216b, ((SearchFieldInput) obj).f139216b);
        }

        public final int hashCode() {
            return this.f139216b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchFieldInput(value="), this.f139216b, ')');
        }
    }
}
