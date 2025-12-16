package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ndi extends oai {
    public final z9j[] W(tqa tqaVar, vdi vdiVar) {
        Parcel parcelT = T();
        int i = ngi.a;
        parcelT.writeStrongBinder(tqaVar);
        parcelT.writeInt(1);
        vdiVar.writeToParcel(parcelT, 0);
        Parcel parcelU = U(parcelT, 1);
        z9j[] z9jVarArr = (z9j[]) parcelU.createTypedArray(z9j.CREATOR);
        parcelU.recycle();
        return z9jVarArr;
    }
}
