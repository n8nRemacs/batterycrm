package com.akita.view.foundation.ui.inflater;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.akita.view.foundation.ui.inflater.a;
import kotlin.Metadata;

/* compiled from: AvitoLayoutInflaterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/c;", "Lcom/akita/view/foundation/ui/inflater/a$c;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements a.c {
    @Override // android.view.LayoutInflater.Factory
    @l
    public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @l
    public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
        if (str.equals("TextView")) {
            com.akita.view.foundation.ui.text.a.f67004c.getClass();
            return com.akita.view.foundation.ui.text.a.f67005d.f67000b.onCreateView(view, str, context, attributeSet);
        }
        a.f66995a.getClass();
        if (!str.equals(a.f66996b)) {
            return null;
        }
        com.akita.view.foundation.ui.text.a.f67004c.getClass();
        return com.akita.view.foundation.ui.text.a.f67006e.f67000b.onCreateView(view, str, context, attributeSet);
    }
}
