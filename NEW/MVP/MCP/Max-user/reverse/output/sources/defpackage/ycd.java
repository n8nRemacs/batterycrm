package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ycd implements tm6, gu3, ewd, fu3, k1e, m7c, kw0, pm0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ycd(int i) {
        this.a = i;
    }

    @Override // defpackage.k1e
    public void a() {
    }

    @Override // defpackage.pm0
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 20:
                ((List) obj).addAll((List) obj2);
                break;
            default:
                ((ArrayList) obj).addAll((List) obj2);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((OneMeRoomDatabase) obj).M();
            case 4:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        ka5 ka5VarA = ac0.a();
                        ka5VarA.p(cursorRawQuery.getString(1));
                        ka5VarA.c = o9c.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        ka5VarA.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(ka5VarA.e());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 8:
                return ((tv3) obj).a();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Long.valueOf(((jef) obj).a);
            case 18:
                return (jef) ((Map.Entry) obj).getValue();
            case 22:
                return ((gu) obj).c;
            case 23:
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList2.add(po8.p((kef) it.next()));
                }
                return arrayList2;
            case 26:
                return Long.valueOf(((pff) obj).c);
            default:
                return ((uef) obj).c;
        }
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 2);
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f == -1.0f ? new baf(i) : new baf(i, f);
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return !l8g.c((String) obj);
            case 10:
                s10 s10Var = ((w10) obj).a;
                return s10Var == s10.c || s10Var == s10.d;
            default:
                return ((scd) obj).a == hdd.STICKER;
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                awd awdVar = bwd.a;
                break;
            case 3:
                Throwable th = (Throwable) obj;
                wqi.e("u8j", th.getMessage(), th);
                break;
            case 5:
                ((cxd) obj).b.getClass();
                break;
            case 6:
                ((dxd) obj).b.release();
                break;
            case 13:
                ((x00) obj).k = -1.0f;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                x00 x00Var = (x00) obj;
                x00Var.i = p10.o;
                x00Var.k = -1.0f;
                break;
            case 16:
                wqi.e("tef", "clear: failed to clear repository", (Throwable) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                wqi.e("tef", "putSticker: failed", (Throwable) obj);
                break;
            case 19:
                wqi.e("tef", "storeSections: failed", (Throwable) obj);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                wqi.e("tef", "onStickersLoadedFromNetwork: write to stickers db failed", (Throwable) obj);
                break;
            case 27:
                wqi.e("tef", "Can't update recents", (Throwable) obj);
                break;
            default:
                wqi.e("tef", "load: failed", (Throwable) obj);
                break;
        }
    }
}
