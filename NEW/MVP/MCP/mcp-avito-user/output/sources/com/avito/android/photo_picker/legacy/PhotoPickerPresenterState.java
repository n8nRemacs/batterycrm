package com.avito.android.photo_picker.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.photo_picker.SelectedPhoto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoPickerPresenterState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PhotoPickerPresenterState;", "Landroid/os/Parcelable;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoPickerPresenterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoPickerPresenterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f219610b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<PickerPhoto> f219611c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<SelectedPhoto> f219612d;

    /* compiled from: PhotoPickerPresenterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoPickerPresenterState> {
        @Override // android.os.Parcelable.Creator
        public final PhotoPickerPresenterState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(PickerPhoto.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(SelectedPhoto.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new PhotoPickerPresenterState(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoPickerPresenterState[] newArray(int i12) {
            return new PhotoPickerPresenterState[i12];
        }
    }

    public PhotoPickerPresenterState(@Y61.l String str, @Y61.l List<PickerPhoto> list, @Y61.l List<SelectedPhoto> list2) {
        this.f219610b = str;
        this.f219611c = list;
        this.f219612d = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f219610b);
        List<PickerPhoto> list = this.f219611c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((PickerPhoto) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<SelectedPhoto> list2 = this.f219612d;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((SelectedPhoto) itA2.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ PhotoPickerPresenterState(String str, List list, List list2, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : list2);
    }
}
