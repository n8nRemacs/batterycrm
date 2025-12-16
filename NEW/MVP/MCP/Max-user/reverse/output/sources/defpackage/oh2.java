package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class oh2 implements m7c, oa8, pa8, tm6, gu3, y89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ oh2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                wqi.e("ps5", String.format(Locale.ENGLISH, "onAssetsUpdate: failed to store stickers %s", list), (Throwable) obj);
                break;
            case 13:
                wqi.e("ps5", String.format(Locale.ENGLISH, "removeFromFavorites: failed: ids=%s", list), (Throwable) obj);
                break;
            case 16:
                ((x10) obj).a = list;
                break;
            case 23:
                wqi.g("igf", (Throwable) obj, "storeStickerSets: failed for sets = %s", list);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                wqi.e("igf", String.format(Locale.ENGLISH, "storeStickerSetsFromServer: failed for %s", list), (Throwable) obj);
                break;
            default:
                wqi.c("a3g", "hasTasksByTypesInDb: tasks count=%d, for types=%s", (Long) obj, list);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                final qs5 qs5Var = (qs5) obj;
                final int i = 0;
                final List list = this.b;
                return new kk3(1, new p6() { // from class: hr5
                    @Override // defpackage.p6
                    public final void run() {
                        switch (i) {
                            case 0:
                                qs5Var.a(list);
                                return;
                            default:
                                List list2 = list;
                                qs5 qs5Var2 = qs5Var;
                                lrd lrdVar = qs5Var2.a;
                                lrdVar.c();
                                try {
                                    dsd dsdVarC = dsd.c(0, "SELECT MAX(`index`) FROM favorite_stickers");
                                    lrd lrdVar2 = qs5Var2.a;
                                    lrdVar2.b();
                                    Cursor cursorN = lrdVar2.n(dsdVarC);
                                    try {
                                        int i2 = cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
                                        cursorN.close();
                                        dsdVarC.y();
                                        qs5.b(i2 + 1, list2);
                                        lrdVar.q();
                                        return;
                                    } catch (Throwable th) {
                                        cursorN.close();
                                        dsdVarC.y();
                                        throw th;
                                    }
                                } finally {
                                    lrdVar.k();
                                }
                        }
                    }
                });
            case 4:
                final qs5 qs5Var2 = (qs5) obj;
                final int i2 = 1;
                final List list2 = this.b;
                return new kk3(i2, new p6() { // from class: hr5
                    @Override // defpackage.p6
                    public final void run() {
                        switch (i2) {
                            case 0:
                                qs5Var2.a(list2);
                                return;
                            default:
                                List list22 = list2;
                                qs5 qs5Var22 = qs5Var2;
                                lrd lrdVar = qs5Var22.a;
                                lrdVar.c();
                                try {
                                    dsd dsdVarC = dsd.c(0, "SELECT MAX(`index`) FROM favorite_stickers");
                                    lrd lrdVar2 = qs5Var22.a;
                                    lrdVar2.b();
                                    Cursor cursorN = lrdVar2.n(dsdVarC);
                                    try {
                                        int i22 = cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
                                        cursorN.close();
                                        dsdVarC.y();
                                        qs5.b(i22 + 1, list22);
                                        lrdVar.q();
                                        return;
                                    } catch (Throwable th) {
                                        cursorN.close();
                                        dsdVarC.y();
                                        throw th;
                                    }
                                } finally {
                                    lrdVar.k();
                                }
                        }
                    }
                });
            case 5:
                qs5 qs5Var3 = (qs5) obj;
                qs5Var3.getClass();
                return new kk3(2, new ci(qs5Var3, 12, this.b));
            case 6:
                return new ik3(((zr5) obj).a(), 2, new oh2(9, this.b));
            case 7:
                return new ik3(((zr5) obj).a(), 2, new oh2(11, this.b));
            case 8:
                return new ik3(((zr5) obj).a(), 2, new oh2(9, this.b));
            case 9:
                final hs5 hs5Var = (hs5) obj;
                final int i3 = 0;
                final List list3 = this.b;
                return new kk3(1, new p6() { // from class: yr5
                    @Override // defpackage.p6
                    public final void run() {
                        switch (i3) {
                            case 0:
                                hs5Var.a(list3);
                                return;
                            default:
                                List list4 = list3;
                                hs5 hs5Var2 = hs5Var;
                                lrd lrdVar = hs5Var2.a;
                                lrdVar.c();
                                try {
                                    dsd dsdVarC = dsd.c(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                                    lrd lrdVar2 = hs5Var2.a;
                                    lrdVar2.b();
                                    Cursor cursorN = lrdVar2.n(dsdVarC);
                                    try {
                                        int i4 = cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
                                        cursorN.close();
                                        dsdVarC.y();
                                        hs5.b(i4 + 1, list4);
                                        lrdVar.q();
                                        return;
                                    } catch (Throwable th) {
                                        cursorN.close();
                                        dsdVarC.y();
                                        throw th;
                                    }
                                } finally {
                                    lrdVar.k();
                                }
                        }
                    }
                });
            case 10:
                final hs5 hs5Var2 = (hs5) obj;
                final int i4 = 1;
                final List list4 = this.b;
                return new kk3(i4, new p6() { // from class: yr5
                    @Override // defpackage.p6
                    public final void run() {
                        switch (i4) {
                            case 0:
                                hs5Var2.a(list4);
                                return;
                            default:
                                List list42 = list4;
                                hs5 hs5Var22 = hs5Var2;
                                lrd lrdVar = hs5Var22.a;
                                lrdVar.c();
                                try {
                                    dsd dsdVarC = dsd.c(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                                    lrd lrdVar2 = hs5Var22.a;
                                    lrdVar2.b();
                                    Cursor cursorN = lrdVar2.n(dsdVarC);
                                    try {
                                        int i42 = cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
                                        cursorN.close();
                                        dsdVarC.y();
                                        hs5.b(i42 + 1, list42);
                                        lrdVar.q();
                                        return;
                                    } catch (Throwable th) {
                                        cursorN.close();
                                        dsdVarC.y();
                                        throw th;
                                    }
                                } finally {
                                    lrdVar.k();
                                }
                        }
                    }
                });
            case 11:
                hs5 hs5Var3 = (hs5) obj;
                hs5Var3.getClass();
                return new kk3(2, new ci(hs5Var3, 9, this.b));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            default:
                jgf jgfVar = (jgf) obj;
                jgfVar.getClass();
                return new kk3(2, new jad(jgfVar, 11, this.b));
            case 18:
                ocd ocdVar = (ocd) obj;
                ocdVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM recent WHERE recent_type IN (");
                List list5 = this.b;
                int size = list5.size();
                lc4.a(sb, size);
                sb.append(") ORDER BY `recent_time` DESC");
                dsd dsdVarC = dsd.c(size, sb.toString());
                Iterator it = list5.iterator();
                int i5 = 1;
                while (it.hasNext()) {
                    dsdVarC.k(i5, ((hdd) it.next()).a);
                    i5++;
                }
                return yfi.c(ocdVar.a, new String[]{"recent"}, new ncd(ocdVar, dsdVarC, 4));
            case 19:
                return new ora(vqa.i((List) obj), new iqa(28), 5).g(new oh2(17, this.b)).s().n();
        }
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((q3c) obj).n(this.b);
                break;
            default:
                ((r3c) obj).n(this.b);
                break;
        }
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        switch (this.a) {
        }
        return o79Var.l(u69Var, this.b);
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                long j = ((fh9) obj).a;
                List list = this.b;
                boolean z = false;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            try {
                                if (((u4a) ((r2g) it.next()).f).Y == j) {
                                    z = true;
                                }
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        }
                    }
                }
                return !z;
            case LangUtils.HASH_SEED /* 17 */:
                return this.b.contains(((scd) obj).a);
            case 20:
                final Long l = (Long) obj;
                final int i = 0;
                return !((Boolean) new zqa(vqa.i(this.b), new m7c() { // from class: sef
                    @Override // defpackage.m7c
                    public final boolean test(Object obj2) {
                        switch (i) {
                            case 0:
                                if (((jef) obj2).a == l.longValue()) {
                                }
                                break;
                            default:
                                if (((xff) obj2).a == l.longValue()) {
                                }
                                break;
                        }
                        return false;
                    }
                }).e()).booleanValue();
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                return this.b.contains(entry.getKey()) && entry.getValue() != null;
            default:
                final Long l2 = (Long) obj;
                final int i2 = 1;
                return !((Boolean) new zqa(vqa.i(this.b), new m7c() { // from class: sef
                    @Override // defpackage.m7c
                    public final boolean test(Object obj2) {
                        switch (i2) {
                            case 0:
                                if (((jef) obj2).a == l2.longValue()) {
                                }
                                break;
                            default:
                                if (((xff) obj2).a == l2.longValue()) {
                                }
                                break;
                        }
                        return false;
                    }
                }).e()).booleanValue();
        }
    }
}
