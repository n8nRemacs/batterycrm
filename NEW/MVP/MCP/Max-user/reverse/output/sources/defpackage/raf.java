package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class raf implements Parcelable, jw0 {
    public static final Parcelable.Creator<raf> CREATOR;
    public static final raf b;
    public static final raf c;
    public static final /* synthetic */ raf[] d;
    public static final /* synthetic */ zg5 o;
    public final String a;

    static {
        raf rafVar = new raf("CHAT", 0, "chat");
        b = rafVar;
        raf rafVar2 = new raf("CHANNEL", 1, "channel");
        c = rafVar2;
        raf[] rafVarArr = {rafVar, rafVar2};
        d = rafVarArr;
        o = new zg5(rafVarArr);
        CREATOR = new z6e(19);
    }

    public raf(String str, int i, String str2) {
        this.a = str2;
    }

    public static raf valueOf(String str) {
        return (raf) Enum.valueOf(raf.class, str);
    }

    public static raf[] values() {
        return (raf[]) d.clone();
    }

    @Override // defpackage.jw0
    public final Object a(String str) {
        raf rafVar;
        Iterator it = o.iterator();
        do {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            rafVar = (raf) f2Var.next();
        } while (!rafVar.a.equals(str));
        return rafVar;
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
