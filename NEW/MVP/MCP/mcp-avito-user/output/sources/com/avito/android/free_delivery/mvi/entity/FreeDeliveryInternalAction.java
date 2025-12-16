package com.avito.android.free_delivery.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreeDeliveryInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Dismiss", "Error", "Finalize", "Input", "Loading", "Slider", "Updated", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Content;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Dismiss;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Error;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Finalize;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Input;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Loading;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Slider;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Updated;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FreeDeliveryInternalAction extends n {

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Content;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements FreeDeliveryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Content f158784b = new Content();

        private Content() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Content);
        }

        public final int hashCode() {
            return -162973111;
        }

        @k
        public final String toString() {
            return "Content";
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Dismiss;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "<init>", "()V", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismiss implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismiss f158785b = new Dismiss();

        private Dismiss() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 557168730;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Error;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FreeDeliveryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f158786b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f158787c;

        public Error(@k ApiError apiError) {
            this.f158786b = apiError;
            this.f158787c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Error) && L.f(this.f158786b, ((Error) obj).f158786b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF153235c() {
            return this.f158787c;
        }

        public final int hashCode() {
            return this.f158786b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f158786b, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Finalize;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finalize implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f158788b;

        public Finalize(int i12) {
            this.f158788b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Finalize) && this.f158788b == ((Finalize) obj).f158788b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f158788b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Finalize(subsidy="), this.f158788b, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Input;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Input implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f158789b;

        public Input(int i12) {
            this.f158789b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Input) && this.f158789b == ((Input) obj).f158789b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f158789b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Input(subsidy="), this.f158789b, ')');
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Loading;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "<init>", "()V", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f158790b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -777853172;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Slider;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Slider implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f158791b;

        public Slider(float f12) {
            this.f158791b = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Slider) && Float.compare(this.f158791b, ((Slider) obj).f158791b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f158791b);
        }

        @k
        public final String toString() {
            return r.k(')', this.f158791b, new StringBuilder("Slider(subsidy="));
        }
    }

    /* compiled from: FreeDeliveryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction$Updated;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Updated implements FreeDeliveryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f158792b;

        public Updated(int i12) {
            this.f158792b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Updated) && this.f158792b == ((Updated) obj).f158792b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f158792b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Updated(subsidy="), this.f158792b, ')');
        }
    }
}
