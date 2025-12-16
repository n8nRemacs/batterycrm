package ru.ok.android.externcalls.sdk.stat.internal;

import defpackage.cm6;
import defpackage.em6;
import defpackage.m81;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "Lkotlin/Function1;", "Lqqg;", "block", "reportOnce", "(Lem6;)V", "Lcm6;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SingleShotStat {
    private final cm6 getEventualStatSender;
    private final AtomicBoolean isReported = new AtomicBoolean(false);

    public SingleShotStat(cm6 cm6Var) {
        this.getEventualStatSender = cm6Var;
    }

    public final void reportOnce(em6 block) {
        m81 m81Var;
        if (!this.isReported.compareAndSet(false, true) || (m81Var = (m81) this.getEventualStatSender.invoke()) == null) {
            return;
        }
        block.invoke(m81Var);
    }
}
