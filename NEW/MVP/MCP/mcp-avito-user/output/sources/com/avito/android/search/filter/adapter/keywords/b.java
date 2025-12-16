package com.avito.android.search.filter.adapter.keywords;

import android.view.KeyEvent;
import android.widget.TextView;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements TextView.OnEditorActionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f262432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.b f262433d;

    public /* synthetic */ b(Y41.l lVar, com.avito.konveyor.adapter.b bVar, int i12) {
        this.f262431b = i12;
        this.f262432c = lVar;
        this.f262433d = bVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
        Y41.l lVar = this.f262432c;
        com.avito.konveyor.adapter.b bVar = this.f262433d;
        switch (this.f262431b) {
            case 0:
                if (i12 != 6) {
                    int i13 = c.f262434i;
                    break;
                } else {
                    Input input = ((c) bVar).f262438e;
                    ((k) lVar).invoke(String.valueOf(input.m53getText()));
                    K2.f(input, 3);
                    break;
                }
            default:
                if (i12 != 6) {
                    int i14 = h.f262455i;
                    break;
                } else {
                    Input input2 = ((h) bVar).f262459e;
                    ((k) lVar).invoke(String.valueOf(input2.m53getText()));
                    K2.f(input2, 3);
                    break;
                }
        }
        return false;
    }
}
