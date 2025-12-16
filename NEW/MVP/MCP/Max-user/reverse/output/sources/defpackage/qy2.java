package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qy2 {
    public final kz4 a;
    public final kz4 b;
    public final kz4 c;
    public final kz4 d;
    public final kz4 e;
    public final kz4 f;
    public final kz4 g;
    public final kz4 h;

    public qy2(kz4 kz4Var, kz4 kz4Var2, kz4 kz4Var3, kz4 kz4Var4, kz4 kz4Var5, kz4 kz4Var6, kz4 kz4Var7, kz4 kz4Var8) {
        this.a = kz4Var;
        this.b = kz4Var2;
        this.c = kz4Var3;
        this.d = kz4Var4;
        this.e = kz4Var5;
        this.f = kz4Var8;
        this.g = kz4Var6;
        this.h = kz4Var7;
    }

    public final CharSequence a(pb2 pb2Var) {
        rf2 rf2Var;
        lf2 lf2Var;
        ku3 ku3Var;
        List list;
        if (pb2Var.k0()) {
            return ((f7b) this.b.get()).a.getString(mvd.R1);
        }
        if (pb2Var.c0((rt5) this.f.get())) {
            return ((f7b) this.b.get()).a.getString(mvd.C);
        }
        ArrayList arrayListL = pb2Var.l();
        if (pb2Var.Q()) {
            if (!arrayListL.isEmpty()) {
                return ((h8c) this.d.get()).b((ku3) arrayListL.get(0));
            }
        } else {
            if (pb2Var.N()) {
                if (arrayListL.isEmpty()) {
                    if (pb2Var.b.c() == 0) {
                        return "";
                    }
                    if (pb2Var.j0() && pb2Var.b.c() == 1) {
                        return ((f7b) this.b.get()).a.getString(c5d.tt_chat_participants_empty__subtitle);
                    }
                    return l6g.p(x1d.tt_chat_subtitle_count, pb2Var.b.c(), ((f7b) this.b.get()).a);
                }
                int iC = pb2Var.b.c();
                if (!((lr3) this.a.get()).e() || !pb2Var.j0() || pb2Var.b.e.size() < pb2Var.b.c()) {
                    return l6g.p(x1d.tt_chat_subtitle_count, iC, ((f7b) this.b.get()).a);
                }
                ArrayList arrayListL2 = pb2Var.l();
                f8c f8cVar = (f8c) this.c.get();
                if (arrayListL2.isEmpty()) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListL2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            if (f8cVar.e(((ku3) next).p())) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    list = arrayList;
                }
                int size = list.size();
                f7b f7bVar = (f7b) this.b.get();
                f7bVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(size + 1);
                sb.append(" ");
                Context context = f7bVar.a;
                sb.append(context.getString(c5d.tt_of));
                sb.append(" ");
                sb.append(iC);
                sb.append(" ");
                sb.append(context.getString(c5d.tt_contact_status_online).toLowerCase());
                return sb.toString();
            }
            if (pb2Var.M()) {
                f7b f7bVar2 = (f7b) this.b.get();
                int iC2 = pb2Var.b.c();
                return iC2 <= 0 ? "" : u45.k(v1a.v(iC2), " ", f7bVar2.a.getResources().getQuantityString(x1d.channel_subscribers_count, iC2));
            }
            if (pb2Var.I()) {
                lf2 lf2Var2 = pb2Var.b.K;
                if (lf2Var2.g) {
                    synchronized (pb2Var.Y) {
                        try {
                            ku3Var = (!pb2Var.I() || pb2Var.Y.isEmpty()) ? null : (ku3) pb2Var.Y.get(0);
                        } finally {
                        }
                    }
                    if (ku3Var != null) {
                        return ku3Var.e();
                    }
                } else if (!l8g.c(lf2Var2.e)) {
                    return String.format(((f7b) this.b.get()).a.getString(c5d.tt_chat_admin_group_name_subtitle), pb2Var.b.K.e);
                }
            } else if (pb2Var.U() && (rf2Var = pb2Var.b) != null && (lf2Var = rf2Var.K) != null) {
                if (!lf2Var.g) {
                    Context context2 = ((f7b) this.b.get()).a;
                    return !TextUtils.isEmpty(null) ? String.format(context2.getString(c5d.tt_chat_group_name_subtitle), null) : context2.getString(c5d.tt_chat_group_subtitle);
                }
                if (!l8g.c(lf2Var.e)) {
                    f7b f7bVar3 = (f7b) this.b.get();
                    String str = pb2Var.b.K.e;
                    Context context3 = f7bVar3.a;
                    return !TextUtils.isEmpty(str) ? String.format(context3.getString(c5d.tt_chat_group_name_subtitle), str) : context3.getString(c5d.tt_chat_group_subtitle);
                }
            }
        }
        return null;
    }
}
