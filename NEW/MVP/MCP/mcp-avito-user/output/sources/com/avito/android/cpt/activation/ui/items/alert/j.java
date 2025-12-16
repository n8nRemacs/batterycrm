package com.avito.android.cpt.activation.ui.items.alert;

import Pr.C14830a;
import Y41.l;
import Y61.k;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptActivationAlertItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/alert/j;", "Lcom/avito/android/cpt/activation/ui/items/alert/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f126335i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f126336b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f126337c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f126338d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f126339e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f126340f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f126341g;

    /* renamed from: h, reason: collision with root package name */
    public final int f126342h;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f126336b = aVar;
        Banner banner = (Banner) view;
        this.f126337c = banner;
        this.f126338d = (TextView) banner.findViewById(R.id.cpt_activation_title);
        this.f126339e = (TextView) banner.findViewById(R.id.cpt_activation_content);
        this.f126340f = (LinearLayout) banner.findViewById(R.id.cpt_activation_container_buttons);
        this.f126341g = (ImageView) banner.findViewById(R.id.cpt_activation_icon);
        this.f126342h = y6.b(12);
    }

    @Override // com.avito.android.cpt.activation.ui.items.alert.i
    public final void Q2(@k l lVar, @k List list) {
        LinearLayout linearLayout = this.f126340f;
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ButtonAction buttonAction = (ButtonAction) it.next();
            Button button = new Button(this.f126337c.getThemedContext(), null, R.attr.buttonPrimaryLarge, 0, 8, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, this.f126342h, 0, 0);
            button.setLayoutParams(layoutParams);
            Or.e.a(button, buttonAction != null ? new C14830a(buttonAction.getTitle(), null, buttonAction.getDeeplink(), buttonAction.getStyle(), buttonAction.isEnabled(), 2, null) : null);
            button.setOnClickListener(new com.avito.android.body_condition.h(28, buttonAction, lVar));
            linearLayout.addView(button);
        }
    }

    @Override // com.avito.android.cpt.activation.ui.items.alert.i
    public final void a3(@InterfaceC42150f @Y61.l Integer num, @InterfaceC42150f @Y61.l Integer num2) {
        Drawable drawableH = num != null ? C35835l0.h(num.intValue(), this.f126337c.getContext()) : null;
        ImageView imageView = this.f126341g;
        C35821j2.a(imageView, drawableH);
        imageView.setImageTintList(num2 != null ? ColorStateList.valueOf(num2.intValue()) : null);
    }

    @Override // com.avito.android.cpt.activation.ui.items.alert.i
    public final void g(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f126339e, attributedText, this.f126336b);
    }

    @Override // com.avito.android.cpt.activation.ui.items.alert.i
    public final void j0(@InterfaceC42150f int i12) {
        this.f126337c.setAppearanceFromAttr(i12);
    }

    @Override // com.avito.android.cpt.activation.ui.items.alert.i
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f126338d, str, false);
    }
}
