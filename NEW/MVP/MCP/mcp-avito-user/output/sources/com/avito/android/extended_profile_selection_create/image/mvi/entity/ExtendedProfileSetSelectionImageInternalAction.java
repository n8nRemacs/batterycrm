package com.avito.android.extended_profile_selection_create.image.mvi.entity;

import JA.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ImageUpdate", "InitState", "OpenImageEditor", "OpenPhotoPicker", "SetSelectionImageError", "SetSelectionImageLoading", "SetSelectionImageSuccess", "SetSelectionIncorrectValuesError", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$ImageUpdate;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$InitState;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$OpenImageEditor;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$OpenPhotoPicker;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageError;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageLoading;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageSuccess;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionIncorrectValuesError;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ExtendedProfileSetSelectionImageInternalAction extends n {

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f151769b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -548605850;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$ImageUpdate;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageUpdate implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UploadImage.ImageFromPhotoPicker f151770b;

        public ImageUpdate(@l UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
            this.f151770b = imageFromPhotoPicker;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImageUpdate) && L.f(this.f151770b, ((ImageUpdate) obj).f151770b);
        }

        public final int hashCode() {
            UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = this.f151770b;
            if (imageFromPhotoPicker == null) {
                return 0;
            }
            return imageFromPhotoPicker.hashCode();
        }

        @k
        public final String toString() {
            return "ImageUpdate(image=" + this.f151770b + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$InitState;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitState f151771b = new InitState();

        private InitState() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitState);
        }

        public final int hashCode() {
            return -394630717;
        }

        @k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$OpenImageEditor;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenImageEditor implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ExtendedProfileImageEditConfig f151772b;

        public OpenImageEditor(@k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
            this.f151772b = extendedProfileImageEditConfig;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenImageEditor) && L.f(this.f151772b, ((OpenImageEditor) obj).f151772b);
        }

        public final int hashCode() {
            return this.f151772b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenImageEditor(config=" + this.f151772b + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$OpenPhotoPicker;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhotoPicker implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151773b;

        public OpenPhotoPicker(@k String str) {
            this.f151773b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPhotoPicker) && L.f(this.f151773b, ((OpenPhotoPicker) obj).f151773b);
        }

        public final int hashCode() {
            return this.f151773b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPhotoPicker(operationId="), this.f151773b, ')');
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageError;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionImageError implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f151774b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a.b f151775c;

        public SetSelectionImageError(@k Throwable th2, @l a.b bVar) {
            this.f151774b = th2;
            this.f151775c = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetSelectionImageError)) {
                return false;
            }
            SetSelectionImageError setSelectionImageError = (SetSelectionImageError) obj;
            return L.f(this.f151774b, setSelectionImageError.f151774b) && L.f(this.f151775c, setSelectionImageError.f151775c);
        }

        public final int hashCode() {
            return (this.f151774b.hashCode() * 31) + (this.f151775c == null ? 0 : -1096693645);
        }

        @k
        public final String toString() {
            return "SetSelectionImageError(throwable=" + this.f151774b + ", action=" + this.f151775c + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageLoading;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionImageLoading implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetSelectionImageLoading f151776b = new SetSelectionImageLoading();

        private SetSelectionImageLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetSelectionImageLoading);
        }

        public final int hashCode() {
            return 827300649;
        }

        @k
        public final String toString() {
            return "SetSelectionImageLoading";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageSuccess;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionImageSuccess implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetSelectionImageSuccess f151777b = new SetSelectionImageSuccess();

        private SetSelectionImageSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetSelectionImageSuccess);
        }

        public final int hashCode() {
            return -1376519696;
        }

        @k
        public final String toString() {
            return "SetSelectionImageSuccess";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction$SetSelectionIncorrectValuesError;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectionIncorrectValuesError implements ExtendedProfileSetSelectionImageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151778b;

        public SetSelectionIncorrectValuesError(@k String str) {
            this.f151778b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSelectionIncorrectValuesError) && L.f(this.f151778b, ((SetSelectionIncorrectValuesError) obj).f151778b);
        }

        public final int hashCode() {
            return this.f151778b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetSelectionIncorrectValuesError(message="), this.f151778b, ')');
        }
    }
}
