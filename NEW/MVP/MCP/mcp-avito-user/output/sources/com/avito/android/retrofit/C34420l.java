package com.avito.android.retrofit;

import Vm0.C15693a;
import arrow.core.AbstractC23662a;
import com.avito.android.json.JsonParseDetailedException;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Pretend;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import e30.InterfaceC39938c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import retrofit2.HttpException;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;

/* compiled from: ResponseConverterFactoryWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/l;", "Lretrofit2/c$a;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34420l extends InterfaceC47647c.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47647c.a f255145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f255146c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.B f255147d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.a f255148e;

    /* compiled from: ResponseConverterFactoryWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lretrofit2/b;", "", "kotlin.jvm.PlatformType", "", "it", "invoke", "(Lretrofit2/b;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.retrofit.l$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<?, Throwable, Throwable> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Annotation[] f255150m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Annotation[] annotationArr) {
            super(2);
            this.f255150m = annotationArr;
        }

        @Override // Y41.p
        public final Throwable invoke(Object obj, Throwable th2) {
            AbstractC23662a<? extends Throwable, ? extends ApiError> bVar;
            boolean z12;
            InterfaceC47646b interfaceC47646b = (InterfaceC47646b) obj;
            Throwable th3 = th2;
            C34420l c34420l = C34420l.this;
            Throwable cause = th3.getCause();
            if (cause instanceof ApiException) {
                ApiError apiError = ((ApiException) cause).f318522b;
                AbstractC23662a.f56267a.getClass();
                bVar = new AbstractC23662a.c<>(apiError);
            } else {
                Throwable thA = C15693a.a(th3);
                AbstractC23662a.f56267a.getClass();
                bVar = new AbstractC23662a.b<>(thA);
            }
            if (c34420l.f255146c.b(bVar) != null) {
                return th3;
            }
            Throwable thA2 = C15693a.a(th3);
            Annotation[] annotationArr = this.f255150m;
            int length = annotationArr.length;
            boolean z13 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z12 = false;
                    break;
                }
                if (annotationArr[i12] instanceof Pretend) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            int length2 = annotationArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    break;
                }
                if (annotationArr[i13] instanceof InterfaceC39938c) {
                    z13 = true;
                    break;
                }
                i13++;
            }
            ApiError apiErrorB = c34420l.f255148e.b(thA2, "", z12, z13);
            if (apiErrorB == null) {
                return th3;
            }
            Throwable thA3 = C15693a.a(th3);
            c34420l.f255147d.d(new C34421m(interfaceC47646b), annotationArr, thA3 instanceof HttpException ? B.a((HttpException) thA3) : thA3 instanceof JsonParseDetailedException ? ((JsonParseDetailedException) thA3).f174714b : null, th3, apiErrorB);
            return C35936s.a(apiErrorB, C15693a.a(th3));
        }
    }

    public C34420l(@Y61.k InterfaceC47647c.a aVar, @Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k com.avito.android.remote.analytics.B b12, @Y61.k com.avito.android.remote.error.a aVar2) {
        this.f255145b = aVar;
        this.f255146c = nVar;
        this.f255147d = b12;
        this.f255148e = aVar2;
    }

    @Override // retrofit2.InterfaceC47647c.a
    @Y61.l
    public final InterfaceC47647c<?, ?> get(@Y61.k Type type, @Y61.k Annotation[] annotationArr, @Y61.k retrofit2.z zVar) {
        InterfaceC47647c<?, ?> interfaceC47647c = this.f255145b.get(type, annotationArr, zVar);
        if (interfaceC47647c == null) {
            return null;
        }
        return new A(interfaceC47647c, new a(annotationArr));
    }
}
