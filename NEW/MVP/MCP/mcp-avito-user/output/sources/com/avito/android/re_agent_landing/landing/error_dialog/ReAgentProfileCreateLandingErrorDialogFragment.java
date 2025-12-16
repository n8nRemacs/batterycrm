package com.avito.android.re_agent_landing.landing.error_dialog;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import cv.c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentProfileCreateLandingErrorDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/error_dialog/ReAgentProfileCreateLandingErrorDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReAgentProfileCreateLandingErrorDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f250616h0;

    /* compiled from: ReAgentProfileCreateLandingErrorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/error_dialog/ReAgentProfileCreateLandingErrorDialogFragment$a;", "", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReAgentProfileCreateLandingErrorDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View viewFindViewById = view.findViewById(R.id.re_agent_profile_create_landing_error_description);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            ReAgentProfileCreateLandingErrorDialogFragment reAgentProfileCreateLandingErrorDialogFragment = ReAgentProfileCreateLandingErrorDialogFragment.this;
            String string = reAgentProfileCreateLandingErrorDialogFragment.getString(R.string.re_agent_profile_create_landing_error_dialog_description);
            com.avito.android.re_agent_landing.landing.error_dialog.a aVar = new com.avito.android.re_agent_landing.landing.error_dialog.a(reAgentProfileCreateLandingErrorDialogFragment, reAgentProfileCreateLandingErrorDialogFragment.getString(R.string.re_agent_profile_create_landing_error_dialog_description_url));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int length = string.length() - 9;
            int length2 = string.length();
            spannableStringBuilder.setSpan(aVar, length, length2, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), length, length2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.black, textView.getContext())), length, length2, 33);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public ReAgentProfileCreateLandingErrorDialogFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.re_agent_landing.landing.error_dialog.di.a.a().a(c.b(this)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        d dVar = new d(requireContext(), 0, 2, null);
        dVar.C(R.layout.re_agent_profile_create_landing_error_dialog_content, new b());
        d.M(dVar, null, false, true, 7);
        d.I(dVar, true);
        return dVar;
    }
}
