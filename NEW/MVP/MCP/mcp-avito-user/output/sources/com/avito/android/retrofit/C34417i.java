package com.avito.android.retrofit;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ConvertDtoToTyped;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.retrofit.C34417i;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35983y4;
import com.avito.android.util.InterfaceC35745a5;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;

/* compiled from: CallAdapterFactoryRx.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/i;", "Lretrofit2/c$a;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34417i extends InterfaceC47647c.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f255136b;

    /* compiled from: CallAdapterFactoryRx.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/i$a;", "Lretrofit2/c;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.i$a */
    public final class a implements InterfaceC47647c<Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC47647c<Object, Object> f255137a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Type f255138b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f255139c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f255140d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f255141e;

        /* compiled from: CallAdapterFactoryRx.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0014\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "cause", "Lio/reactivex/rxjava3/core/E;", "", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.retrofit.i$a$a, reason: collision with other inner class name */
        public static final class C7634a extends kotlin.jvm.internal.N implements Y41.l<Throwable, io.reactivex.rxjava3.core.E<? extends Object>> {
            public C7634a() {
                super(1);
            }

            @Override // Y41.l
            public final io.reactivex.rxjava3.core.E<? extends Object> invoke(Throwable th2) {
                Throwable th3 = th2;
                a aVar = a.this;
                return (aVar.f255140d || aVar.f255139c) ? io.reactivex.rxjava3.core.z.c0(new TypedResult.Error(com.avito.android.error.z.n(th3), th3)) : io.reactivex.rxjava3.core.z.M(new ApiException(com.avito.android.error.z.n(th3), null, 2, null));
            }
        }

        public a(@Y61.k InterfaceC47647c interfaceC47647c, @Y61.k Type type, boolean z12, boolean z13, boolean z14) {
            this.f255137a = interfaceC47647c;
            this.f255138b = type;
            this.f255139c = z12;
            this.f255140d = z13;
            this.f255141e = z14;
        }

        @Override // retrofit2.InterfaceC47647c
        @Y61.k
        public final Object adapt(@Y61.k InterfaceC47646b<Object> interfaceC47646b) {
            io.reactivex.rxjava3.core.z zVarF;
            Object objAdapt = this.f255137a.adapt(interfaceC47646b);
            if (objAdapt instanceof io.reactivex.rxjava3.core.I) {
                zVarF = ((io.reactivex.rxjava3.core.I) objAdapt).F();
            } else {
                if (!(objAdapt instanceof io.reactivex.rxjava3.core.z)) {
                    throw new UnknownError("unsupported type " + this.f255138b);
                }
                zVarF = (io.reactivex.rxjava3.core.z) objAdapt;
            }
            final C7634a c7634a = new C7634a();
            final int i12 = 1;
            final int i13 = 0;
            io.reactivex.rxjava3.core.z zVarT = zVarF.l0(new l41.o() { // from class: com.avito.android.retrofit.h
                @Override // l41.o
                public final Object apply(Object obj) {
                    switch (i12) {
                        case 0:
                            return obj != null ? ((C34417i.a) c7634a).f255139c ? io.reactivex.rxjava3.core.z.c0(new TypedResult.Success(obj)) : io.reactivex.rxjava3.core.z.c0(obj) : io.reactivex.rxjava3.core.z.M(new ApiException(new ApiError.UnknownError("body empty", null, null, 6, null), null, 2, null));
                        default:
                            return (io.reactivex.rxjava3.core.E) ((Y41.l) c7634a).invoke(obj);
                    }
                }
            }).T(new l41.o() { // from class: com.avito.android.retrofit.h
                @Override // l41.o
                public final Object apply(Object obj) {
                    switch (i13) {
                        case 0:
                            return obj != null ? ((C34417i.a) this).f255139c ? io.reactivex.rxjava3.core.z.c0(new TypedResult.Success(obj)) : io.reactivex.rxjava3.core.z.c0(obj) : io.reactivex.rxjava3.core.z.M(new ApiException(new ApiError.UnknownError("body empty", null, null, 6, null), null, 2, null));
                        default:
                            return (io.reactivex.rxjava3.core.E) ((Y41.l) this).invoke(obj);
                    }
                }
            }, Integer.MAX_VALUE);
            return this.f255141e ? zVarT.S() : zVarT;
        }

        @Override // retrofit2.InterfaceC47647c
        @Y61.k
        /* renamed from: responseType, reason: from getter */
        public final Type getF255138b() {
            return this.f255138b;
        }
    }

    @Inject
    public C34417i(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f255136b = interfaceC35745a5;
    }

    @Override // retrofit2.InterfaceC47647c.a
    @Y61.l
    public final InterfaceC47647c<?, ?> get(@Y61.k Type type, @Y61.k Annotation[] annotationArr, @Y61.k retrofit2.z zVar) {
        InterfaceC47647c<?, ?> interfaceC47647c = (C35983y4.c(annotationArr, v.class) ? hu.akarnokd.rxjava3.retrofit.g.a() : new hu.akarnokd.rxjava3.retrofit.g(this.f255136b.a())).get(type, annotationArr, zVar);
        InterfaceC47647c<?, ?> interfaceC47647c2 = interfaceC47647c != null ? interfaceC47647c : null;
        if (interfaceC47647c2 == null) {
            return null;
        }
        Type f255138b = interfaceC47647c2.getF255138b();
        boolean z12 = ((f255138b instanceof ParameterizedType) && kotlin.jvm.internal.L.f(((ParameterizedType) f255138b).getRawType(), TypedResult.class)) || kotlin.jvm.internal.L.f(f255138b, TypedResult.class);
        boolean z13 = ((type instanceof ParameterizedType) && kotlin.jvm.internal.L.f(((ParameterizedType) type).getRawType(), io.reactivex.rxjava3.core.I.class)) || kotlin.jvm.internal.L.f(type, io.reactivex.rxjava3.core.I.class);
        boolean zC2 = C35983y4.c(annotationArr, ConvertDtoToTyped.class);
        return new a(interfaceC47647c2, zC2 ? InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) f255138b) : f255138b, zC2, z12, z13);
    }
}
