package com.avito.android.photo_list_view_group_selection.mvi;

import Y41.p;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.mvi.entity.PhotoItemGroupSelectionInternalAction;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import e80.C39966c;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhotoItemGroupSelectionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_list_view_group_selection.mvi.PhotoItemGroupSelectionActor$process$1", f = "PhotoItemGroupSelectionActor.kt", i = {}, l = {22, 32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PhotoItemGroupSelectionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f218438q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f218439r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C39966c f218440s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f218441t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C39966c c39966c, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f218440s = c39966c;
        this.f218441t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f218440s, this.f218441t, continuation);
        aVar.f218439r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhotoItemGroupSelectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f218438q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f218439r;
            C39966c c39966c = this.f218440s;
            String str = c39966c.f394986d;
            if (str != null) {
                b bVar = this.f218441t;
                PhotoItemGroupSelectionParams photoItemGroupSelectionParams = bVar.f218442a;
                String str2 = photoItemGroupSelectionParams.f218375b;
                Iterator<T> it = c39966c.f394985c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((ImageGroup) next).getId(), c39966c.f394986d)) {
                        break;
                    }
                }
                ImageGroup imageGroup = (ImageGroup) next;
                PhotoItemGroupSelectionInternalAction.SelectImageGroup selectImageGroup = new PhotoItemGroupSelectionInternalAction.SelectImageGroup(str2, str, photoItemGroupSelectionParams.f218378e, imageGroup != null ? imageGroup.getTitle() : null, bVar.f218442a.f218379f);
                this.f218438q = 1;
                if (interfaceC43172j.emit(selectImageGroup, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                PhotoItemGroupSelectionInternalAction.CloseScreen closeScreen = PhotoItemGroupSelectionInternalAction.CloseScreen.f218449b;
                this.f218438q = 2;
                if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
