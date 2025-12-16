package com.avito.android.tariff.cpx.configure.advance_manual.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.remote.model.cpx.CpxConfigureAdvanceManualResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "HandleDeepLink", "HandleRequestDeepLink", "InputChange", "InvalidAdvance", "SaveStatusChanges", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$Content;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$HandleDeepLink;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$HandleRequestDeepLink;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$InputChange;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$InvalidAdvance;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$SaveStatusChanges;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CpxConfigureAdvanceManualInternalAction extends n {

    /* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$Content;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CpxConfigureAdvanceManualInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxConfigureAdvanceManualResult f295839b;

        public Content(@k CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult) {
            this.f295839b = cpxConfigureAdvanceManualResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof Content) && L.f(this.f295839b, ((Content) obj).f295839b);
        }

        public final int hashCode() {
            return this.f295839b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f295839b + ')';
        }
    }

    /* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$HandleDeepLink;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeepLink implements CpxConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f295840b;

        public HandleDeepLink(@k DeepLink deepLink) {
            this.f295840b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeepLink) && L.f(this.f295840b, ((HandleDeepLink) obj).f295840b);
        }

        public final int hashCode() {
            return this.f295840b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeepLink(deeplink="), this.f295840b, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$HandleRequestDeepLink;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleRequestDeepLink implements CpxConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f295841b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f295842c;

        public HandleRequestDeepLink(@l DeepLink deepLink, @l String str) {
            this.f295841b = deepLink;
            this.f295842c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleRequestDeepLink)) {
                return false;
            }
            HandleRequestDeepLink handleRequestDeepLink = (HandleRequestDeepLink) obj;
            return L.f(this.f295841b, handleRequestDeepLink.f295841b) && L.f(this.f295842c, handleRequestDeepLink.f295842c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f295841b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.f295842c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleRequestDeepLink(deeplink=");
            sb2.append(this.f295841b);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f295842c, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$InputChange;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements CpxConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f295843b;

        public InputChange(@k String str) {
            this.f295843b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChange) && L.f(this.f295843b, ((InputChange) obj).f295843b);
        }

        public final int hashCode() {
            return this.f295843b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(text="), this.f295843b, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$InvalidAdvance;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidAdvance implements CpxConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InvalidAdvance f295844b = new InvalidAdvance();

        private InvalidAdvance() {
        }
    }

    /* compiled from: CpxConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction$SaveStatusChanges;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveStatusChanges implements CpxConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f295845b;

        public SaveStatusChanges(boolean z12) {
            this.f295845b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveStatusChanges) && this.f295845b == ((SaveStatusChanges) obj).f295845b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f295845b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SaveStatusChanges(isLoading="), this.f295845b, ')');
        }
    }
}
