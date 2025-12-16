package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* loaded from: classes2.dex */
public abstract class u06 implements s06 {
    public final y8g a;
    public final m81 b;
    public final y6d c;
    public boolean d;
    public int e = 1;
    public Long f;

    public u06(y8g y8gVar, m81 m81Var, y6d y6dVar) {
        this.a = y8gVar;
        this.b = m81Var;
        this.c = y6dVar;
    }

    @Override // defpackage.s06
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.s06
    public void d(vdf vdfVar) {
        String str;
        if (this.d) {
            return;
        }
        Long l = this.f;
        if (l == null) {
            this.c.log(g(), "Data is received but accept event wasn't triggered");
            return;
        }
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(this.a.getMsSinceBoot() - l.longValue());
        switch (f()) {
            case 1:
                str = "";
                break;
            case 2:
                str = "direct_outgoing";
                break;
            case 3:
                str = "direct_incoming";
                break;
            case 4:
                str = "server_incoming";
                break;
            case 5:
                str = "server_join_server";
                break;
            case 6:
                str = "server_change_topology";
                break;
            case 7:
                str = "direct_join";
                break;
            default:
                throw null;
        }
        ((n81) this.b).c("first_media_received", eventItemValue, new EventItemsMap((Map<String, ? extends EventItemValue>) Collections.singletonMap("call_type", EventItemValueKt.toEventItemValue(str))));
        this.d = true;
    }

    public int f() {
        return this.e;
    }

    public abstract String g();

    public final void h() {
        this.f = Long.valueOf(this.a.getMsSinceBoot());
    }
}
