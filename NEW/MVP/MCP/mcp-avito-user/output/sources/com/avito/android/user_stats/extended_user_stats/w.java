package com.avito.android.user_stats.extended_user_stats;

import android.view.View;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/F6", "Landroid/view/View$OnAttachStateChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvitoTabLayout f318262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f318263c;

    public w(AvitoTabLayout avitoTabLayout, v vVar) {
        this.f318262b = avitoTabLayout;
        this.f318263c = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f318262b.removeOnAttachStateChangeListener(this);
        view.removeCallbacks(this.f318263c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
    }
}
