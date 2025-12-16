package com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentChanged", "ContentLoaded", "ExecuteRequestFailed", "ExecuteRequestStateChanged", "HandledOnInitActions", "StoredActionsHandled", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ContentChanged;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ContentLoaded;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$HandledOnInitActions;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$StoredActionsHandled;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UniversalDeliveryTypeCourierInternalAction extends n {

    /* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ContentChanged;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChanged implements UniversalDeliveryTypeCourierInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f256526b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f256527c;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2) {
            this.f256526b = list;
            this.f256527c = list2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChanged)) {
                return false;
            }
            ContentChanged contentChanged = (ContentChanged) obj;
            return L.f(this.f256526b, contentChanged.f256526b) && L.f(this.f256527c, contentChanged.f256527c);
        }

        public final int hashCode() {
            return this.f256527c.hashCode() + (this.f256526b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentChanged(mainComponents=");
            sb2.append(this.f256526b);
            sb2.append(", bottomComponents=");
            return H.p(sb2, this.f256527c, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ContentLoaded;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements UniversalDeliveryTypeCourierInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f256528b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f256529c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f256530d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f256531e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final List<BeduinAction> f256532f;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentLoaded(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @l List<? extends BeduinAction> list3) {
            this.f256528b = str;
            this.f256529c = list;
            this.f256530d = str2;
            this.f256531e = list2;
            this.f256532f = list3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f256528b, contentLoaded.f256528b) && L.f(this.f256529c, contentLoaded.f256529c) && L.f(this.f256530d, contentLoaded.f256530d) && L.f(this.f256531e, contentLoaded.f256531e) && L.f(this.f256532f, contentLoaded.f256532f);
        }

        public final int hashCode() {
            int iE2 = H.e(H.d(H.e(this.f256528b.hashCode() * 31, 31, this.f256529c), 31, this.f256530d), 31, this.f256531e);
            List<BeduinAction> list = this.f256532f;
            return iE2 + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(mainFormId=");
            sb2.append(this.f256528b);
            sb2.append(", mainComponents=");
            sb2.append(this.f256529c);
            sb2.append(", bottomFormId=");
            sb2.append(this.f256530d);
            sb2.append(", bottomComponents=");
            sb2.append(this.f256531e);
            sb2.append(", onInitActions=");
            return H.p(sb2, this.f256532f, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestFailed implements UniversalDeliveryTypeCourierInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f256533b;

        public ExecuteRequestFailed(@k ApiError apiError) {
            this.f256533b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestFailed) && L.f(this.f256533b, ((ExecuteRequestFailed) obj).f256533b);
        }

        public final int hashCode() {
            return this.f256533b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ExecuteRequestFailed(error="), this.f256533b, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestStateChanged implements UniversalDeliveryTypeCourierInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f256534b;

        public ExecuteRequestStateChanged(boolean z12) {
            this.f256534b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestStateChanged) && this.f256534b == ((ExecuteRequestStateChanged) obj).f256534b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f256534b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ExecuteRequestStateChanged(isExecuting="), this.f256534b, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$HandledOnInitActions;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandledOnInitActions implements UniversalDeliveryTypeCourierInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HandledOnInitActions f256535b = new HandledOnInitActions();

        private HandledOnInitActions() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HandledOnInitActions);
        }

        public final int hashCode() {
            return -355397692;
        }

        @k
        public final String toString() {
            return "HandledOnInitActions";
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$StoredActionsHandled;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StoredActionsHandled implements UniversalDeliveryTypeCourierInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StoredActionsHandled f256536b = new StoredActionsHandled();

        private StoredActionsHandled() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StoredActionsHandled);
        }

        public final int hashCode() {
            return 929151284;
        }

        @k
        public final String toString() {
            return "StoredActionsHandled";
        }
    }
}
