package com.avito.android.imv_goods_advert.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvGoodsAdvertInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "OpenGallery", "ShowContent", "ShowDescription", "ShowError", "UpdateGalleryPosition", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$CloseScreen;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$OpenGallery;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$ShowContent;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$ShowDescription;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$ShowError;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$UpdateGalleryPosition;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ImvGoodsAdvertInternalAction extends n {

    /* compiled from: ImvGoodsAdvertInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$CloseScreen;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "()V", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements ImvGoodsAdvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f170549b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: ImvGoodsAdvertInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$ShowContent;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements ImvGoodsAdvertInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdvertDetails f170553b;

        public ShowContent(@k AdvertDetails advertDetails) {
            this.f170553b = advertDetails;
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

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f170553b, ((ShowContent) obj).f170553b);
        }

        public final int hashCode() {
            return this.f170553b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(advertDetails=" + this.f170553b + ')';
        }
    }

    /* compiled from: ImvGoodsAdvertInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$ShowDescription;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDescription implements ImvGoodsAdvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdvertDetails f170554b;

        public ShowDescription(@k AdvertDetails advertDetails) {
            this.f170554b = advertDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDescription) && L.f(this.f170554b, ((ShowDescription) obj).f170554b);
        }

        public final int hashCode() {
            return this.f170554b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDescription(advertDetails=" + this.f170554b + ')';
        }
    }

    /* compiled from: ImvGoodsAdvertInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$ShowError;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ImvGoodsAdvertInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError.UnknownError f170555b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f170556c;

        public ShowError(@k ApiError.UnknownError unknownError) {
            this.f170555b = unknownError;
            this.f170556c = new J.a(unknownError);
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

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && this.f170555b.equals(((ShowError) obj).f170555b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF122503c() {
            return this.f170556c;
        }

        public final int hashCode() {
            return this.f170555b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowError(error=" + this.f170555b + ')';
        }
    }

    /* compiled from: ImvGoodsAdvertInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$UpdateGalleryPosition;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateGalleryPosition implements ImvGoodsAdvertInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final int f170557b;

        public UpdateGalleryPosition(int i12) {
            this.f170557b = i12;
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

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateGalleryPosition) && this.f170557b == ((UpdateGalleryPosition) obj).f170557b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f170557b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateGalleryPosition(currentPhotoPosition="), this.f170557b, ')');
        }
    }

    /* compiled from: ImvGoodsAdvertInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction$OpenGallery;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenGallery implements ImvGoodsAdvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AdvertDetails f170550b;

        /* renamed from: c, reason: collision with root package name */
        public final int f170551c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f170552d;

        public OpenGallery(@l AdvertDetails advertDetails, int i12, @l Long l12) {
            this.f170550b = advertDetails;
            this.f170551c = i12;
            this.f170552d = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenGallery)) {
                return false;
            }
            OpenGallery openGallery = (OpenGallery) obj;
            return L.f(this.f170550b, openGallery.f170550b) && this.f170551c == openGallery.f170551c && L.f(this.f170552d, openGallery.f170552d);
        }

        public final int hashCode() {
            AdvertDetails advertDetails = this.f170550b;
            int iE2 = r.e(this.f170551c, (advertDetails == null ? 0 : advertDetails.hashCode()) * 31, 31);
            Long l12 = this.f170552d;
            return iE2 + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(advertDetails=");
            sb2.append(this.f170550b);
            sb2.append(", position=");
            sb2.append(this.f170551c);
            sb2.append(", stateId=");
            return m.m(sb2, this.f170552d, ')');
        }

        public /* synthetic */ OpenGallery(AdvertDetails advertDetails, int i12, Long l12, int i13, C42822w c42822w) {
            this(advertDetails, i12, (i13 & 4) != 0 ? null : l12);
        }
    }
}
