package com.akita.view.component.fieldset;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.d;
import com.akita.view.component.fieldset.a;
import com.akita.view.foundation.util.e;
import com.avito.android.R;
import g3.C40524a;
import h3.C40765a;
import j3.C42187a;
import java.util.List;
import k3.C42483a;
import k3.InterfaceC42485c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l3.i;

/* compiled from: Fieldset.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/akita/view/component/fieldset/Fieldset;", "Landroid/widget/LinearLayout;", "Lk3/c;", "Lg3/a;", "Lh3/a;", "", "on", "Lkotlin/G0;", "setDescriptionCompensation", "(Z)V", "", "height", "setDivider", "(I)V", "enabled", "setEnabled", "newStyle", "setStyle", "(Lh3/a;)V", "newState", "setState", "(Lg3/a;)V", "fieldset_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Fieldset extends LinearLayout implements InterfaceC42485c<C40524a, C40765a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C40524a f66929b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C40765a f66930c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f66931d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final FrameLayout f66932e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TextView f66933f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final TextView f66934g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final LinearLayout f66935h;

    @j
    public Fieldset(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void a(ViewGroup viewGroup, boolean z12) {
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            childAt.setEnabled(z12);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z12);
            }
        }
    }

    private final void setDescriptionCompensation(boolean on2) {
        int i12;
        Integer numValueOf;
        TextView textView = this.f66933f;
        if (textView != null) {
            if (on2) {
                C40765a c40765a = this.f66930c;
                if (c40765a == null) {
                    numValueOf = null;
                    e.a(textView, null, null, null, numValueOf, 7);
                }
                i12 = c40765a.f396987f;
            } else {
                i12 = 0;
            }
            numValueOf = Integer.valueOf(i12);
            e.a(textView, null, null, null, numValueOf, 7);
        }
    }

    private final void setDivider(int height) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(height);
        shapeDrawable.setAlpha(0);
        LinearLayout linearLayout = this.f66935h;
        if (linearLayout != null) {
            linearLayout.setDividerDrawable(shapeDrawable);
        }
        if (linearLayout != null) {
            linearLayout.setShowDividers(2);
        }
    }

    public final void b(boolean z12, boolean z13) {
        C40765a c40765a;
        C40765a c40765a2;
        int i12 = 0;
        int i13 = (!z13 || (c40765a2 = this.f66930c) == null) ? 0 : c40765a2.f396986e;
        if (z12 && (c40765a = this.f66930c) != null) {
            i12 = c40765a.f396983b;
        }
        TextView textView = this.f66931d;
        if (textView != null) {
            e.a(textView, null, null, null, Integer.valueOf(i13 + i12), 7);
        }
        FrameLayout frameLayout = this.f66932e;
        if (frameLayout != null) {
            e.a(frameLayout, null, null, null, Integer.valueOf(i13 + i12), 7);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextView textView = this.f66931d;
        if (textView != null) {
            textView.setEnabled(enabled);
        }
        TextView textView2 = this.f66933f;
        if (textView2 != null) {
            textView2.setEnabled(enabled);
        }
        TextView textView3 = this.f66934g;
        if (textView3 != null) {
            textView3.setEnabled(enabled);
        }
        FrameLayout frameLayout = this.f66932e;
        if (frameLayout != null) {
            a(frameLayout, enabled);
        }
        LinearLayout linearLayout = this.f66935h;
        if (linearLayout != null) {
            a(linearLayout, enabled);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Fieldset(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i15 = (i14 & 4) != 0 ? 0 : i12;
        int i16 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet2);
        setOrientation(1);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fieldset, (ViewGroup) this, true);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fieldset_title);
        this.f66931d = textView;
        this.f66932e = (FrameLayout) viewInflate.findViewById(R.id.fieldset_title_custom);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fieldset_description);
        this.f66933f = textView2;
        this.f66934g = (TextView) viewInflate.findViewById(R.id.fieldset_hint);
        this.f66935h = (LinearLayout) viewInflate.findViewById(R.id.fields);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, a.d.f66936a, i15, i16);
        C40765a.f396981l.getClass();
        i.a aVar = i.f413422l;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(10, 0);
        aVar.getClass();
        int[] iArr = C42187a.b.f405423a;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
        i iVarA = i.a.a(typedArrayObtainStyledAttributes2, context);
        typedArrayObtainStyledAttributes2.recycle();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(1, 0), iArr);
        i iVarA2 = i.a.a(typedArrayObtainStyledAttributes3, context);
        typedArrayObtainStyledAttributes3.recycle();
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(5, 0), iArr);
        i iVarA3 = i.a.a(typedArrayObtainStyledAttributes4, context);
        typedArrayObtainStyledAttributes4.recycle();
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        Integer numValueOf = resourceId2 == 0 ? null : Integer.valueOf(resourceId2);
        ColorStateList colorStateList = numValueOf != null ? d.getColorStateList(context, numValueOf.intValue()) : null;
        setStyle(new C40765a(iVarA, dimensionPixelSize, iVarA2, typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), iVarA3, colorStateList != null ? new com.akita.view.foundation.util.a(colorStateList, false) : null, typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setState(@k C40524a newState) {
        i iVar;
        com.akita.view.foundation.util.a aVar;
        com.akita.view.foundation.util.a aVar2;
        C40524a c40524a = this.f66929b;
        if (new C42483a(newState, c40524a).f406029c) {
            return;
        }
        this.f66929b = newState;
        C40524a.b bVar = c40524a != null ? c40524a.f396263a : null;
        C40524a.b bVar2 = newState.f396263a;
        if (!new C42483a(bVar2, bVar).f406029c) {
            boolean z12 = bVar2 instanceof C40524a.b.C11187a;
            TextView textView = this.f66933f;
            TextView textView2 = this.f66931d;
            if (z12) {
                if (textView2 != null) {
                    textView2.setText(((C40524a.b.C11187a) bVar2).f396268a);
                }
                C40524a.b.C11187a c11187a = (C40524a.b.C11187a) bVar2;
                b(c11187a.f396270c, true);
                e.d(textView2);
                FrameLayout frameLayout = this.f66932e;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                View view = c11187a.f396269b;
                if (view != null) {
                    if (frameLayout != null) {
                        frameLayout.addView(view);
                    }
                    e.d(frameLayout);
                } else {
                    e.c(frameLayout);
                }
                e.c(textView);
            } else if (bVar2 instanceof C40524a.b.C11188b) {
                if (textView2 != null) {
                    textView2.setText(((C40524a.b.C11188b) bVar2).f396271a);
                }
                C40524a.b.C11188b c11188b = (C40524a.b.C11188b) bVar2;
                b(c11188b.f396273c, false);
                e.d(textView2);
                FrameLayout frameLayout2 = this.f66932e;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                View view2 = c11188b.f396272b;
                if (view2 != null) {
                    if (frameLayout2 != null) {
                        frameLayout2.addView(view2);
                    }
                    e.d(frameLayout2);
                } else {
                    e.c(frameLayout2);
                }
                if (textView != null) {
                    textView.setText(c11188b.f396275e);
                }
                setDescriptionCompensation(c11188b.f396274d);
                e.d(textView);
            } else {
                e.c(textView2);
                e.c(textView);
                e.c(this.f66932e);
            }
        }
        C40524a.AbstractC11185a abstractC11185a = c40524a != null ? c40524a.f396264b : null;
        C40524a.AbstractC11185a abstractC11185a2 = newState.f396264b;
        if (!new C42483a(abstractC11185a2, abstractC11185a).f406029c) {
            boolean z13 = abstractC11185a2 instanceof C40524a.AbstractC11185a.C11186a;
            TextView textView3 = this.f66934g;
            if (z13) {
                C40765a c40765a = this.f66930c;
                if (c40765a != null && (aVar2 = c40765a.f396989h) != null && textView3 != null) {
                    textView3.setTextColor(aVar2.a());
                }
                if (textView3 != null) {
                    textView3.setText(((C40524a.AbstractC11185a.C11186a) abstractC11185a2).f396266a);
                }
                if (textView3 != null) {
                    e.d(textView3);
                }
            } else if (abstractC11185a2 instanceof C40524a.AbstractC11185a.b) {
                C40765a c40765a2 = this.f66930c;
                if (c40765a2 != null && (iVar = c40765a2.f396988g) != null && (aVar = iVar.f413424b) != null && textView3 != null) {
                    textView3.setTextColor(aVar.a());
                }
                if (textView3 != null) {
                    textView3.setText(((C40524a.AbstractC11185a.b) abstractC11185a2).f396267a);
                }
                if (textView3 != null) {
                    e.d(textView3);
                }
            } else if (textView3 != null) {
                e.c(textView3);
            }
        }
        List<View> list = c40524a != null ? c40524a.f396265c : null;
        List<View> list2 = newState.f396265c;
        if (new C42483a(list2, list).f406029c || list2 == null) {
            return;
        }
        List<View> list3 = list2;
        LinearLayout linearLayout = this.f66935h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        for (View view3 : list3) {
            if (linearLayout != null) {
                linearLayout.addView(view3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k h3.C40765a r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.view.component.fieldset.Fieldset.setStyle(h3.a):void");
    }
}
