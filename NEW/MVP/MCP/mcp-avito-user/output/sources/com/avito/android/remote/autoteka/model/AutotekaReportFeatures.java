package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaReportFeatures;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/autoteka/model/Insight;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaReportFeatures implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaReportFeatures> CREATOR = new a();

    @c("items")
    @k
    private final List<Insight> items;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaPreviewResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaReportFeatures> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaReportFeatures createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Insight.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutotekaReportFeatures(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaReportFeatures[] newArray(int i12) {
            return new AutotekaReportFeatures[i12];
        }
    }

    public AutotekaReportFeatures(@k String str, @k List<Insight> list) {
        this.title = str;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaReportFeatures)) {
            return false;
        }
        AutotekaReportFeatures autotekaReportFeatures = (AutotekaReportFeatures) obj;
        return L.f(this.title, autotekaReportFeatures.title) && L.f(this.items, autotekaReportFeatures.items);
    }

    @k
    public final List<Insight> getItems() {
        return this.items;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaReportFeatures(title=");
        sb2.append(this.title);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((Insight) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
