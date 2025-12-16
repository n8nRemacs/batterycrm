package kotlin.reflect;

import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: KProperty.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/o;", "V", "Lkotlin/reflect/n;", "Lkotlin/Function0;", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface o<V> extends n<V>, Y41.a<V> {

    /* compiled from: KProperty.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/o$b;", "V", "Lkotlin/reflect/n$c;", "Lkotlin/Function0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b<V> extends n.c<V>, Y41.a<V> {
    }

    V get();

    @Override // kotlin.reflect.n
    @Y61.k
    b<V> getGetter();
}
