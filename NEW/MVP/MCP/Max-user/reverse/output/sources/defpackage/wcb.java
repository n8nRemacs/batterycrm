package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class wcb implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ wcb(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return xcb.a;
            case 1:
                parcel.readInt();
                return ycb.a;
            case 2:
                return new zcb((s5g) parcel.readParcelable(zcb.class.getClassLoader()));
            case 3:
                return new ParcelImpl(parcel);
            case 4:
                return new smb(parcel);
            case 5:
                return new cqb(parcel.readString(), parcel.createStringArray(), parcel.readInt());
            case 6:
                return new wrb(parcel.readInt());
            case 7:
                return new xrb(parcel.readInt());
            case 8:
                return new zub((Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (da4) parcel.readParcelable(da4.class.getClassLoader()), (l95) parcel.readParcelable(l95.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 9:
                boolean z7 = false;
                boolean z8 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z7 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z8 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z4;
                } else {
                    z5 = z4;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z5;
                } else {
                    z6 = z5;
                    z5 = z;
                }
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new bvb(z7, z8, z2, z3, z4, z5, z6);
            case 10:
                return new kzb(parcel);
            case 11:
                return new f3c(parcel);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new e3c(parcel);
            case 13:
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(zea.CREATOR.createFromParcel(parcel));
                }
                return new o8c(linkedHashMap, arrayList, parcel.readInt() == 0 ? null : zea.CREATOR.createFromParcel(parcel));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new q9c(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new u9c(parcel);
            case 16:
                return pdc.valueOf(parcel.readString());
            case LangUtils.HASH_SEED /* 17 */:
                return hec.valueOf(parcel.readString());
            case 18:
                return cfc.valueOf(parcel.readString());
            case 19:
                return dfc.valueOf(parcel.readString());
            case 20:
                return new pqc(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readLong(), qs2.CREATOR.createFromParcel(parcel));
            case 21:
                return new lsc(new isc(gsc.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), Byte.valueOf(parcel.readByte()).equals(1)));
            case 22:
                return new j8d(parcel.readInt(), parcel.readFloat());
            case 23:
                return new njd(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int iT = v8j.t(parcel);
                Bundle bundleA = null;
                while (parcel.dataPosition() < iT) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        v8j.r(parcel, i5);
                    } else {
                        bundleA = v8j.a(parcel, i5);
                    }
                }
                v8j.h(parcel, iT);
                return new skd(bundleA);
            case 25:
                return new nnd(parcel.readInt());
            case 26:
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList3.add(parcel.readBundle(aud.class.getClassLoader()));
                }
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList4.add(Long.valueOf(parcel.readLong()));
                }
                return new aud(arrayList2, arrayList3, arrayList4, parcel.readInt());
            case 27:
                return new szd(parcel.readParcelable(szd.class.getClassLoader()));
            case 28:
                return new tzd(lf4.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readParcelable(tzd.class.getClassLoader()));
            default:
                return new b1e(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new xcb[i];
            case 1:
                return new ycb[i];
            case 2:
                return new zcb[i];
            case 3:
                return new ParcelImpl[i];
            case 4:
                return new smb[i];
            case 5:
                return new cqb[i];
            case 6:
                return new wrb[i];
            case 7:
                return new xrb[i];
            case 8:
                return new zub[i];
            case 9:
                return new bvb[i];
            case 10:
                return new kzb[i];
            case 11:
                return new f3c[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new e3c[i];
            case 13:
                return new o8c[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new q9c[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new u9c[i];
            case 16:
                return new pdc[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new hec[i];
            case 18:
                return new cfc[i];
            case 19:
                return new dfc[i];
            case 20:
                return new pqc[i];
            case 21:
                return new lsc[i];
            case 22:
                return new j8d[i];
            case 23:
                return new njd[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new skd[i];
            case 25:
                return new nnd[i];
            case 26:
                return new aud[i];
            case 27:
                return new szd[i];
            case 28:
                return new tzd[i];
            default:
                return new b1e[i];
        }
    }
}
