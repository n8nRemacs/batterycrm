package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoFlatsTwoColumnDialogInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Loading", "ShowContent", "ShowErrorScreen", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$CloseScreen;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$Loading;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$ShowContent;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$ShowErrorScreen;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AutoFlatsTwoColumnDialogInternalAction extends n {

    /* compiled from: AutoFlatsTwoColumnDialogInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$CloseScreen;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements AutoFlatsTwoColumnDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f68717b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1875747027;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$Loading;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements AutoFlatsTwoColumnDialogInternalAction {
        static {
            new Loading();
        }

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1789448459;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$ShowContent;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements AutoFlatsTwoColumnDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f68718b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ArrayList f68719c;

        public ShowContent(@l String str, @l ArrayList arrayList) {
            this.f68718b = str;
            this.f68719c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f68718b, showContent.f68718b) && L.f(this.f68719c, showContent.f68719c);
        }

        public final int hashCode() {
            String str = this.f68718b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ArrayList arrayList = this.f68719c;
            return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(bottomSheetTitle=");
            sb2.append(this.f68718b);
            sb2.append(", specItems=");
            return e.p(sb2, this.f68719c, ')');
        }
    }

    /* compiled from: AutoFlatsTwoColumnDialogInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction$ShowErrorScreen;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorScreen implements AutoFlatsTwoColumnDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowErrorScreen f68720b = new ShowErrorScreen();

        private ShowErrorScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowErrorScreen);
        }

        public final int hashCode() {
            return -773683674;
        }

        @k
        public final String toString() {
            return "ShowErrorScreen";
        }
    }
}
