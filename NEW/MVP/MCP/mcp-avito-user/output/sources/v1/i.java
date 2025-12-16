package V1;

import V1.h;
import android.database.Cursor;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TableInfo.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {
    public static final List<h.e> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME);
        int columnIndex4 = cursor.getColumnIndex(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME);
        kotlin.collections.builders.b bVarT = C42745f0.t();
        while (cursor.moveToNext()) {
            bVarT.add(new h.e(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        return C42745f0.A0(C42745f0.p(bVarT));
    }

    public static final h.f b(androidx.sqlite.db.framework.b bVar, String str, boolean z12) {
        Cursor cursorR5 = bVar.R5("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = cursorR5;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i12 = cursor.getInt(columnIndex);
                        String string = cursor.getString(columnIndex3);
                        String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i12), string);
                        treeMap2.put(Integer.valueOf(i12), str2);
                    }
                }
                h.f fVar = new h.f(str, z12, C42745f0.M0(treeMap.values()), C42745f0.M0(treeMap2.values()));
                kotlin.io.c.a(cursorR5, null);
                return fVar;
            }
            kotlin.io.c.a(cursorR5, null);
            return null;
        } finally {
        }
    }
}
