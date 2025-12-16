package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: ToolbarUtils.java */
@RestrictTo
/* loaded from: classes6.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<View> f356731a = new a();

    /* compiled from: ToolbarUtils.java */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ArrayList a(@j.N MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < materialToolbar.getChildCount(); i12++) {
            View childAt = materialToolbar.getChildAt(i12);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
