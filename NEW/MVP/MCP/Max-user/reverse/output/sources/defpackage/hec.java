package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hec implements Parcelable {
    public static final Parcelable.Creator<hec> CREATOR;
    public static final hec b;
    public static final hec c;
    public static final /* synthetic */ hec[] d;
    public static final /* synthetic */ zg5 o;
    public final String a;

    static {
        hec hecVar = new hec("SETUP_NEW_ADMIN", 0, "setup_new_admin");
        b = hecVar;
        hec hecVar2 = new hec("CHANGE_ADMIN", 1, "change_admin");
        c = hecVar2;
        hec[] hecVarArr = {hecVar, hecVar2};
        d = hecVarArr;
        o = new zg5(hecVarArr);
        CREATOR = new wcb(17);
    }

    public hec(String str, int i, String str2) {
        this.a = str2;
    }

    public static hec valueOf(String str) {
        return (hec) Enum.valueOf(hec.class, str);
    }

    public static hec[] values() {
        return (hec[]) d.clone();
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
