package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class ja3 {
    public static final ja3 b = new ja3(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ja3(int i) {
        this.a = i;
    }

    public final void a(pk6 pk6Var) throws SQLException {
        switch (this.a) {
            case 0:
                pk6Var.l();
                try {
                    pk6Var.Q("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - q4i.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    pk6Var.l0();
                    return;
                } finally {
                    pk6Var.P();
                }
            default:
                if (((SQLiteDatabase) pk6Var.b).isWriteAheadLoggingEnabled()) {
                    pk6Var.Q("PRAGMA synchronous = NORMAL");
                    return;
                }
                return;
        }
    }
}
