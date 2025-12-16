package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.Metadata;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43244n extends kotlin.jvm.internal.N implements Y41.l<Throwable, Throwable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Constructor<?> f411924l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43244n(Constructor<?> constructor) {
        super(1);
        this.f411924l = constructor;
    }

    @Override // Y41.l
    public final Throwable invoke(Throwable th2) {
        Throwable th3 = th2;
        return (Throwable) this.f411924l.newInstance(th3.getMessage(), th3);
    }
}
