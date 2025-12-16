package com.avito.android.photo_picker;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoPickerIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory;", "", "AddType", "CameraType", "CropType", "PhotoPickerMode", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhotoPickerIntentFactory {

    /* compiled from: PhotoPickerIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType;", "Landroid/os/Parcelable;", "()V", "Default", "GigDocuments", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType$Default;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType$GigDocuments;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class AddType implements Parcelable {

        /* compiled from: PhotoPickerIntentFactory.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType$Default;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType;", "<init>", "()V", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Default extends AddType {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Default f218797b = new Default();

            @Y61.k
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Default> {
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Default.f218797b;
                }

                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i12) {
                    return new Default[i12];
                }
            }

            public Default() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Default);
            }

            public final int hashCode() {
                return 1549250006;
            }

            @Y61.k
            public final String toString() {
                return "Default";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PhotoPickerIntentFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType$GigDocuments;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$AddType;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GigDocuments extends AddType {

            @Y61.k
            public static final Parcelable.Creator<GigDocuments> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f218798b;

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<GigDocuments> {
                @Override // android.os.Parcelable.Creator
                public final GigDocuments createFromParcel(Parcel parcel) {
                    return new GigDocuments(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final GigDocuments[] newArray(int i12) {
                    return new GigDocuments[i12];
                }
            }

            public GigDocuments(@Y61.k String str) {
                super(null);
                this.f218798b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GigDocuments) && kotlin.jvm.internal.L.f(this.f218798b, ((GigDocuments) obj).f218798b);
            }

            public final int hashCode() {
                return this.f218798b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("GigDocuments(hint="), this.f218798b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f218798b);
            }
        }

        public /* synthetic */ AddType(C42822w c42822w) {
            this();
        }

        public AddType() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoPickerIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$CameraType;", "", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CameraType {

        /* renamed from: b, reason: collision with root package name */
        public static final CameraType f218799b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ CameraType[] f218800c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f218801d;

        static {
            CameraType cameraType = new CameraType("BACK_CAMERA", 0);
            f218799b = cameraType;
            CameraType[] cameraTypeArr = {cameraType, new CameraType("FRONT_CAMERA", 1)};
            f218800c = cameraTypeArr;
            f218801d = kotlin.enums.c.a(cameraTypeArr);
        }

        public CameraType() {
            throw null;
        }

        public static CameraType valueOf(String str) {
            return (CameraType) Enum.valueOf(CameraType.class, str);
        }

        public static CameraType[] values() {
            return (CameraType[]) f218800c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoPickerIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$CropType;", "", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CropType {

        /* renamed from: b, reason: collision with root package name */
        public static final CropType f218802b;

        /* renamed from: c, reason: collision with root package name */
        public static final CropType f218803c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CropType[] f218804d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f218805e;

        static {
            CropType cropType = new CropType("CIRCLE", 0);
            f218802b = cropType;
            CropType cropType2 = new CropType("SQUARE", 1);
            f218803c = cropType2;
            CropType[] cropTypeArr = {cropType, cropType2};
            f218804d = cropTypeArr;
            f218805e = kotlin.enums.c.a(cropTypeArr);
        }

        public CropType() {
            throw null;
        }

        public static CropType valueOf(String str) {
            return (CropType) Enum.valueOf(CropType.class, str);
        }

        public static CropType[] values() {
            return (CropType[]) f218804d.clone();
        }
    }

    /* compiled from: PhotoPickerIntentFactory.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode;", "Landroid/os/Parcelable;", "()V", "ModeAdd", "ModeAvatar", "ModeCrop", "ModeEdit", "ModeView", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeAdd;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeAvatar;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeCrop;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeEdit;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeView;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PhotoPickerMode implements Parcelable {

        /* compiled from: PhotoPickerIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeAdd;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ModeAdd extends PhotoPickerMode {

            @Y61.k
            public static final Parcelable.Creator<ModeAdd> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AddType f218806b;

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ModeAdd> {
                @Override // android.os.Parcelable.Creator
                public final ModeAdd createFromParcel(Parcel parcel) {
                    return new ModeAdd((AddType) parcel.readParcelable(ModeAdd.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ModeAdd[] newArray(int i12) {
                    return new ModeAdd[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ModeAdd() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ModeAdd) && kotlin.jvm.internal.L.f(this.f218806b, ((ModeAdd) obj).f218806b);
            }

            public final int hashCode() {
                return this.f218806b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ModeAdd(type=" + this.f218806b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f218806b, i12);
            }

            public ModeAdd(@Y61.k AddType addType) {
                super(null);
                this.f218806b = addType;
            }

            public /* synthetic */ ModeAdd(AddType addType, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? AddType.Default.f218797b : addType);
            }
        }

        /* compiled from: PhotoPickerIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeAvatar;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ModeAvatar extends PhotoPickerMode {

            @Y61.k
            public static final Parcelable.Creator<ModeAvatar> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final CropType f218807b;

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ModeAvatar> {
                @Override // android.os.Parcelable.Creator
                public final ModeAvatar createFromParcel(Parcel parcel) {
                    return new ModeAvatar(CropType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ModeAvatar[] newArray(int i12) {
                    return new ModeAvatar[i12];
                }
            }

            public ModeAvatar(@Y61.k CropType cropType) {
                super(null);
                this.f218807b = cropType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f218807b.name());
            }
        }

        /* compiled from: PhotoPickerIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeCrop;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode;", "<init>", "()V", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ModeCrop extends PhotoPickerMode {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ModeCrop f218808b = new ModeCrop();

            @Y61.k
            public static final Parcelable.Creator<ModeCrop> CREATOR = new a();

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ModeCrop> {
                @Override // android.os.Parcelable.Creator
                public final ModeCrop createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ModeCrop.f218808b;
                }

                @Override // android.os.Parcelable.Creator
                public final ModeCrop[] newArray(int i12) {
                    return new ModeCrop[i12];
                }
            }

            public ModeCrop() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PhotoPickerIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeEdit;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ModeEdit extends PhotoPickerMode {

            @Y61.k
            public static final Parcelable.Creator<ModeEdit> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f218809b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f218810c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f218811d;

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ModeEdit> {
                @Override // android.os.Parcelable.Creator
                public final ModeEdit createFromParcel(Parcel parcel) {
                    return new ModeEdit(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ModeEdit[] newArray(int i12) {
                    return new ModeEdit[i12];
                }
            }

            public ModeEdit() {
                this(false, false, false, 7, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.f218809b ? 1 : 0);
                parcel.writeInt(this.f218810c ? 1 : 0);
                parcel.writeInt(this.f218811d ? 1 : 0);
            }

            public /* synthetic */ ModeEdit(boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13, (i12 & 4) != 0 ? true : z14);
            }

            public ModeEdit(boolean z12, boolean z13, boolean z14) {
                super(null);
                this.f218809b = z12;
                this.f218810c = z13;
                this.f218811d = z14;
            }
        }

        /* compiled from: PhotoPickerIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode$ModeView;", "Lcom/avito/android/photo_picker/PhotoPickerIntentFactory$PhotoPickerMode;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ModeView extends PhotoPickerMode {

            @Y61.k
            public static final Parcelable.Creator<ModeView> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f218812b;

            /* compiled from: PhotoPickerIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ModeView> {
                @Override // android.os.Parcelable.Creator
                public final ModeView createFromParcel(Parcel parcel) {
                    return new ModeView(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ModeView[] newArray(int i12) {
                    return new ModeView[i12];
                }
            }

            public ModeView() {
                this(false, 1, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.f218812b ? 1 : 0);
            }

            public /* synthetic */ ModeView(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? true : z12);
            }

            public ModeView(boolean z12) {
                super(null);
                this.f218812b = z12;
            }
        }

        public /* synthetic */ PhotoPickerMode(C42822w c42822w) {
            this();
        }

        public PhotoPickerMode() {
        }
    }

    /* compiled from: PhotoPickerIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent a(PhotoPickerIntentFactory photoPickerIntentFactory, Context context, String str, String str2, int i12, int i13, String str3, CameraType cameraType, PhotoPickerMode photoPickerMode, boolean z12, int i14) {
            int i15 = (i14 & 8) != 0 ? 0 : i12;
            String str4 = (i14 & 32) != 0 ? null : str3;
            if ((i14 & 64) != 0) {
                CameraType cameraType2 = CameraType.f218799b;
            }
            return photoPickerIntentFactory.a(context, str, str2, i15, i13, str4, photoPickerMode, (i14 & 256) != 0 ? false : z12);
        }
    }

    @Y61.k
    Intent a(@Y61.k Context context, @Y61.k String str, @Y61.k String str2, int i12, int i13, @Y61.l String str3, @Y61.k PhotoPickerMode photoPickerMode, boolean z12);

    @Y61.k
    Intent b(@Y61.k Context context, @Y61.k String str, @Y61.l String str2, boolean z12);
}
