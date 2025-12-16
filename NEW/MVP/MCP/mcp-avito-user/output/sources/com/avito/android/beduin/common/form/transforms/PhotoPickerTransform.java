package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: PhotoPickerTransform.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "DeletePhoto", "ErrorState", "PhotoLoadingState", "UserImage", "UserImageMinSizeError", "UserImages", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$DeletePhoto;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$ErrorState;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$PhotoLoadingState;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$UserImage;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$UserImageMinSizeError;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$UserImages;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PhotoPickerTransform extends BeduinModelTransform {

    /* compiled from: PhotoPickerTransform.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$DeletePhoto;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeletePhoto implements PhotoPickerTransform {

        @k
        public static final Parcelable.Creator<DeletePhoto> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f103391b;

        /* compiled from: PhotoPickerTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeletePhoto> {
            @Override // android.os.Parcelable.Creator
            public final DeletePhoto createFromParcel(Parcel parcel) {
                return new DeletePhoto(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final DeletePhoto[] newArray(int i12) {
                return new DeletePhoto[i12];
            }
        }

        public DeletePhoto(long j12) {
            this.f103391b = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletePhoto) && this.f103391b == ((DeletePhoto) obj).f103391b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f103391b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("DeletePhoto(photoStorageId="), this.f103391b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f103391b);
        }
    }

    /* compiled from: PhotoPickerTransform.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$ErrorState;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorState implements PhotoPickerTransform {

        @k
        public static final Parcelable.Creator<ErrorState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BeduinPhotoPickerModel.ErrorState f103392b;

        /* compiled from: PhotoPickerTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorState> {
            @Override // android.os.Parcelable.Creator
            public final ErrorState createFromParcel(Parcel parcel) {
                return new ErrorState(parcel.readInt() == 0 ? null : BeduinPhotoPickerModel.ErrorState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorState[] newArray(int i12) {
                return new ErrorState[i12];
            }
        }

        public ErrorState(@l BeduinPhotoPickerModel.ErrorState errorState) {
            this.f103392b = errorState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorState) && L.f(this.f103392b, ((ErrorState) obj).f103392b);
        }

        public final int hashCode() {
            BeduinPhotoPickerModel.ErrorState errorState = this.f103392b;
            if (errorState == null) {
                return 0;
            }
            return errorState.hashCode();
        }

        @k
        public final String toString() {
            return "ErrorState(errorState=" + this.f103392b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            BeduinPhotoPickerModel.ErrorState errorState = this.f103392b;
            if (errorState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                errorState.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: PhotoPickerTransform.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$PhotoLoadingState;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhotoLoadingState implements PhotoPickerTransform {

        @k
        public static final Parcelable.Creator<PhotoLoadingState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f103393b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final BeduinPhotoPickerModel.PhotoPickerImage.LoadingState f103394c;

        /* compiled from: PhotoPickerTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhotoLoadingState> {
            @Override // android.os.Parcelable.Creator
            public final PhotoLoadingState createFromParcel(Parcel parcel) {
                return new PhotoLoadingState(parcel.readLong(), (BeduinPhotoPickerModel.PhotoPickerImage.LoadingState) parcel.readParcelable(PhotoLoadingState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoLoadingState[] newArray(int i12) {
                return new PhotoLoadingState[i12];
            }
        }

        public PhotoLoadingState(long j12, @k BeduinPhotoPickerModel.PhotoPickerImage.LoadingState loadingState) {
            this.f103393b = j12;
            this.f103394c = loadingState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhotoLoadingState)) {
                return false;
            }
            PhotoLoadingState photoLoadingState = (PhotoLoadingState) obj;
            return this.f103393b == photoLoadingState.f103393b && L.f(this.f103394c, photoLoadingState.f103394c);
        }

        public final int hashCode() {
            return this.f103394c.hashCode() + (Long.hashCode(this.f103393b) * 31);
        }

        @k
        public final String toString() {
            return "PhotoLoadingState(photoStorageId=" + this.f103393b + ", loadingState=" + this.f103394c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f103393b);
            parcel.writeParcelable(this.f103394c, i12);
        }
    }

    /* compiled from: PhotoPickerTransform.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$UserImage;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserImage implements PhotoPickerTransform {

        @k
        public static final Parcelable.Creator<UserImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f103395b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f103396c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Image f103397d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final BeduinPhotoPickerModel.ImageDeleteParams f103398e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final BeduinPhotoPickerModel.PhotoPickerImage.LoadingState f103399f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final BeduinPhotoPickerModel.ControlButton f103400g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Map<String, Object> f103401h;

        /* compiled from: PhotoPickerTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserImage> {
            @Override // android.os.Parcelable.Creator
            public final UserImage createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                long j12 = parcel.readLong();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Image image = (Image) parcel.readParcelable(UserImage.class.getClassLoader());
                BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParamsCreateFromParcel = parcel.readInt() == 0 ? null : BeduinPhotoPickerModel.ImageDeleteParams.CREATOR.createFromParcel(parcel);
                BeduinPhotoPickerModel.PhotoPickerImage.LoadingState loadingState = (BeduinPhotoPickerModel.PhotoPickerImage.LoadingState) parcel.readParcelable(UserImage.class.getClassLoader());
                BeduinPhotoPickerModel.ControlButton controlButtonCreateFromParcel = parcel.readInt() == 0 ? null : BeduinPhotoPickerModel.ControlButton.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = h.c(UserImage.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                        linkedHashMap2 = linkedHashMap2;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new UserImage(j12, lValueOf, image, imageDeleteParamsCreateFromParcel, loadingState, controlButtonCreateFromParcel, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final UserImage[] newArray(int i12) {
                return new UserImage[i12];
            }
        }

        public UserImage(long j12, @l Long l12, @k Image image, @l BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParams, @k BeduinPhotoPickerModel.PhotoPickerImage.LoadingState loadingState, @l BeduinPhotoPickerModel.ControlButton controlButton, @l Map<String, ? extends Object> map) {
            this.f103395b = j12;
            this.f103396c = l12;
            this.f103397d = image;
            this.f103398e = imageDeleteParams;
            this.f103399f = loadingState;
            this.f103400g = controlButton;
            this.f103401h = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserImage)) {
                return false;
            }
            UserImage userImage = (UserImage) obj;
            return this.f103395b == userImage.f103395b && L.f(this.f103396c, userImage.f103396c) && L.f(this.f103397d, userImage.f103397d) && L.f(this.f103398e, userImage.f103398e) && L.f(this.f103399f, userImage.f103399f) && L.f(this.f103400g, userImage.f103400g) && L.f(this.f103401h, userImage.f103401h);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f103395b) * 31;
            Long l12 = this.f103396c;
            int iG2 = com.avito.android.actions_sheet.a.g(this.f103397d, (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31);
            BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParams = this.f103398e;
            int iHashCode2 = (this.f103399f.hashCode() + ((iG2 + (imageDeleteParams == null ? 0 : imageDeleteParams.hashCode())) * 31)) * 31;
            BeduinPhotoPickerModel.ControlButton controlButton = this.f103400g;
            int iHashCode3 = (iHashCode2 + (controlButton == null ? 0 : controlButton.hashCode())) * 31;
            Map<String, Object> map = this.f103401h;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UserImage(photoStorageId=");
            sb2.append(this.f103395b);
            sb2.append(", id=");
            sb2.append(this.f103396c);
            sb2.append(", urls=");
            sb2.append(this.f103397d);
            sb2.append(", imageDeleteParams=");
            sb2.append(this.f103398e);
            sb2.append(", loadingState=");
            sb2.append(this.f103399f);
            sb2.append(", controlButton=");
            sb2.append(this.f103400g);
            sb2.append(", parameters=");
            return r.w(sb2, this.f103401h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f103395b);
            Long l12 = this.f103396c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeParcelable(this.f103397d, i12);
            BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParams = this.f103398e;
            if (imageDeleteParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageDeleteParams.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f103399f, i12);
            BeduinPhotoPickerModel.ControlButton controlButton = this.f103400g;
            if (controlButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                controlButton.writeToParcel(parcel, i12);
            }
            Map<String, Object> map = this.f103401h;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
    }

    /* compiled from: PhotoPickerTransform.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$UserImageMinSizeError;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserImageMinSizeError implements PhotoPickerTransform {

        @k
        public static final Parcelable.Creator<UserImageMinSizeError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f103402b;

        /* compiled from: PhotoPickerTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserImageMinSizeError> {
            @Override // android.os.Parcelable.Creator
            public final UserImageMinSizeError createFromParcel(Parcel parcel) {
                return new UserImageMinSizeError(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final UserImageMinSizeError[] newArray(int i12) {
                return new UserImageMinSizeError[i12];
            }
        }

        public UserImageMinSizeError(long j12) {
            this.f103402b = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserImageMinSizeError) && this.f103402b == ((UserImageMinSizeError) obj).f103402b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f103402b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("UserImageMinSizeError(photoStorageId="), this.f103402b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f103402b);
        }
    }

    /* compiled from: PhotoPickerTransform.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform$UserImages;", "Lcom/avito/android/beduin/common/form/transforms/PhotoPickerTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserImages implements PhotoPickerTransform {

        @k
        public static final Parcelable.Creator<UserImages> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f103403b;

        /* compiled from: PhotoPickerTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserImages> {
            @Override // android.os.Parcelable.Creator
            public final UserImages createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(BeduinPhotoPickerModel.PhotoPickerImage.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new UserImages(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final UserImages[] newArray(int i12) {
                return new UserImages[i12];
            }
        }

        public UserImages(@k ArrayList arrayList) {
            this.f103403b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserImages) && this.f103403b.equals(((UserImages) obj).f103403b);
        }

        public final int hashCode() {
            return this.f103403b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("UserImages(images="), this.f103403b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            ArrayList arrayList = this.f103403b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BeduinPhotoPickerModel.PhotoPickerImage) it.next()).writeToParcel(parcel, i12);
            }
        }
    }
}
