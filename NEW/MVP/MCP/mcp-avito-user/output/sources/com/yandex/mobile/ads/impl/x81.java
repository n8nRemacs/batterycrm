package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class x81 extends bj1<TextView, String> {
    public x81(@j.N TextView textView) {
        super(textView);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        super.a(textView);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N String str) {
        ((TextView) view).setText(str);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final boolean a(@j.N View view, @j.N String str) {
        return ((TextView) view).getText().toString().equalsIgnoreCase(str);
    }
}
