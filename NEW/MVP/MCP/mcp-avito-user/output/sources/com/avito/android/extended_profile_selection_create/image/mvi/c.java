package com.avito.android.extended_profile_selection_create.image.mvi;

import Y41.p;
import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSetSelectionImageActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.mvi.ExtendedProfileSetSelectionImageActor$processSelectedImage$1", f = "ExtendedProfileSetSelectionImageActor.kt", i = {0}, l = {145, 152}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151759q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f151760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f151761s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f151762t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f151761s = dVar;
        this.f151762t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f151761s, this.f151762t, continuation);
        cVar.f151760r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151759q;
        d dVar = this.f151761s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f151760r;
            com.avito.android.profile_management_core.images.a aVar = dVar.f151766d;
            UploadImage.Type type = UploadImage.Type.f226693e;
            String str = dVar.f151764b.f151627c;
            this.f151760r = interfaceC43172j;
            this.f151759q = 1;
            obj = aVar.i(this.f151762t, type, str, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f151760r;
            C42729a0.b(obj);
        }
        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = (UploadImage.ImageFromPhotoPicker) C42745f0.S((List) obj);
        if (imageFromPhotoPicker == null) {
            return G0.f406611a;
        }
        dVar.f151766d.d(Collections.singletonList(imageFromPhotoPicker.f226689j));
        ExtendedProfileSetSelectionImageInternalAction.ImageUpdate imageUpdate = new ExtendedProfileSetSelectionImageInternalAction.ImageUpdate(imageFromPhotoPicker);
        this.f151760r = null;
        this.f151759q = 2;
        if (interfaceC43172j.emit(imageUpdate, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
