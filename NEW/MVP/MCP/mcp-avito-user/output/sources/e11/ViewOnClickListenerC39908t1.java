package e11;

import android.content.Context;
import android.view.View;
import com.my.target.C37788h;

/* renamed from: e11.t1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ViewOnClickListenerC39908t1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37788h f394844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.my.target.G0 f394845c;

    public ViewOnClickListenerC39908t1(com.my.target.G0 g02, C37788h c37788h) {
        this.f394845c = g02;
        this.f394844b = c37788h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = view.getContext();
        com.my.target.G0 g02 = this.f394845c;
        com.my.target.D d12 = g02.f364398d;
        if (d12 == null || !d12.c()) {
            com.my.target.D d13 = g02.f364398d;
            if (d13 == null) {
                i2.a(this.f394844b.f364852b, context);
            } else {
                d13.b(context);
            }
        }
    }
}
