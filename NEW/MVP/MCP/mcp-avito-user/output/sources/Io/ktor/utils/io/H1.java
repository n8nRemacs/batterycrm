package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ExceptionUtilsJvm.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "io/ktor/utils/io/L1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class H1 extends kotlin.jvm.internal.N implements Y41.l<Throwable, Throwable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Constructor f400631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(Constructor constructor) {
        super(1);
        this.f400631l = constructor;
    }

    @Override // Y41.l
    public final Throwable invoke(Throwable th2) {
        Object bVar;
        Throwable th3 = th2;
        try {
            int i12 = kotlin.Z.f406624c;
            bVar = (Throwable) this.f400631l.newInstance(th3.getMessage(), th3);
        } catch (Throwable th4) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th4);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (Throwable) bVar;
    }
}
