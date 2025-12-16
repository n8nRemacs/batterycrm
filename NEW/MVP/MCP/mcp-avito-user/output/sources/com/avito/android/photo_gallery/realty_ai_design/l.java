package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import android.content.Context;
import android.net.Uri;
import coil.request.p;
import coil.request.q;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: ImageComparisonSlider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.realty_ai_design.ImageComparisonSliderKt$preloadImagesAsync$2", f = "ImageComparisonSlider.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class l extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f217634q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f217635r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f217636s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f217637t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ coil.j f217638u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f217639v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f217640w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f217641x;

    /* compiled from: ImageComparisonSlider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.realty_ai_design.ImageComparisonSliderKt$preloadImagesAsync$2$left$1", f = "ImageComparisonSlider.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super q>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217642q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ coil.j f217643r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f217644s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Uri f217645t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(coil.j jVar, Context context, Uri uri, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f217643r = jVar;
            this.f217644s = context;
            this.f217645t = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f217643r, this.f217644s, this.f217645t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super q> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217642q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p.a aVar = new p.a(this.f217644s);
                aVar.f58691c = this.f217645t;
                coil.request.p pVarA = aVar.a();
                this.f217642q = 1;
                obj = this.f217643r.c(pVarA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: ImageComparisonSlider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.realty_ai_design.ImageComparisonSliderKt$preloadImagesAsync$2$right$1", f = "ImageComparisonSlider.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super q>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217646q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ coil.j f217647r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f217648s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Uri f217649t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(coil.j jVar, Context context, Uri uri, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f217647r = jVar;
            this.f217648s = context;
            this.f217649t = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f217647r, this.f217648s, this.f217649t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super q> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217646q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p.a aVar = new p.a(this.f217648s);
                aVar.f58691c = this.f217649t;
                coil.request.p pVarA = aVar.a();
                this.f217646q = 1;
                obj = this.f217647r.c(pVarA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Y41.a<G0> aVar, Y41.l<? super String, G0> lVar, coil.j jVar, Context context, Uri uri, Uri uri2, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f217636s = aVar;
        this.f217637t = lVar;
        this.f217638u = jVar;
        this.f217639v = context;
        this.f217640w = uri;
        this.f217641x = uri2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f217636s, this.f217637t, this.f217638u, this.f217639v, this.f217640w, this.f217641x, continuation);
        lVar.f217635r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f217634q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f217635r;
            Uri uri = this.f217640w;
            Context context = this.f217639v;
            coil.j jVar = this.f217638u;
            InterfaceC43076a0[] interfaceC43076a0Arr = {C43259k.b(t12, null, new a(jVar, context, uri, null), 3), C43259k.b(t12, null, new b(jVar, context, this.f217641x, null), 3)};
            this.f217634q = 1;
            obj = C43225h.b(interfaceC43076a0Arr, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((q) next) instanceof coil.request.e) {
                break;
            }
        }
        coil.request.e eVar = next instanceof coil.request.e ? (coil.request.e) next : null;
        Throwable th2 = eVar != null ? eVar.f58643c : null;
        if (th2 == null) {
            this.f217636s.invoke();
        } else {
            this.f217637t.invoke(String.valueOf(th2.getMessage()));
        }
        return G0.f406611a;
    }
}
