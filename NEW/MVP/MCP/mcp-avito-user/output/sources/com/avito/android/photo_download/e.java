package com.avito.android.photo_download;

import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.net.Uri;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: PhotoDownloadManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_download/e;", "Lcom/avito/android/photo_download/d;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPhotosStorage f216432a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f216433b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f216434c;

    /* compiled from: PhotoDownloadManager.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/arch/mvi/utils/c;", "", "Landroid/net/Uri;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/arch/mvi/utils/c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_download.PhotoDownloadManagerImpl$downloadImageToGallery$2", f = "PhotoDownloadManager.kt", i = {0}, l = {30}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends Uri>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public e f216435q;

        /* renamed from: r, reason: collision with root package name */
        public int f216436r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f216437s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Uri f216439u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f216439u = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f216439u, continuation);
            aVar.f216437s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends Uri>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object bVar;
            T t12;
            e eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f216436r;
            Uri uri = this.f216439u;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    t12 = (T) this.f216437s;
                    e eVar2 = e.this;
                    h hVar = eVar2.f216433b;
                    this.f216437s = t12;
                    this.f216435q = eVar2;
                    this.f216436r = 1;
                    Object objA = hVar.a(uri, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = eVar2;
                    obj = objA;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = this.f216435q;
                    t12 = (T) this.f216437s;
                    C42729a0.b(obj);
                }
                U.d(t12);
                bVar = new c.C2712c(SharedPhotosStorage.c.a(eVar.f216432a, (Bitmap) obj, null, null, 30));
            } catch (Throwable th2) {
                Q0.e(getF411447c());
                bVar = new c.b(th2);
            }
            if (!(bVar instanceof c.C2712c)) {
                if (!(bVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th3 = (Throwable) ((c.b) bVar).f92027b;
                V2.f318762a.j("PhotoDownloadManager", "Failed to download image: Url = " + uri, th3);
            }
            return bVar;
        }
    }

    @Inject
    public e(@k SharedPhotosStorage sharedPhotosStorage, @k h hVar, @k R0 r02) {
        this.f216432a = sharedPhotosStorage;
        this.f216433b = hVar;
        this.f216434c = r02;
    }

    @Override // com.avito.android.photo_download.d
    @l
    public final Object a(@k Uri uri, @k Continuation<? super com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends Uri>> continuation) {
        return C43259k.g(this.f216434c.a(), new a(uri, null), continuation);
    }
}
