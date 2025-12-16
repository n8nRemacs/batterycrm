package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class zm9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ an9 c;

    public /* synthetic */ zm9(an9 an9Var, dsd dsdVar, int i) {
        this.a = i;
        this.c = an9Var;
        this.b = dsdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorN;
        u10 u10Var;
        u10 u10Var2;
        int i;
        switch (this.a) {
            case 0:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC = s7j.c(cursorN, ClientCookie.PATH_ATTR);
                    int iC2 = s7j.c(cursorN, "last_modified");
                    int iC3 = s7j.c(cursorN, "upload_type");
                    int iC4 = s7j.c(cursorN, "message_id");
                    int iC5 = s7j.c(cursorN, "chat_id");
                    int iC6 = s7j.c(cursorN, "attach_id");
                    int iC7 = s7j.c(cursorN, "video_quality");
                    int iC8 = s7j.c(cursorN, "video_start_trim_position");
                    int iC9 = s7j.c(cursorN, "video_end_trim_position");
                    int iC10 = s7j.c(cursorN, "mute");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        bz1 bz1Var = new bz1();
                        bz1Var.a = cursorN.getLong(iC4);
                        bz1Var.b = cursorN.getLong(iC5);
                        if (cursorN.isNull(iC6)) {
                            bz1Var.c = null;
                        } else {
                            bz1Var.c = cursorN.getString(iC6);
                        }
                        if (cursorN.isNull(iC7) && cursorN.isNull(iC8) && cursorN.isNull(iC9) && cursorN.isNull(iC10)) {
                            u10Var = null;
                        } else {
                            u10Var = new u10();
                            u10Var.c = coi.e(cursorN.isNull(iC7) ? null : Integer.valueOf(cursorN.getInt(iC7)));
                            u10Var.a = cursorN.getFloat(iC8);
                            u10Var.b = cursorN.getFloat(iC9);
                            u10Var.d = cursorN.getInt(iC10) != 0;
                        }
                        wm9 wm9Var = new wm9();
                        if (cursorN.isNull(iC)) {
                            wm9Var.b = null;
                        } else {
                            wm9Var.b = cursorN.getString(iC);
                        }
                        int i2 = iC;
                        wm9Var.c = cursorN.getLong(iC2);
                        wm9Var.d = coi.d(cursorN.isNull(iC3) ? null : Integer.valueOf(cursorN.getInt(iC3)));
                        wm9Var.a = bz1Var;
                        wm9Var.e = u10Var;
                        arrayList.add(wm9Var);
                        iC = i2;
                    }
                    cursorN.close();
                    return arrayList;
                } finally {
                }
            default:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC11 = s7j.c(cursorN, ClientCookie.PATH_ATTR);
                    int iC12 = s7j.c(cursorN, "last_modified");
                    int iC13 = s7j.c(cursorN, "upload_type");
                    int iC14 = s7j.c(cursorN, "message_id");
                    int iC15 = s7j.c(cursorN, "chat_id");
                    int iC16 = s7j.c(cursorN, "attach_id");
                    int iC17 = s7j.c(cursorN, "video_quality");
                    int iC18 = s7j.c(cursorN, "video_start_trim_position");
                    int iC19 = s7j.c(cursorN, "video_end_trim_position");
                    int iC20 = s7j.c(cursorN, "mute");
                    ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        bz1 bz1Var2 = new bz1();
                        bz1Var2.a = cursorN.getLong(iC14);
                        bz1Var2.b = cursorN.getLong(iC15);
                        if (cursorN.isNull(iC16)) {
                            bz1Var2.c = null;
                        } else {
                            bz1Var2.c = cursorN.getString(iC16);
                        }
                        if (cursorN.isNull(iC17) && cursorN.isNull(iC18) && cursorN.isNull(iC19) && cursorN.isNull(iC20)) {
                            u10Var2 = null;
                        } else {
                            u10Var2 = new u10();
                            u10Var2.c = coi.e(cursorN.isNull(iC17) ? null : Integer.valueOf(cursorN.getInt(iC17)));
                            u10Var2.a = cursorN.getFloat(iC18);
                            u10Var2.b = cursorN.getFloat(iC19);
                            u10Var2.d = cursorN.getInt(iC20) != 0;
                        }
                        wm9 wm9Var2 = new wm9();
                        if (cursorN.isNull(iC11)) {
                            i = iC14;
                            wm9Var2.b = null;
                        } else {
                            i = iC14;
                            wm9Var2.b = cursorN.getString(iC11);
                        }
                        int i3 = iC15;
                        wm9Var2.c = cursorN.getLong(iC12);
                        wm9Var2.d = coi.d(cursorN.isNull(iC13) ? null : Integer.valueOf(cursorN.getInt(iC13)));
                        wm9Var2.a = bz1Var2;
                        wm9Var2.e = u10Var2;
                        arrayList2.add(wm9Var2);
                        iC14 = i;
                        iC15 = i3;
                    }
                    cursorN.close();
                    return arrayList2;
                } finally {
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.y();
                break;
        }
    }
}
