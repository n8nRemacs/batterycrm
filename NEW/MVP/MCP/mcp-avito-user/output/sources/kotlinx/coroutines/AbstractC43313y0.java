package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/M;", "Ljava/io/Closeable;", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43313y0 extends M implements Closeable {

    /* compiled from: Executors.kt */
    @InterfaceC43017s
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/y0$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/M;", "Lkotlinx/coroutines/y0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.y0$a */
    public static final class a extends AbstractCoroutineContextKey<M, AbstractC43313y0> {

        /* compiled from: Executors.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "Lkotlinx/coroutines/y0;", "invoke", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlinx/coroutines/y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlinx.coroutines.y0$a$a, reason: collision with other inner class name */
        public static final class C11740a extends kotlin.jvm.internal.N implements Y41.l<CoroutineContext.Element, AbstractC43313y0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11740a f412304l = new C11740a();

            public C11740a() {
                super(1);
            }

            @Override // Y41.l
            public final AbstractC43313y0 invoke(CoroutineContext.Element element) {
                CoroutineContext.Element element2 = element;
                if (element2 instanceof AbstractC43313y0) {
                    return (AbstractC43313y0) element2;
                }
                return null;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            super(M.f410711b, C11740a.f412304l);
        }
    }

    static {
        new a(null);
    }

    @Y61.k
    /* renamed from: y */
    public abstract Executor getF412305c();
}
