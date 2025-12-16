package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ij7 implements ui8 {
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bwf o;
    public final k18 s0;
    public v28 u0 = null;
    public final ConcurrentHashMap t0 = new ConcurrentHashMap();

    public ij7(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, bwf bwfVar, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.o = bwfVar;
        this.X = k18Var5;
        this.Y = k18Var6;
        this.Z = k18Var7;
        this.s0 = k18Var8;
    }

    public final Map a(long j) {
        return (Map) this.t0.get(Long.valueOf(j));
    }

    public final List b(long j) {
        List arrayList;
        Map mapA = a(j);
        if (mapA == null || mapA.isEmpty()) {
            wy1.q(j, "getNotifList: there is no notifs for chat, chatId = ", "ij7");
            return null;
        }
        try {
            arrayList = new ArrayList(mapA.entrySet());
        } catch (NoSuchElementException unused) {
            arrayList = Collections.EMPTY_LIST;
        }
        if (arrayList.isEmpty()) {
            wy1.q(j, "getNotifList: there is no notifs for chat, chatId = ", "ij7");
            return null;
        }
        if (arrayList.size() > 1) {
            arrayList.sort(Comparator.comparingLong(new p93(1)));
        }
        return arrayList;
    }

    @Override // defpackage.ui8
    public final void c() {
        this.t0.clear();
    }

    public final void d(long j) {
        wy1.q(j, "postEvent: chat.id =  ", "ij7");
        f(j);
        v28 v28Var = this.u0;
        if (v28Var != null) {
            svi.e(v28Var.o, null, null, new u28(v28Var, j, null), 3);
        }
    }

    public final synchronized void e(long j, long j2) {
        try {
            wqi.c("ij7", "removeTyping: chatId = " + j + ", sender = " + j2, new Object[0]);
            Map mapA = a(j);
            if (mapA != null) {
                mapA.remove(Long.valueOf(j2));
                if (mapA.isEmpty()) {
                    wqi.c("ij7", "removeTyping: remove chat notifs, chatId = " + j, new Object[0]);
                    this.t0.remove(Long.valueOf(j));
                }
                d(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String f(long j) {
        List listB = b(j);
        if (listB == null) {
            wy1.q(j, "typingText: there is no notifs for chat, chatId = ", "ij7");
            return null;
        }
        pb2 pb2VarM = ((ve2) this.Y.getValue()).M(j);
        if (pb2VarM == null) {
            ((y3b) ((yi5) this.c.getValue())).a(new IllegalStateException("chat is null"));
            return "";
        }
        boolean zQ = pb2VarM.Q();
        sia siaVar = (sia) ((Map.Entry) listB.get(0)).getValue();
        long jLongValue = ((Long) ((Map.Entry) listB.get(0)).getKey()).longValue();
        if (zQ) {
            Context context = ((f7b) this.d.getValue()).a;
            s00 s00Var = siaVar.b;
            if (s00Var == null) {
                return context.getString(c5d.tt_typing);
            }
            int iOrdinal = s00Var.ordinal();
            return iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? iOrdinal != 9 ? iOrdinal != 15 ? context.getString(c5d.tt_typing) : context.getString(c5d.tt_typing_video_message) : context.getString(c5d.tt_typing_file) : context.getString(c5d.tt_typing_sticker) : context.getString(c5d.tt_typing_audio) : context.getString(c5d.tt_typing_video) : context.getString(c5d.tt_typing_photo);
        }
        StringBuilder sb = new StringBuilder();
        int size = listB.size();
        k18 k18Var = this.s0;
        k18 k18Var2 = this.Z;
        if (size == 1) {
            ku3 ku3VarI = ((qv3) k18Var2.getValue()).i(jLongValue, false);
            if (ku3VarI == null || ku3VarI.B()) {
                ((dd) k18Var.getValue()).e("MISSED_CONTACT_IN_TYPING");
                return null;
            }
            sb.append(ku3VarI.e());
        } else if (listB.size() == 2) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                ku3 ku3VarI2 = ((qv3) k18Var2.getValue()).i(((Long) ((Map.Entry) it.next()).getKey()).longValue(), false);
                if (ku3VarI2 == null || ku3VarI2.B()) {
                    ((dd) k18Var.getValue()).e("MISSED_CONTACT_IN_TYPING");
                } else {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(ku3VarI2.e());
                }
            }
        } else {
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                if (((qv3) k18Var2.getValue()).i(((Long) ((Map.Entry) it2.next()).getKey()).longValue(), true).B()) {
                    ((dd) k18Var.getValue()).e("MISSED_CONTACT_IN_TYPING");
                }
            }
            sb.append(l6g.p(x1d.tt_chat_subtitle_count, listB.size(), (Context) this.a.getValue()));
        }
        return sb.toString();
    }
}
