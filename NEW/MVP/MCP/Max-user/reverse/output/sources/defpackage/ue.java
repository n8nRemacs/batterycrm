package defpackage;

import android.database.Cursor;
import android.view.View;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ue(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public bke a() throws IOException {
        oq7 oq7Var = (oq7) this.b;
        bke bkeVar = new bke();
        String str = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
        Object obj = null;
        Cursor cursorN = oq7Var.a.n(new aqc(str, obj, false, 5));
        while (cursorN.moveToNext()) {
            try {
                bkeVar.add(Integer.valueOf(cursorN.getInt(0)));
            } finally {
            }
        }
        cursorN.close();
        bke bkeVarA = gke.a(bkeVar);
        if (bkeVarA.a.isEmpty()) {
            return bkeVarA;
        }
        if (((oq7) this.b).h == null) {
            throw new IllegalStateException("Required value was null.");
        }
        vk6 vk6Var = ((oq7) this.b).h;
        if (vk6Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        vk6Var.w();
        return bkeVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue.run():void");
    }

    public /* synthetic */ ue(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
