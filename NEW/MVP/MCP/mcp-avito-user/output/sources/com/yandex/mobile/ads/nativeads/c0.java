package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.yandex.mobile.ads.impl.cb0;
import com.yandex.mobile.ads.impl.h11;
import com.yandex.mobile.ads.impl.qw0;
import j.N;
import j.P;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final WeakReference<View> f392605a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final LinkedHashMap f392606b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final h11 f392607c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final WeakReference<ImageView> f392608d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final View f392609a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final Map<String, View> f392610b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public ImageView f392611c;

        public a(@N View view, @N Map<String, View> map) {
            this.f392609a = view;
            this.f392610b = map;
        }

        @N
        public final a c(@P TextView textView) {
            this.f392610b.put("domain", textView);
            return this;
        }

        @N
        public final a d(@P TextView textView) {
            this.f392610b.put("review_count", textView);
            return this;
        }

        @N
        public final a e(@P TextView textView) {
            this.f392610b.put("sponsored", textView);
            return this;
        }

        @N
        public final a f(@P TextView textView) {
            this.f392610b.put("title", textView);
            return this;
        }

        @N
        public final a g(@P TextView textView) {
            this.f392610b.put(ConstraintKt.WARNING, textView);
            return this;
        }

        @N
        public final c0 a() {
            return new c0(this, 0);
        }

        @N
        public final a b(@P TextView textView) {
            this.f392610b.put("body", textView);
            return this;
        }

        @N
        public final a c(@P ImageView imageView) {
            this.f392610b.put("icon", imageView);
            return this;
        }

        @N
        public final a a(@P TextView textView) {
            this.f392610b.put("age", textView);
            return this;
        }

        @N
        public final a b(@P ImageView imageView) {
            this.f392610b.put("feedback", imageView);
            return this;
        }

        @N
        public final a a(@P Button button) {
            this.f392610b.put("call_to_action", button);
            return this;
        }

        @N
        public final a a(@P ImageView imageView) {
            this.f392610b.put("favicon", imageView);
            return this;
        }

        @N
        public final a a(@P CustomizableMediaView customizableMediaView) {
            this.f392610b.put("media", customizableMediaView);
            return this;
        }

        @N
        public final a a(@P qw0 qw0Var) {
            this.f392610b.put("rating", qw0Var);
            return this;
        }
    }

    public /* synthetic */ c0(a aVar, int i12) {
        this(aVar);
    }

    @P
    public final TextView a() {
        h11 h11Var = this.f392607c;
        View viewA = a("age");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @N
    public final LinkedHashMap b() {
        return this.f392606b;
    }

    @P
    public final TextView c() {
        h11 h11Var = this.f392607c;
        View viewA = a("body");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final TextView d() {
        h11 h11Var = this.f392607c;
        View viewA = a("call_to_action");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final TextView e() {
        h11 h11Var = this.f392607c;
        View viewA = a("close_button");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final TextView f() {
        h11 h11Var = this.f392607c;
        View viewA = a("domain");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final ImageView g() {
        h11 h11Var = this.f392607c;
        View viewA = a("feedback");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewA);
    }

    @P
    public final ImageView h() {
        h11 h11Var = this.f392607c;
        View viewA = a("icon");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, viewA);
    }

    @P
    @Deprecated
    public final ImageView i() {
        return this.f392608d.get();
    }

    @P
    public final CustomizableMediaView j() {
        h11 h11Var = this.f392607c;
        View viewA = a("media");
        h11Var.getClass();
        return (CustomizableMediaView) h11.a(CustomizableMediaView.class, viewA);
    }

    @P
    public final View k() {
        return this.f392605a.get();
    }

    @P
    public final TextView l() {
        h11 h11Var = this.f392607c;
        View viewA = a("price");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final View m() {
        h11 h11Var = this.f392607c;
        View viewA = a("rating");
        h11Var.getClass();
        return (View) h11.a(View.class, viewA);
    }

    @P
    public final TextView n() {
        h11 h11Var = this.f392607c;
        View viewA = a("review_count");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final TextView o() {
        h11 h11Var = this.f392607c;
        View viewA = a("sponsored");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final TextView p() {
        h11 h11Var = this.f392607c;
        View viewA = a("title");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    @P
    public final TextView q() {
        h11 h11Var = this.f392607c;
        View viewA = a(ConstraintKt.WARNING);
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewA);
    }

    private c0(@N a aVar) {
        this.f392605a = new WeakReference<>(aVar.f392609a);
        this.f392608d = new WeakReference<>(aVar.f392611c);
        this.f392606b = cb0.a(aVar.f392610b);
        this.f392607c = new h11();
    }

    @P
    public final View a(@N String str) {
        WeakReference weakReference = (WeakReference) this.f392606b.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
