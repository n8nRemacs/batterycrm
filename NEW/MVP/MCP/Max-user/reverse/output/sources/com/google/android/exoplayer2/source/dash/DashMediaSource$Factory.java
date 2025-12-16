package com.google.android.exoplayer2.source.dash;

import androidx.work.WorkRequest;
import defpackage.a3b;
import defpackage.lcj;
import defpackage.ne4;
import defpackage.rha;
import defpackage.tl4;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory {
    public final a3b a;
    public final ne4 b;
    public final tl4 c = new tl4();
    public final rha e = new rha(18);
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public final lcj d = new lcj(17);

    public DashMediaSource$Factory(ne4 ne4Var) {
        this.a = new a3b(14, ne4Var);
        this.b = ne4Var;
    }
}
