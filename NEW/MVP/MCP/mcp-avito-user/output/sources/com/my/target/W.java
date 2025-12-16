package com.my.target;

import android.view.View;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import com.my.target.C37803o0;
import com.my.target.Y0;

/* loaded from: classes7.dex */
public class W extends C37803o0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f364625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f364626b;

    public W(X x12, View view) {
        this.f364626b = x12;
        this.f364625a = view;
    }

    @Override // com.my.target.C37803o0.a
    public final void a() {
        View closeButton;
        X x12 = this.f364626b;
        Y0 y02 = x12.f364634f;
        if (y02 == null || y02.f364659a == CreativeType.HTML_DISPLAY) {
            return;
        }
        y02.c(this.f364625a, new Y0.c[0]);
        i1 i1VarC = x12.c();
        if (i1VarC != null && (closeButton = i1VarC.getCloseButton()) != null) {
            x12.f364634f.e(new Y0.c(closeButton, 0));
        }
        x12.f364634f.g();
    }
}
