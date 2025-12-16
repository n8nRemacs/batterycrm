package com.avito.android.gig_shift_start.deeplink;

import Ju.InterfaceC14249c;
import com.avito.android.R;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import com.avito.android.gig_shift_start.GigShiftStartDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;
import sv.C48421d;

/* compiled from: GigShiftStartDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f160745b;

    public e(f fVar) {
        this.f160745b = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof GigShiftActionDeeplink.b.a;
        f fVar = this.f160745b;
        if (z12) {
            BarcodeScannerParams.f99049e.getClass();
            fVar.f160748h.J(fVar.f160752l.a(new BarcodeScannerParams(com.avito.android.printable_text.a.a(R.string.scanner_description_default), BarcodeScannerType.f99054c, false)), C48421d.a(fVar), com.avito.android.deeplink_handler.view.c.f134589l);
        }
        if (interfaceC14249c instanceof GigShiftActionDeeplink.b.C4686b) {
            fVar.i(l.f160770b, fVar.f160746f, ((GigShiftActionDeeplink.b.C4686b) interfaceC14249c).f160390b);
        }
        if (interfaceC14249c instanceof GigShiftActionDeeplink.b.d) {
            fVar.j(GigShiftStartDeeplink.b.a.f160740b);
        }
        return G0.f406611a;
    }
}
