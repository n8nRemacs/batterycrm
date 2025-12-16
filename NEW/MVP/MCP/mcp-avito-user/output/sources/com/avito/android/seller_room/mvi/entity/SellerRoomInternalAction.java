package com.avito.android.seller_room.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.remote.error.ApiError;
import kotlin.AbstractC40048c;
import kotlin.Metadata;

/* compiled from: SellerRoomInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "Error", "HandleBeduinEvent", "HandleBeduinState", "StartLoading", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$ContentLoaded;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$Error;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$HandleBeduinEvent;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$HandleBeduinState;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$StartLoading;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SellerRoomInternalAction extends n {

    /* compiled from: SellerRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$ContentLoaded;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoaded implements SellerRoomInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f268144b;

        public ContentLoaded(@k String str) {
            this.f268144b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }
    }

    /* compiled from: SellerRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$Error;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements SellerRoomInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f268145b;

        public Error(@k ApiError apiError) {
            this.f268145b = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
        public final J.a getF131362b() {
            return this.f268145b;
        }
    }

    /* compiled from: SellerRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$HandleBeduinEvent;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinEvent implements SellerRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f268146b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f268146b = beduinOneTimeEvent;
        }
    }

    /* compiled from: SellerRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$HandleBeduinState;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinState implements SellerRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f268147b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f268147b = abstractC40048c;
        }
    }

    /* compiled from: SellerRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction$StartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements SellerRoomInternalAction {
    }
}
