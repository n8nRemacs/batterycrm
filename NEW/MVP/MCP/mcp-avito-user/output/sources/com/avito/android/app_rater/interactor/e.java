package com.avito.android.app_rater.interactor;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.huawei.hms.common.PackageConstants;
import i.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: InAppReviewInteractorAppGallery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.app_rater.interactor.InAppReviewInteractorAppGallery$start$1", f = "InAppReviewInteractorAppGallery.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements Y41.p<I0<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f91802q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91803r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f91804s;

    /* compiled from: InAppReviewInteractorAppGallery.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<G0> f91805l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super G0> i02) {
            super(0);
            this.f91805l = i02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f91805l.r().h(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ActivityC22955m activityC22955m, Continuation continuation) {
        super(2, continuation);
        this.f91804s = activityC22955m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f91804s, continuation);
        eVar.f91803r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super G0> i02, Continuation<? super G0> continuation) {
        return ((e) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f91802q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f91803r;
            ActivityC22955m activityC22955m = this.f91804s;
            androidx.appcompat.app.m mVar = activityC22955m instanceof androidx.appcompat.app.m ? (androidx.appcompat.app.m) activityC22955m : null;
            if (mVar == null) {
                i02.h(new IllegalArgumentException("Activity is not an AppCompatActivity"));
                return G0.f406611a;
            }
            androidx.view.result.h hVarE = mVar.getActivityResultRegistry().e("App Gallery rater", new b.m(), new L91.o(i02, 6));
            Intent intent = new Intent("com.huawei.appmarket.intent.action.guidecomment");
            intent.setPackage(PackageConstants.SERVICES_PACKAGE_APPMARKET);
            hVarE.b(intent);
            a aVar = new a(i02);
            this.f91802q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
