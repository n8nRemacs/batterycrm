package com.avito.android.photo_gallery.grid_gallery;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f217436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f217437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f217438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f217439e;

    public w(View view, LinearLayoutManager linearLayoutManager, int i12, RecyclerView recyclerView) {
        this.f217436b = view;
        this.f217437c = linearLayoutManager;
        this.f217438d = i12;
        this.f217439e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager = this.f217437c;
        int i12 = this.f217438d;
        View viewZ = linearLayoutManager.Z(i12);
        if (viewZ == null) {
            return;
        }
        linearLayoutManager.b2(i12, (this.f217439e.getHeight() / 2) - (viewZ.getHeight() / 2));
    }
}
