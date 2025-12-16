package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class sj extends bj1<TextView, qj> {
    public sj(@j.N TextView textView) {
        super(textView);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        super.a(textView);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N qj qjVar) {
        TextView textView = (TextView) view;
        qj qjVar2 = qjVar;
        if (1 == qjVar2.b()) {
            textView.setText(qjVar2.a());
        }
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final /* bridge */ /* synthetic */ boolean a(@j.N View view, @j.N qj qjVar) {
        return a((TextView) view, qjVar);
    }

    public static boolean a(@j.N TextView textView, @j.N qj qjVar) {
        if (1 == qjVar.b()) {
            return textView.getText().toString().equals(qjVar.a());
        }
        return true;
    }
}
