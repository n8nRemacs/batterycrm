package com.yandex.metrica.impl.ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

/* loaded from: classes7.dex */
public class Fl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39275yl f378152a;

    public Fl(@j.N C39275yl c39275yl) {
        this.f378152a = c39275yl;
    }

    public int a(@j.N TextView textView) {
        int length = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String string = textView.getText().toString();
            Layout layout = textView.getLayout();
            length = string.length();
            if (layout == null) {
                return length;
            }
            int lineCount = textView.getLineCount() - 1;
            TextUtils.TruncateAt ellipsize = textView.getEllipsize();
            if (ellipsize == null || lineCount < 0) {
                return length;
            }
            if (lineCount != 0 && ellipsize != TextUtils.TruncateAt.END) {
                return length;
            }
            return length - layout.getEllipsisCount(lineCount);
        } catch (Throwable th2) {
            this.f378152a.a("ui_parsing_visibility", th2);
            return length;
        }
    }
}
