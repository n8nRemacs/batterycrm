package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* loaded from: classes.dex */
public final class ob4 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob4(kub kubVar, Handler handler) {
        super(handler);
        this.b = kubVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
            default:
                return super.deliverSelfNotifications();
            case 2:
                return false;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        Object value;
        switch (this.a) {
            case 0:
                eqf eqfVar = (eqf) this.b;
                if (eqfVar.b && (cursor = eqfVar.c) != null && !cursor.isClosed()) {
                    eqfVar.a = eqfVar.c.requery();
                    break;
                }
                break;
            case 1:
                wqi.c(bj7.D0, "ContentObserver: on content changed", new Object[0]);
                ((bj7) this.b).d();
                break;
            default:
                wqi.c("Phonebook", "contact observer onChange", new Object[0]);
                kub kubVar = (kub) this.b;
                tcf tcfVar = kubVar.s0;
                do {
                    value = tcfVar.getValue();
                    ((Number) value).intValue();
                } while (!tcfVar.c(value, Integer.valueOf(kubVar.Z.incrementAndGet())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob4(eqf eqfVar) {
        super(new Handler());
        this.b = eqfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob4(bj7 bj7Var) {
        super(null);
        this.b = bj7Var;
    }
}
