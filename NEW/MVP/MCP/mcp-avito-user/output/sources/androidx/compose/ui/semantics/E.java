package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: SemanticsProperties.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/E;", "T", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f41722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<T, T, T> f41723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41724c;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<T, T, T> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41725l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final T invoke(T t12, T t13) {
            return t12 == null ? t13 : t12;
        }
    }

    public E(@Y61.k Y41.p pVar, @Y61.k String str) {
        this.f41722a = str;
        this.f41723b = pVar;
    }

    @Y61.k
    public final String toString() {
        return "AccessibilityKey: " + this.f41722a;
    }

    public /* synthetic */ E(String str, Y41.p pVar, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? a.f41725l : pVar, str);
    }

    public E(@Y61.k String str, boolean z12, @Y61.k Y41.p<? super T, ? super T, ? extends T> pVar) {
        this(pVar, str);
        this.f41724c = z12;
    }
}
