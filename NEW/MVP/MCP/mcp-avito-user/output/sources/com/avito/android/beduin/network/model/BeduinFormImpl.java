package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFormImpl.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/network/model/BeduinFormImpl;", "Lcom/avito/android/beduin_models/BeduinForm;", "", "id", "", "Lcom/avito/android/beduin_models/BeduinModel;", "components", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinFormImpl implements BeduinForm {

    @k
    public static final Parcelable.Creator<BeduinFormImpl> CREATOR = new a();

    @c("components")
    @k
    private final List<BeduinModel> components;

    @c("id")
    @k
    private final String id;

    /* compiled from: BeduinFormImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinFormImpl> {
        @Override // android.os.Parcelable.Creator
        public final BeduinFormImpl createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinFormImpl.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinFormImpl(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinFormImpl[] newArray(int i12) {
            return new BeduinFormImpl[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinFormImpl(@k String str, @k List<? extends BeduinModel> list) {
        this.id = str;
        this.components = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinFormImpl)) {
            return false;
        }
        BeduinFormImpl beduinFormImpl = (BeduinFormImpl) obj;
        return L.f(this.id, beduinFormImpl.id) && L.f(this.components, beduinFormImpl.components);
    }

    @Override // com.avito.android.beduin_models.BeduinForm
    @k
    public final List<BeduinModel> getComponents() {
        return this.components;
    }

    @Override // com.avito.android.beduin_models.BeduinForm
    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.components.hashCode() + (this.id.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinFormImpl(id=");
        sb2.append(this.id);
        sb2.append(", components=");
        return H.p(sb2, this.components, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Iterator itJ = C0.j(this.components, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
