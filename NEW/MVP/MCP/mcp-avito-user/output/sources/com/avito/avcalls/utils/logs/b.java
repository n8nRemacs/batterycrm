package com.avito.avcalls.utils.logs;

import Y61.k;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LogsWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/utils/logs/c;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f333694a = C42727D.c(new a());

    /* compiled from: LogsWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/utils/logs/a;", "invoke", "()Lcom/avito/avcalls/utils/logs/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.avcalls.utils.logs.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.avcalls.utils.logs.a invoke() {
            return new com.avito.avcalls.utils.logs.a(b.this.G() + "_wrp");
        }
    }

    @k
    public final com.avito.avcalls.utils.logs.a F() {
        return (com.avito.avcalls.utils.logs.a) this.f333694a.getValue();
    }

    @k
    public abstract String G();

    @k
    public final String toString() {
        return g().toString();
    }

    @Override // com.avito.avcalls.utils.logs.c
    @k
    public Object g() {
        return this;
    }
}
