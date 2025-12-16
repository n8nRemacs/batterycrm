package com.avito.android.profile_management_core.images.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UploadImage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImage;", "Landroid/os/Parcelable;", "ImageFromApi", "ImageFromPhotoPicker", "Type", "Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromApi;", "Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromPhotoPicker;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class UploadImage implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f226676b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UploadImageState f226677c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f226678d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Type f226679e;

    /* compiled from: UploadImage.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromApi;", "Lcom/avito/android/profile_management_core/images/entity/UploadImage;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageFromApi extends UploadImage {

        @Y61.k
        public static final Parcelable.Creator<ImageFromApi> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f226680f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final UploadImageState f226681g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f226682h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Type f226683i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final Image f226684j;

        /* compiled from: UploadImage.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageFromApi> {
            @Override // android.os.Parcelable.Creator
            public final ImageFromApi createFromParcel(Parcel parcel) {
                return new ImageFromApi(parcel.readString(), (UploadImageState) parcel.readParcelable(ImageFromApi.class.getClassLoader()), parcel.readString(), Type.valueOf(parcel.readString()), (Image) parcel.readParcelable(ImageFromApi.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ImageFromApi[] newArray(int i12) {
                return new ImageFromApi[i12];
            }
        }

        public ImageFromApi(@Y61.k String str, @Y61.k UploadImageState uploadImageState, @Y61.k String str2, @Y61.k Type type, @Y61.k Image image) {
            super(str, uploadImageState, str2, type, null);
            this.f226680f = str;
            this.f226681g = uploadImageState;
            this.f226682h = str2;
            this.f226683i = type;
            this.f226684j = image;
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF226678d() {
            return this.f226682h;
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final UploadImageState getF226677c() {
            return this.f226681g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final Type getF226679e() {
            return this.f226683i;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageFromApi)) {
                return false;
            }
            ImageFromApi imageFromApi = (ImageFromApi) obj;
            return L.f(this.f226680f, imageFromApi.f226680f) && L.f(this.f226681g, imageFromApi.f226681g) && L.f(this.f226682h, imageFromApi.f226682h) && this.f226683i == imageFromApi.f226683i && L.f(this.f226684j, imageFromApi.f226684j);
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: f, reason: from getter */
        public final String getF226676b() {
            return this.f226680f;
        }

        public final int hashCode() {
            return this.f226684j.hashCode() + ((this.f226683i.hashCode() + H.d((this.f226681g.hashCode() + (this.f226680f.hashCode() * 31)) * 31, 31, this.f226682h)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageFromApi(valueId=");
            sb2.append(this.f226680f);
            sb2.append(", state=");
            sb2.append(this.f226681g);
            sb2.append(", fieldName=");
            sb2.append(this.f226682h);
            sb2.append(", type=");
            sb2.append(this.f226683i);
            sb2.append(", image=");
            return AK.c.o(sb2, this.f226684j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f226680f);
            parcel.writeParcelable(this.f226681g, i12);
            parcel.writeString(this.f226682h);
            parcel.writeString(this.f226683i.name());
            parcel.writeParcelable(this.f226684j, i12);
        }
    }

    /* compiled from: UploadImage.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromPhotoPicker;", "Lcom/avito/android/profile_management_core/images/entity/UploadImage;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageFromPhotoPicker extends UploadImage {

        @Y61.k
        public static final Parcelable.Creator<ImageFromPhotoPicker> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f226685f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final UploadImageState f226686g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f226687h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Type f226688i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final Uri f226689j;

        /* compiled from: UploadImage.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageFromPhotoPicker> {
            @Override // android.os.Parcelable.Creator
            public final ImageFromPhotoPicker createFromParcel(Parcel parcel) {
                return new ImageFromPhotoPicker(parcel.readString(), (UploadImageState) parcel.readParcelable(ImageFromPhotoPicker.class.getClassLoader()), parcel.readString(), Type.valueOf(parcel.readString()), (Uri) parcel.readParcelable(ImageFromPhotoPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ImageFromPhotoPicker[] newArray(int i12) {
                return new ImageFromPhotoPicker[i12];
            }
        }

        public ImageFromPhotoPicker(@Y61.k String str, @Y61.k UploadImageState uploadImageState, @Y61.k String str2, @Y61.k Type type, @Y61.k Uri uri) {
            super(str, uploadImageState, str2, type, null);
            this.f226685f = str;
            this.f226686g = uploadImageState;
            this.f226687h = str2;
            this.f226688i = type;
            this.f226689j = uri;
        }

        public static ImageFromPhotoPicker g(ImageFromPhotoPicker imageFromPhotoPicker, UploadImageState uploadImageState) {
            String str = imageFromPhotoPicker.f226685f;
            String str2 = imageFromPhotoPicker.f226687h;
            Type type = imageFromPhotoPicker.f226688i;
            Uri uri = imageFromPhotoPicker.f226689j;
            imageFromPhotoPicker.getClass();
            return new ImageFromPhotoPicker(str, uploadImageState, str2, type, uri);
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF226678d() {
            return this.f226687h;
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final UploadImageState getF226677c() {
            return this.f226686g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final Type getF226679e() {
            return this.f226688i;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageFromPhotoPicker)) {
                return false;
            }
            ImageFromPhotoPicker imageFromPhotoPicker = (ImageFromPhotoPicker) obj;
            return L.f(this.f226685f, imageFromPhotoPicker.f226685f) && L.f(this.f226686g, imageFromPhotoPicker.f226686g) && L.f(this.f226687h, imageFromPhotoPicker.f226687h) && this.f226688i == imageFromPhotoPicker.f226688i && L.f(this.f226689j, imageFromPhotoPicker.f226689j);
        }

        @Override // com.avito.android.profile_management_core.images.entity.UploadImage
        @Y61.k
        /* renamed from: f, reason: from getter */
        public final String getF226676b() {
            return this.f226685f;
        }

        public final int hashCode() {
            return this.f226689j.hashCode() + ((this.f226688i.hashCode() + H.d((this.f226686g.hashCode() + (this.f226685f.hashCode() * 31)) * 31, 31, this.f226687h)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageFromPhotoPicker(valueId=");
            sb2.append(this.f226685f);
            sb2.append(", state=");
            sb2.append(this.f226686g);
            sb2.append(", fieldName=");
            sb2.append(this.f226687h);
            sb2.append(", type=");
            sb2.append(this.f226688i);
            sb2.append(", imageUri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f226689j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f226685f);
            parcel.writeParcelable(this.f226686g, i12);
            parcel.writeString(this.f226687h);
            parcel.writeString(this.f226688i.name());
            parcel.writeParcelable(this.f226689j, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UploadImage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImage$Type;", "", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f226690b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f226691c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f226692d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f226693e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f226694f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Type[] f226695g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f226696h;

        static {
            Type type = new Type("GALLERY", 0);
            f226690b = type;
            Type type2 = new Type("BANNER", 1);
            f226691c = type2;
            Type type3 = new Type("PREMIUM_BANNER", 2);
            f226692d = type3;
            Type type4 = new Type("LOGO", 3);
            Type type5 = new Type("SELECTION_COVER", 4);
            f226693e = type5;
            Type type6 = new Type("UNIVERSAL_WIDGET", 5);
            f226694f = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            f226695g = typeArr;
            f226696h = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f226695g.clone();
        }
    }

    public UploadImage(String str, UploadImageState uploadImageState, String str2, Type type, C42822w c42822w) {
        this.f226676b = str;
        this.f226677c = uploadImageState;
        this.f226678d = str2;
        this.f226679e = type;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public String getF226678d() {
        return this.f226678d;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public UploadImageState getF226677c() {
        return this.f226677c;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public Type getF226679e() {
        return this.f226679e;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public String getF226676b() {
        return this.f226676b;
    }
}
