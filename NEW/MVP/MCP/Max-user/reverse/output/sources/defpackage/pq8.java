package defpackage;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class pq8 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ pq8(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                qq8 qq8Var = new qq8(parcel);
                qq8Var.a = ((Integer) parcel.readValue(qq8.class.getClassLoader())).intValue();
                return qq8Var;
            case 1:
                return new js8(parcel);
            case 2:
                return new mv8(parcel);
            case 3:
                return wy8.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case 4:
                return new x19(parcel);
            case 5:
                return new e79(parcel);
            case 6:
                f79 f79Var = new f79();
                f79Var.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return f79Var;
            case 7:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new g79(token, null);
            case 8:
                return new ec9(parcel.readInt(), (s5g) parcel.readParcelable(ec9.class.getClassLoader()), hoe.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (foe) parcel.readParcelable(ec9.class.getClassLoader()));
            case 9:
                return new hd9(parcel.readLong(), br2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 10:
                return new sy9(parcel);
            case 11:
                return new q1a(parcel);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return g2a.a(parcel.readInt(), parcel.readInt());
            case 13:
                return new q2a(parcel);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new taa(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                oda odaVar = new oda(parcel);
                odaVar.a = parcel.readInt();
                return odaVar;
            case 16:
                return new zea(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case LangUtils.HASH_SEED /* 17 */:
                return new x2b(parcel.readString(), parcel.readInt(), (s5g) parcel.readParcelable(x2b.class.getClassLoader()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (s5g) parcel.readParcelable(x2b.class.getClassLoader()));
            case 18:
                return new jcb(parcel.readInt());
            case 19:
                return new kcb(jcb.CREATOR.createFromParcel(parcel).a, parcel.readInt(), parcel.readInt());
            case 20:
                ucb ucbVar = (ucb) parcel.readParcelable(cdb.class.getClassLoader());
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new cdb(ucbVar, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (adb) parcel.readParcelable(cdb.class.getClassLoader()), kcb.CREATOR.createFromParcel(parcel), (ocb) parcel.readParcelable(cdb.class.getClassLoader()), bdb.valueOf(parcel.readString()));
            case 21:
                parcel.readInt();
                return lcb.b;
            case 22:
                parcel.readInt();
                return mcb.b;
            case 23:
                parcel.readInt();
                return ncb.b;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new pcb(parcel.readInt(), parcel.readInt());
            case 25:
                return new qcb(parcel.readInt());
            case 26:
                parcel.readInt();
                return rcb.a;
            case 27:
                return new scb(parcel.readInt());
            case 28:
                parcel.readInt();
                return tcb.a;
            default:
                parcel.readInt();
                return vcb.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qq8[i];
            case 1:
                return new js8[i];
            case 2:
                return new mv8[i];
            case 3:
                return new wy8[i];
            case 4:
                return new x19[i];
            case 5:
                return new e79[i];
            case 6:
                return new f79[i];
            case 7:
                return new g79[i];
            case 8:
                return new ec9[i];
            case 9:
                return new hd9[i];
            case 10:
                return new sy9[i];
            case 11:
                return new q1a[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new g2a[i];
            case 13:
                return new q2a[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new taa[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new oda[i];
            case 16:
                return new zea[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new x2b[i];
            case 18:
                return new jcb[i];
            case 19:
                return new kcb[i];
            case 20:
                return new cdb[i];
            case 21:
                return new lcb[i];
            case 22:
                return new mcb[i];
            case 23:
                return new ncb[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new pcb[i];
            case 25:
                return new qcb[i];
            case 26:
                return new rcb[i];
            case 27:
                return new scb[i];
            case 28:
                return new tcb[i];
            default:
                return new vcb[i];
        }
    }
}
