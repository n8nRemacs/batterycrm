package com.avito.android.photo_picker.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerInteractorState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PhotoPickerInteractorState;", "Landroid/os/Parcelable;", "b", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class PhotoPickerInteractorState implements Parcelable {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<PhotoPickerInteractorState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f219608b;

    /* compiled from: PhotoPickerInteractorState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/photo_picker/legacy/PhotoPickerInteractorState;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Parcel, PhotoPickerInteractorState> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f219609l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final PhotoPickerInteractorState invoke(Parcel parcel) {
            Parcel parcel2 = parcel;
            kotlin.ranges.j jVarK = kotlin.ranges.s.k(parcel2.readInt(), 1);
            ArrayList arrayList = new ArrayList(C42745f0.q(jVarK, 10));
            kotlin.ranges.k it = jVarK.iterator();
            while (it.f406910d) {
                it.a();
                arrayList.add((PickerPhoto) parcel2.readParcelable(PickerPhoto.class.getClassLoader()));
            }
            return new PhotoPickerInteractorState(arrayList);
        }
    }

    /* compiled from: PhotoPickerInteractorState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PhotoPickerInteractorState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/photo_picker/legacy/PhotoPickerInteractorState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        a aVar = a.f219609l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    public PhotoPickerInteractorState(@Y61.k ArrayList arrayList) {
        this.f219608b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        ArrayList arrayList = this.f219608b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((PickerPhoto) it.next(), i12);
        }
    }
}
