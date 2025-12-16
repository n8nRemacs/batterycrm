package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class z6e implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        switch (this.a) {
            case 0:
                return new a7e((ForegroundColorSpan) parcel.readParcelable(a7e.class.getClassLoader()), (BackgroundColorSpan) parcel.readParcelable(a7e.class.getClassLoader()));
            case 1:
                return new ece(vd8.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Uri) parcel.readParcelable(ece.class.getClassLoader()), (Uri) parcel.readParcelable(ece.class.getClassLoader()), parcel.readString(), (RectF) parcel.readParcelable(ece.class.getClassLoader()), (Rect) parcel.readParcelable(ece.class.getClassLoader()), (Uri) parcel.readParcelable(ece.class.getClassLoader()));
            case 2:
                int i2 = parcel.readInt();
                s5g s5gVar = (s5g) parcel.readParcelable(zme.class.getClassLoader());
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("LINK")) {
                    i = 1;
                } else {
                    if (!string.equals("NEUTRAL")) {
                        throw new IllegalArgumentException("No enum constant one.me.settings.SettingsAvatarBottomSheet.Button.Type.".concat(string));
                    }
                    i = 2;
                }
                return new zme(i2, i, s5gVar);
            case 3:
                parcel.readInt();
                return yne.a;
            case 4:
                return new zne(parcel.readInt() != 0);
            case 5:
                return new aoe(parcel.readInt());
            case 6:
                return new boe((s5g) parcel.readParcelable(boe.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 7:
                return new coe(parcel.readInt() != 0, parcel.readInt() != 0);
            case 8:
                return new doe(parcel.readInt() != 0, parcel.readInt() != 0);
            case 9:
                return new eoe((s5g) parcel.readParcelable(eoe.class.getClassLoader()));
            case 10:
                int i3 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList = new ArrayList(i4);
                    for (int i5 = 0; i5 != i4; i5++) {
                        arrayList.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i6 = parcel.readInt();
                    arrayList2 = new ArrayList(i6);
                    for (int i7 = 0; i7 != i6; i7++) {
                        arrayList2.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                ArrayList arrayList5 = arrayList;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i8 = parcel.readInt();
                    arrayList3 = new ArrayList(i8);
                    for (int i9 = 0; i9 != i8; i9++) {
                        arrayList3.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i10 = parcel.readInt();
                    arrayList4 = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList4.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                return new ShareData(i3, arrayList5, arrayList2, string2, arrayList3, arrayList4, parcel.readString());
            case 11:
                ArrayList arrayList6 = new ArrayList();
                parcel.readList(arrayList6, y4f.class.getClassLoader());
                return new a5f(arrayList6);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new y4f(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 13:
                return new w5f(parcel);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new e8f(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new f8f();
            case 16:
                return new j8f(parcel);
            case LangUtils.HASH_SEED /* 17 */:
                q9f q9fVar = new q9f();
                q9fVar.a = parcel.readInt();
                q9fVar.b = parcel.readInt();
                q9fVar.d = parcel.readInt() == 1;
                int i12 = parcel.readInt();
                if (i12 > 0) {
                    int[] iArr = new int[i12];
                    q9fVar.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return q9fVar;
            case 18:
                r9f r9fVar = new r9f();
                r9fVar.a = parcel.readInt();
                r9fVar.b = parcel.readInt();
                int i13 = parcel.readInt();
                r9fVar.c = i13;
                if (i13 > 0) {
                    int[] iArr2 = new int[i13];
                    r9fVar.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i14 = parcel.readInt();
                r9fVar.o = i14;
                if (i14 > 0) {
                    int[] iArr3 = new int[i14];
                    r9fVar.X = iArr3;
                    parcel.readIntArray(iArr3);
                }
                r9fVar.Z = parcel.readInt() == 1;
                r9fVar.s0 = parcel.readInt() == 1;
                r9fVar.t0 = parcel.readInt() == 1;
                r9fVar.Y = parcel.readArrayList(q9f.class.getClassLoader());
                return r9fVar;
            case 19:
                return raf.valueOf(parcel.readString());
            case 20:
                return new hlf(parcel);
            case 21:
                return new ilf(parcel);
            case 22:
                SparseArray sparseArray = new SparseArray();
                int i15 = parcel.readInt();
                for (int i16 = 0; i16 < i15; i16++) {
                    sparseArray.put(parcel.readInt(), parcel.readString());
                }
                return new smf(sparseArray);
            case 23:
                return new g4g(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new t8g(parcel.readInt());
            case 25:
                return new b9g(parcel.readLong(), parcel.readLong());
            case 26:
                return new gfg(parcel);
            case 27:
                return new ffg(parcel);
            case 28:
                return new zkg(parcel.readInt(), parcel.readInt(), parcel.readInt());
            default:
                return new pwg(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new a7e[i];
            case 1:
                return new ece[i];
            case 2:
                return new zme[i];
            case 3:
                return new yne[i];
            case 4:
                return new zne[i];
            case 5:
                return new aoe[i];
            case 6:
                return new boe[i];
            case 7:
                return new coe[i];
            case 8:
                return new doe[i];
            case 9:
                return new eoe[i];
            case 10:
                return new ShareData[i];
            case 11:
                return new a5f[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new y4f[i];
            case 13:
                return new w5f[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new e8f[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new f8f[i];
            case 16:
                return new j8f[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new q9f[i];
            case 18:
                return new r9f[i];
            case 19:
                return new raf[i];
            case 20:
                return new hlf[i];
            case 21:
                return new ilf[i];
            case 22:
                return new smf[i];
            case 23:
                return new g4g[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new t8g[i];
            case 25:
                return new b9g[i];
            case 26:
                return new gfg[i];
            case 27:
                return new ffg[i];
            case 28:
                return new zkg[i];
            default:
                return new pwg[i];
        }
    }
}
