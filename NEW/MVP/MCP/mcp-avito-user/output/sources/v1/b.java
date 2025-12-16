package V1;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: CursorUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
@RestrictTo
/* loaded from: classes10.dex */
public final class b {
    public static final int a(@Y61.k Cursor cursor, @Y61.k String str) {
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

    public static final int b(@Y61.k Cursor cursor, @Y61.k String str) {
        String strP;
        int iA2 = a(cursor, str);
        if (iA2 >= 0) {
            return iA2;
        }
        try {
            strP = C42756l.P(cursor.getColumnNames(), null, null, null, null, 63);
        } catch (Exception unused) {
            strP = "unknown";
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("column '", str, "' does not exist. Available columns: ", strP));
    }
}
