package com.avito.android.beduin.ui.universal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.ui.universal.UniversalBeduinFragment;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalBeduinPushBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/universal/UniversalBeduinPushBottomSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/beduin/ui/universal/c;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UniversalBeduinPushBottomSheetDialog extends BaseDialogFragment implements c, InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final a f104450h0 = new a(null);

    /* compiled from: UniversalBeduinPushBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/universal/UniversalBeduinPushBottomSheetDialog$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UniversalBeduinPushBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/ui/universal/UniversalBeduinPushBottomSheetDialog$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, R.style.UniversalBeduinDialog);
            T();
            com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
            setCancelable(true);
            setCanceledOnTouchOutside(true);
            com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        public final void onBackPressed() {
            UniversalBeduinPushBottomSheetDialog.this.M1(null);
        }
    }

    public UniversalBeduinPushBottomSheetDialog() {
        super(0, 1, null);
    }

    @Override // com.avito.android.beduin.ui.universal.c
    public final void M1(@Y61.l String str) {
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) getDialog();
        if (getChildFragmentManager().L() == 1) {
            dVar.r();
            return;
        }
        if (L.f(getChildFragmentManager().K(0).getName(), str)) {
            dVar.r();
        } else if (str != null) {
            getChildFragmentManager().a0(1, str);
        } else {
            getChildFragmentManager().Y();
        }
    }

    @Override // com.avito.android.beduin.ui.universal.c
    public final void k1(@Y61.k Y41.a<G0> aVar) {
        ((com.avito.android.lib.design.bottom_sheet.d) getDialog()).setOnDismissListener(new com.avito.android.advert.item.properties.g(7, aVar, this));
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return new b(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.beduin_activity, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Long lValueOf;
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                lValueOf = arguments.containsKey("contentId") ? Long.valueOf(arguments.getLong("contentId")) : null;
            } else {
                lValueOf = null;
            }
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString(ContextActionHandler.Link.URL) : null;
            Bundle arguments3 = getArguments();
            String string2 = arguments3 != null ? arguments3.getString("screenName") : null;
            Bundle arguments4 = getArguments();
            String string3 = arguments4 != null ? arguments4.getString(BeduinPromoBlockModel.SERIALIZED_NAME_THEME) : null;
            if (lValueOf == null && string == null) {
                throw new IllegalStateException("Url or contentId must not be null!");
            }
            UniversalBeduinFragment.a aVar = UniversalBeduinFragment.f104416B0;
            Integer numValueOf = Integer.valueOf(R.drawable.common_ic_arrow_back_24);
            Integer numValueOf2 = Integer.valueOf(R.color.common_black);
            ScreenStyle screenStyle = ScreenStyle.PUSH_BOTTOM_SHEET;
            BeduinComponentTheme.f100605c.getClass();
            UniversalBeduinFragment.Params params = new UniversalBeduinFragment.Params(lValueOf, string, numValueOf, numValueOf2, screenStyle, BeduinComponentTheme.a.a(string3), string2, null, 128, null);
            aVar.getClass();
            UniversalBeduinFragment universalBeduinFragment = new UniversalBeduinFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_params", params);
            universalBeduinFragment.setArguments(bundle2);
            H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.fragment_container, universalBeduinFragment, null);
            hE2.c(String.valueOf(universalBeduinFragment.hashCode()));
            hE2.e();
        }
    }

    @Override // com.avito.android.beduin.ui.universal.c
    public final void s2(boolean z12) {
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) getDialog();
        dVar.K(z12);
        dVar.J(z12);
    }
}
