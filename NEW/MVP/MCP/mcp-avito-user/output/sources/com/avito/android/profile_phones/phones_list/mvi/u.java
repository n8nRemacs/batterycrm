package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.deep_linking.DeviceDeletingSheetShowLink;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$showDeviceActions$1", f = "PhonesListMviActor.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228083q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228084r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeviceListItem f228085s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33433e f228086t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PhonesListMviState f228087u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DeviceListItem deviceListItem, C33433e c33433e, PhonesListMviState phonesListMviState, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f228085s = deviceListItem;
        this.f228086t = c33433e;
        this.f228087u = phonesListMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u uVar = new u(this.f228085s, this.f228086t, this.f228087u, continuation);
        uVar.f228084r = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228083q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f228084r;
            DeviceListItem deviceListItem = this.f228085s;
            String str = deviceListItem.f227646c;
            String f227352f = this.f228086t.f227968f.getF227352f();
            List<DeviceListItem> list = this.f228087u.f228022f;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((DeviceListItem) obj2).getF78300d() != deviceListItem.getF78300d()) {
                    arrayList.add(obj2);
                }
            }
            PhonesListMviInternalAction.OpenPhoneActionsSheet openPhoneActionsSheet = new PhonesListMviInternalAction.OpenPhoneActionsSheet(str, Collections.singletonList(new PhoneListItem.Action(f227352f, true, new DeviceDeletingSheetShowLink(deviceListItem, arrayList))));
            this.f228083q = 1;
            if (interfaceC43172j.emit(openPhoneActionsSheet, this) == coroutine_suspended) {
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
