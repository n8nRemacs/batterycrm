package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qs2 implements Parcelable {
    public static final Parcelable.Creator<qs2> CREATOR;
    public static final /* synthetic */ qs2[] X;
    public static final qs2 a;
    public static final qs2 b;
    public static final qs2 c;
    public static final qs2 d;
    public static final qs2 o;

    static {
        qs2 qs2Var = new qs2("DIALOG_MESSAGE", 0);
        a = qs2Var;
        qs2 qs2Var2 = new qs2("CHAT_MESSAGE", 1);
        b = qs2Var2;
        qs2 qs2Var3 = new qs2("CHANNEL_MESSAGE", 2);
        c = qs2Var3;
        qs2 qs2Var4 = new qs2("GROUP_CHAT", 3);
        d = qs2Var4;
        qs2 qs2Var5 = new qs2("SCHEDULED_MESSAGE", 4);
        o = qs2Var5;
        X = new qs2[]{qs2Var, qs2Var2, qs2Var3, qs2Var4, qs2Var5};
        CREATOR = new e8(20);
    }

    public static qs2 valueOf(String str) {
        return (qs2) Enum.valueOf(qs2.class, str);
    }

    public static qs2[] values() {
        return (qs2[]) X.clone();
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
