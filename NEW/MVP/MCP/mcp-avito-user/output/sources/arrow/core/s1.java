package arrow.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TupleN.kt */
@q2.e
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u0001*\u0006\b\u0005\u0010\u0006 \u0001*\u0006\b\u0006\u0010\u0007 \u0001*\u0006\b\u0007\u0010\b \u0001*\u0006\b\b\u0010\t \u0001*\u0006\b\t\u0010\n \u0001*\u0006\b\n\u0010\u000b \u0001*\u0006\b\u000b\u0010\f \u00012Ø\u0005\u0012\u0081\u0005\u0012þ\u0004\u0012§\u0004\u0012¤\u0004\u0012Ó\u0003\u0012Ð\u0003\u0012\u0085\u0003\u0012\u0082\u0003\u0012½\u0002\u0012º\u0002\u0012û\u0001\u0012ø\u0001\u0012¿\u0001\u0012¼\u0001\u0012\u0089\u0001\u0012\u0086\u0001\u0012Z\u0012X\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00028\u00010\rj\u0014\u0012\u0004\u0012\u00028\f\u0012\u0004\u0012\u00028\r\u0012\u0004\u0012\u00028\u000e`\u000f\u0012\u0004\u0012\u00028\u00020\rj\u001a\u0012\u0004\u0012\u00028\u000f\u0012\u0004\u0012\u00028\u0010\u0012\u0004\u0012\u00028\u0011\u0012\u0004\u0012\u00028\u0012`\u0010\u0012\u0004\u0012\u00028\u00030\rj \u0012\u0004\u0012\u00028\u0013\u0012\u0004\u0012\u00028\u0014\u0012\u0004\u0012\u00028\u0015\u0012\u0004\u0012\u00028\u0016\u0012\u0004\u0012\u00028\u0017`\u0011\u0012\u0004\u0012\u00028\u00040\rj&\u0012\u0004\u0012\u00028\u0018\u0012\u0004\u0012\u00028\u0019\u0012\u0004\u0012\u00028\u001a\u0012\u0004\u0012\u00028\u001b\u0012\u0004\u0012\u00028\u001c\u0012\u0004\u0012\u00028\u001d`\u0012\u0012\u0004\u0012\u00028\u00050\rj,\u0012\u0004\u0012\u00028\u001e\u0012\u0004\u0012\u00028\u001f\u0012\u0004\u0012\u00028 \u0012\u0004\u0012\u00028!\u0012\u0004\u0012\u00028\"\u0012\u0004\u0012\u00028#\u0012\u0004\u0012\u00028$`\u0013\u0012\u0004\u0012\u00028\u00060\rj2\u0012\u0004\u0012\u00028%\u0012\u0004\u0012\u00028&\u0012\u0004\u0012\u00028'\u0012\u0004\u0012\u00028(\u0012\u0004\u0012\u00028)\u0012\u0004\u0012\u00028*\u0012\u0004\u0012\u00028+\u0012\u0004\u0012\u00028,`\u0014\u0012\u0004\u0012\u00028\u00070\rj8\u0012\u0004\u0012\u00028-\u0012\u0004\u0012\u00028.\u0012\u0004\u0012\u00028/\u0012\u0004\u0012\u000280\u0012\u0004\u0012\u000281\u0012\u0004\u0012\u000282\u0012\u0004\u0012\u000283\u0012\u0004\u0012\u000284\u0012\u0004\u0012\u000285`\u0015\u0012\u0004\u0012\u00028\b0\rj>\u0012\u0004\u0012\u000286\u0012\u0004\u0012\u000287\u0012\u0004\u0012\u000288\u0012\u0004\u0012\u000289\u0012\u0004\u0012\u00028:\u0012\u0004\u0012\u00028;\u0012\u0004\u0012\u00028<\u0012\u0004\u0012\u00028=\u0012\u0004\u0012\u00028>\u0012\u0004\u0012\u00028?`\u0016\u0012\u0004\u0012\u00028\t0\rjD\u0012\u0004\u0012\u00028@\u0012\u0004\u0012\u00028A\u0012\u0004\u0012\u00028B\u0012\u0004\u0012\u00028C\u0012\u0004\u0012\u00028D\u0012\u0004\u0012\u00028E\u0012\u0004\u0012\u00028F\u0012\u0004\u0012\u00028G\u0012\u0004\u0012\u00028H\u0012\u0004\u0012\u00028I\u0012\u0004\u0012\u00028J`\u0017\u0012\u0004\u0012\u00028\n0\rjJ\u0012\u0004\u0012\u00028K\u0012\u0004\u0012\u00028L\u0012\u0004\u0012\u00028M\u0012\u0004\u0012\u00028N\u0012\u0004\u0012\u00028O\u0012\u0004\u0012\u00028P\u0012\u0004\u0012\u00028Q\u0012\u0004\u0012\u00028R\u0012\u0004\u0012\u00028S\u0012\u0004\u0012\u00028T\u0012\u0004\u0012\u00028U\u0012\u0004\u0012\u00028V`\u0018\u0012\u0004\u0012\u00028\u000b0\rjJ\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b`\u0019:\u0001\u001a¨\u0006\u001b"}, d2 = {"Larrow/core/s1;", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "Lq2/b;", "Larrow/core/C;", "Larrow/Kind2;", "Larrow/Kind3;", "Larrow/Kind4;", "Larrow/Kind5;", "Larrow/Kind6;", "Larrow/Kind7;", "Larrow/Kind8;", "Larrow/Kind9;", "Larrow/Kind10;", "Larrow/Kind11;", "Larrow/core/Tuple12Of;", "a", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final /* data */ class s1<A, B, C, D, E, F, G, H, I, J, K, L> implements q2.b<q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends q2.b<? extends C, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, L> {

    /* compiled from: TupleN.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/s1$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        ((s1) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Tuple12(a=null, b=null, c=null, d=null, e=null, f=null, g=null, h=null, i=null, j=null, k=null, l=null)";
    }
}
