package com.avito.android.advert_stats.detail.tab.items.button.dialogs;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ResponsesDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/dialogs/ResponsesDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponsesDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f86257h0 = new a(null);

    /* compiled from: ResponsesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/dialogs/ResponsesDialogFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ResponsesDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) throws Resources.NotFoundException {
        d dVar = new d(requireContext(), 0, 2, null);
        dVar.D(R.layout.bottom_sheet_more_contacts, true);
        LinearLayout linearLayout = (LinearLayout) dVar.findViewById(R.id.ll_more_contacts);
        int i12 = 0;
        for (String str : linearLayout.getResources().getStringArray(R.array.stats_more_responses_dialog)) {
            i12++;
            View viewInflate = View.inflate(linearLayout.getContext(), R.layout.item_more_contacts, null);
            String strValueOf = String.valueOf(i12);
            View viewFindViewById = viewInflate.findViewById(R.id.tv_more_contacts_item);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById).setText(strValueOf);
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_more_contacts_item_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById2).setText(Html.fromHtml(str, 63));
            linearLayout.addView(viewInflate);
        }
        ((Button) dVar.findViewById(R.id.btn_more_contacts_close)).setOnClickListener(new S7.a(dVar, 23));
        ((TextView) dVar.findViewById(R.id.tv_more_contacts_description)).setText(getString(R.string.stats_more_responses_dialog_description));
        j.c(dVar, getString(R.string.stats_more_responses_dialog_title), false, 0, 0, 0, 124);
        if (getResources().getConfiguration().orientation == 1) {
            d.I(dVar, true);
        }
        return dVar;
    }
}
