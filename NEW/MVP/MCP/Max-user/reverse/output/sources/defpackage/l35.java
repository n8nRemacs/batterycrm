package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class l35 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ m35 c;

    public /* synthetic */ l35(m35 m35Var, dsd dsdVar, int i) {
        this.a = i;
        this.c = m35Var;
        this.b = dsdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorN;
        u10 u10Var;
        u10 u10Var2;
        switch (this.a) {
            case 0:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC = s7j.c(cursorN, ClientCookie.PATH_ATTR);
                    int iC2 = s7j.c(cursorN, "last_modified");
                    int iC3 = s7j.c(cursorN, "upload_type");
                    int iC4 = s7j.c(cursorN, "chat_id");
                    int iC5 = s7j.c(cursorN, "attach_id");
                    int iC6 = s7j.c(cursorN, "video_quality");
                    int iC7 = s7j.c(cursorN, "video_start_trim_position");
                    int iC8 = s7j.c(cursorN, "video_end_trim_position");
                    int iC9 = s7j.c(cursorN, "mute");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        String string = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                        long j = cursorN.getLong(iC2);
                        wvg wvgVarD = coi.d(cursorN.isNull(iC3) ? null : Integer.valueOf(cursorN.getInt(iC3)));
                        z25 z25Var = new z25(cursorN.getLong(iC4), cursorN.isNull(iC5) ? null : cursorN.getString(iC5));
                        if (cursorN.isNull(iC6) && cursorN.isNull(iC7) && cursorN.isNull(iC8) && cursorN.isNull(iC9)) {
                            u10Var = null;
                        } else {
                            u10 u10Var3 = new u10();
                            u10Var3.c = coi.e(cursorN.isNull(iC6) ? null : Integer.valueOf(cursorN.getInt(iC6)));
                            u10Var3.a = cursorN.getFloat(iC7);
                            u10Var3.b = cursorN.getFloat(iC8);
                            u10Var3.d = cursorN.getInt(iC9) != 0;
                            u10Var = u10Var3;
                        }
                        arrayList.add(new g35(z25Var, string, j, wvgVarD, u10Var));
                    }
                    cursorN.close();
                    return arrayList;
                } finally {
                }
            default:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC10 = s7j.c(cursorN, ClientCookie.PATH_ATTR);
                    int iC11 = s7j.c(cursorN, "last_modified");
                    int iC12 = s7j.c(cursorN, "upload_type");
                    int iC13 = s7j.c(cursorN, "chat_id");
                    int iC14 = s7j.c(cursorN, "attach_id");
                    int iC15 = s7j.c(cursorN, "video_quality");
                    int iC16 = s7j.c(cursorN, "video_start_trim_position");
                    int iC17 = s7j.c(cursorN, "video_end_trim_position");
                    int iC18 = s7j.c(cursorN, "mute");
                    ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        String string2 = cursorN.isNull(iC10) ? null : cursorN.getString(iC10);
                        long j2 = cursorN.getLong(iC11);
                        wvg wvgVarD2 = coi.d(cursorN.isNull(iC12) ? null : Integer.valueOf(cursorN.getInt(iC12)));
                        z25 z25Var2 = new z25(cursorN.getLong(iC13), cursorN.isNull(iC14) ? null : cursorN.getString(iC14));
                        if (cursorN.isNull(iC15) && cursorN.isNull(iC16) && cursorN.isNull(iC17) && cursorN.isNull(iC18)) {
                            u10Var2 = null;
                        } else {
                            u10 u10Var4 = new u10();
                            u10Var4.c = coi.e(cursorN.isNull(iC15) ? null : Integer.valueOf(cursorN.getInt(iC15)));
                            u10Var4.a = cursorN.getFloat(iC16);
                            u10Var4.b = cursorN.getFloat(iC17);
                            u10Var4.d = cursorN.getInt(iC18) != 0;
                            u10Var2 = u10Var4;
                        }
                        arrayList2.add(new g35(z25Var2, string2, j2, wvgVarD2, u10Var2));
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
