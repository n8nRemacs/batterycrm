package com.avito.android.search.filter.adapter.double_select;

import android.view.View;
import com.avito.android.lib.design.input.Input;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f262291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f262292d;

    public /* synthetic */ q(r rVar, Y41.a aVar, int i12) {
        this.f262290b = i12;
        this.f262291c = rVar;
        this.f262292d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f262290b) {
            case 0:
                Input.t(this.f262291c.f262295c, "", false, 6);
                ((g) this.f262292d).invoke();
                break;
            default:
                Input.t(this.f262291c.f262296d, "", false, 6);
                ((h) this.f262292d).invoke();
                break;
        }
    }
}
