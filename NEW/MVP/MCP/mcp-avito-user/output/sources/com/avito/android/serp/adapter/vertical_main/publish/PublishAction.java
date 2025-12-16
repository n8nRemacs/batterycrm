package com.avito.android.serp.adapter.vertical_main.publish;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerticalPublishPresenter.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/publish/PublishAction;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PublishAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PublishAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Filter> f273081b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f273082c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f273083d;

    /* compiled from: VerticalPublishPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublishAction> {
        @Override // android.os.Parcelable.Creator
        public final PublishAction createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PublishAction.class, parcel, arrayList, iL2, 1);
            }
            return new PublishAction(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishAction[] newArray(int i12) {
            return new PublishAction[i12];
        }
    }

    public PublishAction(@Y61.k List<Filter> list, @Y61.l String str, @Y61.k String str2) {
        this.f273081b = list;
        this.f273082c = str;
        this.f273083d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishAction)) {
            return false;
        }
        PublishAction publishAction = (PublishAction) obj;
        return L.f(this.f273081b, publishAction.f273081b) && L.f(this.f273082c, publishAction.f273082c) && L.f(this.f273083d, publishAction.f273083d);
    }

    public final int hashCode() {
        int iHashCode = this.f273081b.hashCode() * 31;
        String str = this.f273082c;
        return this.f273083d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishAction(filters=");
        sb2.append(this.f273081b);
        sb2.append(", activeFieldId=");
        sb2.append(this.f273082c);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f273083d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f273081b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f273082c);
        parcel.writeString(this.f273083d);
    }
}
