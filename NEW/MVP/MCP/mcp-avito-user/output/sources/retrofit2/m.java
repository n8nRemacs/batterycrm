package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.L;

/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lretrofit2/m;", "Lretrofit2/d;", "retrofit"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class m implements InterfaceC47648d<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f430010b;

    public m(kotlinx.coroutines.r rVar) {
        this.f430010b = rVar;
    }

    @Override // retrofit2.InterfaceC47648d
    public final void onFailure(@Y61.k InterfaceC47646b<Object> interfaceC47646b, @Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        this.f430010b.resumeWith(new Z.b(th2));
    }

    @Override // retrofit2.InterfaceC47648d
    public final void onResponse(@Y61.k InterfaceC47646b<Object> interfaceC47646b, @Y61.k y<Object> yVar) {
        boolean zIsSuccessful = yVar.f430118a.isSuccessful();
        kotlinx.coroutines.r rVar = this.f430010b;
        if (!zIsSuccessful) {
            HttpException httpException = new HttpException(yVar);
            int i12 = Z.f406624c;
            rVar.resumeWith(new Z.b(httpException));
            return;
        }
        Object obj = yVar.f430119b;
        if (obj != null) {
            int i13 = Z.f406624c;
            rVar.resumeWith(obj);
            return;
        }
        Object objTag = interfaceC47646b.request().tag(j.class);
        if (objTag == null) {
            L.k();
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Response from ");
        Method method = ((j) objTag).f430007a;
        sb2.append(method.getDeclaringClass().getName());
        sb2.append('.');
        sb2.append(method.getName());
        sb2.append(" was null but response body type was declared as non-null");
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
        int i14 = Z.f406624c;
        rVar.resumeWith(new Z.b(kotlinNullPointerException));
    }
}
