package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class n6j extends oai {
    public final kb7 W(tqa tqaVar, String str, int i, tqa tqaVar2) {
        Parcel parcelT = T();
        wgi.c(parcelT, tqaVar);
        parcelT.writeString(str);
        parcelT.writeInt(i);
        wgi.c(parcelT, tqaVar2);
        Parcel parcelA = A(parcelT, 2);
        kb7 kb7VarW = tqa.W(parcelA.readStrongBinder());
        parcelA.recycle();
        return kb7VarW;
    }

    public final kb7 X(tqa tqaVar, String str, int i, tqa tqaVar2) {
        Parcel parcelT = T();
        wgi.c(parcelT, tqaVar);
        parcelT.writeString(str);
        parcelT.writeInt(i);
        wgi.c(parcelT, tqaVar2);
        Parcel parcelA = A(parcelT, 3);
        kb7 kb7VarW = tqa.W(parcelA.readStrongBinder());
        parcelA.recycle();
        return kb7VarW;
    }
}
