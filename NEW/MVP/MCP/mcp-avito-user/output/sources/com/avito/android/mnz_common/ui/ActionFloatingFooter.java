package com.avito.android.mnz_common.ui;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ActionFloatingFooter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/ActionFloatingFooter;", "Landroid/widget/LinearLayout;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActionFloatingFooter extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f197972f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f197973b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f197974c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f197975d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f197976e;

    @j
    public ActionFloatingFooter(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        this.f197974c.setVisibility(this.f197975d.getVisibility() == 0 && this.f197973b.getVisibility() == 0 ? 0 : 8);
    }

    public ActionFloatingFooter(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(new d(context, R.style.Theme_DesignSystem_Re23)).inflate(R.layout.action_floating_footer_container, (ViewGroup) this, true);
        setOrientation(1);
        this.f197973b = (Button) findViewById(R.id.action_floating_footer_button_secondary);
        this.f197974c = findViewById(R.id.action_floating_footer_button_spacer);
        this.f197975d = (Button) findViewById(R.id.action_floating_footer_button_primary);
        TextView textView = (TextView) findViewById(R.id.action_floating_footer_extra);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f197976e = textView;
    }
}
