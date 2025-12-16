package com.avito.android.beduin_shared.model.form;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinForm.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/form/BeduinForm;", "Lcom/avito/android/beduin_models/BeduinForm;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinForm implements com.avito.android.beduin_models.BeduinForm {

    @k
    public static final Parcelable.Creator<BeduinForm> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105312b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<BeduinModel> f105313c;

    /* compiled from: BeduinForm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinForm> {
        @Override // android.os.Parcelable.Creator
        public final BeduinForm createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinForm.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinForm(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinForm[] newArray(int i12) {
            return new BeduinForm[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinForm(@k String str, @k List<? extends BeduinModel> list) {
        this.f105312b = str;
        this.f105313c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinForm)) {
            return false;
        }
        BeduinForm beduinForm = (BeduinForm) obj;
        return L.f(this.f105312b, beduinForm.f105312b) && L.f(this.f105313c, beduinForm.f105313c);
    }

    @Override // com.avito.android.beduin_models.BeduinForm
    @k
    public final List<BeduinModel> getComponents() {
        return this.f105313c;
    }

    @Override // com.avito.android.beduin_models.BeduinForm
    @k
    public final String getId() {
        return this.f105312b;
    }

    public final int hashCode() {
        return this.f105313c.hashCode() + (this.f105312b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinForm(id=");
        sb2.append(this.f105312b);
        sb2.append(", components=");
        return H.p(sb2, this.f105313c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f105312b);
        Iterator itJ = C0.j(this.f105313c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
