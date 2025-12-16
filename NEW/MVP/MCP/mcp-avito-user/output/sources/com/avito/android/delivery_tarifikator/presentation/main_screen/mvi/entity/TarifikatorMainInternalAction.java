package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity;

import AK.c;
import Ov.p;
import Tv.InterfaceC15412c;
import X41.g;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.delivery_tarifikator.domain.Y;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorMainInternalAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearAlertDialog", "CloseScreen", "LoadingFailed", "LoadingSuccess", "OpenRegionSettings", "SetScreenName", "ShowAlertDialog", "ShowDeleteTariffDialog", "TariffDeleteFailure", "TariffDeleteStarted", "TariffDeleteSuccess", "TariffEditorSuccess", "TermsLoadingStarted", "TermsSavingFailed", "TermsSavingStarted", "TermsSavingSuccess", "UpdateScreenContent", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$ClearAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$CloseScreen;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$LoadingFailed;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$LoadingSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$OpenRegionSettings;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$SetScreenName;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$ShowAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$ShowDeleteTariffDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffDeleteFailure;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffDeleteStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffDeleteSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffEditorSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsLoadingStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsSavingFailed;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsSavingStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsSavingSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$UpdateScreenContent;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface TarifikatorMainInternalAction extends n {

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$ClearAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearAlertDialog implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearAlertDialog f135639b = new ClearAlertDialog();

        private ClearAlertDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearAlertDialog);
        }

        public final int hashCode() {
            return -1622259584;
        }

        @k
        public final String toString() {
            return "ClearAlertDialog";
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$CloseScreen;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f135640b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -860476517;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$LoadingFailed;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements TarifikatorMainInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f135641b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f135642c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f135643d;

        public LoadingFailed(@k Throwable th2, boolean z12) {
            this.f135641b = th2;
            this.f135642c = z12;
            this.f135643d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            if (!(obj instanceof LoadingFailed)) {
                return false;
            }
            LoadingFailed loadingFailed = (LoadingFailed) obj;
            return this.f135641b.equals(loadingFailed.f135641b) && this.f135642c == loadingFailed.f135642c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF82203c() {
            return this.f135643d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f135642c) + (this.f135641b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingFailed(error=");
            sb2.append(this.f135641b);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f135642c, ')');
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$LoadingSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingSuccess implements TarifikatorMainInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingSuccess f135644b = new LoadingSuccess();

        private LoadingSuccess() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingSuccess);
        }

        public final int hashCode() {
            return -507317072;
        }

        @k
        public final String toString() {
            return "LoadingSuccess";
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$OpenRegionSettings;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "regionName", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenRegionSettings implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f135645b;

        private /* synthetic */ OpenRegionSettings(String str) {
            this.f135645b = str;
        }

        public static final /* synthetic */ OpenRegionSettings c(String str) {
            return new OpenRegionSettings(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OpenRegionSettings) {
                return L.f(this.f135645b, ((OpenRegionSettings) obj).f135645b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f135645b.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("OpenRegionSettings(regionName="), this.f135645b, ')');
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$SetScreenName;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "screenName", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SetScreenName implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f135646b;

        private /* synthetic */ SetScreenName(String str) {
            this.f135646b = str;
        }

        public static final /* synthetic */ SetScreenName c(String str) {
            return new SetScreenName(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SetScreenName) {
                return L.f(this.f135646b, ((SetScreenName) obj).f135646b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f135646b.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("SetScreenName(screenName="), this.f135646b, ')');
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$ShowAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAlertDialog implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AlertReason f135647b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC15412c f135648c;

        public ShowAlertDialog(@k AlertReason alertReason, @k InterfaceC15412c interfaceC15412c) {
            this.f135647b = alertReason;
            this.f135648c = interfaceC15412c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAlertDialog)) {
                return false;
            }
            ShowAlertDialog showAlertDialog = (ShowAlertDialog) obj;
            return this.f135647b == showAlertDialog.f135647b && L.f(this.f135648c, showAlertDialog.f135648c);
        }

        public final int hashCode() {
            return this.f135648c.hashCode() + (this.f135647b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowAlertDialog(reason=" + this.f135647b + ", confirmAction=" + this.f135648c + ')';
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$ShowDeleteTariffDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDeleteTariffDialog implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f135649b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f135650c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Y f135651d;

        public ShowDeleteTariffDialog(long j12, @k String str, @k Y y12) {
            this.f135649b = j12;
            this.f135650c = str;
            this.f135651d = y12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowDeleteTariffDialog)) {
                return false;
            }
            ShowDeleteTariffDialog showDeleteTariffDialog = (ShowDeleteTariffDialog) obj;
            return this.f135649b == showDeleteTariffDialog.f135649b && L.f(this.f135650c, showDeleteTariffDialog.f135650c) && L.f(this.f135651d, showDeleteTariffDialog.f135651d);
        }

        public final int hashCode() {
            return this.f135651d.hashCode() + H.d(Long.hashCode(this.f135649b) * 31, 31, this.f135650c);
        }

        @k
        public final String toString() {
            return "ShowDeleteTariffDialog(tariffId=" + this.f135649b + ", tariffName=" + this.f135650c + ", tariffUsage=" + this.f135651d + ')';
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffDeleteFailure;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TariffDeleteFailure implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f135652b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f135653c;

        public TariffDeleteFailure(@k ApiException apiException, @l PrintableText printableText) {
            this.f135652b = apiException;
            this.f135653c = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffDeleteFailure)) {
                return false;
            }
            TariffDeleteFailure tariffDeleteFailure = (TariffDeleteFailure) obj;
            return this.f135652b.equals(tariffDeleteFailure.f135652b) && L.f(this.f135653c, tariffDeleteFailure.f135653c);
        }

        public final int hashCode() {
            int iHashCode = this.f135652b.hashCode() * 31;
            PrintableText printableText = this.f135653c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TariffDeleteFailure(error=");
            sb2.append(this.f135652b);
            sb2.append(", message=");
            return c.m(sb2, this.f135653c, ')');
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffDeleteStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TariffDeleteStarted implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TariffDeleteStarted f135654b = new TariffDeleteStarted();

        private TariffDeleteStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TariffDeleteStarted);
        }

        public final int hashCode() {
            return -1536863831;
        }

        @k
        public final String toString() {
            return "TariffDeleteStarted";
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffDeleteSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TariffDeleteSuccess implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f135655b;

        private /* synthetic */ TariffDeleteSuccess(PrintableText printableText) {
            this.f135655b = printableText;
        }

        public static final /* synthetic */ TariffDeleteSuccess c(PrintableText printableText) {
            return new TariffDeleteSuccess(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TariffDeleteSuccess) {
                return L.f(this.f135655b, ((TariffDeleteSuccess) obj).f135655b);
            }
            return false;
        }

        public final int hashCode() {
            PrintableText printableText = this.f135655b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        public final String toString() {
            return "TariffDeleteSuccess(message=" + this.f135655b + ')';
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TariffEditorSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TariffEditorSuccess implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TariffEditorSuccess f135656b = new TariffEditorSuccess();

        private TariffEditorSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TariffEditorSuccess);
        }

        public final int hashCode() {
            return 2142852905;
        }

        @k
        public final String toString() {
            return "TariffEditorSuccess";
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsLoadingStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TermsLoadingStarted extends TrackableLoadingStarted implements TarifikatorMainInternalAction {
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsSavingFailed;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TermsSavingFailed implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f135657b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f135658c;

        public TermsSavingFailed(@k ApiException apiException, @l PrintableText printableText) {
            this.f135657b = apiException;
            this.f135658c = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsSavingFailed)) {
                return false;
            }
            TermsSavingFailed termsSavingFailed = (TermsSavingFailed) obj;
            return this.f135657b.equals(termsSavingFailed.f135657b) && L.f(this.f135658c, termsSavingFailed.f135658c);
        }

        public final int hashCode() {
            int iHashCode = this.f135657b.hashCode() * 31;
            PrintableText printableText = this.f135658c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TermsSavingFailed(error=");
            sb2.append(this.f135657b);
            sb2.append(", message=");
            return c.m(sb2, this.f135658c, ')');
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsSavingStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TermsSavingStarted implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TermsSavingStarted f135659b = new TermsSavingStarted();

        private TermsSavingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TermsSavingStarted);
        }

        public final int hashCode() {
            return 1977581289;
        }

        @k
        public final String toString() {
            return "TermsSavingStarted";
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$TermsSavingSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TermsSavingSuccess implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f135660b;

        private /* synthetic */ TermsSavingSuccess(PrintableText printableText) {
            this.f135660b = printableText;
        }

        public static final /* synthetic */ TermsSavingSuccess c(PrintableText printableText) {
            return new TermsSavingSuccess(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TermsSavingSuccess) {
                return L.f(this.f135660b, ((TermsSavingSuccess) obj).f135660b);
            }
            return false;
        }

        public final int hashCode() {
            PrintableText printableText = this.f135660b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        public final String toString() {
            return "TermsSavingSuccess(message=" + this.f135660b + ')';
        }
    }

    /* compiled from: TarifikatorMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction$UpdateScreenContent;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateScreenContent implements TarifikatorMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p f135661b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Ov.n f135662c;

        public UpdateScreenContent(@k p pVar, @k Ov.n nVar) {
            this.f135661b = pVar;
            this.f135662c = nVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateScreenContent)) {
                return false;
            }
            UpdateScreenContent updateScreenContent = (UpdateScreenContent) obj;
            return L.f(this.f135661b, updateScreenContent.f135661b) && L.f(this.f135662c, updateScreenContent.f135662c);
        }

        public final int hashCode() {
            return this.f135662c.hashCode() + (this.f135661b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "UpdateScreenContent(tarifikatorUiData=" + this.f135661b + ", settings=" + this.f135662c + ')';
        }
    }
}
