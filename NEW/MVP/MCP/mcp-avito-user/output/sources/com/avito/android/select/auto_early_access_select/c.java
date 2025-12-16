package com.avito.android.select.auto_early_access_select;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoEarlyAccessSelectDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/auto_early_access_select/c;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f264999a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f265000b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f265001c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f265002d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f265003e;

    public c(@k View view) {
        this.f264999a = (TextView) view.findViewById(R.id.auto_early_access_select_dialog_title);
        this.f265000b = (SimpleDraweeView) view.findViewById(R.id.auto_early_access_select_dialog_image);
        this.f265001c = (TextView) view.findViewById(R.id.auto_early_access_select_dialog_description);
        this.f265002d = (Button) view.findViewById(R.id.auto_early_access_select_dialog_primary_button);
        this.f265003e = (Button) view.findViewById(R.id.auto_early_access_select_dialog_secondary_button);
    }
}
