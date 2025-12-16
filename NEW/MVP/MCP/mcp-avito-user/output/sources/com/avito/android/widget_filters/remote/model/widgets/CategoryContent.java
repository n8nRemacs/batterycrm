package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersCategoryWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/CategoryContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContent;", "Lcom/avito/android/widget_filters/remote/model/widgets/CategoryParameter;", "category", "<init>", "(Lcom/avito/android/widget_filters/remote/model/widgets/CategoryParameter;)V", "Lcom/avito/android/widget_filters/remote/model/widgets/CategoryParameter;", "c", "()Lcom/avito/android/widget_filters/remote/model/widgets/CategoryParameter;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CategoryContent implements Parcelable, WidgetFiltersContent {

    @k
    public static final Parcelable.Creator<CategoryContent> CREATOR = new a();

    @c("category")
    @l
    private final CategoryParameter category;

    /* compiled from: WidgetFiltersCategoryWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryContent> {
        @Override // android.os.Parcelable.Creator
        public final CategoryContent createFromParcel(Parcel parcel) {
            return new CategoryContent(parcel.readInt() == 0 ? null : CategoryParameter.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryContent[] newArray(int i12) {
            return new CategoryContent[i12];
        }
    }

    public CategoryContent(@l CategoryParameter categoryParameter) {
        this.category = categoryParameter;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final CategoryParameter getCategory() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryContent) && L.f(this.category, ((CategoryContent) obj).category);
    }

    public final int hashCode() {
        CategoryParameter categoryParameter = this.category;
        if (categoryParameter == null) {
            return 0;
        }
        return categoryParameter.hashCode();
    }

    @k
    public final String toString() {
        return "CategoryContent(category=" + this.category + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CategoryParameter categoryParameter = this.category;
        if (categoryParameter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryParameter.writeToParcel(parcel, i12);
        }
    }
}
