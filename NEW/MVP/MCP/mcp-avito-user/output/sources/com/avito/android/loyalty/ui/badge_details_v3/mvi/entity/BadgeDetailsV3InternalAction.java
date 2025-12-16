package com.avito.android.loyalty.ui.badge_details_v3.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import cX.C27116b;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.ui.items.collapse.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsV3InternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CollapseItemClicked", "Error", "HandleDeeplink", "Loaded", "Loading", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$CollapseItemClicked;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$Error;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$HandleDeeplink;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$Loaded;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$Loading;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface BadgeDetailsV3InternalAction extends n {

    /* compiled from: BadgeDetailsV3InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$CollapseItemClicked;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollapseItemClicked implements BadgeDetailsV3InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f183335b;

        public CollapseItemClicked(@k a aVar) {
            this.f183335b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollapseItemClicked) && L.f(this.f183335b, ((CollapseItemClicked) obj).f183335b);
        }

        public final int hashCode() {
            return this.f183335b.hashCode();
        }

        @k
        public final String toString() {
            return "CollapseItemClicked(collapseItem=" + this.f183335b + ')';
        }
    }

    /* compiled from: BadgeDetailsV3InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$Error;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements BadgeDetailsV3InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f183336b = new Error();

        private Error() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 2049889237;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: BadgeDetailsV3InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$HandleDeeplink;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BadgeDetailsV3InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f183337b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f183337b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f183337b, ((HandleDeeplink) obj).f183337b);
        }

        public final int hashCode() {
            return this.f183337b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f183337b, ')');
        }
    }

    /* compiled from: BadgeDetailsV3InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$Loaded;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements BadgeDetailsV3InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C27116b f183338b;

        public Loaded(@k C27116b c27116b) {
            this.f183338b = c27116b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f183338b, ((Loaded) obj).f183338b);
        }

        public final int hashCode() {
            return this.f183338b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(response=" + this.f183338b + ')';
        }
    }

    /* compiled from: BadgeDetailsV3InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction$Loading;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements BadgeDetailsV3InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f183339b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 369206217;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
