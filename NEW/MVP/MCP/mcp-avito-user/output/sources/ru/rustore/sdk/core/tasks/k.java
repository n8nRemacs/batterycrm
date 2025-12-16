package ru.rustore.sdk.core.tasks;

import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.core.tasks.f;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lru/rustore/sdk/core/tasks/a;", "completionListenerHandler", "Lkotlin/G0;", "invoke", "(Lru/rustore/sdk/core/tasks/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes9.dex */
final class k extends N implements Y41.l<a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f<Object> f436793l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f436794m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f<Object> fVar, Throwable th2) {
        super(1);
        this.f436793l = fVar;
        this.f436794m = th2;
    }

    @Override // Y41.l
    public final G0 invoke(a aVar) {
        a aVar2 = aVar;
        j jVar = new j(aVar2, this.f436794m);
        f.a aVar3 = f.f436778d;
        Executor executor = aVar2.f436774b;
        this.f436793l.getClass();
        f.d(executor, jVar);
        return G0.f406611a;
    }
}
