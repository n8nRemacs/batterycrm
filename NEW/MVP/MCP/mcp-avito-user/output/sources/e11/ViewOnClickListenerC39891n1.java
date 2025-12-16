package e11;

import android.content.Context;
import android.view.View;
import com.my.target.C37788h;

/* renamed from: e11.n1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ViewOnClickListenerC39891n1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.my.target.A0 f394688b;

    public ViewOnClickListenerC39891n1(com.my.target.A0 a02) {
        this.f394688b = a02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C37788h c37788h;
        com.my.target.A0 a02 = this.f394688b;
        C39848C c39848c = a02.f364322j;
        if (c39848c == null || (c37788h = c39848c.f394698D) == null) {
            return;
        }
        com.my.target.D d12 = a02.f364323k;
        if (d12 == null || !d12.c()) {
            Context context = a02.f364316d.getContext();
            if (d12 == null) {
                i2.a(c37788h.f364852b, context);
            } else {
                d12.b(context);
            }
        }
    }
}
