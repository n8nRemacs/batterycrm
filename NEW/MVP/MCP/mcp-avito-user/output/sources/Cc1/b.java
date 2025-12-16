package Cc1;

import Y41.l;
import gc1.InterfaceC40658b;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f2355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(1);
        this.f2355l = cVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        InterfaceC40658b interfaceC40658b = (InterfaceC40658b) obj;
        c cVar = this.f2355l;
        cVar.f2361f.a(interfaceC40658b);
        cVar.a(interfaceC40658b.getF396624i(), interfaceC40658b);
        return G0.f406611a;
    }
}
