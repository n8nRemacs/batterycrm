package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class f18 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new g18(parcel);
            case 1:
                z48 z48Var = new z48();
                z48Var.a = parcel.readInt();
                z48Var.b = parcel.readInt();
                z48Var.c = parcel.readInt() == 1;
                return z48Var;
            case 2:
                return new z58(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 3:
                parcel.readInt();
                return a68.a;
            case 4:
                parcel.readInt();
                return b68.a;
            case 5:
                parcel.readInt();
                return c68.a;
            case 6:
                parcel.readInt();
                return d68.a;
            case 7:
                parcel.readInt();
                return e68.a;
            case 8:
                return new f68(((oi4) parcel.readParcelable(f68.class.getClassLoader())).a, parcel.readString());
            case 9:
                parcel.readInt();
                return g68.a;
            case 10:
                parcel.readInt();
                return h68.a;
            case 11:
                return new i68((Uri) parcel.readParcelable(i68.class.getClassLoader()));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new j68(parcel.readString());
            case 13:
                return new k68(parcel.readString());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                parcel.readInt();
                return l68.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new m68(parcel.readLong(), parcel.readString());
            case 16:
                parcel.readInt();
                return n68.a;
            case LangUtils.HASH_SEED /* 17 */:
                return new o68(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            case 18:
                return new p68(parcel.readLong(), parcel.readString());
            case 19:
                return new q68(parcel.readLong(), parcel.readString(), parcel.readString());
            case 20:
                parcel.readInt();
                return r68.a;
            case 21:
                return new s68(parcel.readString());
            case 22:
                return new t68(parcel.readLong());
            case 23:
                parcel.readInt();
                return v68.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new h98(parcel);
            case 25:
                return new nd8(parcel);
            case 26:
                return new pd8(parcel);
            case 27:
                return new vd8(parcel.readLong(), (Uri) parcel.readParcelable(vd8.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt(), parcel.readInt(), parcel.readLong(), (Uri) parcel.readParcelable(vd8.class.getClassLoader()));
            case 28:
                return new lf8(parcel);
            default:
                return new rn8(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g18[i];
            case 1:
                return new z48[i];
            case 2:
                return new z58[i];
            case 3:
                return new a68[i];
            case 4:
                return new b68[i];
            case 5:
                return new c68[i];
            case 6:
                return new d68[i];
            case 7:
                return new e68[i];
            case 8:
                return new f68[i];
            case 9:
                return new g68[i];
            case 10:
                return new h68[i];
            case 11:
                return new i68[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new j68[i];
            case 13:
                return new k68[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new l68[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new m68[i];
            case 16:
                return new n68[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new o68[i];
            case 18:
                return new p68[i];
            case 19:
                return new q68[i];
            case 20:
                return new r68[i];
            case 21:
                return new s68[i];
            case 22:
                return new t68[i];
            case 23:
                return new v68[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new h98[i];
            case 25:
                return new nd8[i];
            case 26:
                return new pd8[i];
            case 27:
                return new vd8[i];
            case 28:
                return new lf8[i];
            default:
                return new rn8[i];
        }
    }
}
