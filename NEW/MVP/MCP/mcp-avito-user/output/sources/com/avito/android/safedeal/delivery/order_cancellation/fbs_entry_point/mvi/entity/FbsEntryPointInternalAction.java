package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.remote.model.ReasonRds;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FbsEntryPointInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "HandleDeeplink", "ShowScreen", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction$CloseScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction$HandleDeeplink;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction$ShowScreen;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FbsEntryPointInternalAction extends n {

    /* compiled from: FbsEntryPointInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction$CloseScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements FbsEntryPointInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f256348b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -2061140578;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: FbsEntryPointInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction$HandleDeeplink;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements FbsEntryPointInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinUniversalPageLink f256349b;

        public HandleDeeplink(@k BeduinUniversalPageLink beduinUniversalPageLink) {
            this.f256349b = beduinUniversalPageLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && this.f256349b.equals(((HandleDeeplink) obj).f256349b);
        }

        public final int hashCode() {
            return this.f256349b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=" + this.f256349b + ')';
        }
    }

    /* compiled from: FbsEntryPointInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction$ShowScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowScreen implements FbsEntryPointInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f256350b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ReasonRds f256351c;

        public ShowScreen(@k ReasonRds reasonRds, @k String str) {
            this.f256350b = str;
            this.f256351c = reasonRds;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowScreen)) {
                return false;
            }
            ShowScreen showScreen = (ShowScreen) obj;
            return L.f(this.f256350b, showScreen.f256350b) && L.f(this.f256351c, showScreen.f256351c);
        }

        public final int hashCode() {
            return this.f256351c.hashCode() + (this.f256350b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowScreen(orderId=" + this.f256350b + ", reasonRds=" + this.f256351c + ')';
        }
    }
}
