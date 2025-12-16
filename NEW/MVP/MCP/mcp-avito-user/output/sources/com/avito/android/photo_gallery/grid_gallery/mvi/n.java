package com.avito.android.photo_gallery.grid_gallery.mvi;

import T70.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.photo_gallery.grid_gallery.items.double_entity.GridGalleryDoubleEntityItem;
import com.avito.android.photo_gallery.grid_gallery.items.single_entity.GridGallerySingleEntityItem;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43142c;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GridGalleryActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "LT70/c;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "LT70/e;", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements com.avito.android.arch.mvi.a<T70.c, GridGalleryInternalAction, T70.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GridGalleryOpenParams f217342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f217343b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f217344c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_gallery.grid_gallery.j f217345d;

    /* compiled from: GridGalleryActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a;", "", "<init>", "()V", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: GridGalleryActor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a;", "", "a", "b", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a$a;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a$b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_gallery.grid_gallery.mvi.n$a$a, reason: collision with other inner class name */
        public interface InterfaceC6522a {

            /* compiled from: GridGalleryActor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a$a;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.photo_gallery.grid_gallery.mvi.n$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C6523a implements InterfaceC6522a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C6523a f217346a = new C6523a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C6523a);
                }

                public final int hashCode() {
                    return 534445668;
                }

                @Y61.k
                public final String toString() {
                    return "Default";
                }
            }

            /* compiled from: GridGalleryActor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a$b;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.photo_gallery.grid_gallery.mvi.n$a$a$b */
            public static final /* data */ class b implements InterfaceC6522a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f217347a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1212831492;
                }

                @Y61.k
                public final String toString() {
                    return "Latest";
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GridGalleryActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$3", f = "GridGalleryActor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217348q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f217349r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T70.e f217350s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f217351t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T70.e eVar, n nVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f217350s = eVar;
            this.f217351t = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f217350s, this.f217351t, continuation);
            bVar.f217349r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217348q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f217349r;
                T70.e eVar = this.f217350s;
                if (!eVar.f15418c) {
                    return G0.f406611a;
                }
                n nVar = this.f217351t;
                int i13 = nVar.f217342a.f217126d;
                if (i13 == 0) {
                    return G0.f406611a;
                }
                ?? r12 = eVar.f15424i.f15426b.f15383c;
                if (r12.isEmpty()) {
                    return G0.f406611a;
                }
                Integer numC = n.c(nVar, i13, r12);
                if (numC == null) {
                    return G0.f406611a;
                }
                GridGalleryInternalAction.ScrollToItem scrollToItem = new GridGalleryInternalAction.ScrollToItem(numC.intValue());
                this.f217348q = 1;
                if (interfaceC43172j.emit(scrollToItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GridGalleryActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$4", f = "GridGalleryActor.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217352q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f217353r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T70.e f217354s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f217355t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ T70.c f217356u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T70.c cVar, T70.e eVar, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f217354s = eVar;
            this.f217355t = nVar;
            this.f217356u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f217356u, this.f217354s, this.f217355t, continuation);
            cVar.f217353r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217352q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f217353r;
                ?? r12 = this.f217354s.f15424i.f15426b.f15383c;
                if (r12.isEmpty()) {
                    return G0.f406611a;
                }
                Integer numC = n.c(this.f217355t, ((c.g) this.f217356u).f15406a, r12);
                if (numC == null) {
                    return G0.f406611a;
                }
                GridGalleryInternalAction.ScrollToItem scrollToItem = new GridGalleryInternalAction.ScrollToItem(numC.intValue());
                this.f217352q = 1;
                if (interfaceC43172j.emit(scrollToItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GridGalleryActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$5", f = "GridGalleryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ n f217357q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ T70.e f217358r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T70.e eVar, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f217357q = nVar;
            this.f217358r = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f217358r, this.f217357q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Long lZ02;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            n nVar = this.f217357q;
            InterfaceC28373a interfaceC28373a = nVar.f217343b;
            GridGalleryOpenParams gridGalleryOpenParams = nVar.f217342a;
            String str = gridGalleryOpenParams.f217132j;
            interfaceC28373a.c(new S70.c((str == null || (lZ02 = C43066x.z0(str)) == null) ? 0L : lZ02.longValue(), this.f217358r.f15419d, gridGalleryOpenParams.f217139q));
            return G0.f406611a;
        }
    }

    /* compiled from: GridGalleryActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$6", f = "GridGalleryActor.kt", i = {0}, l = {107, 125}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217359q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f217360r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T70.c f217361s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ T70.e f217362t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ n f217363u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T70.c cVar, T70.e eVar, n nVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f217361s = cVar;
            this.f217362t = eVar;
            this.f217363u = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f217361s, this.f217362t, this.f217363u, continuation);
            eVar.f217360r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.grid_gallery.mvi.n.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GridGalleryActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$7", f = "GridGalleryActor.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217364q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f217365r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ T70.c f217367t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(T70.c cVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f217367t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = n.this.new f(this.f217367t, continuation);
            fVar.f217365r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Long lZ02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217364q;
            T70.c cVar = this.f217367t;
            n nVar = n.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f217365r;
                GridGalleryInternalAction.OpenFullScreenGallery openFullScreenGallery = new GridGalleryInternalAction.OpenFullScreenGallery(nVar.f217342a, ((c.C1050c) cVar).f15400a);
                this.f217364q = 1;
                if (interfaceC43172j.emit(openFullScreenGallery, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            InterfaceC28373a interfaceC28373a = nVar.f217343b;
            GridGalleryOpenParams gridGalleryOpenParams = nVar.f217342a;
            String str = gridGalleryOpenParams.f217132j;
            interfaceC28373a.c(new S70.b((str == null || (lZ02 = C43066x.z0(str)) == null) ? 0L : lZ02.longValue(), ((c.C1050c) cVar).f15401b, gridGalleryOpenParams.f217139q));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public n(@Y61.k GridGalleryOpenParams gridGalleryOpenParams, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k com.avito.android.photo_gallery.grid_gallery.j jVar) {
        this.f217342a = gridGalleryOpenParams;
        this.f217343b = interfaceC28373a;
        this.f217344c = r02;
        this.f217345d = jVar;
    }

    public static final Integer c(n nVar, int i12, List list) {
        Object next;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if ((aVar instanceof GridGallerySingleEntityItem) || (aVar instanceof GridGalleryDoubleEntityItem)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) next;
            if (aVar2 instanceof GridGallerySingleEntityItem) {
                if (((GridGallerySingleEntityItem) aVar2).f217281c.getF217212c() == i12) {
                    break;
                }
            } else if (aVar2 instanceof GridGalleryDoubleEntityItem) {
                GridGalleryDoubleEntityItem gridGalleryDoubleEntityItem = (GridGalleryDoubleEntityItem) aVar2;
                if (gridGalleryDoubleEntityItem.f217246c.getF217212c() == i12 || gridGalleryDoubleEntityItem.f217247d.getF217212c() == i12) {
                    break;
                }
            } else {
                continue;
            }
        }
        com.avito.conveyor_item.a aVar3 = (com.avito.conveyor_item.a) next;
        if (aVar3 == null) {
            return null;
        }
        int iIndexOf = list.indexOf(aVar3);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf >= 0) {
            return numValueOf;
        }
        return null;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new p(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, o.f217368l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<GridGalleryInternalAction> b(@Y61.k T70.c cVar, @Y61.k T70.e eVar) {
        if (cVar instanceof c.h ? true : cVar instanceof c.a) {
            GridGalleryOpenParams gridGalleryOpenParams = eVar.f15417b;
            return new C43210w(new GridGalleryInternalAction.CloseScreen(eVar.f15421f, gridGalleryOpenParams != null ? gridGalleryOpenParams.f217138p : null));
        }
        if (cVar instanceof c.e) {
            return C43175k.G(new b(eVar, this, null));
        }
        if (cVar instanceof c.g) {
            return C43175k.G(new c(cVar, eVar, this, null));
        }
        if (cVar instanceof c.d) {
            c.d dVar = (c.d) cVar;
            InterfaceC43142c interfaceC43142cE = C43175k.e(C43175k.G(new r(eVar, dVar, null)));
            R0 r02 = this.f217344c;
            return C43175k.N(C43175k.I(r02.c(), interfaceC43142cE), C43175k.I(r02.c(), C43175k.e(C43175k.G(new q(eVar, dVar, this, null)))));
        }
        if (cVar instanceof c.i) {
            return C43175k.G(new d(eVar, this, null));
        }
        if (cVar instanceof c.f) {
            return C43175k.G(new e(cVar, eVar, this, null));
        }
        if (cVar instanceof c.C1050c) {
            return C43175k.G(new f(cVar, null));
        }
        if (cVar instanceof c.b) {
            return new C43210w(new GridGalleryInternalAction.OpenDeeplink(((c.b) cVar).f15399a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
