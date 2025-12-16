package com.avito.android.service.short_task.metrics;

import com.avito.android.util.I1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: GooglePlayServicesInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/k;", "Lcom/avito/android/service/short_task/metrics/n;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f274084a;

    /* compiled from: GooglePlayServicesInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "", "test", "(Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f274085b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Q) obj).f406620c != 0;
        }
    }

    /* compiled from: GooglePlayServicesInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "", "apply", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f274086b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (Q) obj;
        }
    }

    /* compiled from: GooglePlayServicesInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "Lcom/avito/android/service/short_task/metrics/m;", "apply", "(Lkotlin/Q;)Lcom/avito/android/service/short_task/metrics/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f274087b = new c<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            Q q12 = (Q) obj;
            return new m((String) q12.f406619b, q12.f406620c);
        }
    }

    @Inject
    public k(@Y61.k I1 i12) {
        this.f274084a = i12;
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        I1 i12 = this.f274084a;
        return io.reactivex.rxjava3.core.z.V(new Q("google_play_services_version_code", i12.a()), new Q("google_play_services_version_name", i12.b()), new Q("google_play_services_library_version_code", Integer.valueOf(i12.c())), new Q("google_play_services_compatibility", Boolean.valueOf(i12.d()))).N(a.f274085b).d0(b.f274086b).d0(c.f274087b);
    }
}
