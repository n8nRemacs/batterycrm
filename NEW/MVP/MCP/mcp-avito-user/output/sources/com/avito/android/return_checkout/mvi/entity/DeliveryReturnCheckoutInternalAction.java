package com.avito.android.return_checkout.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryReturnCheckoutInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentChanged", "ContentLoaded", "ExecuteRequestFailed", "LoadingError", "LoadingStarted", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$ContentChanged;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$ContentLoaded;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$LoadingError;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$LoadingStarted;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DeliveryReturnCheckoutInternalAction extends n {

    /* compiled from: DeliveryReturnCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$ContentChanged;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChanged implements DeliveryReturnCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f255327b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f255328c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f255329d;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
            this.f255327b = list;
            this.f255328c = list2;
            this.f255329d = list3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChanged)) {
                return false;
            }
            ContentChanged contentChanged = (ContentChanged) obj;
            return L.f(this.f255327b, contentChanged.f255327b) && L.f(this.f255328c, contentChanged.f255328c) && L.f(this.f255329d, contentChanged.f255329d);
        }

        public final int hashCode() {
            return this.f255329d.hashCode() + H.e(this.f255327b.hashCode() * 31, 31, this.f255328c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentChanged(topComponents=");
            sb2.append(this.f255327b);
            sb2.append(", mainComponents=");
            sb2.append(this.f255328c);
            sb2.append(", bottomComponents=");
            return H.p(sb2, this.f255329d, ')');
        }
    }

    /* compiled from: DeliveryReturnCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$ContentLoaded;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements DeliveryReturnCheckoutInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255330b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f255331c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f255332d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f255333e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f255334f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f255335g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f255336h;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentLoaded(@k String str, @k String str2, @k String str3, @k String str4, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
            this.f255330b = str;
            this.f255331c = str2;
            this.f255332d = str3;
            this.f255333e = str4;
            this.f255334f = list;
            this.f255335g = list2;
            this.f255336h = list3;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f255330b, contentLoaded.f255330b) && L.f(this.f255331c, contentLoaded.f255331c) && L.f(this.f255332d, contentLoaded.f255332d) && L.f(this.f255333e, contentLoaded.f255333e) && L.f(this.f255334f, contentLoaded.f255334f) && L.f(this.f255335g, contentLoaded.f255335g) && L.f(this.f255336h, contentLoaded.f255336h);
        }

        public final int hashCode() {
            return this.f255336h.hashCode() + H.e(H.e(H.d(H.d(H.d(this.f255330b.hashCode() * 31, 31, this.f255331c), 31, this.f255332d), 31, this.f255333e), 31, this.f255334f), 31, this.f255335g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f255330b);
            sb2.append(", topFormId=");
            sb2.append(this.f255331c);
            sb2.append(", mainFormId=");
            sb2.append(this.f255332d);
            sb2.append(", bottomFormId=");
            sb2.append(this.f255333e);
            sb2.append(", topComponents=");
            sb2.append(this.f255334f);
            sb2.append(", mainComponents=");
            sb2.append(this.f255335g);
            sb2.append(", bottomComponents=");
            return H.p(sb2, this.f255336h, ')');
        }
    }

    /* compiled from: DeliveryReturnCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestFailed implements DeliveryReturnCheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f255337b;

        public ExecuteRequestFailed(@k ApiError apiError) {
            this.f255337b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestFailed) && L.f(this.f255337b, ((ExecuteRequestFailed) obj).f255337b);
        }

        public final int hashCode() {
            return this.f255337b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ExecuteRequestFailed(error="), this.f255337b, ')');
        }
    }

    /* compiled from: DeliveryReturnCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$LoadingError;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements DeliveryReturnCheckoutInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f255338b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f255339c;

        public LoadingError(@k ApiError apiError) {
            this.f255338b = apiError;
            this.f255339c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof LoadingError) && L.f(this.f255338b, ((LoadingError) obj).f255338b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF131298b() {
            return this.f255339c;
        }

        public final int hashCode() {
            return this.f255338b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f255338b, ')');
        }
    }

    /* compiled from: DeliveryReturnCheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction$LoadingStarted;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted extends TrackableLoadingStarted implements DeliveryReturnCheckoutInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f255340d;

        public LoadingStarted() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStarted) && L.f(this.f255340d, ((LoadingStarted) obj).f255340d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f255340d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("LoadingStarted(stub="), this.f255340d, ')');
        }

        public LoadingStarted(G0 g02, int i12, C42822w c42822w) {
            this.f255340d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }
}
