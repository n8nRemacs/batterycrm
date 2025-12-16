package com.avito.android.util;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: RecyclerViews.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/u4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.util.v4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC35962v4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Adapter f319099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f319100c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f319101d;

    public RunnableC35962v4(RecyclerView.Adapter adapter, int i12, String str) {
        this.f319099b = adapter;
        this.f319100c = i12;
        this.f319101d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f319099b.notifyItemChanged(this.f319100c, this.f319101d);
    }
}
