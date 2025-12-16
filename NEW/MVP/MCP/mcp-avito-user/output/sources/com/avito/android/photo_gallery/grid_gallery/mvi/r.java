package com.avito.android.photo_gallery.grid_gallery.mvi;

import T70.c;
import com.avito.android.photo_gallery.grid_gallery.items.title.GridGalleryTitleItem;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GridGalleryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateNavbarChipSelectedBlockId;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$updateNavBarSelectedTitle$1", f = "GridGalleryActor.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction.UpdateNavbarChipSelectedBlockId>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f217386q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f217387r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T70.e f217388s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c.d f217389t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(T70.e eVar, c.d dVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f217388s = eVar;
        this.f217389t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f217388s, this.f217389t, continuation);
        rVar.f217387r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction.UpdateNavbarChipSelectedBlockId> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f217386q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f217387r;
            ?? r12 = this.f217388s.f15424i.f15426b.f15383c;
            if (r12.isEmpty()) {
                return G0.f406611a;
            }
            c.d dVar = this.f217389t;
            int i13 = (dVar.f15402a + dVar.f15403b) / 2;
            while (true) {
                if (-1 >= i13) {
                    str = null;
                    break;
                }
                com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) C42745f0.K(i13, r12);
                if (aVar != null) {
                    if (aVar instanceof GridGalleryTitleItem) {
                        str = ((GridGalleryTitleItem) aVar).f217304c;
                        break;
                    }
                    if (!Q0.h(getF411447c())) {
                        return G0.f406611a;
                    }
                }
                i13--;
            }
            if (str == null) {
                Iterator it = ((Collection) r12).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next instanceof GridGalleryTitleItem) {
                        break;
                    }
                }
                if (!(next instanceof GridGalleryTitleItem)) {
                    next = null;
                }
                GridGalleryTitleItem gridGalleryTitleItem = (GridGalleryTitleItem) next;
                str = gridGalleryTitleItem != null ? gridGalleryTitleItem.f217304c : null;
            }
            if (str != null) {
                GridGalleryInternalAction.UpdateNavbarChipSelectedBlockId updateNavbarChipSelectedBlockId = new GridGalleryInternalAction.UpdateNavbarChipSelectedBlockId(str);
                this.f217386q = 1;
                if (interfaceC43172j.emit(updateNavbarChipSelectedBlockId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
