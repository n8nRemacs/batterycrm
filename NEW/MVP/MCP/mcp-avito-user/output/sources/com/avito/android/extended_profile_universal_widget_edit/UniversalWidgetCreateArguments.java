package com.avito.android.extended_profile_universal_widget_edit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.extended.UniversalWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/UniversalWidgetCreateArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-universal-widget-edit_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetCreateArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UniversalWidgetCreateArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f153647b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalWidget.Config f153648c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<UniversalWidget.OrderedSectionType> f153649d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f153650e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f153651f;

    /* compiled from: UniversalWidgetCreateArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetCreateArguments> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCreateArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            UniversalWidget.Config config = (UniversalWidget.Config) parcel.readParcelable(UniversalWidgetCreateArguments.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(UniversalWidgetCreateArguments.class, parcel, arrayList, iL2, 1);
            }
            return new UniversalWidgetCreateArguments(string, config, arrayList, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCreateArguments[] newArray(int i12) {
            return new UniversalWidgetCreateArguments[i12];
        }
    }

    public UniversalWidgetCreateArguments(@Y61.l String str, @Y61.k UniversalWidget.Config config, @Y61.k List list, @Y61.k String str2, @Y61.k ArrayList arrayList) {
        this.f153647b = str;
        this.f153648c = config;
        this.f153649d = list;
        this.f153650e = str2;
        this.f153651f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetCreateArguments)) {
            return false;
        }
        UniversalWidgetCreateArguments universalWidgetCreateArguments = (UniversalWidgetCreateArguments) obj;
        return L.f(this.f153647b, universalWidgetCreateArguments.f153647b) && L.f(this.f153648c, universalWidgetCreateArguments.f153648c) && L.f(this.f153649d, universalWidgetCreateArguments.f153649d) && L.f(this.f153650e, universalWidgetCreateArguments.f153650e) && L.f(this.f153651f, universalWidgetCreateArguments.f153651f);
    }

    public final int hashCode() {
        String str = this.f153647b;
        return this.f153651f.hashCode() + H.d(H.e((this.f153648c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f153649d), 31, this.f153650e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetCreateArguments(createSectionTitle=");
        sb2.append(this.f153647b);
        sb2.append(", universalWidgetConfig=");
        sb2.append(this.f153648c);
        sb2.append(", addSectionOrder=");
        sb2.append(this.f153649d);
        sb2.append(", fieldName=");
        sb2.append(this.f153650e);
        sb2.append(", valuesIdOrder=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f153651f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f153647b);
        parcel.writeParcelable(this.f153648c, i12);
        Iterator itJ = C0.j(this.f153649d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f153650e);
        parcel.writeStringList(this.f153651f);
    }
}
