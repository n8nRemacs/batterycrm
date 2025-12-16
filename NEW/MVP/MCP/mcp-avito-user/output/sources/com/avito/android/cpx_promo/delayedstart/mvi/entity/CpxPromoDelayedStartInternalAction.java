package com.avito.android.cpx_promo.delayedstart.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CpxPromoDelayedStartInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "OpenDeeplink", "ShowContent", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction$Close;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction$OpenDeeplink;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction$ShowContent;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CpxPromoDelayedStartInternalAction extends n {

    /* compiled from: CpxPromoDelayedStartInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction$Close;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements CpxPromoDelayedStartInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f126861b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 210758094;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CpxPromoDelayedStartInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction$OpenDeeplink;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenDeeplink implements CpxPromoDelayedStartInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f126862b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f126862b = deepLink;
        }
    }

    /* compiled from: CpxPromoDelayedStartInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction$ShowContent;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContent implements CpxPromoDelayedStartInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromoDelayedStartContent f126863b;

        public ShowContent(@k CpxPromoDelayedStartContent cpxPromoDelayedStartContent) {
            this.f126863b = cpxPromoDelayedStartContent;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }
    }
}
