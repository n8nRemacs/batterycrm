package com.avito.android.profile.remove.screen.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveItemsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "FollowDeeplink", "InitState", "OpenHowToReturnMoneyScreen", "OpenScreen", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$FollowDeeplink;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$InitState;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$OpenHowToReturnMoneyScreen;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$OpenScreen;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ProfileRemoveItemsInternalAction extends n {

    /* compiled from: ProfileRemoveItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$FollowDeeplink;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowDeeplink implements ProfileRemoveItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f224176b;

        public FollowDeeplink(@k DeepLink deepLink) {
            this.f224176b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowDeeplink) && L.f(this.f224176b, ((FollowDeeplink) obj).f224176b);
        }

        public final int hashCode() {
            return this.f224176b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f224176b, ')');
        }
    }

    /* compiled from: ProfileRemoveItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$InitState;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements ProfileRemoveItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitState f224177b = new InitState();

        private InitState() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitState);
        }

        public final int hashCode() {
            return -1116706738;
        }

        @k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: ProfileRemoveItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$OpenHowToReturnMoneyScreen;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenHowToReturnMoneyScreen implements ProfileRemoveItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenHowToReturnMoneyScreen f224178b = new OpenHowToReturnMoneyScreen();

        private OpenHowToReturnMoneyScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenHowToReturnMoneyScreen);
        }

        public final int hashCode() {
            return 2116368878;
        }

        @k
        public final String toString() {
            return "OpenHowToReturnMoneyScreen";
        }
    }

    /* compiled from: ProfileRemoveItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction$OpenScreen;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements ProfileRemoveItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ProfileRemovalScreen f224179b;

        public OpenScreen(@k ProfileRemovalScreen profileRemovalScreen) {
            this.f224179b = profileRemovalScreen;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenScreen) && L.f(this.f224179b, ((OpenScreen) obj).f224179b);
        }

        public final int hashCode() {
            return this.f224179b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(screen=" + this.f224179b + ')';
        }
    }
}
