package com.avito.android.publish.screen.objects.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f240393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f240394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f240395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f240396e;

    public n(View view, m mVar, View view2, int i12) {
        this.f240393b = view;
        this.f240394c = mVar;
        this.f240395d = view2;
        this.f240396e = i12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f240394c.g(this.f240395d, this.f240396e);
        this.f240393b.removeOnLayoutChangeListener(this);
    }
}
