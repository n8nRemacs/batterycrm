package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity;

import AK.c;
import X41.g;
import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorRegionInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearAlertDialog", "CloseScreen", "FooterChanged", "InitScreen", "SettingsChanged", "ShowExitAlertDialog", "TermsSavingFailed", "TermsSavingStarted", "TermsSavingSuccess", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$ClearAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$CloseScreen;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$FooterChanged;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$InitScreen;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$SettingsChanged;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$ShowExitAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$TermsSavingFailed;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$TermsSavingStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$TermsSavingSuccess;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface TarifikatorRegionInternalAction extends n {

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$ClearAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearAlertDialog implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearAlertDialog f135809b = new ClearAlertDialog();

        private ClearAlertDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearAlertDialog);
        }

        public final int hashCode() {
            return -1276376310;
        }

        @k
        public final String toString() {
            return "ClearAlertDialog";
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$CloseScreen;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f135810b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 465009361;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$FooterChanged;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "footer", "Lcom/avito/android/remote/model/text/AttributedText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FooterChanged implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f135811b;

        public final boolean equals(Object obj) {
            if (obj instanceof FooterChanged) {
                return L.f(this.f135811b, ((FooterChanged) obj).f135811b);
            }
            return false;
        }

        public final int hashCode() {
            AttributedText attributedText = this.f135811b;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        public final String toString() {
            return "FooterChanged(footer=" + this.f135811b + ')';
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$InitScreen;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitScreen implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f135812b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f135813c;

        public InitScreen(@k String str, @l AttributedText attributedText) {
            this.f135812b = str;
            this.f135813c = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitScreen)) {
                return false;
            }
            InitScreen initScreen = (InitScreen) obj;
            return L.f(this.f135812b, initScreen.f135812b) && L.f(this.f135813c, initScreen.f135813c);
        }

        public final int hashCode() {
            int iHashCode = this.f135812b.hashCode() * 31;
            AttributedText attributedText = this.f135813c;
            return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitScreen(regionName=");
            sb2.append(this.f135812b);
            sb2.append(", footer=");
            return a.w(sb2, this.f135813c, ')');
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$SettingsChanged;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "settings", "LOv/n;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SettingsChanged implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Ov.n f135814b;

        private /* synthetic */ SettingsChanged(Ov.n nVar) {
            this.f135814b = nVar;
        }

        public static final /* synthetic */ SettingsChanged c(Ov.n nVar) {
            return new SettingsChanged(nVar);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SettingsChanged) {
                return L.f(this.f135814b, ((SettingsChanged) obj).f135814b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f135814b.hashCode();
        }

        public final String toString() {
            return "SettingsChanged(settings=" + this.f135814b + ')';
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$ShowExitAlertDialog;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowExitAlertDialog implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowExitAlertDialog f135815b = new ShowExitAlertDialog();

        private ShowExitAlertDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowExitAlertDialog);
        }

        public final int hashCode() {
            return -1203683754;
        }

        @k
        public final String toString() {
            return "ShowExitAlertDialog";
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$TermsSavingFailed;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TermsSavingFailed implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f135816b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f135817c;

        public TermsSavingFailed(@l PrintableText printableText, @k Throwable th2) {
            this.f135816b = th2;
            this.f135817c = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsSavingFailed)) {
                return false;
            }
            TermsSavingFailed termsSavingFailed = (TermsSavingFailed) obj;
            return L.f(this.f135816b, termsSavingFailed.f135816b) && L.f(this.f135817c, termsSavingFailed.f135817c);
        }

        public final int hashCode() {
            int iHashCode = this.f135816b.hashCode() * 31;
            PrintableText printableText = this.f135817c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TermsSavingFailed(error=");
            sb2.append(this.f135816b);
            sb2.append(", message=");
            return c.m(sb2, this.f135817c, ')');
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$TermsSavingStarted;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TermsSavingStarted implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TermsSavingStarted f135818b = new TermsSavingStarted();

        private TermsSavingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof TermsSavingStarted);
        }

        public final int hashCode() {
            return -636041485;
        }

        @k
        public final String toString() {
            return "TermsSavingStarted";
        }
    }

    /* compiled from: TarifikatorRegionInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction$TermsSavingSuccess;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TermsSavingSuccess implements TarifikatorRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f135819b;

        private /* synthetic */ TermsSavingSuccess(PrintableText printableText) {
            this.f135819b = printableText;
        }

        public static final /* synthetic */ TermsSavingSuccess c(PrintableText printableText) {
            return new TermsSavingSuccess(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TermsSavingSuccess) {
                return L.f(this.f135819b, ((TermsSavingSuccess) obj).f135819b);
            }
            return false;
        }

        public final int hashCode() {
            PrintableText printableText = this.f135819b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        public final String toString() {
            return "TermsSavingSuccess(message=" + this.f135819b + ')';
        }
    }
}
