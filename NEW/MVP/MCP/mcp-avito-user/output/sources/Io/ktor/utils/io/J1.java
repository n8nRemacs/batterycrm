package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ExceptionUtilsJvm.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "io/ktor/utils/io/L1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class J1 extends kotlin.jvm.internal.N implements Y41.l<Throwable, Throwable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Constructor f400653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(Constructor constructor) {
        super(1);
        this.f400653l = constructor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final Throwable invoke(Throwable th2) {
        Z.b bVar;
        Throwable th3 = th2;
        try {
            int i12 = kotlin.Z.f406624c;
            Throwable th4 = (Throwable) this.f400653l.newInstance(th3.getMessage());
            th4.initCause(th3);
            bVar = th4;
        } catch (Throwable th5) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th5);
        }
        boolean z12 = bVar instanceof Z.b;
        Object obj = bVar;
        if (z12) {
            obj = null;
        }
        return (Throwable) obj;
    }
}
