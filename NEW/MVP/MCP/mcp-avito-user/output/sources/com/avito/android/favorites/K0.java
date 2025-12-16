package com.avito.android.favorites;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.CommercialLoadingItem;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorites.FavoritesListPresenterImpl$loadCommercialBanner$1", f = "FavoritesListPresenter.kt", i = {}, l = {1554}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class K0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156289q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156290r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommercialLoadingItem f156291s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f156292t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f156293u;

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/advertising/CommercialBanner;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/advertising/CommercialBanner;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorites.FavoritesListPresenterImpl$loadCommercialBanner$1$loadedBanner$1", f = "FavoritesListPresenter.kt", i = {}, l = {1561}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super CommercialBanner>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f156294q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C30684r0 f156295r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CommercialLoadingItem f156296s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f156297t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f156298u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C30684r0 c30684r0, CommercialLoadingItem commercialLoadingItem, long j12, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f156295r = c30684r0;
            this.f156296s = commercialLoadingItem;
            this.f156297t = j12;
            this.f156298u = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f156295r, this.f156296s, this.f156297t, this.f156298u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super CommercialBanner> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f156294q;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(this.f156295r.f157439J.c(this.f156296s.f86897b, this.f156297t, Boxing.boxInt(1), Boxing.boxInt(this.f156298u)));
                    this.f156294q = 1;
                    obj = C43175k.A(interfaceC43160iA, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
            } catch (Throwable th2) {
                V2.f318762a.a("FavoritesListPresenter", "Commercial load error in favorites", th2);
                obj = kotlin.G0.f406611a;
            }
            if (obj instanceof CommercialBanner) {
                return (CommercialBanner) obj;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C30684r0 c30684r0, CommercialLoadingItem commercialLoadingItem, long j12, int i12, Continuation<? super K0> continuation) {
        super(2, continuation);
        this.f156290r = c30684r0;
        this.f156291s = commercialLoadingItem;
        this.f156292t = j12;
        this.f156293u = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new K0(this.f156290r, this.f156291s, this.f156292t, this.f156293u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((K0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.K0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
