package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.internal.L;
import com.google.android.gms.dynamic.e;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;
import j.P;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public abstract class a<T extends e> {

    /* renamed from: a, reason: collision with root package name */
    public e f349638a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public Bundle f349639b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList f349640c;

    /* renamed from: d, reason: collision with root package name */
    public final g f349641d = new i(this);

    @RX0.a
    public a() {
    }

    @RX0.a
    public static void j(@N FrameLayout frameLayout) {
        C36687f c36687f = C36687f.f349287e;
        Context context = frameLayout.getContext();
        int iC2 = c36687f.c(C36688g.f349288a, context);
        String strC = L.c(iC2, context);
        String strB = L.b(iC2, context);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = c36687f.b(context, iC2, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new m(context, intentB));
        }
    }

    @RX0.a
    public abstract void a(@N g<T> gVar);

    @RX0.a
    public final void b(@P Bundle bundle) {
        l(bundle, new k(this, bundle));
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public final FrameLayout c(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        l(bundle, new l(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f349638a == null) {
            j(frameLayout);
        }
        return frameLayout;
    }

    @RX0.a
    public final void d() {
        e eVar = this.f349638a;
        if (eVar != null) {
            eVar.e();
        } else {
            k(1);
        }
    }

    @RX0.a
    public final void e(@N Activity activity, @N Bundle bundle, @P Bundle bundle2) {
        l(bundle2, new j(this, activity, bundle, bundle2));
    }

    @RX0.a
    public final void f() {
        l(null, new o(this));
    }

    @RX0.a
    public final void g(@N Bundle bundle) {
        e eVar = this.f349638a;
        if (eVar != null) {
            eVar.c(bundle);
            return;
        }
        Bundle bundle2 = this.f349639b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @RX0.a
    public final void h() {
        l(null, new n(this));
    }

    @RX0.a
    public final void i() {
        e eVar = this.f349638a;
        if (eVar != null) {
            eVar.onStop();
        } else {
            k(4);
        }
    }

    public final void k(int i12) {
        while (!this.f349640c.isEmpty() && ((p) this.f349640c.getLast()).b() >= i12) {
            this.f349640c.removeLast();
        }
    }

    public final void l(@P Bundle bundle, p pVar) {
        if (this.f349638a != null) {
            pVar.a();
            return;
        }
        if (this.f349640c == null) {
            this.f349640c = new LinkedList();
        }
        this.f349640c.add(pVar);
        if (bundle != null) {
            Bundle bundle2 = this.f349639b;
            if (bundle2 == null) {
                this.f349639b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f349641d);
    }
}
