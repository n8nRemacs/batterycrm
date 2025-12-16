package com.avito.android.photo_gallery.grid_gallery;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f217433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f217434c;

    public u(View view, y yVar) {
        this.f217433b = view;
        this.f217434c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.a(this.f217434c);
    }
}
