package com.avito.android.early_access.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialog", "Initial", "LoadingError", "LoadingFinished", "LoadingStarted", "OpenScreen", "OrderCreated", "PackageSelected", "PaymentCompleted", "PaymentStarted", "ShowBottomToast", "ShowError", "ShowFakedoor", "ShowSecondPage", "ShowTopToast", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$CloseDialog;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$Initial;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$LoadingError;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$LoadingFinished;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$LoadingStarted;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$OpenScreen;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$OrderCreated;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$PackageSelected;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$PaymentCompleted;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$PaymentStarted;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowBottomToast;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowError;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowFakedoor;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowSecondPage;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowTopToast;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EarlyAccessInternalAction extends n {

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$CloseDialog;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f145458b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return -635693966;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$Initial;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReEarlyAccessData f145459b;

        public Initial(@k ReEarlyAccessData reEarlyAccessData) {
            this.f145459b = reEarlyAccessData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && L.f(this.f145459b, ((Initial) obj).f145459b);
        }

        public final int hashCode() {
            return this.f145459b.hashCode();
        }

        @k
        public final String toString() {
            return "Initial(data=" + this.f145459b + ')';
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$LoadingError;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f145460b;

        public LoadingError(@k ApiError apiError) {
            this.f145460b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f145460b, ((LoadingError) obj).f145460b);
        }

        public final int hashCode() {
            return this.f145460b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f145460b, ')');
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$LoadingFinished;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFinished implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingFinished f145461b = new LoadingFinished();

        private LoadingFinished() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingFinished);
        }

        public final int hashCode() {
            return -2043226144;
        }

        @k
        public final String toString() {
            return "LoadingFinished";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$LoadingStarted;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingStarted f145462b = new LoadingStarted();

        private LoadingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingStarted);
        }

        public final int hashCode() {
            return -1110080685;
        }

        @k
        public final String toString() {
            return "LoadingStarted";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$OrderCreated;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderCreated implements EarlyAccessInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderCreated)) {
                return false;
            }
            ((OrderCreated) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        @k
        public final String toString() {
            return "OrderCreated(orderId=0)";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$PackageSelected;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PackageSelected implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReEarlyAccessData.Package f145465b;

        public PackageSelected(@k ReEarlyAccessData.Package r12) {
            this.f145465b = r12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PackageSelected) && L.f(this.f145465b, ((PackageSelected) obj).f145465b);
        }

        public final int hashCode() {
            return this.f145465b.hashCode();
        }

        @k
        public final String toString() {
            return "PackageSelected(selectedPackage=" + this.f145465b + ')';
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$PaymentCompleted;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentCompleted implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PaymentCompleted f145466b = new PaymentCompleted();

        private PaymentCompleted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PaymentCompleted);
        }

        public final int hashCode() {
            return 1046986515;
        }

        @k
        public final String toString() {
            return "PaymentCompleted";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$PaymentStarted;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentStarted implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PaymentStarted f145467b = new PaymentStarted();

        private PaymentStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PaymentStarted);
        }

        public final int hashCode() {
            return -1541563575;
        }

        @k
        public final String toString() {
            return "PaymentStarted";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowBottomToast;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowBottomToast implements EarlyAccessInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowBottomToast)) {
                return false;
            }
            ((ShowBottomToast) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowBottomToast(text=null)";
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowError;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145468b;

        public ShowError(@k String str) {
            this.f145468b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f145468b, ((ShowError) obj).f145468b);
        }

        public final int hashCode() {
            return this.f145468b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(text="), this.f145468b, ')');
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowFakedoor;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFakedoor implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReEarlyAccessData f145469b;

        public ShowFakedoor(@k ReEarlyAccessData reEarlyAccessData) {
            this.f145469b = reEarlyAccessData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFakedoor) && L.f(this.f145469b, ((ShowFakedoor) obj).f145469b);
        }

        public final int hashCode() {
            return this.f145469b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowFakedoor(data=" + this.f145469b + ')';
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowSecondPage;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSecondPage implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReEarlyAccessData f145470b;

        public ShowSecondPage(@k ReEarlyAccessData reEarlyAccessData) {
            this.f145470b = reEarlyAccessData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSecondPage) && L.f(this.f145470b, ((ShowSecondPage) obj).f145470b);
        }

        public final int hashCode() {
            return this.f145470b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowSecondPage(data=" + this.f145470b + ')';
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$ShowTopToast;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowTopToast implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145471b;

        public ShowTopToast(@k String str) {
            this.f145471b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowTopToast) && L.f(this.f145471b, ((ShowTopToast) obj).f145471b);
        }

        public final int hashCode() {
            return this.f145471b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowTopToast(text="), this.f145471b, ')');
        }
    }

    /* compiled from: EarlyAccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction$OpenScreen;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements EarlyAccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145463b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f145464c;

        public OpenScreen(@k String str, @l String str2) {
            this.f145463b = str;
            this.f145464c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenScreen)) {
                return false;
            }
            OpenScreen openScreen = (OpenScreen) obj;
            return L.f(this.f145463b, openScreen.f145463b) && L.f(this.f145464c, openScreen.f145464c);
        }

        public final int hashCode() {
            int iHashCode = this.f145463b.hashCode() * 31;
            String str = this.f145464c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenScreen(uri=");
            sb2.append(this.f145463b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f145464c, ')');
        }

        public /* synthetic */ OpenScreen(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }
}
