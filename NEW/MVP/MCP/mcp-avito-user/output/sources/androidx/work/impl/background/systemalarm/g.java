package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.impl.InterfaceC23590u;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.H;
import androidx.work.impl.model.o0;
import j.N;

/* compiled from: SystemAlarmScheduler.java */
@RestrictTo
/* loaded from: classes10.dex */
public class g implements InterfaceC23590u {
    static {
        G.b("SystemAlarmScheduler");
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final void h(@N String str) {
        int i12 = b.f55606g;
        Intent intent = new Intent((Context) null, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        throw null;
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final boolean i() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final void j(@N H... hArr) {
        if (hArr.length <= 0) {
            return;
        }
        H h12 = hArr[0];
        G gA2 = G.a();
        String str = h12.f55795a;
        gA2.getClass();
        C23580w c23580wA = o0.a(h12);
        int i12 = b.f55606g;
        Intent intent = new Intent((Context) null, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        b.c(intent, c23580wA);
        throw null;
    }
}
