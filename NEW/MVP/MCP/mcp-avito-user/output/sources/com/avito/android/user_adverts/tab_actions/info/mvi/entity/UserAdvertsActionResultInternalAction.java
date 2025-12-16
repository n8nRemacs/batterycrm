package com.avito.android.user_adverts.tab_actions.info.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;

/* compiled from: UserAdvertsActionResultInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Init", "NoChange", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction$Init;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction$NoChange;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertsActionResultInternalAction extends n {

    /* compiled from: UserAdvertsActionResultInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction$Init;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements UserAdvertsActionResultInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Init f314681b = new Init();

        private Init() {
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        public final String e() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public final int hashCode() {
            return -694524268;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: UserAdvertsActionResultInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction$NoChange;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements UserAdvertsActionResultInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f314682b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return -1709860779;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }
}
