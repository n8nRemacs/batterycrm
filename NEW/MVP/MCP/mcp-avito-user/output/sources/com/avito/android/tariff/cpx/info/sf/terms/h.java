package com.avito.android.tariff.cpx.info.sf.terms;

import BB0.b;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsDialogFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsDialogFragment$ScreenContent$1", f = "TariffCpxInfoSfTermsDialogFragment.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f296878q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<BB0.b> f296879r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TariffCpxInfoSfTermsDialogFragment f296880s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f296881t;

    /* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBB0/b;", "event", "Lkotlin/G0;", "emit", "(LBB0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TariffCpxInfoSfTermsDialogFragment f296882b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f296883c;

        public a(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            this.f296882b = tariffCpxInfoSfTermsDialogFragment;
            this.f296883c = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            BB0.b bVar = (BB0.b) obj;
            boolean z12 = bVar instanceof b.a;
            TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment = this.f296882b;
            if (z12) {
                tariffCpxInfoSfTermsDialogFragment.dismiss();
            } else {
                boolean z13 = bVar instanceof b.d;
                InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f296883c;
                if (z13) {
                    interfaceC22204y1.setValue(Boxing.boxBoolean(false));
                    Fragment parentFragment = tariffCpxInfoSfTermsDialogFragment.getParentFragment();
                    if (parentFragment != null) {
                        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, parentFragment, com.avito.android.printable_text.b.f(((b.d) bVar).f1234a), null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, 942);
                    }
                    Fragment parentFragment2 = tariffCpxInfoSfTermsDialogFragment.getParentFragment();
                    if (parentFragment2 != null) {
                        parentFragment2.getParentFragmentManager().o0(C22777e.a(), "SF_TERMS_DIALOG_REQUEST_KEY");
                    }
                    tariffCpxInfoSfTermsDialogFragment.dismiss();
                } else if (bVar instanceof b.C0046b) {
                    interfaceC22204y1.setValue(Boxing.boxBoolean(false));
                    b.C0046b c0046b = (b.C0046b) bVar;
                    String message = c0046b.f1232a.getMessage();
                    if (message != null) {
                        TariffCpxInfoSfTermsDialogFragment.a aVar = TariffCpxInfoSfTermsDialogFragment.f296814n0;
                        Dialog dialog = tariffCpxInfoSfTermsDialogFragment.getDialog();
                        com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                        KeyEvent.Callback callbackU = dVar != null ? dVar.u() : null;
                        ViewGroup viewGroup = callbackU instanceof ViewGroup ? (ViewGroup) callbackU : null;
                        if (viewGroup != null) {
                            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, viewGroup, com.avito.android.printable_text.b.f(message), null, null, null, new f.c(c0046b.f1232a), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                        }
                    }
                } else if (L.f(bVar, b.c.f1233a)) {
                    interfaceC22204y1.setValue(Boxing.boxBoolean(true));
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(InterfaceC43160i<? extends BB0.b> interfaceC43160i, TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f296879r = interfaceC43160i;
        this.f296880s = tariffCpxInfoSfTermsDialogFragment;
        this.f296881t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f296879r, this.f296880s, this.f296881t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f296878q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f296880s, this.f296881t);
            this.f296878q = 1;
            if (this.f296879r.collect(aVar, this) == coroutine_suspended) {
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
