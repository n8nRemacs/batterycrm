package com.avito.android.extended_profile_selection_create.name.mvi.entity;

import KA.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "EmptyNameError", "InitState", "IsPublicChange", "SetSelectionIncorrectValuesError", "SetSelectionNameError", "SetSelectionNameLoading", "SetSelectionNameSuccess", "TypingText", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$EmptyNameError;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$InitState;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$IsPublicChange;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionIncorrectValuesError;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionNameError;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionNameLoading;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionNameSuccess;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$TypingText;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ExtendedProfileSetSelectionNameInternalAction extends n {

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$EmptyNameError;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptyNameError implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptyNameError f151904b = new EmptyNameError();

        private EmptyNameError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof EmptyNameError);
        }

        public final int hashCode() {
            return 1863323182;
        }

        @k
        public final String toString() {
            return "EmptyNameError";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$InitState;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitState f151905b = new InitState();

        private InitState() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitState);
        }

        public final int hashCode() {
            return -45231133;
        }

        @k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$IsPublicChange;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsPublicChange implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f151906b;

        public IsPublicChange(boolean z12) {
            this.f151906b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IsPublicChange) && this.f151906b == ((IsPublicChange) obj).f151906b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f151906b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsPublicChange(isPublic="), this.f151906b, ')');
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionIncorrectValuesError;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionIncorrectValuesError implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151907b;

        public SetSelectionIncorrectValuesError(@k String str) {
            this.f151907b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSelectionIncorrectValuesError) && L.f(this.f151907b, ((SetSelectionIncorrectValuesError) obj).f151907b);
        }

        public final int hashCode() {
            return this.f151907b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetSelectionIncorrectValuesError(message="), this.f151907b, ')');
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionNameError;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionNameError implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f151908b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a.C0558a f151909c;

        public SetSelectionNameError(@k Throwable th2, @k a.C0558a c0558a) {
            this.f151908b = th2;
            this.f151909c = c0558a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSelectionNameError)) {
                return false;
            }
            SetSelectionNameError setSelectionNameError = (SetSelectionNameError) obj;
            return L.f(this.f151908b, setSelectionNameError.f151908b) && L.f(this.f151909c, setSelectionNameError.f151909c);
        }

        public final int hashCode() {
            int iHashCode = this.f151908b.hashCode() * 31;
            this.f151909c.getClass();
            return 1465398598 + iHashCode;
        }

        @k
        public final String toString() {
            return "SetSelectionNameError(throwable=" + this.f151908b + ", action=" + this.f151909c + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionNameLoading;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionNameLoading implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetSelectionNameLoading f151910b = new SetSelectionNameLoading();

        private SetSelectionNameLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetSelectionNameLoading);
        }

        public final int hashCode() {
            return 1321418121;
        }

        @k
        public final String toString() {
            return "SetSelectionNameLoading";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$SetSelectionNameSuccess;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionNameSuccess implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151911b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f151912c;

        public SetSelectionNameSuccess(@k String str, boolean z12) {
            this.f151911b = str;
            this.f151912c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSelectionNameSuccess)) {
                return false;
            }
            SetSelectionNameSuccess setSelectionNameSuccess = (SetSelectionNameSuccess) obj;
            return L.f(this.f151911b, setSelectionNameSuccess.f151911b) && this.f151912c == setSelectionNameSuccess.f151912c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f151912c) + (this.f151911b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetSelectionNameSuccess(name=");
            sb2.append(this.f151911b);
            sb2.append(", isPublic=");
            return r.x(sb2, this.f151912c, ')');
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction$TypingText;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TypingText implements ExtendedProfileSetSelectionNameInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151913b;

        public TypingText(@k String str) {
            this.f151913b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypingText) && L.f(this.f151913b, ((TypingText) obj).f151913b);
        }

        public final int hashCode() {
            return this.f151913b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TypingText(text="), this.f151913b, ')');
        }
    }
}
