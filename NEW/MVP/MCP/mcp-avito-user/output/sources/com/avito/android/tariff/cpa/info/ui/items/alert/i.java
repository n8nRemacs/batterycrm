package com.avito.android.tariff.cpa.info.ui.items.alert;

import Y41.l;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpa.info.ui.items.alert.AlertItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: AlertItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/alert/i;", "Lcom/avito/android/tariff/cpa/info/ui/items/alert/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f294806g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f294807b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294808c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f294809d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f294810e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LayoutInflater f294811f;

    /* compiled from: AlertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AlertItem.CornersStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AlertItem.CornersStyle cornersStyle = AlertItem.CornersStyle.f294794b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AlertItem.CornersStyle cornersStyle2 = AlertItem.CornersStyle.f294794b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(@k View view) {
        super(view);
        Banner banner = (Banner) view;
        this.f294807b = banner;
        this.f294808c = (TextView) banner.findViewById(R.id.tv_title);
        TextView textView = (TextView) banner.findViewById(R.id.tv_content);
        this.f294809d = textView;
        this.f294810e = (LinearLayout) banner.findViewById(R.id.container_buttons);
        this.f294811f = LayoutInflater.from(banner.getThemedContext());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.alert.h
    public final void Q2(@k l lVar, @Y61.l List list) {
        LinearLayout linearLayout = this.f294810e;
        linearLayout.removeAllViews();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.avito.android.tariff.remote.model.edit.a aVar = (com.avito.android.tariff.remote.model.edit.a) it.next();
                Button button = (Button) this.f294811f.inflate(R.layout.alert_item_button_outline, (ViewGroup) linearLayout, false);
                com.avito.android.lib.design.button.b.a(button, aVar.getTitle(), false);
                button.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(29, lVar, aVar));
                linearLayout.addView(button);
            }
        }
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.alert.h
    public final void S5(@Y61.l Integer num) {
        this.f294808c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, num != null ? C35835l0.h(num.intValue(), this.f294807b.getContext()) : null, (Drawable) null);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.alert.h
    public final void g(@Y61.l AttributedText attributedText) {
        j.a(this.f294809d, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.alert.h
    public final void j0(int i12) {
        this.f294807b.setAppearanceFromAttr(i12);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.alert.h
    public final void setTitle(@Y61.l CharSequence charSequence) {
        I5.a(this.f294808c, charSequence, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.tariff.cpa.info.ui.items.alert.h
    public final void xz(@k AlertItem.CornersStyle cornersStyle) {
        Q q12;
        Q q13;
        int iOrdinal = cornersStyle.ordinal();
        if (iOrdinal == 0) {
            q12 = new Q(Boolean.TRUE, Boolean.FALSE);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Boolean bool = Boolean.TRUE;
                q13 = new Q(bool, bool);
                this.f294807b.Tz(((Boolean) q13.f406619b).booleanValue(), ((Boolean) q13.f406620c).booleanValue());
            }
            q12 = new Q(Boolean.FALSE, Boolean.TRUE);
        }
        q13 = q12;
        this.f294807b.Tz(((Boolean) q13.f406619b).booleanValue(), ((Boolean) q13.f406620c).booleanValue());
    }
}
