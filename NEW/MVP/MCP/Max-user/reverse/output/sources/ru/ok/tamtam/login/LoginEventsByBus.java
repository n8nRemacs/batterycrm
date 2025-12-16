package ru.ok.tamtam.login;

import androidx.annotation.Keep;
import defpackage.d7j;
import defpackage.gbd;
import defpackage.jve;
import defpackage.kve;
import defpackage.lzf;
import defpackage.ph8;
import defpackage.q2b;
import defpackage.qh8;
import defpackage.svi;
import defpackage.tw0;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/login/LoginEventsByBus;", "Lqh8;", "Lph8;", "event", "Lqqg;", "onEvent", "(Lph8;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LoginEventsByBus implements qh8 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public LoginEventsByBus(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).c().getImmediate());
        tw0Var.d(this);
    }

    @Keep
    @vnf
    public final void onEvent(ph8 event) {
        svi.e(this.b, null, null, new a(this, event, null), 3);
    }

    @Override // defpackage.qh8
    public final gbd stream() {
        return new gbd(this.a);
    }
}
