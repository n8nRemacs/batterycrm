package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.text.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectionController.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/p;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class p {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f31686c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final p f31687d = new p(null, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final A f31688a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final o0 f31689b;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/modifiers/p$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.l A a12, @Y61.l o0 o0Var) {
        this.f31688a = a12;
        this.f31689b = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.layout.A] */
    public static p a(p pVar, AbstractC22443w0 abstractC22443w0, o0 o0Var, int i12) {
        AbstractC22443w0 abstractC22443w02 = abstractC22443w0;
        if ((i12 & 1) != 0) {
            abstractC22443w02 = pVar.f31688a;
        }
        if ((i12 & 2) != 0) {
            o0Var = pVar.f31689b;
        }
        pVar.getClass();
        return new p(abstractC22443w02, o0Var);
    }
}
