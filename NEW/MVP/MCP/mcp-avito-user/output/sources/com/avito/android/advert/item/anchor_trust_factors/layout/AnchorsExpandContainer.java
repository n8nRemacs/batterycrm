package com.avito.android.advert.item.anchor_trust_factors.layout;

import LV.a;
import VU.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22829k0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.c;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.H0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43028k;
import kotlin.sequences.C43033p;
import n11.RunnableC44167a;
import p4.C46889a;
import q4.C47196a;

/* compiled from: AnchorsExpandContainer.kt */
@P
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/layout/AnchorsExpandContainer;", "Landroid/view/ViewGroup;", "LLV/a;", "Lp4/a;", "Lq4/a;", VoiceInfo.STATE, "Lkotlin/G0;", "setButtons", "(Lp4/a;)V", "setExpandButton", "LVU/b;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setButtonsStyle", "(LVU/b;)V", "setExpandButtonStyle", "newState", "setState", "newStyle", "setStyle", "(Lq4/a;)V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnchorsExpandContainer extends ViewGroup implements a<C46889a, C47196a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public C46889a f72836b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C47196a f72837c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Object f72838d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public Button f72839e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup.LayoutParams f72840f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Integer f72841g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f72842h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RunnableC44167a f72843i;

    @j
    public AnchorsExpandContainer(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setButtons(C46889a state) {
        removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (UU.a aVar : state.f428186a) {
            Button button = new Button(getContext(), null, 0, 0, 14, null);
            button.setState(aVar);
            addView(button, this.f72840f);
            arrayList.add(button);
        }
        this.f72838d = arrayList;
    }

    private final void setButtonsStyle(b style) {
        Iterator it = ((Iterable) this.f72838d).iterator();
        while (it.hasNext()) {
            ((Button) it.next()).setStyle(style);
        }
    }

    private final void setExpandButton(C46889a state) {
        UU.a aVar = state.f428187b;
        if (aVar != null) {
            Button button = new Button(getContext(), null, 0, 0, 14, null);
            button.setState(aVar);
            this.f72839e = button;
        }
    }

    private final void setExpandButtonStyle(b style) {
        this.f72839e.setStyle(style);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        if (this.f72836b.f428188c < 1) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        C47196a c47196a = this.f72837c;
        int i16 = c47196a != null ? c47196a.f429013d : 0;
        int i17 = c47196a != null ? c47196a.f429012c : 0;
        int iD2 = C43033p.d(new C22829k0(this));
        C43028k.a aVar = new C43028k.a(new C43028k(new C22829k0(this)));
        int i18 = 1;
        while (aVar.f410524b.hasNext()) {
            H0 h02 = (H0) aVar.next();
            int i19 = this.f72836b.f428188c;
            if (i18 > i19) {
                return;
            }
            View view = (View) h02.f406644b;
            boolean z13 = i19 >= 1 && i19 == i18;
            boolean z14 = h02.f406643a == iD2 + (-1);
            int paddingEnd = getPaddingEnd();
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = this.f72839e.getMeasuredWidth();
            int width = getWidth();
            if (z13) {
                int i22 = measuredWidth + paddingStart;
                int i23 = width - paddingEnd;
                boolean z15 = i22 <= i23;
                if ((!z14 || !z15) && i22 + i16 + measuredWidth2 > i23) {
                    Button button = this.f72839e;
                    button.layout(paddingStart, paddingTop, button.getMeasuredWidth() + paddingStart, this.f72839e.getMeasuredHeight() + paddingTop);
                    return;
                }
            }
            if (view.getMeasuredWidth() + paddingStart > getWidth() - getPaddingEnd()) {
                paddingStart = getPaddingStart();
                i18++;
                paddingTop = view.getMeasuredHeight() + i17 + paddingTop;
            }
            Button button2 = (Button) view;
            button2.layout(paddingStart, paddingTop, button2.getMeasuredWidth() + paddingStart, button2.getMeasuredHeight() + paddingTop);
            paddingStart = button2.getRight() + i16;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        if (this.f72836b.f428188c < 1) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingStart()) - getPaddingEnd(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f72839e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        if (this.f72839e.getMeasuredWidth() + getLeft() > size - getPaddingEnd()) {
            AW.a.f430a.c("AnchorsExpandContainer", "Layout have too small width", null);
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        C47196a c47196a = this.f72837c;
        int i15 = c47196a != null ? c47196a.f429013d : 0;
        int i16 = c47196a != null ? c47196a.f429012c : 0;
        int iD2 = C43033p.d(new C22829k0(this));
        C43028k.a aVar = new C43028k.a(new C43028k(new C22829k0(this)));
        int i17 = 0;
        int i18 = 1;
        while (true) {
            if (!aVar.f410524b.hasNext()) {
                i14 = iD2;
                break;
            }
            H0 h02 = (H0) aVar.next();
            Button button = (Button) ((View) h02.f406644b);
            button.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int i19 = iMakeMeasureSpec;
            int i22 = this.f72836b.f428188c;
            int i23 = iMakeMeasureSpec2;
            boolean z12 = i22 >= 1 && i22 == i18;
            int i24 = iD2 - 1;
            int i25 = h02.f406643a;
            boolean z13 = i25 == i24;
            int paddingEnd = getPaddingEnd();
            int measuredWidth = button.getMeasuredWidth();
            C43028k.a aVar2 = aVar;
            int measuredWidth2 = this.f72839e.getMeasuredWidth();
            if (z12) {
                int i26 = paddingStart + measuredWidth;
                i14 = iD2;
                int i27 = size - paddingEnd;
                boolean z14 = i26 <= i27;
                if ((!z13 || !z14) && i26 + i15 + measuredWidth2 > i27) {
                    removeViewsInLayout(i25, getChildCount() - i25);
                    addViewInLayout(this.f72839e, i25, this.f72840f);
                    this.f72839e.getMeasuredWidth();
                    break;
                }
            } else {
                i14 = iD2;
            }
            if (button.getMeasuredWidth() + paddingStart > size - getPaddingEnd()) {
                if (i18 > this.f72836b.f428188c) {
                    break;
                }
                i18++;
                paddingStart = getPaddingStart();
                paddingTop = button.getMeasuredHeight() + i16 + paddingTop;
            }
            paddingStart += button.getMeasuredWidth() + i15;
            i17++;
            iMakeMeasureSpec = i19;
            iMakeMeasureSpec2 = i23;
            iD2 = i14;
            aVar = aVar2;
        }
        View view = (View) C43033p.n(new C22829k0(this));
        int measuredHeight = paddingTop + (view != null ? view.getMeasuredHeight() : 0);
        if (mode == Integer.MIN_VALUE) {
            int paddingBottom = getPaddingBottom() + measuredHeight;
            if (paddingBottom <= size2) {
                size2 = paddingBottom;
            }
        } else if (mode != 1073741824) {
            size2 = getPaddingBottom() + measuredHeight;
        }
        setMeasuredDimension(size, size2);
        this.f72841g = Integer.valueOf(i14 - i17);
        if (this.f72842h != null) {
            Handler handler = getHandler();
            RunnableC44167a runnableC44167a = this.f72843i;
            handler.removeCallbacks(runnableC44167a);
            getHandler().postDelayed(runnableC44167a, 100L);
        }
    }

    public AnchorsExpandContainer(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f72836b = new C46889a(null, null, 0, null, 11, null);
        this.f72838d = C42784z0.f406748b;
        this.f72839e = new Button(context, null, 0, 0, 14, null);
        this.f72840f = new ViewGroup.LayoutParams(-2, -2);
        this.f72843i = new RunnableC44167a(this, 1);
    }

    @Override // LV.b
    public void setState(@k C46889a newState) {
        C46889a c46889a = this.f72836b;
        if (new c(newState, c46889a).f181333c) {
            return;
        }
        if (!new c(newState.f428186a, c46889a.f428186a).f181333c) {
            C46889a c46889aA = C46889a.a(this.f72836b, newState.f428186a, null, 0, null, 14);
            this.f72836b = c46889aA;
            setButtons(c46889aA);
            C47196a c47196a = this.f72837c;
            if (c47196a != null) {
                setButtonsStyle(c47196a.f429010a);
            }
            requestLayout();
        }
        if (!new c(newState.f428187b, c46889a.f428187b).f181333c) {
            C46889a c46889aA2 = C46889a.a(this.f72836b, null, newState.f428187b, 0, null, 13);
            this.f72836b = c46889aA2;
            setExpandButton(c46889aA2);
            C47196a c47196a2 = this.f72837c;
            if (c47196a2 != null) {
                setExpandButtonStyle(c47196a2.f429011b);
            }
            requestLayout();
        }
        if (!new c(Integer.valueOf(newState.f428188c), Integer.valueOf(c46889a.f428188c)).f181333c) {
            C46889a c46889aA3 = C46889a.a(this.f72836b, null, null, newState.f428188c, null, 11);
            this.f72836b = c46889aA3;
            setButtons(c46889aA3);
            C47196a c47196a3 = this.f72837c;
            if (c47196a3 != null) {
                setButtonsStyle(c47196a3.f429010a);
            }
            requestLayout();
        }
        if (new c(newState.f428189d, c46889a.f428189d).f181333c) {
            return;
        }
        C46889a c46889aA4 = C46889a.a(this.f72836b, null, null, 0, newState.f428189d, 7);
        this.f72836b = c46889aA4;
        this.f72842h = c46889aA4.f428189d;
    }

    @Override // LV.d
    public void setStyle(@k C47196a newStyle) {
        C47196a c47196a = this.f72837c;
        if (new c(newStyle, c47196a).f181333c) {
            return;
        }
        this.f72837c = newStyle;
        b bVar = c47196a != null ? c47196a.f429010a : null;
        b bVar2 = newStyle.f429010a;
        if (!new c(bVar2, bVar).f181333c && bVar2 != null) {
            setButtonsStyle(bVar2);
            requestLayout();
        }
        b bVar3 = c47196a != null ? c47196a.f429011b : null;
        b bVar4 = newStyle.f429011b;
        if (!new c(bVar4, bVar3).f181333c && bVar4 != null) {
            setExpandButtonStyle(bVar4);
            requestLayout();
        }
        Integer numValueOf = Integer.valueOf(newStyle.f429012c);
        if (!new c(numValueOf, c47196a != null ? Integer.valueOf(c47196a.f429012c) : null).f181333c) {
            numValueOf.intValue();
            requestLayout();
        }
        Integer numValueOf2 = Integer.valueOf(newStyle.f429013d);
        if (new c(numValueOf2, c47196a != null ? Integer.valueOf(c47196a.f429013d) : null).f181333c) {
            return;
        }
        numValueOf2.intValue();
        requestLayout();
    }
}
