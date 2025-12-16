package com.avito.android.photo_picker.camera_mvi.mvi;

import android.net.Uri;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$p;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processSelectedPhotos$1", f = "CameraActor.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super a.p>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219232q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219233r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f219234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f219235t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f219236u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, ArrayList arrayList, int i12, Continuation continuation) {
        super(2, continuation);
        this.f219234s = aVar;
        this.f219235t = arrayList;
        this.f219236u = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f219234s, this.f219235t, this.f219236u, continuation);
        iVar.f219233r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.p> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f219232q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f219233r;
            ArrayList arrayList = this.f219235t;
            Uri uri = (Uri) C42745f0.K(arrayList.size() - 1, arrayList);
            a aVar = this.f219234s;
            CameraState.c cVar = new CameraState.c(a.c(aVar, uri), a.c(aVar, (Uri) C42745f0.K(arrayList.size() - 2, arrayList)), a.c(aVar, (Uri) C42745f0.K(arrayList.size() - 3, arrayList)));
            StringBuilder sb2 = new StringBuilder();
            int i13 = this.f219236u;
            sb2.append(i13);
            sb2.append('/');
            int i14 = aVar.f219121a;
            sb2.append(i14);
            a.p pVar = new a.p(cVar, sb2.toString(), i13 >= i14);
            this.f219232q = 1;
            if (interfaceC43172j.emit(pVar, this) == coroutine_suspended) {
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
