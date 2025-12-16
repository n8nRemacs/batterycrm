package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dn2 implements Parcelable {
    public static final Parcelable.Creator<dn2> CREATOR;
    public static final dn2 a;
    public static final dn2 b;
    public static final /* synthetic */ dn2[] c;
    public static final /* synthetic */ zg5 d;

    static {
        dn2 dn2Var = new dn2("MEDIA", 0);
        a = dn2Var;
        dn2 dn2Var2 = new dn2("FILE", 1);
        dn2 dn2Var3 = new dn2("LINK", 2);
        dn2 dn2Var4 = new dn2("AUDIO", 3);
        b = dn2Var4;
        dn2[] dn2VarArr = {dn2Var, dn2Var2, dn2Var3, dn2Var4};
        c = dn2VarArr;
        d = new zg5(dn2VarArr);
        CREATOR = new e8(18);
    }

    public static dn2 valueOf(String str) {
        return (dn2) Enum.valueOf(dn2.class, str);
    }

    public static dn2[] values() {
        return (dn2[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
