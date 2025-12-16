package com.avito.android.publish.free_delivery.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import ge0.C40669a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreeDeliveryInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Finalize", "Forward", "Input", "Loading", "Return", "SaveAndClose", "ShowToast", "Slider", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Content;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Error;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Finalize;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Forward;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Input;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Loading;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Return;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$SaveAndClose;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$ShowToast;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Slider;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface FreeDeliveryInternalAction extends n {

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Content;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements FreeDeliveryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C40669a f235818b;

        public Content(@k C40669a c40669a) {
            this.f235818b = c40669a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f235818b, ((Content) obj).f235818b);
        }

        public final int hashCode() {
            return this.f235818b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f235818b + ')';
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Error;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FreeDeliveryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f235819b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f235820c;

        public Error(@k ApiException apiException) {
            this.f235819b = apiException;
            this.f235820c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f235819b.equals(((Error) obj).f235819b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211739c() {
            return this.f235820c;
        }

        public final int hashCode() {
            return this.f235819b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f235819b, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Finalize;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finalize implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f235821b;

        /* renamed from: c, reason: collision with root package name */
        public final int f235822c;

        /* renamed from: d, reason: collision with root package name */
        public final int f235823d;

        public Finalize(int i12, int i13, int i14) {
            this.f235821b = i12;
            this.f235822c = i13;
            this.f235823d = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finalize)) {
                return false;
            }
            Finalize finalize = (Finalize) obj;
            return this.f235821b == finalize.f235821b && this.f235822c == finalize.f235822c && this.f235823d == finalize.f235823d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f235823d) + r.e(this.f235822c, Integer.hashCode(this.f235821b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Finalize(subsidy=");
            sb2.append(this.f235821b);
            sb2.append(", minSubsidy=");
            sb2.append(this.f235822c);
            sb2.append(", maxSubsidy=");
            return r.t(sb2, this.f235823d, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Forward;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Forward implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Forward f235824b = new Forward();

        private Forward() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Forward);
        }

        public final int hashCode() {
            return -1224465610;
        }

        @k
        public final String toString() {
            return "Forward";
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Input;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Input implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f235825b;

        /* renamed from: c, reason: collision with root package name */
        public final int f235826c;

        /* renamed from: d, reason: collision with root package name */
        public final int f235827d;

        public Input(int i12, int i13, int i14) {
            this.f235825b = i12;
            this.f235826c = i13;
            this.f235827d = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return this.f235825b == input.f235825b && this.f235826c == input.f235826c && this.f235827d == input.f235827d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f235827d) + r.e(this.f235826c, Integer.hashCode(this.f235825b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Input(subsidy=");
            sb2.append(this.f235825b);
            sb2.append(", minSubsidy=");
            sb2.append(this.f235826c);
            sb2.append(", maxSubsidy=");
            return r.t(sb2, this.f235827d, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Loading;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FreeDeliveryInternalAction {
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Return;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Return implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Return f235828b = new Return();

        private Return() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Return);
        }

        public final int hashCode() {
            return 156326559;
        }

        @k
        public final String toString() {
            return "Return";
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$SaveAndClose;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveAndClose implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SaveAndClose f235829b = new SaveAndClose();

        private SaveAndClose() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SaveAndClose);
        }

        public final int hashCode() {
            return -113415891;
        }

        @k
        public final String toString() {
            return "SaveAndClose";
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$ShowToast;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f235830b;

        public ShowToast(@k String str) {
            this.f235830b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f235830b, ((ShowToast) obj).f235830b);
        }

        public final int hashCode() {
            return this.f235830b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f235830b, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction$Slider;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Slider implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f235831b;

        /* renamed from: c, reason: collision with root package name */
        public final int f235832c;

        /* renamed from: d, reason: collision with root package name */
        public final int f235833d;

        public Slider(float f12, int i12, int i13) {
            this.f235831b = f12;
            this.f235832c = i12;
            this.f235833d = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Slider)) {
                return false;
            }
            Slider slider = (Slider) obj;
            return Float.compare(this.f235831b, slider.f235831b) == 0 && this.f235832c == slider.f235832c && this.f235833d == slider.f235833d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f235833d) + r.e(this.f235832c, Float.hashCode(this.f235831b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Slider(subsidy=");
            sb2.append(this.f235831b);
            sb2.append(", minSubsidy=");
            sb2.append(this.f235832c);
            sb2.append(", maxSubsidy=");
            return r.t(sb2, this.f235833d, ')');
        }
    }
}
