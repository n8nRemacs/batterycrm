package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import android.view.View;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f273491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f273492c;

    public /* synthetic */ k(Object obj, int i12) {
        this.f273491b = i12;
        this.f273492c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f273492c;
        switch (this.f273491b) {
            case 0:
                int i12 = l.f273493f;
                ((Y41.a) obj).invoke();
                break;
            case 1:
                int i13 = l.f273493f;
                ((Y41.a) obj).invoke();
                break;
            default:
                c.a aVar = c.a.f273444l;
                ((View) obj).performClick();
                break;
        }
    }
}
