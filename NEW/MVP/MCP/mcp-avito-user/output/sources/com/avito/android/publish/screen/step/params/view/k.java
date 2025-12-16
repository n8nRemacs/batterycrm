package com.avito.android.publish.screen.step.params.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f241640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f241641c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f241642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f241643e;

    public k(View view, j jVar, View view2, int i12) {
        this.f241640b = view;
        this.f241641c = jVar;
        this.f241642d = view2;
        this.f241643e = i12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f241641c.h(this.f241642d, this.f241643e);
        this.f241640b.removeOnLayoutChangeListener(this);
    }
}
