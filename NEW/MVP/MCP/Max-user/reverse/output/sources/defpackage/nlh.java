package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class nlh implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ qlh c;

    public /* synthetic */ nlh(qlh qlhVar, dsd dsdVar, int i) {
        this.a = i;
        this.c = qlhVar;
        this.b = dsdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [umh] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorN;
        boolean z;
        switch (this.a) {
            case 0:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "user_id");
                    int iC3 = s7j.c(cursorN, "bot_id");
                    int iC4 = s7j.c(cursorN, ApiProtocol.KEY_TOKEN);
                    int iC5 = s7j.c(cursorN, "access_requested");
                    int iC6 = s7j.c(cursorN, "access_granted");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        long j = cursorN.getLong(iC);
                        long j2 = cursorN.getLong(iC2);
                        long j3 = cursorN.getLong(iC3);
                        String string = cursorN.isNull(iC4) ? null : cursorN.getString(iC4);
                        boolean z2 = true;
                        if (cursorN.getInt(iC5) != 0) {
                            z = true;
                        } else {
                            z = true;
                            z2 = false;
                        }
                        arrayList.add(new umh(j, j2, j3, string, z2, cursorN.getInt(iC6) != 0 ? z : false));
                    }
                    return arrayList;
                } finally {
                }
            default:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC7 = s7j.c(cursorN, "id");
                    int iC8 = s7j.c(cursorN, "user_id");
                    int iC9 = s7j.c(cursorN, "bot_id");
                    int iC10 = s7j.c(cursorN, ApiProtocol.KEY_TOKEN);
                    int iC11 = s7j.c(cursorN, "access_requested");
                    int iC12 = s7j.c(cursorN, "access_granted");
                    if (cursorN.moveToFirst()) {
                        umhVar = new umh(cursorN.getLong(iC7), cursorN.getLong(iC8), cursorN.getLong(iC9), cursorN.isNull(iC10) ? null : cursorN.getString(iC10), cursorN.getInt(iC11) != 0, cursorN.getInt(iC12) != 0);
                    }
                    return umhVar;
                } finally {
                }
        }
    }
}
