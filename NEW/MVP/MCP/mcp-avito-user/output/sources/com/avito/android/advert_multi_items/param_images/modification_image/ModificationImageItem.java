package com.avito.android.advert_multi_items.param_images.modification_image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.advert_multi_items.model.ImageDisplayMode;
import com.avito.android.advert_multi_items.model.ModificationItem;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModificationImageItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/param_images/modification_image/ModificationImageItem;", "Lcom/avito/android/advert_multi_items/model/ModificationItem;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ModificationImageItem implements ModificationItem {

    @k
    public static final Parcelable.Creator<ModificationImageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85952b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85953c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ModificationViewState f85954d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageDisplayMode f85955e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Image f85956f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UniversalColor f85957g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f85958h;

    /* compiled from: ModificationImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModificationImageItem> {
        @Override // android.os.Parcelable.Creator
        public final ModificationImageItem createFromParcel(Parcel parcel) {
            return new ModificationImageItem(parcel.readString(), parcel.readString(), ModificationViewState.valueOf(parcel.readString()), ImageDisplayMode.valueOf(parcel.readString()), (Image) parcel.readParcelable(ModificationImageItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ModificationImageItem.class.getClassLoader()), (Image) parcel.readParcelable(ModificationImageItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ModificationImageItem[] newArray(int i12) {
            return new ModificationImageItem[i12];
        }
    }

    public ModificationImageItem(@k String str, @k String str2, @k ModificationViewState modificationViewState, @k ImageDisplayMode imageDisplayMode, @k Image image, @k UniversalColor universalColor, @l Image image2) {
        this.f85952b = str;
        this.f85953c = str2;
        this.f85954d = modificationViewState;
        this.f85955e = imageDisplayMode;
        this.f85956f = image;
        this.f85957g = universalColor;
        this.f85958h = image2;
    }

    @Override // com.avito.android.advert_multi_items.model.ModificationItem
    @k
    /* renamed from: D4, reason: from getter */
    public final String getF85952b() {
        return this.f85952b;
    }

    @Override // Ra.InterfaceC15021a
    @k
    /* renamed from: W, reason: from getter */
    public final ModificationViewState getF85954d() {
        return this.f85954d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModificationImageItem)) {
            return false;
        }
        ModificationImageItem modificationImageItem = (ModificationImageItem) obj;
        return L.f(this.f85952b, modificationImageItem.f85952b) && L.f(this.f85953c, modificationImageItem.f85953c) && this.f85954d == modificationImageItem.f85954d && this.f85955e == modificationImageItem.f85955e && L.f(this.f85956f, modificationImageItem.f85956f) && L.f(this.f85957g, modificationImageItem.f85957g) && L.f(this.f85958h, modificationImageItem.f85958h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80676b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.advert_multi_items.model.ModificationItem
    @k
    /* renamed from: getModificationId, reason: from getter */
    public final String getF85953c() {
        return this.f85953c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF86439b() {
        return this.f85953c;
    }

    public final int hashCode() {
        int i12 = com.avito.android.actions_sheet.a.i(this.f85957g, com.avito.android.actions_sheet.a.g(this.f85956f, (this.f85955e.hashCode() + ((this.f85954d.hashCode() + H.d(this.f85952b.hashCode() * 31, 31, this.f85953c)) * 31)) * 31, 31), 31);
        Image image = this.f85958h;
        return i12 + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModificationImageItem(parentParamTitle=");
        sb2.append(this.f85952b);
        sb2.append(", modificationId=");
        sb2.append(this.f85953c);
        sb2.append(", viewState=");
        sb2.append(this.f85954d);
        sb2.append(", imageDisplayMode=");
        sb2.append(this.f85955e);
        sb2.append(", modificationImage=");
        sb2.append(this.f85956f);
        sb2.append(", bgColor=");
        sb2.append(this.f85957g);
        sb2.append(", materialImage=");
        return AK.c.o(sb2, this.f85958h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85952b);
        parcel.writeString(this.f85953c);
        parcel.writeString(this.f85954d.name());
        parcel.writeString(this.f85955e.name());
        parcel.writeParcelable(this.f85956f, i12);
        parcel.writeParcelable(this.f85957g, i12);
        parcel.writeParcelable(this.f85958h, i12);
    }

    public /* synthetic */ ModificationImageItem(String str, String str2, ModificationViewState modificationViewState, ImageDisplayMode imageDisplayMode, Image image, UniversalColor universalColor, Image image2, int i12, C42822w c42822w) {
        this(str, str2, modificationViewState, imageDisplayMode, image, universalColor, (i12 & 64) != 0 ? null : image2);
    }
}
