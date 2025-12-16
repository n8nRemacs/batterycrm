package com.avito.android.iac_calls_history.impl_module.screen.mvi.entity;

import Y61.k;
import Y61.l;
import aK.C19782a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallsHistoryScreenInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeItemsLoadingId", "ChangeSelectedTab", "ChangeUnreadMissedCallsCounter", "a", "HandleLink", "OnItemsLoaded", "OnItemsLoadingError", "SetOnlyLoadingItem", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$ChangeItemsLoadingId;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$ChangeSelectedTab;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$ChangeUnreadMissedCallsCounter;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$HandleLink;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$OnItemsLoaded;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$OnItemsLoadingError;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$SetOnlyLoadingItem;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CallsHistoryScreenInternalAction extends n {

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$ChangeItemsLoadingId;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeItemsLoadingId implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f164814b;

        public ChangeItemsLoadingId(@l Long l12) {
            this.f164814b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeItemsLoadingId) && L.f(this.f164814b, ((ChangeItemsLoadingId) obj).f164814b);
        }

        public final int hashCode() {
            Long l12 = this.f164814b;
            if (l12 == null) {
                return 0;
            }
            return l12.hashCode();
        }

        @k
        public final String toString() {
            return a.f164822a.a(new String[]{"loadingId=" + this.f164814b}, this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$ChangeSelectedTab;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSelectedTab implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f164815b;

        public ChangeSelectedTab(int i12) {
            this.f164815b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSelectedTab) && this.f164815b == ((ChangeSelectedTab) obj).f164815b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f164815b);
        }

        @k
        public final String toString() {
            return a.f164822a.a(new String[]{"position=" + this.f164815b}, this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$ChangeUnreadMissedCallsCounter;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeUnreadMissedCallsCounter implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f164816b;

        public ChangeUnreadMissedCallsCounter(int i12) {
            this.f164816b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeUnreadMissedCallsCounter) && this.f164816b == ((ChangeUnreadMissedCallsCounter) obj).f164816b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f164816b);
        }

        @k
        public final String toString() {
            return a.f164822a.a(new String[]{"counter=" + this.f164816b}, this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$HandleLink;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleLink implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f164817b;

        public HandleLink(@k DeepLink deepLink) {
            this.f164817b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleLink) && L.f(this.f164817b, ((HandleLink) obj).f164817b);
        }

        public final int hashCode() {
            return this.f164817b.hashCode();
        }

        @k
        public final String toString() {
            return a.f164822a.a(new String[]{"link=" + this.f164817b}, this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$OnItemsLoaded;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnItemsLoaded implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f164818b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f164819c;

        public OnItemsLoaded(boolean z12, @k List<? extends CallsHistoryScreenState.Item> list) {
            this.f164818b = z12;
            this.f164819c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnItemsLoaded)) {
                return false;
            }
            OnItemsLoaded onItemsLoaded = (OnItemsLoaded) obj;
            return this.f164818b == onItemsLoaded.f164818b && L.f(this.f164819c, onItemsLoaded.f164819c);
        }

        public final int hashCode() {
            return this.f164819c.hashCode() + (Boolean.hashCode(this.f164818b) * 31);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
        @k
        public final String toString() {
            return a.f164822a.a(new String[]{"hasMore=" + this.f164818b, "itemsCount=" + this.f164819c.size()}, this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$OnItemsLoadingError;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnItemsLoadingError implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnItemsLoadingError f164820b = new OnItemsLoadingError();

        private OnItemsLoadingError() {
        }

        @k
        public final String toString() {
            return a.f164822a.a(new String[0], this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$SetOnlyLoadingItem;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SetOnlyLoadingItem implements CallsHistoryScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetOnlyLoadingItem f164821b = new SetOnlyLoadingItem();

        private SetOnlyLoadingItem() {
        }

        @k
        public final String toString() {
            return a.f164822a.a(new String[0], this);
        }
    }

    /* compiled from: CallsHistoryScreenInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C19782a<CallsHistoryScreenInternalAction> f164822a;

        static {
            new a();
            f164822a = new C19782a<>(CallsHistoryScreenInternalAction.class);
        }
    }
}
