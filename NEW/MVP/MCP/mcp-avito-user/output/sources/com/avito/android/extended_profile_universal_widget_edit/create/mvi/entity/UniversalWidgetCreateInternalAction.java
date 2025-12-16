package com.avito.android.extended_profile_universal_widget_edit.create.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import hB.InterfaceC40798a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Error", "IncorrectValues", "InitState", "Loading", "Success", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Close;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Error;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$IncorrectValues;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$InitState;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Loading;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Success;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface UniversalWidgetCreateInternalAction extends n {

    /* compiled from: UniversalWidgetCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Close;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements UniversalWidgetCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f153759b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 2119189967;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: UniversalWidgetCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Error;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements UniversalWidgetCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f153760b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC40798a.b f153761c;

        public Error(@k Throwable th2, @k InterfaceC40798a.b bVar) {
            this.f153760b = th2;
            this.f153761c = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f153760b, error.f153760b) && this.f153761c.equals(error.f153761c);
        }

        public final int hashCode() {
            return this.f153761c.f397093a.hashCode() + (this.f153760b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Error(throwable=" + this.f153760b + ", retryAction=" + this.f153761c + ')';
        }
    }

    /* compiled from: UniversalWidgetCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$IncorrectValues;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectValues implements UniversalWidgetCreateInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IncorrectValues)) {
                return false;
            }
            ((IncorrectValues) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "IncorrectValues(message=null)";
        }
    }

    /* compiled from: UniversalWidgetCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$InitState;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements UniversalWidgetCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitState f153762b = new InitState();

        private InitState() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitState);
        }

        public final int hashCode() {
            return -1158693448;
        }

        @k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: UniversalWidgetCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Loading;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements UniversalWidgetCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f153763b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 197177171;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: UniversalWidgetCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction$Success;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements UniversalWidgetCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f153764b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalWidgetEditArguments f153765c;

        public Success(@k String str, @k UniversalWidgetEditArguments universalWidgetEditArguments) {
            this.f153764b = str;
            this.f153765c = universalWidgetEditArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return L.f(this.f153764b, success.f153764b) && L.f(this.f153765c, success.f153765c);
        }

        public final int hashCode() {
            return this.f153765c.hashCode() + (this.f153764b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Success(valueId=" + this.f153764b + ", editArguments=" + this.f153765c + ')';
        }
    }
}
