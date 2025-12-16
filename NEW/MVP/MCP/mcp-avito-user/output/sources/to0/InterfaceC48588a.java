package tO0;

import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.virtual_deal_room_reference_category.generated.api.create_process_api.CreateProcessApiResponse;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import uO0.C48925a;
import vO0.C49242a;

/* compiled from: VirtualDealRoomReferenceCategoryApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LtO0/a;", "", "LvO0/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse;", "b", "(LvO0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invitationId", "LuO0/a;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: tO0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC48588a {
    @o("1/demo/invitation/{invitationId}/accept")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("invitationId") @k String str, @k Continuation<? super TypedResult<C48925a>> continuation);

    @o("1/demo/create-process")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k C49242a c49242a, @k Continuation<? super TypedResult<CreateProcessApiResponse>> continuation);
}
