package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cfc implements Parcelable {
    public static final Parcelable.Creator<cfc> CREATOR;
    public static final cfc b;
    public static final /* synthetic */ cfc[] c;
    public static final /* synthetic */ zg5 d;
    public final String a;

    static {
        cfc cfcVar = new cfc("CREATE", 0, "create");
        b = cfcVar;
        cfc[] cfcVarArr = {cfcVar, new cfc("EDIT", 1, "edit")};
        c = cfcVarArr;
        d = new zg5(cfcVarArr);
        CREATOR = new wcb(18);
    }

    public cfc(String str, int i, String str2) {
        this.a = str2;
    }

    public static cfc valueOf(String str) {
        return (cfc) Enum.valueOf(cfc.class, str);
    }

    public static cfc[] values() {
        return (cfc[]) c.clone();
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
