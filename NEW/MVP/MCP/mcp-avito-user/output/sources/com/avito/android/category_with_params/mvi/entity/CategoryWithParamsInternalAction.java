package com.avito.android.category_with_params.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.category_with_params.entity.CategoryParams;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryWithParamsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CategoryWithParamsDataReceived", "FinishScreenWithResult", "ToggleOption", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction$CategoryWithParamsDataReceived;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction$FinishScreenWithResult;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction$ToggleOption;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CategoryWithParamsInternalAction extends n {

    /* compiled from: CategoryWithParamsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction$CategoryWithParamsDataReceived;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CategoryWithParamsDataReceived implements CategoryWithParamsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CategoryParams f117689b;

        public CategoryWithParamsDataReceived(@k CategoryParams categoryParams) {
            this.f117689b = categoryParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryWithParamsDataReceived) && L.f(this.f117689b, ((CategoryWithParamsDataReceived) obj).f117689b);
        }

        public final int hashCode() {
            return this.f117689b.hashCode();
        }

        @k
        public final String toString() {
            return "CategoryWithParamsDataReceived(params=" + this.f117689b + ')';
        }
    }

    /* compiled from: CategoryWithParamsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction$FinishScreenWithResult;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishScreenWithResult implements CategoryWithParamsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f117690b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f117691c;

        public FinishScreenWithResult(@k ArrayList arrayList, boolean z12) {
            this.f117690b = arrayList;
            this.f117691c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinishScreenWithResult)) {
                return false;
            }
            FinishScreenWithResult finishScreenWithResult = (FinishScreenWithResult) obj;
            return this.f117690b.equals(finishScreenWithResult.f117690b) && this.f117691c == finishScreenWithResult.f117691c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f117691c) + (this.f117690b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishScreenWithResult(ids=");
            sb2.append(this.f117690b);
            sb2.append(", applyFilter=");
            return r.x(sb2, this.f117691c, ')');
        }
    }

    /* compiled from: CategoryWithParamsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction$ToggleOption;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleOption implements CategoryWithParamsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f117692b;

        public ToggleOption(@k String str) {
            this.f117692b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleOption) && L.f(this.f117692b, ((ToggleOption) obj).f117692b);
        }

        public final int hashCode() {
            return this.f117692b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToggleOption(id="), this.f117692b, ')');
        }
    }
}
