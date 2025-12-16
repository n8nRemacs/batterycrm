package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExceptionsConstructor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43245o extends kotlin.jvm.internal.N implements Y41.l<Throwable, Throwable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Constructor<?> f411926l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43245o(Constructor<?> constructor) {
        super(1);
        this.f411926l = constructor;
    }

    @Override // Y41.l
    public final Throwable invoke(Throwable th2) {
        Throwable th3 = th2;
        Throwable th4 = (Throwable) this.f411926l.newInstance(th3.getMessage());
        th4.initCause(th3);
        return th4;
    }
}
