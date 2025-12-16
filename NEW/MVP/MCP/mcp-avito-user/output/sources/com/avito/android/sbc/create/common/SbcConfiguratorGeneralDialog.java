package com.avito.android.sbc.create.common;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.review_gallery.g;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;

/* compiled from: SbcConfiguratorGeneralDialog.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/common/SbcConfiguratorGeneralDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbcConfiguratorGeneralDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f259176h0 = new a(null);

    /* compiled from: SbcConfiguratorGeneralDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/sbc/create/common/SbcConfiguratorGeneralDialog$a;", "", "<init>", "()V", "", "TEXT_KEY", "Ljava/lang/String;", "TITLE_KEY", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SbcConfiguratorGeneralDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            SbcConfiguratorGeneralDialog sbcConfiguratorGeneralDialog = (SbcConfiguratorGeneralDialog) this.receiver;
            a aVar = SbcConfiguratorGeneralDialog.f259176h0;
            Bundle arguments = sbcConfiguratorGeneralDialog.getArguments();
            CharSequence charSequence = arguments != null ? arguments.getCharSequence("text_key") : null;
            Bundle arguments2 = sbcConfiguratorGeneralDialog.getArguments();
            CharSequence charSequence2 = arguments2 != null ? arguments2.getCharSequence("title_key") : null;
            TextView textView = (TextView) view2.findViewById(R.id.message);
            TextView textView2 = (TextView) view2.findViewById(R.id.title);
            textView.setText(charSequence);
            textView2.setText(charSequence2);
            Button button = (Button) view2.findViewById(R.id.close_button);
            if (button != null) {
                button.setOnClickListener(new g(sbcConfiguratorGeneralDialog, 9));
            }
            return G0.f406611a;
        }
    }

    public SbcConfiguratorGeneralDialog() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        d dVar = new d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.C(R.layout.sbc_auto_dispatch_summary_explained_dialog, new b(1, this, SbcConfiguratorGeneralDialog.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        return dVar;
    }
}
