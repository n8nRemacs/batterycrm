package com.avito.android.util;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: Views.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.util.s4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC35941s4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f319050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f319051c;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC35941s4(RecyclerView recyclerView, Y41.l lVar) {
        this.f319050b = recyclerView;
        this.f319051c = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f319051c.invoke(this.f319050b.focusSearch(null, 2));
        } catch (NullPointerException e12) {
            V2.f318762a.a("DEFAULT_TAG", "PaymentGenericFormView_recycler_NPE", e12);
        }
    }
}
