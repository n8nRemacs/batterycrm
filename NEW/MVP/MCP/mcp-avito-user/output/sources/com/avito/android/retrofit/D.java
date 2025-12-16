package com.avito.android.retrofit;

import com.avito.android.util.C35983y4;
import e30.InterfaceC39938c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import retrofit2.InterfaceC47647c;

/* compiled from: NetworkContractsConverterFactoryWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/D;", "Lretrofit2/c$a;", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class D extends InterfaceC47647c.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47647c.a f255087b;

    public D(@Y61.k InterfaceC47647c.a aVar) {
        this.f255087b = aVar;
    }

    @Override // retrofit2.InterfaceC47647c.a
    @Y61.l
    public final InterfaceC47647c<?, ?> get(@Y61.k Type type, @Y61.k Annotation[] annotationArr, @Y61.k retrofit2.z zVar) {
        boolean zC2 = C35983y4.c(annotationArr, InterfaceC39938c.class);
        InterfaceC47647c<?, ?> interfaceC47647c = this.f255087b.get(type, annotationArr, zVar);
        if (interfaceC47647c == null) {
            return null;
        }
        return !zC2 ? interfaceC47647c : new C(interfaceC47647c, zVar.d(interfaceC47647c.getF255131a(), annotationArr));
    }
}
