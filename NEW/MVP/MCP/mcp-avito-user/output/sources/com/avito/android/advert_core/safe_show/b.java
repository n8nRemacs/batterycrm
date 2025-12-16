package com.avito.android.advert_core.safe_show;

import Y61.k;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.g;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafeShowDialogFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safe_show/b;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84183a;

    public b(boolean z12) {
        this.f84183a = z12;
    }

    public final void a(@k Context context, @k String str, @k String str2) {
        Dialog dialogA;
        if (this.f84183a) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.advert_details_safe_show_bottomshet_layout, (ViewGroup) null);
            a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
            a aVar = new a(viewInflate);
            c5284a.getClass();
            dialogA = a.C5284a.a(context, 0, R.style.SafeShowFloatingDialogStyle, aVar);
            View viewFindViewById = viewInflate.findViewById(R.id.avito_bottom_sheet_notch);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.w(viewFindViewById);
            View viewFindViewById2 = viewInflate.findViewById(R.id.title);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById2).setText(str);
            View viewFindViewById3 = viewInflate.findViewById(R.id.text);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById3).setText(str2);
        } else {
            d dVar = new d(context, 0, 2, null);
            dVar.setContentView(R.layout.advert_details_safe_show_bottomshet_layout);
            dVar.setTitle((CharSequence) null);
            if (context.getResources().getConfiguration().orientation == 2) {
                dVar.S(context.getResources().getDisplayMetrics().widthPixels);
            }
            ((TextView) dVar.findViewById(R.id.title)).setText(str);
            ((TextView) dVar.findViewById(R.id.text)).setText(str2);
            dialogA = dVar;
        }
        dialogA.setCancelable(true);
        dialogA.setCanceledOnTouchOutside(true);
        g.a(dialogA);
    }
}
