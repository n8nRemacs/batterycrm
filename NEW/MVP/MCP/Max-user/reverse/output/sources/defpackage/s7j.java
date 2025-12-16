package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.Size;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public abstract class s7j {
    public static void a(Context context, z7c z7cVar) {
        context.getResources();
        int i = t9d.a;
        l5c l5cVar = z7cVar.b;
        l5cVar.getClass();
        t9d.a = (int) l5cVar.m(PmsKey.f126reactionsmax, 8);
        t9d.b = new Size(160, 160);
        z7cVar.b.getClass();
        Set set = Collections.EMPTY_SET;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext() && !dnf.l("REACTION_BADGE", (CharSequence) it.next())) {
            }
        }
        int i2 = t9d.a;
        Set set2 = Collections.EMPTY_SET;
        if (!set2.isEmpty()) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext() && !dnf.l("REACTION_SELECT_PANEL", (CharSequence) it2.next())) {
            }
        }
        int i3 = t9d.a;
    }

    public static final int b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int c(Cursor cursor, String str) {
        String strA;
        int iB = b(cursor, str);
        if (iB >= 0) {
            return iB;
        }
        try {
            strA = ys.A(cursor.getColumnNames(), null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strA = "unknown";
        }
        throw new IllegalArgumentException(wy1.i("column '", str, "' does not exist. Available columns: ", strA));
    }
}
