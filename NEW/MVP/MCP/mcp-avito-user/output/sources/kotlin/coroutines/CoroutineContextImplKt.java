package kotlin.coroutines;

import Y61.k;
import Y61.l;
import kotlin.InterfaceC42733c0;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoroutineContextImplKt {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC43017s
    @l
    @InterfaceC42733c0
    public static final <E extends CoroutineContext.Element> E getPolymorphicElement(@k CoroutineContext.Element element, @k CoroutineContext.Key<E> key) {
        E e12;
        if (!(key instanceof AbstractCoroutineContextKey)) {
            if (element.getKey() == key) {
                return element;
            }
            return null;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        if (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(element.getKey()) || (e12 = (E) abstractCoroutineContextKey.tryCast$kotlin_stdlib(element)) == null) {
            return null;
        }
        return e12;
    }

    @InterfaceC43017s
    @InterfaceC42733c0
    @k
    public static final CoroutineContext minusPolymorphicKey(@k CoroutineContext.Element element, @k CoroutineContext.Key<?> key) {
        if (!(key instanceof AbstractCoroutineContextKey)) {
            return element.getKey() == key ? EmptyCoroutineContext.INSTANCE : element;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        return (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(element.getKey()) || abstractCoroutineContextKey.tryCast$kotlin_stdlib(element) == null) ? element : EmptyCoroutineContext.INSTANCE;
    }
}
