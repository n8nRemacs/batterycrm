package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class uf2 implements Parcelable, jw0 {
    public static final Parcelable.Creator<uf2> CREATOR;
    public static final uf2 b;
    public static final /* synthetic */ uf2[] c;
    public static final /* synthetic */ zg5 d;
    public final String a;

    static {
        uf2 uf2Var = new uf2("LOCAL_ID", 0, "local");
        b = uf2Var;
        uf2[] uf2VarArr = {uf2Var, new uf2("SERVER_ID", 1, "server")};
        c = uf2VarArr;
        d = new zg5(uf2VarArr);
        CREATOR = new e8(17);
    }

    public uf2(String str, int i, String str2) {
        this.a = str2;
    }

    public static uf2 valueOf(String str) {
        return (uf2) Enum.valueOf(uf2.class, str);
    }

    public static uf2[] values() {
        return (uf2[]) c.clone();
    }

    @Override // defpackage.jw0
    public final Object a(String str) {
        f2 f2Var = new f2(0, d);
        while (f2Var.hasNext()) {
            uf2 uf2Var = (uf2) f2Var.next();
            if (uf2Var.a.equals(str)) {
                return uf2Var;
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
