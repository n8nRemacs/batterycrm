package com.avito.android.messenger.service.user_last_activity;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import p41.AbstractC46895b;

/* compiled from: Observables.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "KeyT", "EventT", "OutT", "Lp41/b;", "groupedObs", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/rx3/o0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class k<T, R> implements l41.o {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC46895b abstractC46895b = (AbstractC46895b) obj;
        return ((String) abstractC46895b.f428195b) != null ? abstractC46895b.D0(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b) : abstractC46895b;
    }
}
