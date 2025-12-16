package com.avito.android.edit_count_field.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditCountFieldInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "IncorrectValuesError", "Loading", "SetButtonEnabled", "SetCount", "SetValidationText", "SubmitSuccess", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$Error;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$IncorrectValuesError;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$Loading;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SetButtonEnabled;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SetCount;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SetValidationText;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SubmitSuccess;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EditCountFieldInternalAction extends n {

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$Error;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f146642b;

        public Error(@k Throwable th2) {
            this.f146642b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f146642b, ((Error) obj).f146642b);
        }

        public final int hashCode() {
            return this.f146642b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f146642b, ')');
        }
    }

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$IncorrectValuesError;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectValuesError implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146643b;

        public IncorrectValuesError(@k String str) {
            this.f146643b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncorrectValuesError) && L.f(this.f146643b, ((IncorrectValuesError) obj).f146643b);
        }

        public final int hashCode() {
            return this.f146643b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("IncorrectValuesError(message="), this.f146643b, ')');
        }
    }

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$Loading;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f146644b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1270628997;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SetButtonEnabled;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetButtonEnabled implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f146645b;

        public SetButtonEnabled(boolean z12) {
            this.f146645b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetButtonEnabled) && this.f146645b == ((SetButtonEnabled) obj).f146645b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f146645b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetButtonEnabled(isEnabled="), this.f146645b, ')');
        }
    }

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SetCount;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetCount implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f146646b;

        public SetCount(@l Integer num) {
            this.f146646b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetCount) && L.f(this.f146646b, ((SetCount) obj).f146646b);
        }

        public final int hashCode() {
            Integer num = this.f146646b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("SetCount(count="), this.f146646b, ')');
        }
    }

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SetValidationText;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetValidationText implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f146647b;

        public SetValidationText(@l PrintableText printableText) {
            this.f146647b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetValidationText) && L.f(this.f146647b, ((SetValidationText) obj).f146647b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f146647b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("SetValidationText(text="), this.f146647b, ')');
        }
    }

    /* compiled from: EditCountFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction$SubmitSuccess;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitSuccess implements EditCountFieldInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f146648b;

        public SubmitSuccess(boolean z12) {
            this.f146648b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitSuccess) && this.f146648b == ((SubmitSuccess) obj).f146648b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f146648b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SubmitSuccess(isChanged="), this.f146648b, ')');
        }
    }
}
