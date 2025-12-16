package retrofit2;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lretrofit2/p;", "Lretrofit2/d;", "retrofit"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class p implements InterfaceC47648d<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f430012b;

    public p(kotlinx.coroutines.r rVar) {
        this.f430012b = rVar;
    }

    @Override // retrofit2.InterfaceC47648d
    public final void onFailure(@Y61.k InterfaceC47646b<Object> interfaceC47646b, @Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        this.f430012b.resumeWith(new Z.b(th2));
    }

    @Override // retrofit2.InterfaceC47648d
    public final void onResponse(@Y61.k InterfaceC47646b<Object> interfaceC47646b, @Y61.k y<Object> yVar) {
        int i12 = Z.f406624c;
        this.f430012b.resumeWith(yVar);
    }
}
