package com.avito.android.remote;

import com.avito.android.remote.model.Pretend;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpErrorsMapper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/g0;", "", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.g0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34265g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f253474a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Annotation[] f253475b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f253476c = C42727D.b(LazyThreadSafetyMode.f406616d, new b());

    /* compiled from: HttpErrorsMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/g0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.g0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HttpErrorsMapper.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.g0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Annotation[] annotationArr = C34265g0.this.f253475b;
            int length = annotationArr.length;
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (annotationArr[i12] instanceof Pretend) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            return Boolean.valueOf(z12);
        }
    }

    static {
        new a(null);
    }

    public C34265g0(@Y61.k Gson gson, @Y61.k Annotation[] annotationArr) {
        this.f253474a = gson;
        this.f253475b = annotationArr;
    }
}
