package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.n;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetGroupInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "InitContent", "OnClearClicked", "OnExpandButtonClicked", "OnItemClicked", "OnSubmitClicked", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$InitContent;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnClearClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnExpandButtonClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnItemClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnSubmitClicked;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BottomSheetGroupInternalAction extends n {

    /* compiled from: BottomSheetGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$InitContent;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitContent implements BottomSheetGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitContent f107248b = new InitContent();

        private InitContent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitContent);
        }

        public final int hashCode() {
            return -379394101;
        }

        @k
        public final String toString() {
            return "InitContent";
        }
    }

    /* compiled from: BottomSheetGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnClearClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnClearClicked implements BottomSheetGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnClearClicked f107249b = new OnClearClicked();

        private OnClearClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnClearClicked);
        }

        public final int hashCode() {
            return -846839081;
        }

        @k
        public final String toString() {
            return "OnClearClicked";
        }
    }

    /* compiled from: BottomSheetGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnExpandButtonClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnExpandButtonClicked implements BottomSheetGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f107250b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f107251c;

        public OnExpandButtonClicked(@k String str, boolean z12) {
            this.f107250b = str;
            this.f107251c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnExpandButtonClicked)) {
                return false;
            }
            OnExpandButtonClicked onExpandButtonClicked = (OnExpandButtonClicked) obj;
            return L.f(this.f107250b, onExpandButtonClicked.f107250b) && this.f107251c == onExpandButtonClicked.f107251c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f107251c) + (this.f107250b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnExpandButtonClicked(id=");
            sb2.append(this.f107250b);
            sb2.append(", isExpanded=");
            return r.x(sb2, this.f107251c, ')');
        }
    }

    /* compiled from: BottomSheetGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnItemClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnItemClicked implements BottomSheetGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f107252b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f107253c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f107254d;

        public OnItemClicked(@k String str, @k String str2, boolean z12) {
            this.f107252b = str;
            this.f107253c = str2;
            this.f107254d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnItemClicked)) {
                return false;
            }
            OnItemClicked onItemClicked = (OnItemClicked) obj;
            return L.f(this.f107252b, onItemClicked.f107252b) && L.f(this.f107253c, onItemClicked.f107253c) && this.f107254d == onItemClicked.f107254d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f107254d) + H.d(this.f107252b.hashCode() * 31, 31, this.f107253c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnItemClicked(id=");
            sb2.append(this.f107252b);
            sb2.append(", paramId=");
            sb2.append(this.f107253c);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f107254d, ')');
        }
    }

    /* compiled from: BottomSheetGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction$OnSubmitClicked;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSubmitClicked implements BottomSheetGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f107255b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Set<String>> f107256c;

        /* JADX WARN: Multi-variable type inference failed */
        public OnSubmitClicked(@k String str, @k Map<String, ? extends Set<String>> map) {
            this.f107255b = str;
            this.f107256c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSubmitClicked)) {
                return false;
            }
            OnSubmitClicked onSubmitClicked = (OnSubmitClicked) obj;
            return L.f(this.f107255b, onSubmitClicked.f107255b) && L.f(this.f107256c, onSubmitClicked.f107256c);
        }

        public final int hashCode() {
            return this.f107256c.hashCode() + (this.f107255b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSubmitClicked(id=");
            sb2.append(this.f107255b);
            sb2.append(", selected=");
            return r.w(sb2, this.f107256c, ')');
        }
    }
}
