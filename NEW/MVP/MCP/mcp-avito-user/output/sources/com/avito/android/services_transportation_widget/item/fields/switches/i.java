package com.avito.android.services_transportation_widget.item.fields.switches;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationWidgetSwitchesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/switches/i;", "Landroid/widget/LinearLayout;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class i extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TextView f280620b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Switcher f280621c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f280622d;

    /* compiled from: ServiceTransportationWidgetSwitchesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f280623a;

        static {
            int[] iArr = new int[ServiceTransportationWidget.SwitchGroupField.SwitchValue.SwitchSize.values().length];
            try {
                iArr[ServiceTransportationWidget.SwitchGroupField.SwitchValue.SwitchSize.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f280623a = iArr;
        }
    }

    /* compiled from: ServiceTransportationWidgetSwitchesView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            Y41.l<? super Boolean, G0> lVar = i.this.f280622d;
            if (lVar != null) {
                lVar.invoke(bool2);
            }
            return G0.f406611a;
        }
    }

    public i(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.service_transportation_widget_switch_item, (ViewGroup) this, true);
        setId(R.id.switcherContainer);
        setOrientation(0);
        setPadding(y6.b(0), y6.b(10), y6.b(24), y6.b(10));
        this.f280620b = (TextView) findViewById(R.id.switcherTitle);
        this.f280621c = (Switcher) findViewById(R.id.switcher);
        setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.services_transportation_widget.item.fields.switches.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i iVar = this.f280619b;
                Switcher switcher = iVar.f280621c;
                if (switcher != null) {
                    boolean zIsChecked = switcher.isChecked();
                    switcher.toggle();
                    Y41.l<? super Boolean, G0> lVar = iVar.f280622d;
                    if (lVar != null) {
                        lVar.invoke(Boolean.valueOf(!zIsChecked));
                    }
                }
            }
        });
    }

    public final void a(@k String str, boolean z12, @l ServiceTransportationWidget.SwitchGroupField.SwitchValue.SwitchSize switchSize, boolean z13) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).width = (switchSize == null ? -1 : a.f280623a[switchSize.ordinal()]) == 1 ? -1 : -2;
        if (switchSize == ServiceTransportationWidget.SwitchGroupField.SwitchValue.SwitchSize.Half) {
            layoutParams.f348437f = 0.5f;
        } else {
            layoutParams.f348437f = -1.0f;
        }
        setLayoutParams(layoutParams);
        setEnabled(z12);
        TextView textView = this.f280620b;
        if (textView != null) {
            textView.setText(str);
        }
        Switcher switcher = this.f280621c;
        if (switcher != null) {
            switcher.setState(new EV.c(new b(), z12, z13, false, false, 8, null));
        }
    }
}
