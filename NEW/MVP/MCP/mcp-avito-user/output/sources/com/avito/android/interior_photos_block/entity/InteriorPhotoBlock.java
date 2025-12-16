package com.avito.android.interior_photos_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InteriorPhotoBlock.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/interior_photos_block/entity/InteriorPhotoBlock;", "Landroid/os/Parcelable;", "_avito_interior-photos-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InteriorPhotoBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<InteriorPhotoBlock> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Image> f173044b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f173045c;

    /* compiled from: InteriorPhotoBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InteriorPhotoBlock> {
        @Override // android.os.Parcelable.Creator
        public final InteriorPhotoBlock createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(InteriorPhotoBlock.class, parcel, arrayList, iL2, 1);
            }
            return new InteriorPhotoBlock(arrayList, (AttributedText) parcel.readParcelable(InteriorPhotoBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InteriorPhotoBlock[] newArray(int i12) {
            return new InteriorPhotoBlock[i12];
        }
    }

    public InteriorPhotoBlock(@k List<Image> list, @l AttributedText attributedText) {
        this.f173044b = list;
        this.f173045c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteriorPhotoBlock)) {
            return false;
        }
        InteriorPhotoBlock interiorPhotoBlock = (InteriorPhotoBlock) obj;
        return L.f(this.f173044b, interiorPhotoBlock.f173044b) && L.f(this.f173045c, interiorPhotoBlock.f173045c);
    }

    public final int hashCode() {
        int iHashCode = this.f173044b.hashCode() * 31;
        AttributedText attributedText = this.f173045c;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InteriorPhotoBlock(images=");
        sb2.append(this.f173044b);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f173045c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f173044b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f173045c, i12);
    }
}
