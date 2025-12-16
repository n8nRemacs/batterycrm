package C91;

import Y41.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import ru.mts.biometry.api.dataSource.j;

/* loaded from: classes9.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f2027q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f2028r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f2028r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f2028r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f2027q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        h hVar = this.f2028r;
        if (h.b()) {
            hVar.f2039c.b(new W91.a());
            return G0.f406611a;
        }
        E91.a aVar = a.f2018e.f3821g;
        ru.mts.biometry.sdk.domain.entity.selector.f fVar = aVar != null ? aVar.f3814f : null;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ?? r12 = fVar.f436415b;
        int size = r12.size();
        j jVar = hVar.f2038b;
        if (size == 1) {
            Iterator it = r12.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }
            ru.mts.biometry.sdk.domain.entity.selector.d dVar = (ru.mts.biometry.sdk.domain.entity.selector.d) it.next();
            Iterator it2 = dVar.f436414d.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            String str = (String) it2.next();
            this.f2027q = 1;
            if (jVar.f(dVar.f436412b, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        Iterator it3 = r12.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (L.f(((ru.mts.biometry.sdk.domain.entity.selector.d) next).f436412b, "_any_")) {
                break;
            }
        }
        ru.mts.biometry.sdk.domain.entity.selector.d dVar2 = (ru.mts.biometry.sdk.domain.entity.selector.d) next;
        if (dVar2 == null || (list = dVar2.f436414d) == null) {
            return null;
        }
        Iterator it4 = list.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        String str2 = (String) it4.next();
        this.f2027q = 2;
        if (jVar.f(dVar2.f436412b, str2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
