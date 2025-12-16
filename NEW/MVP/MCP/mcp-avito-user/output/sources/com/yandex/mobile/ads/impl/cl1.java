package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class cl1<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final rj0 f384329a = new rj0();

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f384329a.getClass();
        TextView textView = (TextView) v12.findViewById(R.id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
