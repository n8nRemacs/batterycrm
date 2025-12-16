package com.avito.android.profile_management_core.images;

import Y41.p;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.util.V2;
import com.avito.android.util.Y;
import io.reactivex.rxjava3.core.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: ProfileManagementImageInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromPhotoPicker;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$getSelectedPhotos$2", f = "ProfileManagementImageInteractor.kt", i = {}, l = {139, 146, 146, 146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super List<? extends UploadImage.ImageFromPhotoPicker>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Serializable f226632q;

    /* renamed from: r, reason: collision with root package name */
    public int f226633r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f226634s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f226635t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ UploadImage.Type f226636u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f226637v;

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$getSelectedPhotos$2$2", f = "ProfileManagementImageInteractor.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226638q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d f226639r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f226639r = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f226639r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226638q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f226638q = 1;
                if (this.f226639r.a(this) == coroutine_suspended) {
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
    public c(d dVar, String str, UploadImage.Type type, String str2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f226634s = dVar;
        this.f226635t = str;
        this.f226636u = type;
        this.f226637v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f226634s, this.f226635t, this.f226636u, this.f226637v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super List<? extends UploadImage.ImageFromPhotoPicker>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Object objC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226633r;
        String str = this.f226635t;
        d dVar = this.f226634s;
        try {
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    z<CloseableDataSource<? extends PhotoUpload>> zVarA = dVar.f226642c.a(str);
                    this.f226633r = 1;
                    objC = C43292o.c(zVarA, this);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2 || i12 == 3) {
                            List list = (List) this.f226632q;
                            C42729a0.b(obj);
                            return list;
                        }
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.f226632q;
                        C42729a0.b(obj);
                        throw th2;
                    }
                    C42729a0.b(obj);
                    objC = obj;
                }
                ArrayList arrayListA = Y.a((CloseableDataSource) objC);
                UploadImage.Type type = this.f226636u;
                String str2 = this.f226637v;
                ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    String str3 = str2;
                    arrayList2.add(d.m(dVar, (PhotoUpload) it.next(), str, dVar.f226645f, type, str2));
                    arrayList = arrayList2;
                    str2 = str3;
                }
                ArrayList arrayList3 = arrayList;
                C43135f1 c43135f1 = C43135f1.f411090b;
                a aVar = new a(dVar, null);
                this.f226632q = arrayList3;
                this.f226633r = 2;
                return C43259k.g(c43135f1, aVar, this) == coroutine_suspended ? coroutine_suspended : arrayList3;
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "ProfileManagementImageInteractor", e12);
                C42784z0 c42784z0 = C42784z0.f406748b;
                C43135f1 c43135f12 = C43135f1.f411090b;
                a aVar2 = new a(dVar, null);
                this.f226632q = c42784z0;
                this.f226633r = 3;
                return C43259k.g(c43135f12, aVar2, this) == coroutine_suspended ? coroutine_suspended : c42784z0;
            }
        } catch (Throwable th3) {
            C43135f1 c43135f13 = C43135f1.f411090b;
            a aVar3 = new a(dVar, null);
            this.f226632q = th3;
            this.f226633r = 4;
            if (C43259k.g(c43135f13, aVar3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th3;
        }
    }
}
