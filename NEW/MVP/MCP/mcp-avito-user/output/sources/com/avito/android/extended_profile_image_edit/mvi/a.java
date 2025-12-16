package com.avito.android.extended_profile_image_edit.mvi;

import android.graphics.Bitmap;
import android.net.Uri;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.photo_storage.SharedPhotosStorage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA.InterfaceC49183a;
import vA.InterfaceC49184b;

/* compiled from: BannerImageEditActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LvA/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$1", f = "BannerImageEditActor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC49184b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151030q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f151031r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f151032s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49183a f151033t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ vA.d f151034u;

    /* compiled from: BannerImageEditActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$1$1", f = "BannerImageEditActor.kt", i = {}, l = {56, 57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_image_edit.mvi.a$a, reason: collision with other inner class name */
    public static final class C4413a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151035q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f151036r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f151037s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC49184b> f151038t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49183a f151039u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vA.d f151040v;

        /* compiled from: BannerImageEditActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$1$1$isUpdatedDeferred$1", f = "BannerImageEditActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_image_edit.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C4414a extends SuspendLambda implements Y41.p<T, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ g f151041q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC49183a f151042r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ vA.d f151043s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4414a(g gVar, InterfaceC49183a interfaceC49183a, vA.d dVar, Continuation<? super C4414a> continuation) {
                super(2, continuation);
                this.f151041q = gVar;
                this.f151042r = interfaceC49183a;
                this.f151043s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4414a(this.f151041q, this.f151042r, this.f151043s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
                return ((C4414a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                g gVar = this.f151041q;
                SharedPhotosStorage sharedPhotosStorage = gVar.f151067c;
                Bitmap bitmapInvoke = ((InterfaceC49183a.b) this.f151042r).f440490a.invoke();
                if (bitmapInvoke == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Uri uriA = SharedPhotosStorage.c.a(sharedPhotosStorage, bitmapInvoke, null, new SharedPhotosStorage.a(Bitmap.CompressFormat.PNG, 100), 14);
                PhotoUpload photoUpload = this.f151043s.f440507a;
                boolean z12 = false;
                if (photoUpload != null) {
                    if (gVar.f151066b.h(gVar.f151065a.f151132a, PhotoUpload.a(photoUpload, null, uriA, null, null, null, null, 4063))) {
                        z12 = true;
                    }
                }
                return Boxing.boxBoolean(z12);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4413a(g gVar, InterfaceC43172j<? super InterfaceC49184b> interfaceC43172j, InterfaceC49183a interfaceC49183a, vA.d dVar, Continuation<? super C4413a> continuation) {
            super(2, continuation);
            this.f151037s = gVar;
            this.f151038t = interfaceC43172j;
            this.f151039u = interfaceC49183a;
            this.f151040v = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C4413a c4413a = new C4413a(this.f151037s, this.f151038t, this.f151039u, this.f151040v, continuation);
            c4413a.f151036r = obj;
            return c4413a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4413a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151035q;
            g gVar = this.f151037s;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43076a0 interfaceC43076a0B = C43259k.b((T) this.f151036r, gVar.f151068d.a(), new C4414a(gVar, this.f151039u, this.f151040v, null), 2);
                this.f151035q = 1;
                obj = interfaceC43076a0B.F(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                throw new IllegalStateException("Saving error");
            }
            InterfaceC49184b.c cVar = new InterfaceC49184b.c(gVar.f151065a.f151132a);
            this.f151035q = 2;
            if (this.f151038t.emit(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, InterfaceC49183a interfaceC49183a, vA.d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f151032s = gVar;
        this.f151033t = interfaceC49183a;
        this.f151034u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f151032s, this.f151033t, this.f151034u, continuation);
        aVar.f151031r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC49184b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151030q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C4413a c4413a = new C4413a(this.f151032s, (InterfaceC43172j) this.f151031r, this.f151033t, this.f151034u, null);
            this.f151030q = 1;
            if (U.c(c4413a, this) == coroutine_suspended) {
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
