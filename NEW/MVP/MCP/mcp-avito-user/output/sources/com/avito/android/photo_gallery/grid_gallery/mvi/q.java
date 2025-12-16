package com.avito.android.photo_gallery.grid_gallery.mvi;

import T70.c;
import com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity;
import com.avito.android.photo_gallery.grid_gallery.items.double_entity.GridGalleryDoubleEntityItem;
import com.avito.android.photo_gallery.grid_gallery.items.single_entity.GridGallerySingleEntityItem;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$updateGalleryItemPosition$1", f = "GridGalleryActor.kt", i = {0, 0, 1}, l = {239, 245}, m = "invokeSuspend", n = {"$this$flow", "closestContentItemEntity", "closestContentItemEntity"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes14.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public GridGalleryItemEntity f217380q;

    /* renamed from: r, reason: collision with root package name */
    public int f217381r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f217382s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T70.e f217383t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c.d f217384u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f217385v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(T70.e eVar, c.d dVar, n nVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f217383t = eVar;
        this.f217384u = dVar;
        this.f217385v = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f217383t, this.f217384u, this.f217385v, continuation);
        qVar.f217382s = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        GridGalleryItemEntity gridGalleryItemEntity;
        GridGalleryItemEntity gridGalleryItemEntity2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f217381r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f217382s;
            ?? r12 = this.f217383t.f15424i.f15426b.f15383c;
            if (r12.isEmpty()) {
                return G0.f406611a;
            }
            c.d dVar = this.f217384u;
            int i13 = dVar.f15402a;
            int i14 = dVar.f15403b;
            int i15 = (i13 + i14) / 2;
            int i16 = 0;
            if (i13 == 0) {
                i14 = 0;
            } else if (i14 != r12.size() - 1) {
                i14 = i15;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) C42745f0.K(i14, r12);
            if (aVar == null) {
                return G0.f406611a;
            }
            GridGalleryItemEntity gridGalleryItemEntity3 = null;
            com.avito.conveyor_item.a aVar2 = aVar;
            do {
                if (aVar != null || aVar2 != null) {
                    aVar2 = (com.avito.conveyor_item.a) C42745f0.K(i14 + i16, r12);
                    aVar = (com.avito.conveyor_item.a) C42745f0.K(i14 - i16, r12);
                    if (aVar2 instanceof GridGallerySingleEntityItem) {
                        gridGalleryItemEntity3 = ((GridGallerySingleEntityItem) aVar2).f217281c;
                    } else if (aVar2 instanceof GridGalleryDoubleEntityItem) {
                        gridGalleryItemEntity3 = ((GridGalleryDoubleEntityItem) aVar2).f217247d;
                    } else if (aVar instanceof GridGallerySingleEntityItem) {
                        gridGalleryItemEntity3 = ((GridGallerySingleEntityItem) aVar).f217281c;
                    } else if (aVar instanceof GridGalleryDoubleEntityItem) {
                        gridGalleryItemEntity3 = ((GridGalleryDoubleEntityItem) aVar).f217247d;
                    }
                    if (gridGalleryItemEntity3 == null) {
                        i16++;
                    }
                }
                if (gridGalleryItemEntity3 != null) {
                    GridGalleryInternalAction.UpdateGalleryItemPosition updateGalleryItemPosition = new GridGalleryInternalAction.UpdateGalleryItemPosition(gridGalleryItemEntity3.getF217212c(), gridGalleryItemEntity3.getF217213d());
                    this.f217382s = interfaceC43172j2;
                    this.f217380q = gridGalleryItemEntity3;
                    this.f217381r = 1;
                    if (interfaceC43172j2.emit(updateGalleryItemPosition, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC43172j = interfaceC43172j2;
                    gridGalleryItemEntity = gridGalleryItemEntity3;
                }
                return G0.f406611a;
            } while (Q0.h(getF411447c()));
            return G0.f406611a;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gridGalleryItemEntity2 = (GridGalleryItemEntity) this.f217382s;
            C42729a0.b(obj);
            this.f217385v.f217345d.b(gridGalleryItemEntity2.getF217213d());
            return G0.f406611a;
        }
        gridGalleryItemEntity = this.f217380q;
        interfaceC43172j = (InterfaceC43172j) this.f217382s;
        C42729a0.b(obj);
        GridGalleryInternalAction.UpdateLastValidGridGalleryItemPosition updateLastValidGridGalleryItemPosition = new GridGalleryInternalAction.UpdateLastValidGridGalleryItemPosition(gridGalleryItemEntity.getF217215f());
        this.f217382s = gridGalleryItemEntity;
        this.f217380q = null;
        this.f217381r = 2;
        if (interfaceC43172j.emit(updateLastValidGridGalleryItemPosition, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        gridGalleryItemEntity2 = gridGalleryItemEntity;
        this.f217385v.f217345d.b(gridGalleryItemEntity2.getF217213d());
        return G0.f406611a;
    }
}
