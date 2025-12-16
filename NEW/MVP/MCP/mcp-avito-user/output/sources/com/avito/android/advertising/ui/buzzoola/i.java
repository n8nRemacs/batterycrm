package com.avito.android.advertising.ui.buzzoola;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CommercialLegalInfoBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/i;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final TextView f88595E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final TextView f88596F;

    public i(@Y61.k Context context) {
        super(context, 0, 2, null);
        D(R.layout.buzzoola_premium_legal_bottom_sheet, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        N(true);
        this.f88595E = (TextView) findViewById(R.id.legal_text);
        this.f88596F = (TextView) findViewById(R.id.juristic_text);
    }

    public final void V(@Y61.l String str, @Y61.l String str2, @Y61.l DialogInterface.OnDismissListener onDismissListener) {
        TextView textView = this.f88595E;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f88596F;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        setOnDismissListener(onDismissListener);
        com.avito.android.lib.util.g.a(this);
    }
}
