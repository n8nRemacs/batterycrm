package com.avito.android.spare_parts.bottom_sheet.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.models.SparePartsGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsBottomSheetInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddGroup", "Close", "InitRootGroup", "PopGroupsStack", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$AddGroup;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$Close;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$InitRootGroup;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$PopGroupsStack;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SparePartsBottomSheetInternalAction extends n {

    /* compiled from: SparePartsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$AddGroup;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddGroup implements SparePartsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SparePartsGroup f284804b;

        public AddGroup(@k SparePartsGroup sparePartsGroup) {
            this.f284804b = sparePartsGroup;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddGroup) && L.f(this.f284804b, ((AddGroup) obj).f284804b);
        }

        public final int hashCode() {
            return this.f284804b.hashCode();
        }

        @k
        public final String toString() {
            return "AddGroup(group=" + this.f284804b + ')';
        }
    }

    /* compiled from: SparePartsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$Close;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements SparePartsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f284805b = new Close();

        private Close() {
        }
    }

    /* compiled from: SparePartsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$InitRootGroup;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitRootGroup implements SparePartsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SparePartsGroup f284806b;

        public InitRootGroup(@k SparePartsGroup sparePartsGroup) {
            this.f284806b = sparePartsGroup;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitRootGroup) && L.f(this.f284806b, ((InitRootGroup) obj).f284806b);
        }

        public final int hashCode() {
            return this.f284806b.hashCode();
        }

        @k
        public final String toString() {
            return "InitRootGroup(group=" + this.f284806b + ')';
        }
    }

    /* compiled from: SparePartsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction$PopGroupsStack;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PopGroupsStack implements SparePartsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PopGroupsStack f284807b = new PopGroupsStack();

        private PopGroupsStack() {
        }
    }
}
