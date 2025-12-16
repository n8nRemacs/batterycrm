package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class yl6 {
    public static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set b;
    public final Set c;

    public yl6(String str, AbstractSet abstractSet, Set set) {
        this.a = str;
        this.b = abstractSet;
        this.c = set;
    }

    public static final yl6 a(pk6 pk6Var, String str) throws IOException {
        bke bkeVar = new bke();
        Cursor cursorK0 = pk6Var.k0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorK0.getColumnCount() > 0) {
                int columnIndex = cursorK0.getColumnIndex(SdkMetricStatEvent.NAME_KEY);
                while (cursorK0.moveToNext()) {
                    bkeVar.add(cursorK0.getString(columnIndex));
                }
            }
            cursorK0.close();
            bke bkeVarA = gke.a(bkeVar);
            cursorK0 = pk6Var.k0("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String string = cursorK0.moveToFirst() ? cursorK0.getString(cursorK0.getColumnIndexOrThrow("sql")) : "";
                cursorK0.close();
                return new yl6(str, bkeVarA, so8.c(string));
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl6)) {
            return false;
        }
        yl6 yl6Var = (yl6) obj;
        if (fni.a(this.a, yl6Var.a) && fni.a(this.b, yl6Var.b)) {
            return fni.a(this.c, yl6Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + "'}";
    }

    public yl6(String str, HashSet hashSet, String str2) {
        this(str, hashSet, so8.c(str2));
    }
}
