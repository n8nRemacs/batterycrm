package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pdc implements Parcelable, jw0 {
    public static final Parcelable.Creator<pdc> CREATOR;
    public static final /* synthetic */ zg5 X;
    public static final pdc b;
    public static final pdc c;
    public static final pdc d;
    public static final /* synthetic */ pdc[] o;
    public final String a;

    static {
        pdc pdcVar = new pdc("LOCAL_CHAT", 0, "local_chat");
        b = pdcVar;
        pdc pdcVar2 = new pdc("SERVER_CHAT", 1, "server_chat");
        c = pdcVar2;
        pdc pdcVar3 = new pdc("CONTACT", 2, "contact");
        d = pdcVar3;
        pdc[] pdcVarArr = {pdcVar, pdcVar2, pdcVar3};
        o = pdcVarArr;
        X = new zg5(pdcVarArr);
        CREATOR = new wcb(16);
    }

    public pdc(String str, int i, String str2) {
        this.a = str2;
    }

    public static pdc valueOf(String str) {
        return (pdc) Enum.valueOf(pdc.class, str);
    }

    public static pdc[] values() {
        return (pdc[]) o.clone();
    }

    @Override // defpackage.jw0
    public final Object a(String str) {
        f2 f2Var = new f2(0, X);
        while (f2Var.hasNext()) {
            pdc pdcVar = (pdc) f2Var.next();
            if (pdcVar.a.equals(str)) {
                return pdcVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
