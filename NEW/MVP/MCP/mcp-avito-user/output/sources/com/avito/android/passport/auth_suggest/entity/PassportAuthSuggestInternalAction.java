package com.avito.android.passport.auth_suggest.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.remote.error.ApiError;
import kotlin.AbstractC40048c;
import kotlin.Metadata;

/* compiled from: PassportAuthSuggestInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "Error", "HandleBeduinEvent", "HandleBeduinState", "LoadingStarted", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$ContentLoaded;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$Error;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$HandleBeduinEvent;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$HandleBeduinState;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$LoadingStarted;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PassportAuthSuggestInternalAction extends n {

    /* compiled from: PassportAuthSuggestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$ContentLoaded;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoaded implements PassportAuthSuggestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f211015b;

        public ContentLoaded(@k String str) {
            this.f211015b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }
    }

    /* compiled from: PassportAuthSuggestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$Error;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements PassportAuthSuggestInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f211016b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f211017c;

        public Error(@k ApiError apiError) {
            this.f211016b = apiError;
            this.f211017c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF170556c() {
            return this.f211017c;
        }
    }

    /* compiled from: PassportAuthSuggestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$HandleBeduinEvent;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinEvent implements PassportAuthSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f211018b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f211018b = beduinOneTimeEvent;
        }
    }

    /* compiled from: PassportAuthSuggestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$HandleBeduinState;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinState implements PassportAuthSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f211019b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f211019b = abstractC40048c;
        }
    }

    /* compiled from: PassportAuthSuggestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements PassportAuthSuggestInternalAction {
    }
}
