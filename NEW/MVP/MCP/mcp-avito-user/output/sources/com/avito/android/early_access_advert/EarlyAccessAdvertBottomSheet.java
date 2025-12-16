package com.avito.android.early_access_advert;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.early_access_advert.info_screen.EarlyAccessAdvertInfoFragment;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import com.avito.android.ui.fragments.BaseDialogFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessAdvertBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/early_access_advert/EarlyAccessAdvertBottomSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/early_access_advert/h;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EarlyAccessAdvertBottomSheet extends BaseDialogFragment implements h, InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f145585l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.early_access_advert.a f145586h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f145587i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f145588j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public N f145589k0;

    /* compiled from: EarlyAccessAdvertBottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access_advert/EarlyAccessAdvertBottomSheet$a;", "", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EarlyAccessAdvertBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return EarlyAccessAdvertBottomSheet.this.requireArguments().getString("advert_id");
        }
    }

    /* compiled from: EarlyAccessAdvertBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessAdvert;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<EarlyAccessAdvert> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final EarlyAccessAdvert invoke() {
            Bundle bundleRequireArguments = EarlyAccessAdvertBottomSheet.this.requireArguments();
            return (EarlyAccessAdvert) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("early_access_advert_key", EarlyAccessAdvert.class) : bundleRequireArguments.getParcelable("early_access_advert_key"));
        }
    }

    /* compiled from: EarlyAccessAdvertBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ EarlyAccessAdvertFeedbackType f145593m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType) {
            super(0);
            this.f145593m = earlyAccessAdvertFeedbackType;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.early_access_advert.a aVar = EarlyAccessAdvertBottomSheet.this.f145586h0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.b(this.f145593m.f145655c);
            return G0.f406611a;
        }
    }

    public EarlyAccessAdvertBottomSheet() {
        super(0, 1, null);
        this.f145587i0 = C42727D.c(new b());
        this.f145588j0 = C42727D.c(new c());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.early_access_advert.di.a.a().a((com.avito.android.early_access_advert.di.e) C29972i.a(C29972i.b(this), com.avito.android.early_access_advert.di.e.class)).a(this);
    }

    @Override // com.avito.android.early_access_advert.h
    public final void n8(@k PrintableText printableText) {
        Dialog dialog = getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
        if (dVar != null) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.d(cVar, dVar, printableText, null, f.c.a.b(), 0, ToastBarPosition.f181044b, 942);
        }
    }

    @Override // com.avito.android.early_access_advert.h
    public final void o8() {
        this.f145589k0 = null;
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(requireContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        dVar.D(R.layout.early_access_advert_bottom_sheet, true);
        j.b(dVar, true, 4);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.T();
        if (bundle == null) {
            this.f145589k0 = new com.avito.android.early_access_advert.b(this);
            H hE2 = getChildFragmentManager().e();
            EarlyAccessAdvertInfoFragment.a aVar = EarlyAccessAdvertInfoFragment.f145703s0;
            EarlyAccessAdvert earlyAccessAdvert = (EarlyAccessAdvert) this.f145588j0.getValue();
            aVar.getClass();
            EarlyAccessAdvertInfoFragment earlyAccessAdvertInfoFragment = new EarlyAccessAdvertInfoFragment();
            earlyAccessAdvertInfoFragment.setArguments(C22777e.b(new Q("early_access_advert_key", earlyAccessAdvert)));
            hE2.n(R.id.fragment_container, earlyAccessAdvertInfoFragment, null);
            hE2.c(null);
            hE2.e();
        }
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ?? r12 = this.f145589k0;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    @Override // com.avito.android.early_access_advert.h
    public final void p8(@k EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, @k EarlyAccessFeedback earlyAccessFeedback) {
        this.f145589k0 = new d(earlyAccessAdvertFeedbackType);
        H hE2 = getChildFragmentManager().e();
        hE2.o(R.anim.early_access_advert_enter_from_right, R.anim.early_access_advert_exit_to_left, 0, 0);
        EarlyAccessAdvertFeedbackFragment.a aVar = EarlyAccessAdvertFeedbackFragment.f145620s0;
        String str = (String) this.f145587i0.getValue();
        aVar.getClass();
        EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment = new EarlyAccessAdvertFeedbackFragment();
        earlyAccessAdvertFeedbackFragment.setArguments(C22777e.b(new Q("advert_id", str), new Q("early_access_feedback_type_key", earlyAccessAdvertFeedbackType), new Q("early_access_feedback_key", earlyAccessFeedback)));
        hE2.n(R.id.fragment_container, earlyAccessAdvertFeedbackFragment, null);
        hE2.c(null);
        hE2.e();
    }
}
