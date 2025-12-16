package com.avito.android.photo_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlashMode.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/photo_picker/FlashMode;", "Landroid/os/Parcelable;", "Auto", "b", "ForceOn", "Off", "Lcom/avito/android/photo_picker/FlashMode$Auto;", "Lcom/avito/android/photo_picker/FlashMode$ForceOn;", "Lcom/avito/android/photo_picker/FlashMode$Off;", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FlashMode implements Parcelable {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<FlashMode> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f218746b;

    /* compiled from: FlashMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/FlashMode$Auto;", "Lcom/avito/android/photo_picker/FlashMode;", "()V", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Auto extends FlashMode {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Auto f218747c = new Auto();

        public Auto() {
            super("auto", null);
        }
    }

    /* compiled from: FlashMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/FlashMode$ForceOn;", "Lcom/avito/android/photo_picker/FlashMode;", "()V", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForceOn extends FlashMode {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final ForceOn f218748c = new ForceOn();

        public ForceOn() {
            super("on", null);
        }
    }

    /* compiled from: FlashMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/FlashMode$Off;", "Lcom/avito/android/photo_picker/FlashMode;", "()V", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Off extends FlashMode {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Off f218749c = new Off();

        public Off() {
            super("off", null);
        }
    }

    /* compiled from: FlashMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/photo_picker/FlashMode;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Parcel, FlashMode> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f218750l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final FlashMode invoke(Parcel parcel) {
            FlashMode flashModeA = C33266q.a(parcel.readString());
            return flashModeA == null ? Off.f218749c : flashModeA;
        }
    }

    /* compiled from: FlashMode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/FlashMode$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/photo_picker/FlashMode;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        a aVar = a.f218750l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    public FlashMode(String str, C42822w c42822w) {
        this.f218746b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f218746b);
    }
}
