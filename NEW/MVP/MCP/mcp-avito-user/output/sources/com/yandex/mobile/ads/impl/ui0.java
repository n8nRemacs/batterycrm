package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class ui0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ny0 f390570a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f390571b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f390572c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f390573d = true;

    public ui0(@Y61.k Context context) {
        this.f390570a = m9.a(context);
    }

    public final void a() {
        if (this.f390573d) {
            this.f390570a.a(new ky0(ky0.b.f387293N, kotlin.collections.P0.e(new kotlin.Q("event_type", "first_auto_swipe"))));
            this.f390573d = false;
        }
    }

    public final void b() {
        if (this.f390571b) {
            this.f390570a.a(new ky0(ky0.b.f387293N, kotlin.collections.P0.e(new kotlin.Q("event_type", "first_click_on_controls"))));
            this.f390571b = false;
        }
    }

    public final void c() {
        if (this.f390572c) {
            this.f390570a.a(new ky0(ky0.b.f387293N, kotlin.collections.P0.e(new kotlin.Q("event_type", "first_user_swipe"))));
            this.f390572c = false;
        }
    }
}
