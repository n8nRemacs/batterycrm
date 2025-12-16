package Za1;

import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class t extends N implements Y41.p<com.vk.push.core.test.a, com.vk.push.core.base.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f20254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f20255m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, C c12) {
        super(2);
        this.f20254l = str;
        this.f20255m = c12;
    }

    @Override // Y41.p
    public final G0 invoke(com.vk.push.core.test.a aVar, com.vk.push.core.base.a aVar2) {
        String str = this.f20255m.f20218n;
        aVar.j(this.f20254l, str, aVar2);
        return G0.f406611a;
    }
}
