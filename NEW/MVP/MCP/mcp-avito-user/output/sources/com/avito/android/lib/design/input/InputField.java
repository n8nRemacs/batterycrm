package com.avito.android.lib.design.input;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.avito.android.lib.design.component_container.ComponentContainer;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: InputField.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016Rk\u0010&\u001aK\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/avito/android/lib/design/input/InputField;", "Lcom/avito/android/lib/design/input/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/lib/design/component_container/ComponentContainer;", "getComponentContainer", "()Lcom/avito/android/lib/design/component_container/ComponentContainer;", "", "componentContainerFocusedRectEnabled", "Lkotlin/G0;", "setComponentContainerFocusedRectEnabled", "(Z)V", "Lcom/avito/android/lib/design/input/FormatterType;", "f", "Lcom/avito/android/lib/design/input/FormatterType;", "getInnerFormatterType", "()Lcom/avito/android/lib/design/input/FormatterType;", "setInnerFormatterType", "(Lcom/avito/android/lib/design/input/FormatterType;)V", "innerFormatterType", "Lkotlin/Function3;", "", "Lkotlin/S;", "name", "text", "", "selStart", "selEnd", "g", "LY41/q;", "getOnSelectionChangedListener", "()LY41/q;", "setOnSelectionChangedListener", "(LY41/q;)V", "onSelectionChangedListener", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InputField extends a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public FormatterType innerFormatterType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> onSelectionChangedListener;

    /* renamed from: h, reason: collision with root package name */
    public boolean f179369h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Rect f179370i;

    public InputField(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.f179370i = new Rect();
    }

    private final ComponentContainer getComponentContainer() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof ComponentContainer) {
                return (ComponentContainer) parent;
            }
        }
        return null;
    }

    @Override // android.view.View
    @Y61.l
    public final View focusSearch(int i12) {
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@Y61.l Rect rect) {
        super.getFocusedRect(rect);
        ComponentContainer componentContainer = getComponentContainer();
        if (!this.f179369h || componentContainer == null || rect == null) {
            return;
        }
        Rect rect2 = this.f179370i;
        componentContainer.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(@Y61.l Rect rect, @Y61.l Point point) {
        ComponentContainer componentContainer = getComponentContainer();
        return (!this.f179369h || componentContainer == null) ? super.getGlobalVisibleRect(rect, point) : componentContainer.getGlobalVisibleRect(rect, point);
    }

    @Y61.l
    public final FormatterType getInnerFormatterType() {
        return this.innerFormatterType;
    }

    @Y61.l
    public final Y41.q<CharSequence, Integer, Integer, G0> getOnSelectionChangedListener() {
        return this.onSelectionChangedListener;
    }

    @Override // android.widget.TextView, android.view.View
    @Y61.k
    public final int[] onCreateDrawableState(int i12) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        int[] drawableState = view != null ? view.getDrawableState() : null;
        if (drawableState == null) {
            drawableState = new int[0];
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12);
        linkedHashSet.addAll(C42756l.k0(drawableState));
        linkedHashSet.addAll(C42756l.k0(iArrOnCreateDrawableState));
        return C42745f0.L0(linkedHashSet);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.widget.TextView
    public final void onSelectionChanged(int i12, int i13) {
        MaskParameters maskParameters;
        Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> qVar = this.onSelectionChangedListener;
        if (qVar != null) {
            qVar.invoke(getText(), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        if (this.innerFormatterType == null) {
            super.onSelectionChanged(i12, i13);
            return;
        }
        CharSequence text = getText();
        if (text == null) {
            text = "";
        }
        FormatterType formatterType = this.innerFormatterType;
        if (formatterType == null || (maskParameters = formatterType.f179302d) == null) {
            maskParameters = new MaskParameters(null, false, null, null, false, null, false, null, (char) 0, 0, null, 2047, null);
        }
        String str = maskParameters.f179371b;
        int length = str.length();
        String str2 = maskParameters.f179373d;
        if (length == 0 && str2.length() == 0) {
            super.onSelectionChanged(i12, i13);
            return;
        }
        if (i12 >= str.length() && i13 <= text.length() - str2.length()) {
            super.onSelectionChanged(i12, i13);
            return;
        }
        boolean z12 = maskParameters.f179372c;
        int length2 = z12 ? 0 : str.length();
        int length3 = maskParameters.f179375f ? 0 : str2.length();
        int iMax = Math.max(length2, Math.min(i12, text.length() - length3));
        int iMax2 = Math.max(iMax, Math.min(text.length() - length3, i13));
        if (i12 == i13) {
            if (z12) {
                iMax = Math.max(str.length(), Math.min(i12, text.length() - length3));
                iMax2 = iMax;
            } else {
                iMax = iMax2;
            }
        }
        try {
            setSelection(Math.min(getText().length(), iMax), Math.min(getText().length(), iMax2));
        } catch (IndexOutOfBoundsException e12) {
            r.f179417a.getClass();
            if (!((Boolean) r.f179418b.invoke()).booleanValue()) {
                throw e12;
            }
        }
        super.onSelectionChanged(i12, i13);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(@Y61.l Rect rect) {
        ComponentContainer componentContainer = getComponentContainer();
        if (!this.f179369h || componentContainer == null || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = componentContainer.getHeight() - (getHeight() / 3);
        int i12 = rect.left;
        int i13 = rect.top;
        int i14 = rect.right;
        int i15 = rect.bottom + height;
        Rect rect2 = this.f179370i;
        rect2.set(i12, i13, i14, i15);
        return super.requestRectangleOnScreen(rect2);
    }

    public final void setComponentContainerFocusedRectEnabled(boolean componentContainerFocusedRectEnabled) {
        this.f179369h = componentContainerFocusedRectEnabled;
    }

    public final void setInnerFormatterType(@Y61.l FormatterType formatterType) {
        this.innerFormatterType = formatterType;
    }

    public final void setOnSelectionChangedListener(@Y61.l Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> qVar) {
        this.onSelectionChangedListener = qVar;
    }
}
