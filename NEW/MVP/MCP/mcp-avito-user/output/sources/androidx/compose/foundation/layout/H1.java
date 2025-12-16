package androidx.compose.foundation.layout;

import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlowLayoutOverflow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/H1;", "Lkotlin/C;", "", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H1 implements InterfaceC42726C<Integer> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f28305b;

    /* renamed from: c, reason: collision with root package name */
    public int f28306c = -1;

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/H1$a;", "", "<init>", "()V", "", "UNINITIALIZED_VALUE", "I", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H1(@Y61.k Y41.a aVar) {
        this.f28305b = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.InterfaceC42726C
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer getValue() {
        if (this.f28306c == -1) {
            this.f28306c = ((Number) this.f28305b.invoke()).intValue();
        }
        int i12 = this.f28306c;
        if (i12 != -1) {
            return Integer.valueOf(i12);
        }
        throw new IllegalStateException("Lazy item is not yet initialized");
    }

    @Override // kotlin.InterfaceC42726C
    public final boolean isInitialized() {
        return this.f28306c != -1;
    }

    @Y61.k
    public final String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : "Lazy item is not yet initialized";
    }
}
