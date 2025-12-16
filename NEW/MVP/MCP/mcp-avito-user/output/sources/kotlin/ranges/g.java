package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;

/* compiled from: Range.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/g;", "", "T", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface g<T extends Comparable<? super T>> {

    /* compiled from: Range.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@Y61.k g<T> gVar, @Y61.k T t12) {
            return t12.compareTo(gVar.d()) >= 0 && t12.compareTo(gVar.g()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@Y61.k g<T> gVar) {
            return gVar.d().compareTo(gVar.g()) > 0;
        }
    }

    @Y61.k
    T d();

    boolean e(@Y61.k T t12);

    @Y61.k
    T g();

    boolean isEmpty();
}
