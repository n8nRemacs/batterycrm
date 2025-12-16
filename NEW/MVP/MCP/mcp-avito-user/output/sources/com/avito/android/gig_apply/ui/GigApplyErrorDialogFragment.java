package com.avito.android.gig_apply.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.gig_apply.ui.GigApplyErrorResult;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: GigApplyErrorDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyErrorDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigApplyErrorDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f159844h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public TextView f159845i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public TextView f159846j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public Button f159847k0;

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f159843m0 = {m0.f406844a.e(new Y(GigApplyErrorDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/gig_apply/ui/GigApplyErrorOpenParams;", 0))};

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f159842l0 = new a(null);

    /* compiled from: GigApplyErrorDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyErrorDialogFragment$a;", "", "<init>", "()V", "", "GIG_APPLY_ERROR_BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "GIG_APPLY_ERROR_BOTTOM_SHEET_RESULT_KEY", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GigApplyErrorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f159849m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(1);
            this.f159849m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = GigApplyErrorDialogFragment.f159842l0;
            GigApplyErrorDialogFragment gigApplyErrorDialogFragment = GigApplyErrorDialogFragment.this;
            View viewFindViewById = view2.findViewById(R.id.apply_error_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            gigApplyErrorDialogFragment.f159845i0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.apply_error_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            gigApplyErrorDialogFragment.f159846j0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.apply_error_button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            gigApplyErrorDialogFragment.f159847k0 = (Button) viewFindViewById3;
            TextView textView = gigApplyErrorDialogFragment.f159845i0;
            if (textView != null) {
                I5.a(textView, GigApplyErrorDialogFragment.f5(gigApplyErrorDialogFragment).f159851b, false);
            }
            TextView textView2 = gigApplyErrorDialogFragment.f159846j0;
            if (textView2 != null) {
                I5.a(textView2, GigApplyErrorDialogFragment.f5(gigApplyErrorDialogFragment).f159852c, false);
            }
            Button button = gigApplyErrorDialogFragment.f159847k0;
            if (button != null) {
                com.avito.android.lib.design.button.b.a(button, GigApplyErrorDialogFragment.f5(gigApplyErrorDialogFragment).f159853d, false);
            }
            Button button2 = gigApplyErrorDialogFragment.f159847k0;
            if (button2 != null) {
                button2.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(16, gigApplyErrorDialogFragment, this.f159849m));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigApplyErrorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C22960s.a(C22777e.b(new Q("GIG_APPLY_ERROR_BOTTOM_SHEET_RESULT_KEY", GigApplyErrorResult.Closed.f159855b)), GigApplyErrorDialogFragment.this, "GIG_APPLY_ERROR_BOTTOM_SHEET_REQUEST_KEY");
            return G0.f406611a;
        }
    }

    public GigApplyErrorDialogFragment() {
        super(0, 1, null);
        this.f159844h0 = new C35968w3(this);
    }

    public static final GigApplyErrorOpenParams f5(GigApplyErrorDialogFragment gigApplyErrorDialogFragment) {
        return (GigApplyErrorOpenParams) gigApplyErrorDialogFragment.f159844h0.getValue(gigApplyErrorDialogFragment, f159843m0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.C(R.layout.gig_apply_error_dialog, new b(dVar));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.Q(new c());
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f159845i0 = null;
        this.f159846j0 = null;
        this.f159847k0 = null;
    }
}
