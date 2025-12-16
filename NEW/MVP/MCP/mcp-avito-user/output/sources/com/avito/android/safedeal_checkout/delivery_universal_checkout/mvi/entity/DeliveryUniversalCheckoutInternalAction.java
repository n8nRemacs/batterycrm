package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity;

import AK.c;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.delivery.DeliveryUniversalCheckoutSummary;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeUserAddressAction", "ContentChanged", "DeeplinkResultAction", "ExecuteRequestFailed", "ExecuteRequestStateChanged", "Loaded", "LoadedError", "LoadingStarted", "ReturnCheckoutAction", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ChangeUserAddressAction;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ContentChanged;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$DeeplinkResultAction;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$Loaded;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$LoadedError;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$LoadingStarted;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ReturnCheckoutAction;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeliveryUniversalCheckoutInternalAction extends n {

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ChangeUserAddressAction;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChangeUserAddressAction implements DeliveryUniversalCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ChangeUserAddressAction f257116b = new ChangeUserAddressAction();

        private ChangeUserAddressAction() {
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ContentChanged;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChanged implements DeliveryUniversalCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f257117b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f257118c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f257119d;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
            this.f257117b = list;
            this.f257118c = list2;
            this.f257119d = list3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChanged)) {
                return false;
            }
            ContentChanged contentChanged = (ContentChanged) obj;
            return L.f(this.f257117b, contentChanged.f257117b) && L.f(this.f257118c, contentChanged.f257118c) && L.f(this.f257119d, contentChanged.f257119d);
        }

        public final int hashCode() {
            return this.f257119d.hashCode() + H.e(this.f257117b.hashCode() * 31, 31, this.f257118c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentChanged(topComponents=");
            sb2.append(this.f257117b);
            sb2.append(", mainComponents=");
            sb2.append(this.f257118c);
            sb2.append(", bottomComponents=");
            return H.p(sb2, this.f257119d, ')');
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$DeeplinkResultAction;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkResultAction implements DeliveryUniversalCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC14249c f257120b;

        public DeeplinkResultAction(@k InterfaceC14249c interfaceC14249c) {
            this.f257120b = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkResultAction) && L.f(this.f257120b, ((DeeplinkResultAction) obj).f257120b);
        }

        public final int hashCode() {
            return this.f257120b.hashCode();
        }

        @k
        public final String toString() {
            return "DeeplinkResultAction(result=" + this.f257120b + ')';
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestFailed implements DeliveryUniversalCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f257121b;

        public ExecuteRequestFailed(@k ApiError apiError) {
            this.f257121b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestFailed) && L.f(this.f257121b, ((ExecuteRequestFailed) obj).f257121b);
        }

        public final int hashCode() {
            return this.f257121b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ExecuteRequestFailed(error="), this.f257121b, ')');
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestStateChanged implements DeliveryUniversalCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257122b;

        public ExecuteRequestStateChanged(boolean z12) {
            this.f257122b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestStateChanged) && this.f257122b == ((ExecuteRequestStateChanged) obj).f257122b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f257122b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ExecuteRequestStateChanged(isExecuting="), this.f257122b, ')');
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$Loaded;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements DeliveryUniversalCheckoutInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257123b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<BeduinAction> f257124c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f257125d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f257126e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f257127f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f257128g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f257129h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f257130i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final DeliveryUniversalCheckoutSummary.Settings f257131j;

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(@k String str, @l List<? extends BeduinAction> list, @k String str2, @k String str3, @k String str4, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list4, @l DeliveryUniversalCheckoutSummary.Settings settings) {
            this.f257123b = str;
            this.f257124c = list;
            this.f257125d = str2;
            this.f257126e = str3;
            this.f257127f = str4;
            this.f257128g = list2;
            this.f257129h = list3;
            this.f257130i = list4;
            this.f257131j = settings;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF185112d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f257123b, loaded.f257123b) && L.f(this.f257124c, loaded.f257124c) && L.f(this.f257125d, loaded.f257125d) && L.f(this.f257126e, loaded.f257126e) && L.f(this.f257127f, loaded.f257127f) && L.f(this.f257128g, loaded.f257128g) && L.f(this.f257129h, loaded.f257129h) && L.f(this.f257130i, loaded.f257130i) && L.f(this.f257131j, loaded.f257131j);
        }

        public final int hashCode() {
            int iHashCode = this.f257123b.hashCode() * 31;
            List<BeduinAction> list = this.f257124c;
            int iE2 = H.e(H.e(H.e(H.d(H.d(H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f257125d), 31, this.f257126e), 31, this.f257127f), 31, this.f257128g), 31, this.f257129h), 31, this.f257130i);
            DeliveryUniversalCheckoutSummary.Settings settings = this.f257131j;
            return iE2 + (settings != null ? settings.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Loaded(title=" + this.f257123b + ", actions=" + this.f257124c + ", topFormId=" + this.f257125d + ", mainFormId=" + this.f257126e + ", bottomFormId=" + this.f257127f + ", topComponents=" + this.f257128g + ", mainComponents=" + this.f257129h + ", bottomComponents=" + this.f257130i + ", settings=" + this.f257131j + ')';
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$LoadedError;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadedError implements DeliveryUniversalCheckoutInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f257132b;

        public LoadedError(@k ApiError apiError) {
            this.f257132b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF185112d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadedError) && L.f(this.f257132b, ((LoadedError) obj).f257132b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF185068d() {
            return new J.a(this.f257132b);
        }

        public final int hashCode() {
            return this.f257132b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadedError(error="), this.f257132b, ')');
        }
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements DeliveryUniversalCheckoutInternalAction {
    }

    /* compiled from: DeliveryUniversalCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ReturnCheckoutAction;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReturnCheckoutAction implements DeliveryUniversalCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ReturnCheckoutAction f257133b = new ReturnCheckoutAction();

        private ReturnCheckoutAction() {
        }
    }
}
