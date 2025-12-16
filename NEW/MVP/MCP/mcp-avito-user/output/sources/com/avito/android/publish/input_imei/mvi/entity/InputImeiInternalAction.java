package com.avito.android.publish.input_imei.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.component.toolbar.d;

/* compiled from: InputImeiInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddScanButton", "ConfigureAppBar", "Error", "SaveAndExit", "ScanImei", "ShowOnboarding", "UpdateImeiText", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$AddScanButton;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$ConfigureAppBar;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$Error;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$SaveAndExit;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$ScanImei;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$ShowOnboarding;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$UpdateImeiText;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface InputImeiInternalAction extends n {

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$AddScanButton;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddScanButton implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CategoryPublishStep.Params.ScanButtonData.Position f236384b;

        public AddScanButton(@k CategoryPublishStep.Params.ScanButtonData.Position position) {
            this.f236384b = position;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddScanButton) && this.f236384b == ((AddScanButton) obj).f236384b;
        }

        public final int hashCode() {
            return this.f236384b.hashCode();
        }

        @k
        public final String toString() {
            return "AddScanButton(scanButtonPosition=" + this.f236384b + ')';
        }
    }

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$ConfigureAppBar;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfigureAppBar implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f236385b;

        public ConfigureAppBar(@l Boolean bool) {
            this.f236385b = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigureAppBar) && L.f(this.f236385b, ((ConfigureAppBar) obj).f236385b);
        }

        public final int hashCode() {
            Boolean bool = this.f236385b;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @k
        public final String toString() {
            return C0.g(new StringBuilder("ConfigureAppBar(shouldSaveDraft="), this.f236385b, ')');
        }
    }

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$Error;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f236386b;

        public Error(@k PrintableText printableText) {
            this.f236386b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f236386b, ((Error) obj).f236386b);
        }

        public final int hashCode() {
            return this.f236386b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("Error(message="), this.f236386b, ')');
        }
    }

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$SaveAndExit;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveAndExit implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SaveAndExit f236387b = new SaveAndExit();

        private SaveAndExit() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SaveAndExit);
        }

        public final int hashCode() {
            return -365654695;
        }

        @k
        public final String toString() {
            return "SaveAndExit";
        }
    }

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$ScanImei;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScanImei implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScanImei f236388b = new ScanImei();

        private ScanImei() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScanImei);
        }

        public final int hashCode() {
            return 1548235396;
        }

        @k
        public final String toString() {
            return "ScanImei";
        }
    }

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$ShowOnboarding;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOnboarding implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f236389b;

        public ShowOnboarding(@k d dVar) {
            this.f236389b = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowOnboarding) && L.f(this.f236389b, ((ShowOnboarding) obj).f236389b);
        }

        public final int hashCode() {
            return this.f236389b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboardingData=" + this.f236389b + ')';
        }
    }

    /* compiled from: InputImeiInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction$UpdateImeiText;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateImeiText implements InputImeiInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f236390b;

        public UpdateImeiText(@k String str) {
            this.f236390b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateImeiText) && L.f(this.f236390b, ((UpdateImeiText) obj).f236390b);
        }

        public final int hashCode() {
            return this.f236390b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateImeiText(text="), this.f236390b, ')');
        }
    }
}
