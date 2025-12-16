package defpackage;

import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes.dex */
public abstract class cn8 {
    public static volatile Handler a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static void a(ti6 ti6Var, int i, FrgBase frgBase, String str) {
        ti6Var.getClass();
        ue0 ue0Var = new ue0(ti6Var);
        ue0Var.f(i, frgBase, str, 1);
        ue0Var.d(false);
    }

    public static Handler b() {
        if (a != null) {
            return a;
        }
        synchronized (cn8.class) {
            try {
                if (a == null) {
                    a = guf.h(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        o98 o98VarD = ve3.d();
        while (cursor.moveToNext()) {
            o98VarD.add(new oyf(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        return ue3.W(ve3.a(o98VarD));
    }

    public static final pyf d(pk6 pk6Var, String str, boolean z) throws IOException {
        Cursor cursorK0 = pk6Var.k0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorK0.getColumnIndex("seqno");
            int columnIndex2 = cursorK0.getColumnIndex("cid");
            int columnIndex3 = cursorK0.getColumnIndex(SdkMetricStatEvent.NAME_KEY);
            int columnIndex4 = cursorK0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorK0.moveToNext()) {
                    if (cursorK0.getInt(columnIndex2) >= 0) {
                        int i = cursorK0.getInt(columnIndex);
                        String string = cursorK0.getString(columnIndex3);
                        String str2 = cursorK0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                pyf pyfVar = new pyf(str, z, ue3.d0(treeMap.values()), ue3.d0(treeMap2.values()));
                cursorK0.close();
                return pyfVar;
            }
            cursorK0.close();
            return null;
        } finally {
        }
    }
}
