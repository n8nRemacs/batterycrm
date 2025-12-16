package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dfc implements Parcelable {
    public static final Parcelable.Creator<dfc> CREATOR;
    public static final dfc b;
    public static final dfc c;
    public static final /* synthetic */ dfc[] d;
    public static final /* synthetic */ zg5 o;
    public final String a;

    static {
        dfc dfcVar = new dfc("LOCAL_CHAT", 0, "local_chat");
        b = dfcVar;
        dfc dfcVar2 = new dfc("SERVER_CHAT", 1, "server_chat");
        dfc dfcVar3 = new dfc("CONTACT", 2, "contact");
        c = dfcVar3;
        dfc[] dfcVarArr = {dfcVar, dfcVar2, dfcVar3};
        d = dfcVarArr;
        o = new zg5(dfcVarArr);
        CREATOR = new wcb(19);
    }

    public dfc(String str, int i, String str2) {
        this.a = str2;
    }

    public static dfc valueOf(String str) {
        return (dfc) Enum.valueOf(dfc.class, str);
    }

    public static dfc[] values() {
        return (dfc[]) d.clone();
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
