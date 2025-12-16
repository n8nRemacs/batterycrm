package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.C42833p;
import kotlin.Metadata;

/* compiled from: Recomposer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22110j2 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Recomposer f38480l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f38481m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22110j2(Recomposer recomposer, Throwable th2) {
        super(1);
        this.f38480l = recomposer;
        this.f38481m = th2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        Recomposer recomposer = this.f38480l;
        Object obj = recomposer.f38109b;
        Throwable th4 = this.f38481m;
        synchronized (obj) {
            if (th4 == null) {
                th4 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        C42833p.a(th4, th3);
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            recomposer.f38111d = th4;
            recomposer.f38128u.setValue(Recomposer.State.f38132b);
        }
        return kotlin.G0.f406611a;
    }
}
