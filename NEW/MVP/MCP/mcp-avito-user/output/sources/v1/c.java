package V1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DBUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
@RestrictTo
/* loaded from: classes10.dex */
public final class c {
    public static final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        kotlin.collections.builders.b bVarT = C42745f0.t();
        Cursor cursorR5 = bVar.R5("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = cursorR5;
            while (cursor.moveToNext()) {
                bVarT.add(cursor.getString(0));
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(cursorR5, null);
            ListIterator listIterator = C42745f0.p(bVarT).listIterator(0);
            while (listIterator.hasNext()) {
                String str = (String) listIterator.next();
                if (C43066x.h0(str, "room_fts_content_sync_", false)) {
                    bVar.P4("DROP TRIGGER IF EXISTS ".concat(str));
                }
            }
        } finally {
        }
    }

    @Y61.k
    public static final Cursor b(@Y61.k RoomDatabase roomDatabase, @Y61.k Z1.g gVar, boolean z12) {
        Cursor cursorP = roomDatabase.p(gVar);
        if (z12 && (cursorP instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorP;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorP.getColumnNames(), cursorP.getCount());
                    while (cursorP.moveToNext()) {
                        Object[] objArr = new Object[cursorP.getColumnCount()];
                        int columnCount = cursorP.getColumnCount();
                        for (int i12 = 0; i12 < columnCount; i12++) {
                            int type = cursorP.getType(i12);
                            if (type == 0) {
                                objArr[i12] = null;
                            } else if (type == 1) {
                                objArr[i12] = Long.valueOf(cursorP.getLong(i12));
                            } else if (type == 2) {
                                objArr[i12] = Double.valueOf(cursorP.getDouble(i12));
                            } else if (type == 3) {
                                objArr[i12] = cursorP.getString(i12);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i12] = cursorP.getBlob(i12);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    kotlin.io.c.a(cursorP, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorP;
    }
}
