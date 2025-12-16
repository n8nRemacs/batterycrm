package com.google.android.gms.common.api;

import com.google.android.gms.common.api.r;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class m<R extends r> {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    public interface a {
        @RX0.a
        void a(@N Status status);
    }

    @RX0.a
    public void addStatusListener(@N a aVar) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    @N
    public abstract R await();

    @ResultIgnorabilityUnspecified
    @N
    public abstract R await(long j12, @N TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@N s<? super R> sVar);

    public abstract void setResultCallback(@N s<? super R> sVar, long j12, @N TimeUnit timeUnit);

    @N
    public <S extends r> v<S> then(@N u<? super R, ? extends S> uVar) {
        throw new UnsupportedOperationException();
    }
}
