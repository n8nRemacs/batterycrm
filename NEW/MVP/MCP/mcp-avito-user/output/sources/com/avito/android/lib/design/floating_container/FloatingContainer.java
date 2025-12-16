package com.avito.android.lib.design.floating_container;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.lib.design.floating_container.b;
import com.avito.android.lib.util.c;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FloatingContainer.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/lib/design/floating_container/FloatingContainer;", "Landroid/widget/LinearLayout;", "LLV/a;", "Lcom/avito/android/lib/design/floating_container/a;", "Lcom/avito/android/lib/design/floating_container/b;", "Landroid/view/View$OnClickListener;", "l", "Lkotlin/G0;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "enabled", "setEnabled", "(Z)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/floating_container/b;)V", "newState", "setState", "(Lcom/avito/android/lib/design/floating_container/a;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FloatingContainer extends LinearLayout implements LV.a<a, b> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public b f179175b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f179176c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Button f179177d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Button f179178e;

    @j
    public FloatingContainer(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(@k CharSequence charSequence) {
        Button button = this.f179177d;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, charSequence, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Button button = this.f179177d;
        if (button == null) {
            return;
        }
        button.setEnabled(enabled);
    }

    @Override // android.view.View
    public void setOnClickListener(@l View.OnClickListener l12) {
        Button button = this.f179177d;
        if (button != null) {
            button.setOnClickListener(l12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingContainer(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.design_floating_button, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.first_button);
        this.f179177d = button;
        this.f179178e = (Button) findViewById(R.id.second_button);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178933M, i12, i13);
        b.a aVar = b.f179184i;
        Context context2 = getContext();
        aVar.getClass();
        setStyle(b.a.c(typedArrayObtainStyledAttributes, context2));
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, typedArrayObtainStyledAttributes.getText(0), false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k a newState) {
        a aVar = this.f179176c;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        a aVar2 = this.f179176c;
        a.AbstractC5270a abstractC5270a = aVar2 != null ? aVar2.f179179a : null;
        a.AbstractC5270a.C5271a c5271a = abstractC5270a instanceof a.AbstractC5270a.C5271a ? (a.AbstractC5270a.C5271a) abstractC5270a : null;
        View view = c5271a != null ? c5271a.f179180a : null;
        this.f179176c = newState;
        a.AbstractC5270a abstractC5270a2 = aVar != null ? aVar.f179179a : null;
        a.AbstractC5270a abstractC5270a3 = newState.f179179a;
        if (new c(abstractC5270a3, abstractC5270a2).f181333c || abstractC5270a3 == null) {
            return;
        }
        boolean z12 = abstractC5270a3 instanceof a.AbstractC5270a.b;
        Button button = this.f179178e;
        Button button2 = this.f179177d;
        if (z12) {
            if (button2 != null) {
                D6.H(button2);
            }
            if (button2 != null) {
                button2.setState(((a.AbstractC5270a.b) abstractC5270a3).f179181a);
            }
            D6.w(button);
            if (view != null) {
                removeView(view);
                return;
            }
            return;
        }
        if (!(abstractC5270a3 instanceof a.AbstractC5270a.c)) {
            if (abstractC5270a3 instanceof a.AbstractC5270a.C5271a) {
                D6.w(button2);
                D6.w(button);
                if (view != null) {
                    removeView(view);
                }
                addView(((a.AbstractC5270a.C5271a) abstractC5270a3).f179180a);
                return;
            }
            return;
        }
        D6.H(button2);
        D6.H(button);
        if (button2 != null) {
            button2.setState(((a.AbstractC5270a.c) abstractC5270a3).f179182a);
        }
        if (button != null) {
            button.setState(((a.AbstractC5270a.c) abstractC5270a3).f179183b);
        }
        if (view != null) {
            removeView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.floating_container.b r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.floating_container.FloatingContainer.setStyle(com.avito.android.lib.design.floating_container.b):void");
    }
}
