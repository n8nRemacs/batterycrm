package com.avito.android.search.filter.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParameterElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/search/filter/converter/CategoryParameterGroup;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", LocalPublishState.FIELDS, "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CategoryParameterGroup implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryParameterGroup> CREATOR = new a();

    @com.google.gson.annotations.c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @Y61.l
    private final AttributedText disclaimer;

    @com.google.gson.annotations.c(LocalPublishState.FIELDS)
    @Y61.k
    private final List<ParameterSlot> fields;

    /* compiled from: ParameterElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryParameterGroup> {
        @Override // android.os.Parcelable.Creator
        public final CategoryParameterGroup createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryParameterGroup.class, parcel, arrayList, iL2, 1);
            }
            return new CategoryParameterGroup(arrayList, (AttributedText) parcel.readParcelable(CategoryParameterGroup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryParameterGroup[] newArray(int i12) {
            return new CategoryParameterGroup[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryParameterGroup(@Y61.k List<? extends ParameterSlot> list, @Y61.l AttributedText attributedText) {
        this.fields = list;
        this.disclaimer = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.fields, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.disclaimer, i12);
    }
}
