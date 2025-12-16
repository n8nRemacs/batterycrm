package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class e8 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e8(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (this.a) {
            case 0:
                return new g8(parcel);
            case 1:
                return new y9(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 2:
                return new xm(parcel);
            case 3:
                cp cpVar = new cp(parcel);
                cpVar.a = parcel.readByte() != 0;
                return cpVar;
            case 4:
                String string = parcel.readString();
                string.getClass();
                return new yp(parcel.readInt(), string);
            case 5:
                return new ve0(parcel);
            case 6:
                return new we0(parcel);
            case 7:
                xg0 xg0Var = new xg0();
                xg0Var.s0 = 255;
                xg0Var.u0 = -2;
                xg0Var.v0 = -2;
                xg0Var.w0 = -2;
                xg0Var.D0 = Boolean.TRUE;
                xg0Var.a = parcel.readInt();
                xg0Var.b = (Integer) parcel.readSerializable();
                xg0Var.c = (Integer) parcel.readSerializable();
                xg0Var.d = (Integer) parcel.readSerializable();
                xg0Var.o = (Integer) parcel.readSerializable();
                xg0Var.X = (Integer) parcel.readSerializable();
                xg0Var.Y = (Integer) parcel.readSerializable();
                xg0Var.Z = (Integer) parcel.readSerializable();
                xg0Var.s0 = parcel.readInt();
                xg0Var.t0 = parcel.readString();
                xg0Var.u0 = parcel.readInt();
                xg0Var.v0 = parcel.readInt();
                xg0Var.w0 = parcel.readInt();
                xg0Var.y0 = parcel.readString();
                xg0Var.z0 = parcel.readString();
                xg0Var.A0 = parcel.readInt();
                xg0Var.C0 = (Integer) parcel.readSerializable();
                xg0Var.E0 = (Integer) parcel.readSerializable();
                xg0Var.F0 = (Integer) parcel.readSerializable();
                xg0Var.G0 = (Integer) parcel.readSerializable();
                xg0Var.H0 = (Integer) parcel.readSerializable();
                xg0Var.I0 = (Integer) parcel.readSerializable();
                xg0Var.J0 = (Integer) parcel.readSerializable();
                xg0Var.M0 = (Integer) parcel.readSerializable();
                xg0Var.K0 = (Integer) parcel.readSerializable();
                xg0Var.L0 = (Integer) parcel.readSerializable();
                xg0Var.D0 = (Boolean) parcel.readSerializable();
                xg0Var.x0 = (Locale) parcel.readSerializable();
                xg0Var.N0 = (Boolean) parcel.readSerializable();
                return xg0Var;
            case 8:
                zk0 zk0Var = new zk0(parcel);
                zk0Var.a = parcel.readFloat();
                zk0Var.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                zk0Var.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                zk0Var.d = parcel.readFloat();
                zk0Var.o = parcel.createBooleanArray()[0];
                return zk0Var;
            case 9:
                return new gn0(parcel);
            case 10:
                return new mz0((g2a) parcel.readParcelable(g2a.class.getClassLoader()), (g2a) parcel.readParcelable(g2a.class.getClassLoader()), (uf4) parcel.readParcelable(uf4.class.getClassLoader()), (g2a) parcel.readParcelable(g2a.class.getClassLoader()), parcel.readInt());
            case 11:
                return new zi1(parcel.readLong(), parcel.readInt());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new a92((pd8) parcel.readParcelable(a92.class.getClassLoader()), (Uri) parcel.readParcelable(a92.class.getClassLoader()));
            case 13:
                return new b92((pd8) parcel.readParcelable(b92.class.getClassLoader()), (Uri) parcel.readParcelable(b92.class.getClassLoader()));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new c92((pd8) parcel.readParcelable(c92.class.getClassLoader()), parcel.readString());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new qa2(parcel);
            case 16:
                return new sa2(parcel);
            case LangUtils.HASH_SEED /* 17 */:
                return uf2.valueOf(parcel.readString());
            case 18:
                return dn2.valueOf(parcel.readString());
            case 19:
                return es2.valueOf(parcel.readString());
            case 20:
                return qs2.valueOf(parcel.readString());
            case 21:
                return new ad3(parcel.readInt());
            case 22:
                return new dg3(parcel);
            case 23:
                return new eg3(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int i6 = parcel.readInt();
                s5g s5gVar = (s5g) parcel.readParcelable(pq3.class.getClassLoader());
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("NEGATIVE")) {
                    i = 1;
                } else if (string2.equals("NEUTRAL")) {
                    i = 2;
                } else if (string2.equals("PRIMARY")) {
                    i = 3;
                } else {
                    if (!string2.equals("THEMED")) {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Type.".concat(string2));
                    }
                    i = 4;
                }
                int i7 = i;
                int i8 = 0;
                boolean z = parcel.readInt() != 0;
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("SMALL")) {
                    i2 = 1;
                } else if (string3.equals("MEDIUM")) {
                    i2 = 2;
                } else {
                    if (!string3.equals("LARGE")) {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Size.".concat(string3));
                    }
                    i2 = 3;
                }
                if (parcel.readInt() != 0) {
                    String string4 = parcel.readString();
                    if (string4 == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string4.equals("NEGATIVE")) {
                        i3 = 1;
                    } else if (string4.equals("NEUTRAL")) {
                        i3 = 2;
                    } else {
                        if (!string4.equals("NEUTRAL_THEMED")) {
                            throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Appearance.".concat(string4));
                        }
                        i3 = 3;
                    }
                    i8 = i3;
                }
                return new pq3(i6, s5gVar, i7, z, i2, i8);
            case 25:
                int i9 = parcel.readInt();
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("SMALL")) {
                    i4 = 1;
                } else {
                    if (!string5.equals("LARGE")) {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Icon.Size.".concat(string5));
                    }
                    i4 = 2;
                }
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("PRIMARY")) {
                    i5 = 1;
                } else {
                    if (!string6.equals("SECONDARY")) {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Icon.Appearance.".concat(string6));
                    }
                    i5 = 2;
                }
                return new rq3(i9, i4, i5);
            case 26:
                return new da4(parcel);
            case 27:
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(parcel.readBundle(xb4.class.getClassLoader()));
                }
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList4.add(Long.valueOf(parcel.readLong()));
                }
                return new xb4(arrayList2, arrayList3, arrayList4, parcel.readInt());
            case 28:
                xf4 xf4VarCreateFromParcel = xf4.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<t8g> creator = t8g.CREATOR;
                return new lf4(xf4VarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            default:
                return new uf4(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g8[i];
            case 1:
                return new y9[i];
            case 2:
                return new xm[i];
            case 3:
                return new cp[i];
            case 4:
                return new yp[i];
            case 5:
                return new ve0[i];
            case 6:
                return new we0[i];
            case 7:
                return new xg0[i];
            case 8:
                return new zk0[i];
            case 9:
                return new gn0[i];
            case 10:
                return new mz0[i];
            case 11:
                return new zi1[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new a92[i];
            case 13:
                return new b92[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new c92[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new qa2[i];
            case 16:
                return new sa2[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new uf2[i];
            case 18:
                return new dn2[i];
            case 19:
                return new es2[i];
            case 20:
                return new qs2[i];
            case 21:
                return new ad3[i];
            case 22:
                return new dg3[i];
            case 23:
                return new eg3[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new pq3[i];
            case 25:
                return new rq3[i];
            case 26:
                return new da4[i];
            case 27:
                return new xb4[i];
            case 28:
                return new lf4[i];
            default:
                return new uf4[i];
        }
    }
}
