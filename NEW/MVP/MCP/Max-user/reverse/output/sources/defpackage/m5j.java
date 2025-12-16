package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class m5j extends oai {
    public final kb7 W(tqa tqaVar, String str, int i) {
        Parcel parcelT = T();
        wgi.c(parcelT, tqaVar);
        parcelT.writeString(str);
        parcelT.writeInt(i);
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
        Parcel parcelA = A(parcelT, 8);
        kb7 kb7VarW = tqa.W(parcelA.readStrongBinder());
        parcelA.recycle();
        return kb7VarW;
    }

    public final kb7 Y(tqa tqaVar, String str, int i) {
        Parcel parcelT = T();
        wgi.c(parcelT, tqaVar);
        parcelT.writeString(str);
        parcelT.writeInt(i);
        Parcel parcelA = A(parcelT, 4);
        kb7 kb7VarW = tqa.W(parcelA.readStrongBinder());
        parcelA.recycle();
        return kb7VarW;
    }

    public final kb7 Z(tqa tqaVar, String str, boolean z, long j) {
        Parcel parcelT = T();
        wgi.c(parcelT, tqaVar);
        parcelT.writeString(str);
        parcelT.writeInt(z ? 1 : 0);
        parcelT.writeLong(j);
        Parcel parcelA = A(parcelT, 7);
        kb7 kb7VarW = tqa.W(parcelA.readStrongBinder());
        parcelA.recycle();
        return kb7VarW;
    }
}
