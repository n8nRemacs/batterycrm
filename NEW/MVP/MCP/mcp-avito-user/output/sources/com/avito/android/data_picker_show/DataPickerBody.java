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

/* compiled from: DataPickerShowLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/android/data_picker_show/DataPickerBody;", "Landroid/os/Parcelable;", "", "", "values", "preselect", "divider", "title", "buttonText", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getTitle", "c", "_avito_data-picker-show_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DataPickerBody implements Parcelable {

    @k
    public static final Parcelable.Creator<DataPickerBody> CREATOR = new a();

    @com.google.gson.annotations.c("buttonText")
    @k
    private final String buttonText;

    @com.google.gson.annotations.c("divider")
    @l
    private final String divider;

    @com.google.gson.annotations.c("preselect")
    @l
    private final List<String> preselect;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("values")
    @k
    private final List<List<String>> values;

    /* compiled from: DataPickerShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DataPickerBody> {
        @Override // android.os.Parcelable.Creator
        public final DataPickerBody createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            while (true) {
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (i13 == i12) {
                    return new DataPickerBody(arrayList, arrayListCreateStringArrayList, parcel.readString(), parcel.readString(), parcel.readString());
                }
                arrayList.add(arrayListCreateStringArrayList);
                i13++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final DataPickerBody[] newArray(int i12) {
            return new DataPickerBody[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataPickerBody(@k List<? extends List<String>> list, @l List<String> list2, @l String str, @l String str2, @k String str3) {
        this.values = list;
        this.preselect = list2;
        this.divider = str;
        this.title = str2;
        this.buttonText = str3;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getDivider() {
        return this.divider;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<String> e() {
        return this.preselect;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPickerBody)) {
            return false;
        }
        DataPickerBody dataPickerBody = (DataPickerBody) obj;
        return L.f(this.values, dataPickerBody.values) && L.f(this.preselect, dataPickerBody.preselect) && L.f(this.divider, dataPickerBody.divider) && L.f(this.title, dataPickerBody.title) && L.f(this.buttonText, dataPickerBody.buttonText);
    }

    @k
    public final List<List<String>> f() {
        return this.values;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.values.hashCode() * 31;
        List<String> list = this.preselect;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.divider;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return this.buttonText.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPickerBody(values=");
        sb2.append(this.values);
        sb2.append(", preselect=");
        sb2.append(this.preselect);
        sb2.append(", divider=");
        sb2.append(this.divider);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            parcel.writeStringList((List) itJ.next());
        }
        parcel.writeStringList(this.preselect);
        parcel.writeString(this.divider);
        parcel.writeString(this.title);
        parcel.writeString(this.buttonText);
    }
}
