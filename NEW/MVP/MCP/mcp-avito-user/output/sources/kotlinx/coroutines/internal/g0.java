package kotlinx.coroutines.internal;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.u1;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a0 f411898a = new a0("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<Object, CoroutineContext.Element, Object> f411899b = a.f411902l;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<u1<?>, CoroutineContext.Element, u1<?>> f411900c = b.f411903l;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<m0, CoroutineContext.Element, m0> f411901d = c.f411904l;

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Object, CoroutineContext.Element, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f411902l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            CoroutineContext.Element element2 = element;
            if (!(element2 instanceof u1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/u1;", "found", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "invoke", "(Lkotlinx/coroutines/u1;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlinx/coroutines/u1;", "<no name provided>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<u1<?>, CoroutineContext.Element, u1<?>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f411903l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final u1<?> invoke(u1<?> u1Var, CoroutineContext.Element element) {
            u1<?> u1Var2 = u1Var;
            CoroutineContext.Element element2 = element;
            if (u1Var2 != null) {
                return u1Var2;
            }
            if (element2 instanceof u1) {
                return (u1) element2;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/m0;", VoiceInfo.STATE, "Lkotlin/coroutines/CoroutineContext$Element;", "element", "invoke", "(Lkotlinx/coroutines/internal/m0;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlinx/coroutines/internal/m0;", "<no name provided>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<m0, CoroutineContext.Element, m0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f411904l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final m0 invoke(m0 m0Var, CoroutineContext.Element element) {
            m0 m0Var2 = m0Var;
            CoroutineContext.Element element2 = element;
            if (element2 instanceof u1) {
                u1<Object> u1Var = (u1) element2;
                Object objR = u1Var.R(m0Var2.f411920a);
                int i12 = m0Var2.f411923d;
                m0Var2.f411921b[i12] = objR;
                m0Var2.f411923d = i12 + 1;
                m0Var2.f411922c[i12] = u1Var;
            }
            return m0Var2;
        }
    }

    public static final void a(@Y61.k CoroutineContext coroutineContext, @Y61.l Object obj) {
        if (obj == f411898a) {
            return;
        }
        if (!(obj instanceof m0)) {
            ((u1) coroutineContext.fold(null, f411900c)).o(obj);
            return;
        }
        m0 m0Var = (m0) obj;
        u1<Object>[] u1VarArr = m0Var.f411922c;
        int length = u1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i12 = length - 1;
            u1VarArr[length].o(m0Var.f411921b[length]);
            if (i12 < 0) {
                return;
            } else {
                length = i12;
            }
        }
    }

    @Y61.l
    public static final Object b(@Y61.k CoroutineContext coroutineContext, @Y61.l Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, f411899b);
        }
        return obj == 0 ? f411898a : obj instanceof Integer ? coroutineContext.fold(new m0(((Number) obj).intValue(), coroutineContext), f411901d) : ((u1) obj).R(coroutineContext);
    }
}
