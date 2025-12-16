package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43248s extends kotlin.jvm.internal.N implements Y41.l<Throwable, Throwable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f411930l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43248s(Y41.l<? super Throwable, ? extends Throwable> lVar) {
        super(1);
        this.f411930l = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Throwable invoke(Throwable th2) {
        Object bVar;
        Throwable th3 = th2;
        ?? r02 = this.f411930l;
        try {
            int i12 = kotlin.Z.f406624c;
            Throwable th4 = (Throwable) r02.invoke(th3);
            boolean zF2 = kotlin.jvm.internal.L.f(th3.getMessage(), th4.getMessage());
            bVar = th4;
            if (!zF2) {
                boolean zF3 = kotlin.jvm.internal.L.f(th4.getMessage(), th3.toString());
                bVar = th4;
                if (!zF3) {
                    bVar = null;
                }
            }
        } catch (Throwable th5) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th5);
        }
        return (Throwable) (bVar instanceof Z.b ? null : bVar);
    }
}
