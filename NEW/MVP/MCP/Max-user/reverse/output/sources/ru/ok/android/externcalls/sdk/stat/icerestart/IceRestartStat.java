package ru.ok.android.externcalls.sdk.stat.icerestart;

import defpackage.cm6;
import defpackage.m81;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/icerestart/IceRestartStat;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "Lqqg;", "onIceRestart", "()V", "Lcm6;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IceRestartStat {
    private final cm6 getEventualStatSender;

    public IceRestartStat(cm6 cm6Var) {
        this.getEventualStatSender = cm6Var;
    }

    public final void onIceRestart() {
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            m81.a(m81Var, "ice_restart", null, null, 6);
        }
    }
}
