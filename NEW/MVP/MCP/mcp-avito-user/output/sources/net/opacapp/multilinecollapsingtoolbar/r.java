package net.opacapp.multilinecollapsingtoolbar;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes7.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    public final View f419103a;

    /* renamed from: b, reason: collision with root package name */
    public int f419104b;

    /* renamed from: c, reason: collision with root package name */
    public int f419105c;

    /* renamed from: d, reason: collision with root package name */
    public int f419106d;

    public r(View view) {
        this.f419103a = view;
    }

    public final void a() {
        int i12 = this.f419106d;
        View view = this.f419103a;
        int top = i12 - (view.getTop() - this.f419104b);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f419105c));
    }
}
