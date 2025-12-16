package com.avito.android.data_picker_show;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DataPickerArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/DataPickerArgs;", "Landroid/os/Parcelable;", "_avito_data-picker-show_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DataPickerArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<DataPickerArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<List<String>> f132463b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f132464c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f132465d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f132466e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f132467f;

    /* compiled from: DataPickerArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DataPickerArgs> {
        @Override // android.os.Parcelable.Creator
        public final DataPickerArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            while (true) {
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (i13 == i12) {
                    return new DataPickerArgs(arrayList, arrayListCreateStringArrayList, parcel.readString(), parcel.readString(), parcel.readString());
                }
                arrayList.add(arrayListCreateStringArrayList);
                i13++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final DataPickerArgs[] newArray(int i12) {
            return new DataPickerArgs[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataPickerArgs(@k List<? extends List<String>> list, @l List<String> list2, @l String str, @l String str2, @k String str3) {
        this.f132463b = list;
        this.f132464c = list2;
        this.f132465d = str;
        this.f132466e = str2;
        this.f132467f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPickerArgs)) {
            return false;
        }
        DataPickerArgs dataPickerArgs = (DataPickerArgs) obj;
        return L.f(this.f132463b, dataPickerArgs.f132463b) && L.f(this.f132464c, dataPickerArgs.f132464c) && L.f(this.f132465d, dataPickerArgs.f132465d) && L.f(this.f132466e, dataPickerArgs.f132466e) && L.f(this.f132467f, dataPickerArgs.f132467f);
    }

    public final int hashCode() {
        int iHashCode = this.f132463b.hashCode() * 31;
        List<String> list = this.f132464c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f132465d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132466e;
        return this.f132467f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPickerArgs(values=");
        sb2.append(this.f132463b);
        sb2.append(", preselect=");
        sb2.append(this.f132464c);
        sb2.append(", divider=");
        sb2.append(this.f132465d);
        sb2.append(", title=");
        sb2.append(this.f132466e);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f132467f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f132463b, parcel);
        while (itJ.hasNext()) {
            parcel.writeStringList((List) itJ.next());
        }
        parcel.writeStringList(this.f132464c);
        parcel.writeString(this.f132465d);
        parcel.writeString(this.f132466e);
        parcel.writeString(this.f132467f);
    }
}
