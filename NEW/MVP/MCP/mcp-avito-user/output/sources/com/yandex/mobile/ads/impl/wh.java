package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class wh<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final rj0 f391413a = new rj0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final vh f391414b;

    public wh(@j.N Context context) {
        this.f391414b = new vh(context);
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f391413a.getClass();
        TextView textView = (TextView) v12.findViewById(R.id.call_to_action);
        if (textView != null) {
            this.f391414b.a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        this.f391414b.a();
    }
}
