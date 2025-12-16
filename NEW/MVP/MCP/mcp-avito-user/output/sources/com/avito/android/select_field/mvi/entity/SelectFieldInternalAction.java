package com.avito.android.select_field.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectFieldInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "IncorrectValuesError", "Loading", "OpenSelector", "SelectItem", "SubmitSuccess", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$Error;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$IncorrectValuesError;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$Loading;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$OpenSelector;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$SelectItem;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$SubmitSuccess;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectFieldInternalAction extends n {

    /* compiled from: SelectFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$Error;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements SelectFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f267196b;

        public Error(@k Throwable th2) {
            this.f267196b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f267196b, ((Error) obj).f267196b);
        }

        public final int hashCode() {
            return this.f267196b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f267196b, ')');
        }
    }

    /* compiled from: SelectFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$IncorrectValuesError;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectValuesError implements SelectFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f267197b;

        public IncorrectValuesError(@k String str) {
            this.f267197b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncorrectValuesError) && L.f(this.f267197b, ((IncorrectValuesError) obj).f267197b);
        }

        public final int hashCode() {
            return this.f267197b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("IncorrectValuesError(message="), this.f267197b, ')');
        }
    }

    /* compiled from: SelectFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$Loading;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements SelectFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f267198b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1980728338;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SelectFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$OpenSelector;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelector implements SelectFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f267199b;

        public OpenSelector(@k Arguments arguments) {
            this.f267199b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSelector) && L.f(this.f267199b, ((OpenSelector) obj).f267199b);
        }

        public final int hashCode() {
            return this.f267199b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OpenSelector(arguments="), this.f267199b, ')');
        }
    }

    /* compiled from: SelectFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$SelectItem;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectItem implements SelectFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final SelectItem.Option f267200b;

        public SelectItem(@l SelectItem.Option option) {
            this.f267200b = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectItem) && L.f(this.f267200b, ((SelectItem) obj).f267200b);
        }

        public final int hashCode() {
            SelectItem.Option option = this.f267200b;
            if (option == null) {
                return 0;
            }
            return option.hashCode();
        }

        @k
        public final String toString() {
            return "SelectItem(option=" + this.f267200b + ')';
        }
    }

    /* compiled from: SelectFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction$SubmitSuccess;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitSuccess implements SelectFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f267201b;

        public SubmitSuccess(boolean z12) {
            this.f267201b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitSuccess) && this.f267201b == ((SubmitSuccess) obj).f267201b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f267201b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SubmitSuccess(isChanged="), this.f267201b, ')');
        }
    }
}
