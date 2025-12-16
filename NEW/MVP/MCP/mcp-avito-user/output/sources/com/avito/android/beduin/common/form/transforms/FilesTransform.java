package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: BeduinModelTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/FilesTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilesTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<FilesTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f103384b;

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FilesTransform> {
        @Override // android.os.Parcelable.Creator
        public final FilesTransform createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(FileItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FilesTransform(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FilesTransform[] newArray(int i12) {
            return new FilesTransform[i12];
        }
    }

    public FilesTransform(@k ArrayList arrayList) {
        this.f103384b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilesTransform) && this.f103384b.equals(((FilesTransform) obj).f103384b);
    }

    public final int hashCode() {
        return this.f103384b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("FilesTransform(files="), this.f103384b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f103384b, parcel);
        while (itZ.hasNext()) {
            ((FileItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
