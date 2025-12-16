package com.avito.android.personal_banner.feature.mvi;

import Z60.a;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.arch.mvi.utils.x;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BannerActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LZ60/a;", "LZ60/c;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;", "a", "b", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<Z60.a, Z60.c, BannerState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f215609a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.personal_banner.feature.domain.d f215610b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.personal_banner.feature.domain.a f215611c;

    /* compiled from: BannerActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$a;", "Lcom/avito/android/arch/mvi/utils/n;", "Lcom/avito/android/personal_banner/feature/domain/model/BannerContext;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.personal_banner.feature.mvi.a$a, reason: collision with other inner class name */
    public static final class C6453a implements com.avito.android.arch.mvi.utils.n<BannerContext, C6453a, C6453a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.utils.o f215612b;

        public C6453a(@Y61.k BannerState bannerState) {
            com.avito.android.arch.mvi.utils.n.f92111a.getClass();
            this.f215612b = new com.avito.android.arch.mvi.utils.o(bannerState.f215640d);
        }

        @Override // com.avito.android.arch.mvi.utils.n
        public final o.a a(Object obj) {
            return this.f215612b.f92114c;
        }

        @Override // com.avito.android.arch.mvi.utils.n
        public final x<BannerContext> b(Object obj) {
            return this.f215612b.f92114c;
        }
    }

    /* compiled from: BannerActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$b;", "", "a", "b", "c", "d", "Lcom/avito/android/personal_banner/feature/mvi/a$b$a;", "Lcom/avito/android/personal_banner/feature/mvi/a$b$c;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: BannerActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$b$a;", "Lcom/avito/android/personal_banner/feature/mvi/a$b;", "Lcom/avito/android/personal_banner/feature/mvi/a$b$b;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.personal_banner.feature.mvi.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC6454a extends b {
        }

        /* compiled from: BannerActor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$b$b;", "Lcom/avito/android/personal_banner/feature/mvi/a$b$a;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.personal_banner.feature.mvi.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6455b implements InterfaceC6454a {
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6455b)) {
                    return false;
                }
                ((C6455b) obj).getClass();
                return L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @Y61.k
            public final String toString() {
                return "Close(bannerItemId=null)";
            }
        }

        /* compiled from: BannerActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$b$c;", "Lcom/avito/android/personal_banner/feature/mvi/a$b;", "Lcom/avito/android/personal_banner/feature/mvi/a$b$d;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface c extends b {
        }

        /* compiled from: BannerActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$b$d;", "Lcom/avito/android/personal_banner/feature/mvi/a$b$c;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f215613a = new d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1729416647;
            }

            @Y61.k
            public final String toString() {
                return "Reload";
            }
        }
    }

    @Inject
    public a(@Y61.k R0 r02, @Y61.k com.avito.android.personal_banner.feature.domain.d dVar, @Y61.k com.avito.android.personal_banner.feature.domain.a aVar) {
        this.f215609a = r02;
        this.f215610b = dVar;
        this.f215611c = aVar;
    }

    public static final b c(a aVar, Z60.a aVar2) {
        aVar.getClass();
        if (aVar2 instanceof a.C1420a) {
            ((a.C1420a) aVar2).getClass();
            return new b.C6455b();
        }
        if (aVar2 instanceof a.b) {
            return b.d.f215613a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return new f(this, aVar).invoke(c43197r1, new C6453a((BannerState) aVar.invoke()));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Z60.c> b(Z60.a aVar, BannerState bannerState) {
        return C43175k.w();
    }
}
