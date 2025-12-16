package ob1;

import Y41.p;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class c extends N implements p<com.vk.push.core.push.b, com.vk.push.core.base.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f419955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f419956m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, g gVar) {
        super(2);
        this.f419955l = str;
        this.f419956m = gVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.vk.push.core.push.b bVar, com.vk.push.core.base.a aVar) {
        String str = this.f419956m.f419960n;
        bVar.j(this.f419955l, str, aVar);
        return G0.f406611a;
    }
}
