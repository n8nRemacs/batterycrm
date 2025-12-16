package ru.rustore.sdk.core.tasks;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.core.tasks.f;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lru/rustore/sdk/core/tasks/b;", "listenerHandler", "Lkotlin/G0;", "invoke", "(Lru/rustore/sdk/core/tasks/b;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes9.dex */
final class m extends N implements Y41.l<b<Object>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f436797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f<Object> fVar, Object obj) {
        super(1);
        this.f436797l = obj;
    }

    @Override // Y41.l
    public final G0 invoke(b<Object> bVar) {
        b<Object> bVar2 = bVar;
        e<Object> eVar = bVar2.f436775a;
        if (eVar != null) {
            l lVar = new l(eVar, this.f436797l);
            f.a aVar = f.f436778d;
            f.d(bVar2.f436777c, lVar);
        }
        return G0.f406611a;
    }
}
