package com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetInputInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ButtonStateChanged", "CloseScreen", "LoadingStateChanged", "ShowError", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$ButtonStateChanged;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$CloseScreen;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$LoadingStateChanged;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$ShowError;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BottomSheetInputInternalAction extends n {

    /* compiled from: BottomSheetInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$ButtonStateChanged;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonStateChanged implements BottomSheetInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f195482b;

        public ButtonStateChanged(boolean z12) {
            this.f195482b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonStateChanged) && this.f195482b == ((ButtonStateChanged) obj).f195482b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f195482b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ButtonStateChanged(isEnabled="), this.f195482b, ')');
        }
    }

    /* compiled from: BottomSheetInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$CloseScreen;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements BottomSheetInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f195483b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -930137509;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BottomSheetInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$LoadingStateChanged;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStateChanged implements BottomSheetInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f195484b;

        public LoadingStateChanged(boolean z12) {
            this.f195484b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStateChanged) && this.f195484b == ((LoadingStateChanged) obj).f195484b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f195484b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LoadingStateChanged(isLoadingVisible="), this.f195484b, ')');
        }
    }

    /* compiled from: BottomSheetInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction$ShowError;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements BottomSheetInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f195485b;

        public ShowError(@k PrintableText printableText) {
            this.f195485b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f195485b, ((ShowError) obj).f195485b);
        }

        public final int hashCode() {
            return this.f195485b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowError(printableText="), this.f195485b, ')');
        }
    }
}
