package com.akita.view.foundation.ui.inflater;

import Y41.r;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.akita.view.foundation.ui.inflater.a;
import kotlin.Metadata;

/* compiled from: AvitoLayoutInflater.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/b;", "Lcom/akita/view/foundation/ui/inflater/a$c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r<View, String, Context, AttributeSet, View> f67003b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(r<? super View, ? super String, ? super Context, ? super AttributeSet, ? extends View> rVar) {
        this.f67003b = rVar;
    }

    @Override // android.view.LayoutInflater.Factory
    @l
    public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @l
    public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
        return this.f67003b.invoke(view, str, context, attributeSet);
    }
}
