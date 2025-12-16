package retrofit2;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lretrofit2/n;", "Lretrofit2/d;", "retrofit"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class n implements InterfaceC47648d<Object> {
    @Override // retrofit2.InterfaceC47648d
    public final void onFailure(@Y61.k InterfaceC47646b<Object> interfaceC47646b, @Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        new Z.b(th2);
        throw null;
    }

    @Override // retrofit2.InterfaceC47648d
    public final void onResponse(@Y61.k InterfaceC47646b<Object> interfaceC47646b, @Y61.k y<Object> yVar) {
        if (yVar.f430118a.isSuccessful()) {
            int i12 = Z.f406624c;
            throw null;
        }
        HttpException httpException = new HttpException(yVar);
        int i13 = Z.f406624c;
        new Z.b(httpException);
        throw null;
    }
}
