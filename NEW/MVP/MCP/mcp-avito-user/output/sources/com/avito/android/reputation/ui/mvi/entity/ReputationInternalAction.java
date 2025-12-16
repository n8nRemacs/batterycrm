package com.avito.android.reputation.ui.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HandleBeduinEvent", "HandleBeduinState", "ScreenLoaded", "ScreenLoadedError", "ScreenLoading", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$HandleBeduinEvent;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$HandleBeduinState;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$ScreenLoaded;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$ScreenLoadedError;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$ScreenLoading;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ReputationInternalAction extends n {

    /* compiled from: ReputationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$HandleBeduinEvent;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinEvent implements ReputationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f255062b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f255062b = beduinOneTimeEvent;
        }
    }

    /* compiled from: ReputationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$HandleBeduinState;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinState implements ReputationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f255063b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f255063b = abstractC40048c;
        }
    }

    /* compiled from: ReputationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$ScreenLoaded;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenLoaded implements ReputationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255064b;

        public ScreenLoaded(@k String str) {
            this.f255064b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScreenLoaded) && L.f(this.f255064b, ((ScreenLoaded) obj).f255064b);
        }

        public final int hashCode() {
            return this.f255064b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ScreenLoaded(json="), this.f255064b, ')');
        }
    }

    /* compiled from: ReputationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$ScreenLoadedError;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenLoadedError implements ReputationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScreenLoadedError f255065b = new ScreenLoadedError();

        private ScreenLoadedError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScreenLoadedError);
        }

        public final int hashCode() {
            return 712196546;
        }

        @k
        public final String toString() {
            return "ScreenLoadedError";
        }
    }

    /* compiled from: ReputationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction$ScreenLoading;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenLoading implements ReputationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScreenLoading f255066b = new ScreenLoading();

        private ScreenLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScreenLoading);
        }

        public final int hashCode() {
            return -511742597;
        }

        @k
        public final String toString() {
            return "ScreenLoading";
        }
    }
}
