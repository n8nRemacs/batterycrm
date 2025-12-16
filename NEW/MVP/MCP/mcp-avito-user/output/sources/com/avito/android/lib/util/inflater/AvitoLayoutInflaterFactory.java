package com.avito.android.lib.util.inflater;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.text_view.a;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import kotlin.Metadata;

/* compiled from: AvitoLayoutInflaterFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflaterFactory;", "Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$b;", "<init>", "()V", "Landroid/view/View;", "parent", "", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "onCreateView", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AvitoLayoutInflaterFactory implements AvitoLayoutInflater.b {
    @Override // android.view.LayoutInflater.Factory2
    @l
    public View onCreateView(@l View parent, @k String name, @k Context context, @k AttributeSet attrs) {
        AvitoLayoutInflater.f181382a.getClass();
        if (name.equals(AvitoLayoutInflater.f181383b)) {
            Button.f178621m.getClass();
            return Button.f178622n.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (name.equals(AvitoLayoutInflater.f181384c)) {
            Input.f179303W.getClass();
            return Input.f179307d0.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (name.equals("TextView")) {
            a.f180919m.getClass();
            return a.f180920n.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (name.equals(AvitoLayoutInflater.f181385d)) {
            a.f180919m.getClass();
            return a.f180921o.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (name.equals("CheckedTextView")) {
            com.avito.android.lib.design.checked_text_view.a.f178659f.getClass();
            return com.avito.android.lib.design.checked_text_view.a.f178660g.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (name.equals(AvitoLayoutInflater.f181386e)) {
            com.avito.android.lib.design.checked_text_view.a.f178659f.getClass();
            return com.avito.android.lib.design.checked_text_view.a.f178661h.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (name.equals(AvitoLayoutInflater.f181387f)) {
            com.avito.android.lib.design.input.a.f179382c.getClass();
            return com.avito.android.lib.design.input.a.f179383d.f181395c.onCreateView(parent, name, context, attrs);
        }
        if (!name.equals(AvitoLayoutInflater.f181388g)) {
            return null;
        }
        com.avito.android.lib.design.input.a.f179382c.getClass();
        return com.avito.android.lib.design.input.a.f179384e.f181395c.onCreateView(parent, name, context, attrs);
    }

    @Override // android.view.LayoutInflater.Factory
    @l
    public View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
