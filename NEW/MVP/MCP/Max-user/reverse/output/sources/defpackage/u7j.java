package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u7j {
    public static final void a(pk6 pk6Var) throws IOException, SQLException {
        o98 o98VarD = ve3.d();
        Cursor cursorK0 = pk6Var.k0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorK0.moveToNext()) {
            try {
                o98VarD.add(cursorK0.getString(0));
            } finally {
            }
        }
        cursorK0.close();
        ListIterator listIterator = ve3.a(o98VarD).listIterator(0);
        while (true) {
            m98 m98Var = (m98) listIterator;
            if (!m98Var.hasNext()) {
                return;
            }
            String str = (String) m98Var.next();
            if (dnf.r(str, "room_fts_content_sync_", false)) {
                pk6Var.Q("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final void b(pk6 pk6Var) throws IOException {
        Cursor cursorK0 = pk6Var.k0("PRAGMA foreign_key_check(`messages`)");
        try {
            if (cursorK0.getCount() > 0) {
                throw new SQLiteConstraintException(c(cursorK0));
            }
            cursorK0.close();
        } finally {
        }
    }

    public static final String c(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, cursor.getString(2));
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(count);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ho7.r(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final Cursor d(WorkDatabase_Impl workDatabase_Impl, rrf rrfVar) throws IOException {
        Cursor cursorN = workDatabase_Impl.n(rrfVar);
        if (cursorN instanceof AbstractWindowedCursor) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorN;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorN.getColumnNames(), cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        Object[] objArr = new Object[cursorN.getColumnCount()];
                        int columnCount = cursorN.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorN.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorN.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorN.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorN.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorN.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorN.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorN;
    }
}
