package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final class fk7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ gk7 c;

    public /* synthetic */ fk7(gk7 gk7Var, dsd dsdVar, int i) {
        this.a = i;
        this.c = gk7Var;
        this.b = dsdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [vk7] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        byte b;
        uk7 tk7Var;
        uk7 rk7Var;
        dsd dsdVar2;
        uk7 tk7Var2;
        uk7 rk7Var2;
        switch (this.a) {
            case 0:
                lrd lrdVar = this.c.a;
                dsd dsdVar3 = this.b;
                Cursor cursorN = lrdVar.n(dsdVar3);
                try {
                    iC = s7j.c(cursorN, "id");
                    iC2 = s7j.c(cursorN, "title");
                    iC3 = s7j.c(cursorN, "is_title_animated");
                    iC4 = s7j.c(cursorN, "description");
                    iC5 = s7j.c(cursorN, LogFactory.PRIORITY_KEY);
                    iC6 = s7j.c(cursorN, "repeat");
                    iC7 = s7j.c(cursorN, "rerun");
                    iC8 = s7j.c(cursorN, "animoji_id");
                    iC9 = s7j.c(cursorN, KwsFeaturesConfigProviderImpl.URL_KEY);
                    iC10 = s7j.c(cursorN, "type");
                    iC11 = s7j.c(cursorN, "click_time");
                    iC12 = s7j.c(cursorN, "show_time");
                    iC13 = s7j.c(cursorN, "close_time");
                    dsdVar = dsdVar3;
                } catch (Throwable th) {
                    th = th;
                    dsdVar = dsdVar3;
                }
                try {
                    int iC14 = s7j.c(cursorN, "show_count");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        String string = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                        String string2 = cursorN.isNull(iC2) ? null : cursorN.getString(iC2);
                        int i = iC;
                        boolean z = cursorN.getInt(iC3) != 0;
                        String string3 = cursorN.isNull(iC4) ? null : cursorN.getString(iC4);
                        byte b2 = (byte) cursorN.getShort(iC5);
                        byte b3 = (byte) cursorN.getShort(iC6);
                        long j = cursorN.getLong(iC7);
                        long j2 = cursorN.getLong(iC8);
                        String string4 = cursorN.isNull(iC9) ? null : cursorN.getString(iC9);
                        byte b4 = (byte) cursorN.getInt(iC10);
                        if (b4 == 0) {
                            b = b2;
                            rk7Var = new sk7((byte) 0);
                        } else {
                            b = b2;
                            if (b4 == 1) {
                                rk7Var = new rk7((byte) 1);
                            } else {
                                tk7Var = new tk7(b4);
                                int i2 = iC14;
                                arrayList.add(new vk7(string, string2, z, string3, b, b3, j, j2, string4, tk7Var, cursorN.getLong(iC11), cursorN.getLong(iC12), cursorN.getLong(iC13), cursorN.getInt(i2)));
                                iC14 = i2;
                                iC = i;
                            }
                        }
                        tk7Var = rk7Var;
                        int i22 = iC14;
                        arrayList.add(new vk7(string, string2, z, string3, b, b3, j, j2, string4, tk7Var, cursorN.getLong(iC11), cursorN.getLong(iC12), cursorN.getLong(iC13), cursorN.getInt(i22)));
                        iC14 = i22;
                        iC = i;
                    }
                    cursorN.close();
                    dsdVar.y();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursorN.close();
                    dsdVar.y();
                    throw th;
                }
            default:
                lrd lrdVar2 = this.c.a;
                dsd dsdVar4 = this.b;
                Cursor cursorN2 = lrdVar2.n(dsdVar4);
                try {
                    int iC15 = s7j.c(cursorN2, "id");
                    int iC16 = s7j.c(cursorN2, "title");
                    int iC17 = s7j.c(cursorN2, "is_title_animated");
                    int iC18 = s7j.c(cursorN2, "description");
                    int iC19 = s7j.c(cursorN2, LogFactory.PRIORITY_KEY);
                    int iC20 = s7j.c(cursorN2, "repeat");
                    int iC21 = s7j.c(cursorN2, "rerun");
                    int iC22 = s7j.c(cursorN2, "animoji_id");
                    int iC23 = s7j.c(cursorN2, KwsFeaturesConfigProviderImpl.URL_KEY);
                    int iC24 = s7j.c(cursorN2, "type");
                    int iC25 = s7j.c(cursorN2, "click_time");
                    int iC26 = s7j.c(cursorN2, "show_time");
                    int iC27 = s7j.c(cursorN2, "close_time");
                    dsdVar2 = dsdVar4;
                    try {
                        int iC28 = s7j.c(cursorN2, "show_count");
                        if (cursorN2.moveToFirst()) {
                            String string5 = cursorN2.isNull(iC15) ? null : cursorN2.getString(iC15);
                            String string6 = cursorN2.isNull(iC16) ? null : cursorN2.getString(iC16);
                            boolean z2 = cursorN2.getInt(iC17) != 0;
                            String string7 = cursorN2.isNull(iC18) ? null : cursorN2.getString(iC18);
                            byte b5 = (byte) cursorN2.getShort(iC19);
                            byte b6 = (byte) cursorN2.getShort(iC20);
                            long j3 = cursorN2.getLong(iC21);
                            long j4 = cursorN2.getLong(iC22);
                            String string8 = cursorN2.isNull(iC23) ? null : cursorN2.getString(iC23);
                            byte b7 = (byte) cursorN2.getInt(iC24);
                            if (b7 == 0) {
                                tk7Var2 = new sk7((byte) 0);
                            } else if (b7 == 1) {
                                rk7Var2 = new rk7((byte) 1);
                                vk7Var = new vk7(string5, string6, z2, string7, b5, b6, j3, j4, string8, rk7Var2, cursorN2.getLong(iC25), cursorN2.getLong(iC26), cursorN2.getLong(iC27), cursorN2.getInt(iC28));
                            } else {
                                tk7Var2 = new tk7(b7);
                            }
                            rk7Var2 = tk7Var2;
                            vk7Var = new vk7(string5, string6, z2, string7, b5, b6, j3, j4, string8, rk7Var2, cursorN2.getLong(iC25), cursorN2.getLong(iC26), cursorN2.getLong(iC27), cursorN2.getInt(iC28));
                        }
                        cursorN2.close();
                        dsdVar2.y();
                        return vk7Var;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorN2.close();
                        dsdVar2.y();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dsdVar2 = dsdVar4;
                }
        }
    }
}
