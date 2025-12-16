package com.avito.android.publish.slots.images_groups_recommendations;

import com.avito.android.category_parameters.f;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesGroupsRecommendationsSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "images", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.images_groups_recommendations.ImagesGroupsRecommendationsSlotWrapper$subscribeToPhotos$1", f = "ImagesGroupsRecommendationsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class j extends SuspendLambda implements Y41.p<List<? extends G>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f244245q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f244246r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f244246r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f244246r, continuation);
        jVar.f244245q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(List<? extends G> list, Continuation<? super G0> continuation) {
        return ((j) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = (List) this.f244245q;
        i iVar = this.f244246r;
        List list2 = list;
        boolean z12 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((G) it.next()).f218070c instanceof InterfaceC33208b.InterfaceC6540b.C6541b) {
                    z12 = true;
                    break;
                }
            }
        }
        iVar.f244184n = z12;
        if (this.f244246r.f244184n) {
            this.f244246r.f244179i.accept(new f.b(SlotType.IMAGES_GROUPS_RECOMMENDATIONS, null));
        }
        return G0.f406611a;
    }
}
