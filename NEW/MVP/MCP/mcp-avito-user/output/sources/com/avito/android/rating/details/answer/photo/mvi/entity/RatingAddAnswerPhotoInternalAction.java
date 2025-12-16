package com.avito.android.rating.details.answer.photo.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.rating.details.answer.upload.ReviewReplyState;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerPhotoInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Finish", "HideLoading", "HideToastBar", "ImagesLoaded", "LoadingAnswer", "LoadingImages", "ShowErrorToastBar", "ShowUserDialog", "TrackPhotoPickerOpen", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$Finish;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$HideLoading;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$HideToastBar;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$ImagesLoaded;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$LoadingAnswer;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$LoadingImages;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$ShowErrorToastBar;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$ShowUserDialog;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$TrackPhotoPickerOpen;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingAddAnswerPhotoInternalAction extends n {

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$Finish;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements RatingAddAnswerPhotoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewReplyState.Result f246724b;

        public Finish(@k ReviewReplyState.Result result) {
            this.f246724b = result;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Finish) && this.f246724b.equals(((Finish) obj).f246724b);
        }

        public final int hashCode() {
            return this.f246724b.hashCode();
        }

        @k
        public final String toString() {
            return "Finish(reviewReplyState=" + this.f246724b + ')';
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$HideLoading;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideLoading implements RatingAddAnswerPhotoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideLoading f246725b = new HideLoading();

        private HideLoading() {
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$HideToastBar;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideToastBar implements RatingAddAnswerPhotoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideToastBar f246726b = new HideToastBar();

        private HideToastBar() {
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$ImagesLoaded;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImagesLoaded implements RatingAddAnswerPhotoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f246727b;

        public ImagesLoaded(@k ArrayList arrayList) {
            this.f246727b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImagesLoaded) && this.f246727b.equals(((ImagesLoaded) obj).f246727b);
        }

        public final int hashCode() {
            return this.f246727b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ImagesLoaded(photoIds="), this.f246727b, ')');
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$LoadingAnswer;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingAnswer extends TrackableLoadingStarted implements RatingAddAnswerPhotoInternalAction {
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$LoadingImages;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingImages implements RatingAddAnswerPhotoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingImages f246728b = new LoadingImages();

        private LoadingImages() {
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$ShowErrorToastBar;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToastBar implements RatingAddAnswerPhotoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f246729b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiException f246730c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f246731d;

        public ShowErrorToastBar(@k String str, @k ApiException apiException) {
            this.f246729b = str;
            this.f246730c = apiException;
            this.f246731d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            if (!(obj instanceof ShowErrorToastBar)) {
                return false;
            }
            ShowErrorToastBar showErrorToastBar = (ShowErrorToastBar) obj;
            return L.f(this.f246729b, showErrorToastBar.f246729b) && this.f246730c.equals(showErrorToastBar.f246730c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF208121c() {
            return this.f246731d;
        }

        public final int hashCode() {
            return this.f246730c.hashCode() + (this.f246729b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToastBar(text=");
            sb2.append(this.f246729b);
            sb2.append(", error=");
            return c.q(sb2, this.f246730c, ')');
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$ShowUserDialog;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUserDialog implements RatingAddAnswerPhotoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserDialog f246732b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiException f246733c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f246734d;

        public ShowUserDialog(@k UserDialog userDialog, @k ApiException apiException) {
            this.f246732b = userDialog;
            this.f246733c = apiException;
            this.f246734d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            if (!(obj instanceof ShowUserDialog)) {
                return false;
            }
            ShowUserDialog showUserDialog = (ShowUserDialog) obj;
            return L.f(this.f246732b, showUserDialog.f246732b) && this.f246733c.equals(showUserDialog.f246733c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF208121c() {
            return this.f246734d;
        }

        public final int hashCode() {
            return this.f246733c.hashCode() + (this.f246732b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowUserDialog(dialog=");
            sb2.append(this.f246732b);
            sb2.append(", error=");
            return c.q(sb2, this.f246733c, ')');
        }
    }

    /* compiled from: RatingAddAnswerPhotoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction$TrackPhotoPickerOpen;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TrackPhotoPickerOpen implements RatingAddAnswerPhotoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TrackPhotoPickerOpen f246735b = new TrackPhotoPickerOpen();

        private TrackPhotoPickerOpen() {
        }
    }
}
