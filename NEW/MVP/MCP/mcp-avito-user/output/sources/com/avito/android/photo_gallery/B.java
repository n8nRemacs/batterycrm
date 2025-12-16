package com.avito.android.photo_gallery;

import J70.c;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.permissions.t;
import com.avito.android.util.L5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhotoGalleryActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.PhotoGalleryActivity$bindPhotoDownloadViewModel$1", f = "PhotoGalleryActivity.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class B extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f216472q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PhotoGalleryActivity f216473r;

    /* compiled from: PhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.PhotoGalleryActivity$bindPhotoDownloadViewModel$1$1", f = "PhotoGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f216474q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PhotoGalleryActivity f216475r;

        /* compiled from: PhotoGalleryActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.photo_gallery.PhotoGalleryActivity$bindPhotoDownloadViewModel$1$1$1", f = "PhotoGalleryActivity.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.photo_gallery.B$a$a, reason: collision with other inner class name */
        public static final class C6491a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f216476q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhotoGalleryActivity f216477r;

            /* compiled from: PhotoGalleryActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.photo_gallery.B$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C6492a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PhotoGalleryActivity f216478b;

                public C6492a(PhotoGalleryActivity photoGalleryActivity) {
                    this.f216478b = photoGalleryActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    J70.c cVar = (J70.c) obj;
                    int i12 = PhotoGalleryActivity.f216648B;
                    PhotoGalleryActivity photoGalleryActivity = this.f216478b;
                    if (cVar instanceof c.a) {
                        photoGalleryActivity.f216662y = ((c.a) cVar).f8790a;
                        com.avito.android.permissions.t.f215141z.getClass();
                        photoGalleryActivity.f216649A.b(t.a.f215143b);
                    } else if (cVar instanceof c.b) {
                        L5.b(photoGalleryActivity, ((c.b) cVar).f8791a.k0(photoGalleryActivity), 0);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f216478b, PhotoGalleryActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/photo_download/feature/mvi/entity/PhotoDownloadOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6491a(PhotoGalleryActivity photoGalleryActivity, Continuation<? super C6491a> continuation) {
                super(2, continuation);
                this.f216477r = photoGalleryActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6491a(this.f216477r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((C6491a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f216476q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    int i13 = PhotoGalleryActivity.f216648B;
                    PhotoGalleryActivity photoGalleryActivity = this.f216477r;
                    com.avito.android.photo_download.feature.mvi.j jVar = (com.avito.android.photo_download.feature.mvi.j) photoGalleryActivity.f216657t.getValue();
                    C6492a c6492a = new C6492a(photoGalleryActivity);
                    this.f216476q = 1;
                    if (jVar.ke(c6492a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PhotoGalleryActivity photoGalleryActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f216475r = photoGalleryActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f216475r, continuation);
            aVar.f216474q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((kotlinx.coroutines.T) this.f216474q, null, null, new C6491a(this.f216475r, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(PhotoGalleryActivity photoGalleryActivity, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f216473r = photoGalleryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B(this.f216473r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((B) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f216472q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            PhotoGalleryActivity photoGalleryActivity = this.f216473r;
            a aVar = new a(photoGalleryActivity, null);
            this.f216472q = 1;
            if (C23056p0.b(photoGalleryActivity, state, aVar, this) == coroutine_suspended) {
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
