package kotlinx.coroutines.internal;

import defpackage.k42;
import defpackage.lm4;
import defpackage.ms4;
import defpackage.qqg;
import defpackage.sy4;
import defpackage.x74;
import defpackage.z74;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\bH\u0097A¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/NamedDispatcher;", "Lz74;", "Lms4;", "dispatcher", "", SdkMetricStatEvent.NAME_KEY, "<init>", "(Lz74;Ljava/lang/String;)V", "", "timeMillis", "Lk42;", "Lqqg;", "continuation", "scheduleResumeAfterDelay", "(JLk42;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lx74;", "context", "Lsy4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lx74;)Lsy4;", "", "isDispatchNeeded", "(Lx74;)Z", "dispatch", "(Lx74;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "time", "delay", "(J)V", "Lz74;", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NamedDispatcher extends z74 implements ms4 {
    private final /* synthetic */ ms4 $$delegate_0;
    private final z74 dispatcher;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedDispatcher(z74 z74Var, String str) {
        ms4 ms4Var = z74Var instanceof ms4 ? (ms4) z74Var : null;
        this.$$delegate_0 = ms4Var == null ? lm4.a : ms4Var;
        this.dispatcher = z74Var;
        this.name = str;
    }

    @Override // defpackage.ms4
    public Object delay(long j, Continuation<? super qqg> continuation) {
        return this.$$delegate_0.delay(j, continuation);
    }

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public void mo13dispatch(x74 context, Runnable block) {
        this.dispatcher.mo13dispatch(context, block);
    }

    @Override // defpackage.z74
    public void dispatchYield(x74 context, Runnable block) {
        this.dispatcher.dispatchYield(context, block);
    }

    @Override // defpackage.ms4
    public sy4 invokeOnTimeout(long timeMillis, Runnable block, x74 context) {
        return this.$$delegate_0.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // defpackage.z74
    public boolean isDispatchNeeded(x74 context) {
        return this.dispatcher.isDispatchNeeded(context);
    }

    @Override // defpackage.ms4
    /* renamed from: scheduleResumeAfterDelay */
    public void mo14scheduleResumeAfterDelay(long timeMillis, k42 continuation) {
        this.$$delegate_0.mo14scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // defpackage.z74
    /* renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }
}
