package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes8.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<ViewGroup> f390859a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final List<df1> f390860b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InstreamAdBinder f390861c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.instream.a f390862d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private lu f390863e;

    public vf(@j.N ViewGroup viewGroup, @j.N List<df1> list, @j.N InstreamAdBinder instreamAdBinder) {
        this.f390861c = instreamAdBinder;
        this.f390862d = new com.yandex.mobile.ads.instream.a(instreamAdBinder);
        this.f390859a = new WeakReference<>(viewGroup);
        this.f390860b = list;
    }

    public final void a() {
        ViewGroup viewGroup = this.f390859a.get();
        if (viewGroup != null) {
            if (this.f390863e == null) {
                this.f390863e = new lu(viewGroup.getContext());
                viewGroup.addView(this.f390863e, new ViewGroup.LayoutParams(-1, -1));
            }
            this.f390862d.a(this.f390863e, this.f390860b);
        }
    }

    public final void b() {
        lu luVar;
        ViewGroup viewGroup = this.f390859a.get();
        if (viewGroup != null && (luVar = this.f390863e) != null) {
            viewGroup.removeView(luVar);
        }
        this.f390863e = null;
        this.f390861c.setInstreamAdListener(null);
        this.f390861c.unbind();
        this.f390861c.invalidateAdPlayer();
        this.f390861c.invalidateVideoPlayer();
    }

    public final void a(@j.P vf1 vf1Var) {
        this.f390861c.setVideoAdPlaybackListener(vf1Var);
    }

    public final void a(@j.P oe1 oe1Var) {
        this.f390862d.a(oe1Var);
    }

    public final void a(@j.P pe1 pe1Var) {
        this.f390862d.a(pe1Var);
    }
}
