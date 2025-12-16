package com.avito.android.publish.details;

import android.view.View;
import kotlin.Metadata;

/* compiled from: Views.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnLayoutChangeListenerC33792u implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f235033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33789t f235034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f235035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f235036e;

    public ViewOnLayoutChangeListenerC33792u(View view, C33789t c33789t, View view2, int i12) {
        this.f235033b = view;
        this.f235034c = c33789t;
        this.f235035d = view2;
        this.f235036e = i12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f235034c.m(this.f235035d, this.f235036e);
        this.f235033b.removeOnLayoutChangeListener(this);
    }
}
