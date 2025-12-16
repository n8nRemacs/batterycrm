package com.avito.android.visual_rubricator.element;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryBadge.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/element/CategoryBadge;", "Landroid/os/Parcelable;", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CategoryBadge implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryBadge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f327356b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f327357c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f327358d;

    /* compiled from: CategoryBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryBadge> {
        @Override // android.os.Parcelable.Creator
        public final CategoryBadge createFromParcel(Parcel parcel) {
            return new CategoryBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(CategoryBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(CategoryBadge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryBadge[] newArray(int i12) {
            return new CategoryBadge[i12];
        }
    }

    public CategoryBadge(@Y61.k String str, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2) {
        this.f327356b = str;
        this.f327357c = universalColor;
        this.f327358d = universalColor2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryBadge)) {
            return false;
        }
        CategoryBadge categoryBadge = (CategoryBadge) obj;
        return L.f(this.f327356b, categoryBadge.f327356b) && L.f(this.f327357c, categoryBadge.f327357c) && L.f(this.f327358d, categoryBadge.f327358d);
    }

    public final int hashCode() {
        return this.f327358d.hashCode() + com.avito.android.actions_sheet.a.i(this.f327357c, this.f327356b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryBadge(text=");
        sb2.append(this.f327356b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f327357c);
        sb2.append(", textColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f327358d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f327356b);
        parcel.writeParcelable(this.f327357c, i12);
        parcel.writeParcelable(this.f327358d, i12);
    }
}
