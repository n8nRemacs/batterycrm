package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class wf4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ wf4(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new xf4(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString());
            case 1:
                return new oi4((Uri) parcel.readParcelable(oi4.class.getClassLoader()));
            case 2:
                return new r25(parcel);
            case 3:
                return new p25(parcel);
            case 4:
                return new q25(parcel);
            case 5:
                return new s45(parcel);
            case 6:
                return new x45(parcel);
            case 7:
                return new y45(parcel);
            case 8:
                return new v45(parcel);
            case 9:
                return new w45(parcel);
            case 10:
                return new l95(parcel);
            case 11:
                return new mi5(parcel);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                h26 h26Var = new h26(-2, -2);
                h26Var.o = 0.0f;
                h26Var.X = 1.0f;
                h26Var.Y = -1;
                h26Var.Z = -1.0f;
                h26Var.u0 = 16777215;
                h26Var.v0 = 16777215;
                h26Var.o = parcel.readFloat();
                h26Var.X = parcel.readFloat();
                h26Var.Y = parcel.readInt();
                h26Var.Z = parcel.readFloat();
                h26Var.s0 = parcel.readInt();
                h26Var.t0 = parcel.readInt();
                h26Var.u0 = parcel.readInt();
                h26Var.v0 = parcel.readInt();
                h26Var.w0 = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) h26Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) h26Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) h26Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) h26Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) h26Var).width = parcel.readInt();
                return h26Var;
            case 13:
                j26 j26Var = new j26();
                j26Var.a = parcel.readInt();
                j26Var.b = parcel.readInt();
                return j26Var;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                oi6 oi6Var = new oi6();
                oi6Var.a = parcel.readString();
                oi6Var.b = parcel.readInt();
                return oi6Var;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ui6(parcel);
            case 16:
                return new xi6(parcel);
            case LangUtils.HASH_SEED /* 17 */:
                return new jo6(parcel.readInt());
            case 18:
                return new ko6(parcel.readString());
            case 19:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(xo6.class.getClassLoader()));
                }
                return new xo6(z, z2, z3, z4, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                return new lr6(parcel);
            case 21:
                return new p17(parcel.readFloat());
            case 22:
                return new l67(parcel);
            case 23:
                return new j67(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new dc7(parcel);
            case 25:
                return new fc7(parcel);
            case 26:
                return new zo7(parcel);
            case 27:
                return new gp7(parcel);
            case 28:
                return new up7(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : tp7.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? zkg.CREATOR.createFromParcel(parcel) : null);
            default:
                return new tp7(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new xf4[i];
            case 1:
                return new oi4[i];
            case 2:
                return new r25[i];
            case 3:
                return new p25[i];
            case 4:
                return new q25[i];
            case 5:
                return new s45[i];
            case 6:
                return new x45[i];
            case 7:
                return new y45[i];
            case 8:
                return new v45[i];
            case 9:
                return new w45[i];
            case 10:
                return new l95[i];
            case 11:
                return new mi5[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new h26[i];
            case 13:
                return new j26[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new oi6[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ui6[i];
            case 16:
                return new xi6[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new jo6[i];
            case 18:
                return new ko6[i];
            case 19:
                return new xo6[i];
            case 20:
                return new lr6[i];
            case 21:
                return new p17[i];
            case 22:
                return new l67[i];
            case 23:
                return new j67[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new dc7[i];
            case 25:
                return new fc7[i];
            case 26:
                return new zo7[i];
            case 27:
                return new gp7[i];
            case 28:
                return new up7[i];
            default:
                return new tp7[i];
        }
    }
}
