package com.avito.android.user_adverts.tab_actions.host.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import hm0.InterfaceC40961a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsActionsInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ErrorActionHandling", "HandleSingleAction", "HideActions", "HideActionsEvent", "NeedConfirmation", "NoChange", "ResultActionHandling", "ShowMultipleActions", "ShowSingleActions", "StartActionHandling", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ErrorActionHandling;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$HandleSingleAction;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$HideActions;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$HideActionsEvent;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$NeedConfirmation;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$NoChange;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ShowMultipleActions;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ShowSingleActions;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$StartActionHandling;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertsActionsInternalAction extends n {

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ErrorActionHandling;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorActionHandling implements UserAdvertsActionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f314421b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f314422c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f314423d;

        public ErrorActionHandling(@l ApiError apiError) {
            this.f314421b = apiError;
            UserAdvertsScreen.f90543d.getClass();
            this.f314422c = UserAdvertsScreen.f90549j;
            J.a.f90383b.getClass();
            this.f314423d = J.a.C2676a.a(apiError, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f314422c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ErrorActionHandling) {
                return L.f(this.f314421b, ((ErrorActionHandling) obj).f314421b) && L.f(null, null);
            }
            return false;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF198093c() {
            return this.f314423d;
        }

        public final int hashCode() {
            ApiError apiError = this.f314421b;
            return (apiError == null ? 0 : apiError.hashCode()) * 31;
        }

        @k
        public final String toString() {
            return "ErrorActionHandling(apiError=" + this.f314421b + ", throwable=null)";
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$HandleSingleAction;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSingleAction implements UserAdvertsActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f314424b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f314425c;

        public HandleSingleAction(@k DeepLink deepLink, @k String str) {
            this.f314424b = deepLink;
            this.f314425c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleSingleAction)) {
                return false;
            }
            HandleSingleAction handleSingleAction = (HandleSingleAction) obj;
            return L.f(this.f314424b, handleSingleAction.f314424b) && L.f(this.f314425c, handleSingleAction.f314425c);
        }

        public final int hashCode() {
            return this.f314425c.hashCode() + (this.f314424b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleSingleAction(deepLink=");
            sb2.append(this.f314424b);
            sb2.append(", advertId=");
            return C22026a.c(sb2, this.f314425c, ')');
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$HideActions;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideActions implements UserAdvertsActionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314426b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f314427c;

        public HideActions(@k String str) {
            this.f314426b = str;
            UserAdvertsScreen.f90543d.getClass();
            this.f314427c = UserAdvertsScreen.f90549j;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f314427c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HideActions) && L.f(this.f314426b, ((HideActions) obj).f314426b);
        }

        public final int hashCode() {
            return this.f314426b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HideActions(shortcut="), this.f314426b, ')');
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$HideActionsEvent;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideActionsEvent implements UserAdvertsActionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314428b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertsActionsState.a f314429c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f314430d;

        public HideActionsEvent(@k String str, @k UserAdvertsActionsState.a aVar) {
            this.f314428b = str;
            this.f314429c = aVar;
            UserAdvertsScreen.f90543d.getClass();
            this.f314430d = UserAdvertsScreen.f90549j;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f314430d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HideActionsEvent)) {
                return false;
            }
            HideActionsEvent hideActionsEvent = (HideActionsEvent) obj;
            return L.f(this.f314428b, hideActionsEvent.f314428b) && L.f(this.f314429c, hideActionsEvent.f314429c);
        }

        public final int hashCode() {
            return this.f314429c.hashCode() + (this.f314428b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "HideActionsEvent(shortcut=" + this.f314428b + ", actionsInfo=" + this.f314429c + ')';
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$NeedConfirmation;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NeedConfirmation implements UserAdvertsActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f314431b;

        /* renamed from: c, reason: collision with root package name */
        public final int f314432c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UserAdvertActionAttentionInfo f314433d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f314434e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final UserAdvertActionType.Multiple f314435f;

        public NeedConfirmation(int i12, @k UserAdvertActionAttentionInfo userAdvertActionAttentionInfo, @k UserAdvertActionType.Multiple multiple, @k String str, @k Map map) {
            this.f314431b = map;
            this.f314432c = i12;
            this.f314433d = userAdvertActionAttentionInfo;
            this.f314434e = str;
            this.f314435f = multiple;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeedConfirmation)) {
                return false;
            }
            NeedConfirmation needConfirmation = (NeedConfirmation) obj;
            return L.f(this.f314431b, needConfirmation.f314431b) && this.f314432c == needConfirmation.f314432c && L.f(this.f314433d, needConfirmation.f314433d) && L.f(this.f314434e, needConfirmation.f314434e) && this.f314435f == needConfirmation.f314435f;
        }

        public final int hashCode() {
            return this.f314435f.hashCode() + H.d((this.f314433d.hashCode() + r.e(this.f314432c, this.f314431b.hashCode() * 31, 31)) * 31, 31, this.f314434e);
        }

        @k
        public final String toString() {
            return "NeedConfirmation(selectedGroupInfo=" + this.f314431b + ", selectedSize=" + this.f314432c + ", attentionInfo=" + this.f314433d + ", shortcut=" + this.f314434e + ", actionType=" + this.f314435f + ')';
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$NoChange;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements UserAdvertsActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f314436b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return 225611417;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ShowMultipleActions;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMultipleActions implements UserAdvertsActionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314452b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertsGroupData f314453c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UserAdvertActionsInfoDomain f314454d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f314455e;

        public ShowMultipleActions(@k String str, @k UserAdvertsGroupData userAdvertsGroupData, @k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
            this.f314452b = str;
            this.f314453c = userAdvertsGroupData;
            this.f314454d = userAdvertActionsInfoDomain;
            UserAdvertsScreen.f90543d.getClass();
            this.f314455e = UserAdvertsScreen.f90549j;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f314455e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowMultipleActions)) {
                return false;
            }
            ShowMultipleActions showMultipleActions = (ShowMultipleActions) obj;
            return L.f(this.f314452b, showMultipleActions.f314452b) && L.f(this.f314453c, showMultipleActions.f314453c) && L.f(this.f314454d, showMultipleActions.f314454d);
        }

        public final int hashCode() {
            return this.f314454d.hashCode() + c.c(this.f314452b.hashCode() * 31, 31, this.f314453c.f312182b);
        }

        @k
        public final String toString() {
            return "ShowMultipleActions(shortcut=" + this.f314452b + ", groupData=" + this.f314453c + ", actionsInfo=" + this.f314454d + ')';
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ShowSingleActions;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSingleActions implements UserAdvertsActionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314456b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f314457c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f314458d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AvailableActionsDomain f314459e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f314460f;

        public ShowSingleActions(@k String str, @k String str2, @k String str3, @k AvailableActionsDomain availableActionsDomain) {
            this.f314456b = str;
            this.f314457c = str2;
            this.f314458d = str3;
            this.f314459e = availableActionsDomain;
            UserAdvertsScreen.f90543d.getClass();
            this.f314460f = UserAdvertsScreen.f90549j;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f314460f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSingleActions)) {
                return false;
            }
            ShowSingleActions showSingleActions = (ShowSingleActions) obj;
            return L.f(this.f314456b, showSingleActions.f314456b) && L.f(this.f314457c, showSingleActions.f314457c) && L.f(this.f314458d, showSingleActions.f314458d) && L.f(this.f314459e, showSingleActions.f314459e);
        }

        public final int hashCode() {
            return this.f314459e.f314259b.hashCode() + H.d(H.d(this.f314456b.hashCode() * 31, 31, this.f314457c), 31, this.f314458d);
        }

        @k
        public final String toString() {
            return "ShowSingleActions(shortcut=" + this.f314456b + ", advertId=" + this.f314457c + ", advertTitle=" + this.f314458d + ", availableActions=" + this.f314459e + ')';
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$StartActionHandling;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartActionHandling extends TrackableLoadingStarted implements UserAdvertsActionsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UserAdvertActionType f314461d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f314462e;

        public StartActionHandling(@k UserAdvertActionType userAdvertActionType) {
            this.f314461d = userAdvertActionType;
            UserAdvertsScreen.f90543d.getClass();
            this.f314462e = UserAdvertsScreen.f90549j;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF261005e() {
            return this.f314462e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartActionHandling) && L.f(this.f314461d, ((StartActionHandling) obj).f314461d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f314461d.hashCode();
        }

        @k
        public final String toString() {
            return "StartActionHandling(actionType=" + this.f314461d + ')';
        }
    }

    /* compiled from: UserAdvertsActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Multiple", "Single", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ResultActionHandling extends UserAdvertsActionsInternalAction, TrackableContent {

        /* compiled from: UserAdvertsActionsInternalAction.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling;", "Cancelled", "Redirect", "Success", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Cancelled;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Redirect;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Success;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Multiple extends ResultActionHandling {

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Cancelled;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Cancelled implements Multiple {

                /* renamed from: b, reason: collision with root package name */
                @k
                public static final Cancelled f314437b = new Cancelled();

                private Cancelled() {
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof Cancelled);
                }

                public final int hashCode() {
                    return -2060634335;
                }

                @k
                public final String toString() {
                    return "Cancelled";
                }
            }

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Redirect;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Redirect implements Multiple {

                /* renamed from: b, reason: collision with root package name */
                @k
                public final DeepLink f314438b;

                public Redirect(@k DeepLink deepLink) {
                    this.f314438b = deepLink;
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Redirect) {
                        return L.f(this.f314438b, ((Redirect) obj).f314438b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return (this.f314438b.hashCode() * 31) - 1438062151;
                }

                @k
                public final String toString() {
                    return "Redirect(deepLink=" + this.f314438b + ", requestKey=CPT_MASS_ACTIVATION_REQUEST_KEY)";
                }
            }

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Success;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Multiple;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Success implements Multiple {

                /* renamed from: b, reason: collision with root package name */
                @k
                public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f314439b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f314440c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final UserAdvertActionType f314441d;

                /* renamed from: e, reason: collision with root package name */
                @k
                public final InterfaceC40961a f314442e;

                public Success(@k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map, @k String str, @k UserAdvertActionType userAdvertActionType, @k InterfaceC40961a interfaceC40961a) {
                    this.f314439b = map;
                    this.f314440c = str;
                    this.f314441d = userAdvertActionType;
                    this.f314442e = interfaceC40961a;
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Success)) {
                        return false;
                    }
                    Success success = (Success) obj;
                    return L.f(this.f314439b, success.f314439b) && L.f(this.f314440c, success.f314440c) && L.f(this.f314441d, success.f314441d) && L.f(this.f314442e, success.f314442e);
                }

                public final int hashCode() {
                    return this.f314442e.hashCode() + ((this.f314441d.hashCode() + H.d(this.f314439b.hashCode() * 31, 31, this.f314440c)) * 31);
                }

                @k
                public final String toString() {
                    return "Success(selectedGroupInfo=" + this.f314439b + ", currentShortcut=" + this.f314440c + ", actionType=" + this.f314441d + ", result=" + this.f314442e + ')';
                }
            }

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a {
            }
        }

        /* compiled from: UserAdvertsActionsInternalAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            @k
            public static String a() {
                UserAdvertsScreen.f90543d.getClass();
                return UserAdvertsScreen.f90549j;
            }
        }

        /* compiled from: UserAdvertsActionsInternalAction.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling;", "Cancelled", "Error", "Redirect", "Success", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Cancelled;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Error;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Redirect;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Success;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Single extends ResultActionHandling {

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Cancelled;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Cancelled implements Single {

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f314443b;

                public Cancelled(@k String str) {
                    this.f314443b = str;
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Cancelled) && L.f(this.f314443b, ((Cancelled) obj).f314443b);
                }

                @Override // com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction.ResultActionHandling.Single
                @k
                /* renamed from: getAdvertId, reason: from getter */
                public final String getF314449b() {
                    return this.f314443b;
                }

                public final int hashCode() {
                    return this.f314443b.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Cancelled(advertId="), this.f314443b, ')');
                }
            }

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Error;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Error implements Single {

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f314444b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final ApiError f314445c;

                public Error(@k ApiError apiError, @k String str) {
                    this.f314444b = str;
                    this.f314445c = apiError;
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return false;
                    }
                    Error error = (Error) obj;
                    return L.f(this.f314444b, error.f314444b) && L.f(this.f314445c, error.f314445c);
                }

                @Override // com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction.ResultActionHandling.Single
                @k
                /* renamed from: getAdvertId, reason: from getter */
                public final String getF314449b() {
                    return this.f314444b;
                }

                public final int hashCode() {
                    return this.f314445c.hashCode() + (this.f314444b.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Error(advertId=");
                    sb2.append(this.f314444b);
                    sb2.append(", apiError=");
                    return c.n(sb2, this.f314445c, ')');
                }
            }

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Redirect;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Redirect implements Single {

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f314446b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f314447c;

                /* renamed from: d, reason: collision with root package name */
                @l
                public final DeepLink f314448d;

                public Redirect(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
                    deepLink = (i12 & 4) != 0 ? null : deepLink;
                    this.f314446b = str;
                    this.f314447c = str2;
                    this.f314448d = deepLink;
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Redirect)) {
                        return false;
                    }
                    Redirect redirect = (Redirect) obj;
                    return L.f(this.f314446b, redirect.f314446b) && L.f(this.f314447c, redirect.f314447c) && L.f(this.f314448d, redirect.f314448d);
                }

                @Override // com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction.ResultActionHandling.Single
                @k
                /* renamed from: getAdvertId, reason: from getter */
                public final String getF314449b() {
                    return this.f314446b;
                }

                public final int hashCode() {
                    int iD2 = H.d(this.f314446b.hashCode() * 31, 31, this.f314447c);
                    DeepLink deepLink = this.f314448d;
                    return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Redirect(advertId=");
                    sb2.append(this.f314446b);
                    sb2.append(", currentShortcut=");
                    sb2.append(this.f314447c);
                    sb2.append(", deepLink=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.f314448d, ')');
                }
            }

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a {
            }

            @k
            /* renamed from: getAdvertId */
            String getF314449b();

            /* compiled from: UserAdvertsActionsInternalAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single$Success;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction$ResultActionHandling$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Success implements Single {

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f314449b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f314450c;

                /* renamed from: d, reason: collision with root package name */
                @l
                public final String f314451d;

                public Success(@k String str, @k String str2, @l String str3) {
                    this.f314449b = str;
                    this.f314450c = str2;
                    this.f314451d = str3;
                }

                @Override // com.avito.android.analytics.screens.mvi.s
                @l
                /* renamed from: d */
                public final String getF261005e() {
                    return null;
                }

                @Override // com.avito.android.analytics.screens.mvi.t
                @k
                /* renamed from: e */
                public final String getF112001c() {
                    return a.a();
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Success)) {
                        return false;
                    }
                    Success success = (Success) obj;
                    return L.f(this.f314449b, success.f314449b) && L.f(this.f314450c, success.f314450c) && L.f(this.f314451d, success.f314451d);
                }

                @Override // com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction.ResultActionHandling.Single
                @k
                /* renamed from: getAdvertId, reason: from getter */
                public final String getF314449b() {
                    return this.f314449b;
                }

                public final int hashCode() {
                    int iD2 = H.d(this.f314449b.hashCode() * 31, 31, this.f314450c);
                    String str = this.f314451d;
                    return iD2 + (str == null ? 0 : str.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Success(advertId=");
                    sb2.append(this.f314449b);
                    sb2.append(", currentShortcut=");
                    sb2.append(this.f314450c);
                    sb2.append(", msg=");
                    return C22026a.c(sb2, this.f314451d, ')');
                }

                public /* synthetic */ Success(String str, String str2, String str3, int i12, C42822w c42822w) {
                    this(str, str2, (i12 & 4) != 0 ? null : str3);
                }
            }
        }
    }
}
