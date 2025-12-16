package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet;

import android.app.Dialog;
import android.view.View;
import androidx.core.os.C22777e;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.DeleteDeviceBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet.DeviceReplacementBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ub0.InterfaceC49015c;

/* compiled from: DeleteDeviceBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.DeleteDeviceBottomSheetFragment$onCreateDialog$1$1$1$1", f = "DeleteDeviceBottomSheetFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f227619q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DeleteDeviceBottomSheetFragment f227620r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f227621s;

    /* compiled from: DeleteDeviceBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lub0/c;", "event", "Lkotlin/G0;", "emit", "(Lub0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeleteDeviceBottomSheetFragment f227622b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f227623c;

        public a(DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
            this.f227622b = deleteDeviceBottomSheetFragment;
            this.f227623c = dVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            View viewV;
            InterfaceC49015c interfaceC49015c = (InterfaceC49015c) obj;
            boolean z12 = interfaceC49015c instanceof InterfaceC49015c.a;
            DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment = this.f227622b;
            if (z12) {
                deleteDeviceBottomSheetFragment.getParentFragmentManager().o0(C22777e.b(new Q("iac_enabled_result_device", ((InterfaceC49015c.a) interfaceC49015c).f440114a)), "iac_enabled_result_success");
                this.f227623c.dismiss();
            } else if (interfaceC49015c instanceof InterfaceC49015c.b) {
                List<DeviceListItem> list = ((InterfaceC49015c.b) interfaceC49015c).f440115a;
                DeleteDeviceBottomSheetFragment.a aVar = DeleteDeviceBottomSheetFragment.f227518m0;
                new DeviceReplacementBottomSheetFragment(new u(deleteDeviceBottomSheetFragment), list).show(deleteDeviceBottomSheetFragment.getParentFragmentManager(), "DeviceReplacementBottomSheetFragment");
            } else if (interfaceC49015c instanceof InterfaceC49015c.C12723c) {
                Dialog dialogRequireDialog = deleteDeviceBottomSheetFragment.requireDialog();
                com.avito.android.lib.design.bottom_sheet.d dVar = dialogRequireDialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialogRequireDialog : null;
                if (dVar != null && (viewV = dVar.v()) != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableText = ((InterfaceC49015c.C12723c) interfaceC49015c).f440116a;
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, viewV, printableText, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment, com.avito.android.lib.design.bottom_sheet.d dVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f227620r = deleteDeviceBottomSheetFragment;
        this.f227621s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f227620r, this.f227621s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f227619q;
        if (i12 == 0) {
            C42729a0.b(obj);
            DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment = this.f227620r;
            InterfaceC43160i<InterfaceC49015c> events = ((B) deleteDeviceBottomSheetFragment.f227520i0.getValue()).getEvents();
            a aVar = new a(deleteDeviceBottomSheetFragment, this.f227621s);
            this.f227619q = 1;
            if (events.collect(aVar, this) == coroutine_suspended) {
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
