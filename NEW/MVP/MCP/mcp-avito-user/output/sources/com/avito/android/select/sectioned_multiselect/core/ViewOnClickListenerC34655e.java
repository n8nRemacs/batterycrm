package com.avito.android.select.sectioned_multiselect.core;

import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.select.sectioned_multiselect.core.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC34655e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f266638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34656f f266639c;

    public /* synthetic */ ViewOnClickListenerC34655e(C34656f c34656f, int i12) {
        this.f266638b = i12;
        this.f266639c = c34656f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f266638b) {
            case 0:
                this.f266639c.f266657r.accept(G0.f406611a);
                break;
            case 1:
                this.f266639c.f266654o.accept(G0.f406611a);
                break;
            case 2:
                this.f266639c.f266655p.accept(G0.f406611a);
                break;
            default:
                this.f266639c.f266658s.accept(G0.f406611a);
                break;
        }
    }
}
