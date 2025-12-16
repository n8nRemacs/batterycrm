package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class di implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ ei c;

    public /* synthetic */ di(ei eiVar, dsd dsdVar, int i) {
        this.a = i;
        this.c = eiVar;
        this.b = dsdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorN;
        switch (this.a) {
            case 0:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "update_time");
                    int iC3 = s7j.c(cursorN, "emoji");
                    int iC4 = s7j.c(cursorN, "lottie_url");
                    int iC5 = s7j.c(cursorN, "lottie_play_url");
                    int iC6 = s7j.c(cursorN, "set_id");
                    int iC7 = s7j.c(cursorN, "icon_url");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList.add(new si(cursorN.getLong(iC), cursorN.getLong(iC2), cursorN.isNull(iC3) ? null : cursorN.getString(iC3), cursorN.isNull(iC4) ? null : cursorN.getString(iC4), cursorN.isNull(iC5) ? null : cursorN.getString(iC5), cursorN.isNull(iC6) ? null : Long.valueOf(cursorN.getLong(iC6)), cursorN.isNull(iC7) ? null : cursorN.getString(iC7)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC8 = s7j.c(cursorN, "id");
                    int iC9 = s7j.c(cursorN, "update_time");
                    int iC10 = s7j.c(cursorN, "emoji");
                    int iC11 = s7j.c(cursorN, "lottie_url");
                    int iC12 = s7j.c(cursorN, "lottie_play_url");
                    int iC13 = s7j.c(cursorN, "set_id");
                    int iC14 = s7j.c(cursorN, "icon_url");
                    ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList2.add(new si(cursorN.getLong(iC8), cursorN.getLong(iC9), cursorN.isNull(iC10) ? null : cursorN.getString(iC10), cursorN.isNull(iC11) ? null : cursorN.getString(iC11), cursorN.isNull(iC12) ? null : cursorN.getString(iC12), cursorN.isNull(iC13) ? null : Long.valueOf(cursorN.getLong(iC13)), cursorN.isNull(iC14) ? null : cursorN.getString(iC14)));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                cursorN = this.c.a.n(this.b);
                try {
                    Integer numValueOf = null;
                    if (cursorN.moveToFirst() && !cursorN.isNull(0)) {
                        numValueOf = Integer.valueOf(cursorN.getInt(0));
                    }
                    return numValueOf;
                } finally {
                }
        }
    }
}
