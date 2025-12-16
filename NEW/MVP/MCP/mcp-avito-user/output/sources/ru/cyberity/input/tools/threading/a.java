package ru.cyberity.input.tools.threading;

import Y61.k;
import androidx.compose.ui.RunnableC22211b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: AnotherThread.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "block", "Lkotlin/Z;", "a", "(LY41/a;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {
    @k
    public static final Object a(@k Y41.a<G0> aVar) {
        try {
            int i12 = Z.f406624c;
            b.b().submit(new RunnableC22211b(15, aVar));
            return G0.f406611a;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            return new Z.b(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Y41.a aVar) {
        aVar.invoke();
    }
}
