package kotlinx.coroutines.internal;

import defpackage.k42;
import defpackage.ms4;
import defpackage.q8j;
import defpackage.qqg;
import defpackage.sy4;
import defpackage.tk4;
import defpackage.u45;
import defpackage.wl8;
import defpackage.x74;
import defpackage.z74;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010,\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lwl8;", "Lms4;", "", "cause", "", "errorHint", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "missing", "()Ljava/lang/Void;", "Lx74;", "context", "", "isDispatchNeeded", "(Lx74;)Z", "", "parallelism", SdkMetricStatEvent.NAME_KEY, "Lz74;", "limitedParallelism", "(ILjava/lang/String;)Lz74;", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lsy4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lx74;)Lsy4;", "dispatch", "(Lx74;Ljava/lang/Runnable;)Ljava/lang/Void;", "Lk42;", "Lqqg;", "continuation", "scheduleResumeAfterDelay", "(JLk42;)Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "Ljava/lang/String;", "getImmediate", "()Lwl8;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class MissingMainCoroutineDispatcher extends wl8 implements ms4 {
    private final Throwable cause;
    private final String errorHint;

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    private final Void missing() {
        String strConcat;
        if (this.cause == null) {
            MainDispatchersKt.throwMissingMainDispatcherException();
            throw new KotlinNothingValueException();
        }
        String str = this.errorHint;
        if (str == null || (strConcat = ". ".concat(str)) == null) {
            strConcat = "";
        }
        throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(strConcat), this.cause);
    }

    @Override // defpackage.ms4
    public Object delay(long j, Continuation<? super qqg> continuation) {
        return q8j.a(this, j, continuation);
    }

    @Override // defpackage.wl8
    public wl8 getImmediate() {
        return this;
    }

    @Override // defpackage.ms4
    public sy4 invokeOnTimeout(long timeMillis, Runnable block, x74 context) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.z74
    public boolean isDispatchNeeded(x74 context) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.wl8, defpackage.z74
    public z74 limitedParallelism(int parallelism, String name) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.wl8, defpackage.z74
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        return u45.l(sb, str, ']');
    }

    @Override // defpackage.z74
    /* renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo13dispatch(x74 context, Runnable block) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.ms4
    /* renamed from: scheduleResumeAfterDelay, reason: merged with bridge method [inline-methods] */
    public Void mo14scheduleResumeAfterDelay(long timeMillis, k42 continuation) {
        missing();
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i, tk4 tk4Var) {
        this(th, (i & 2) != 0 ? null : str);
    }
}
