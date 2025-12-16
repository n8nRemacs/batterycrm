package com.avito.android.publish.objects;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ObjectFillViewOverKeyboardHelper.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/N0;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237522a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f237523b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f237524c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ShadowFrameLayout f237525d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Handler f237526e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.group.item.double_input.e f237527f = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 27);

    public N0(@Y61.k ViewGroup viewGroup) {
        this.f237522a = viewGroup;
    }

    public final void a(ShadowFrameLayout shadowFrameLayout, boolean z12, boolean z13) {
        Handler handler = this.f237526e;
        com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = this.f237527f;
        handler.removeCallbacks(eVar);
        if (z12 && z13) {
            handler.postDelayed(eVar, 200L);
        } else {
            D6.w(shadowFrameLayout);
        }
    }

    public final void b() {
        this.f237526e.removeCallbacks(this.f237527f);
        this.f237522a.removeView(this.f237525d);
        this.f237525d = null;
    }
}
