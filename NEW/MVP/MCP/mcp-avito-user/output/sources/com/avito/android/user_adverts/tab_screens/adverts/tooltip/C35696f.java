package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35696f extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f315638l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f315639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35696f(RecyclerView recyclerView, Runnable runnable) {
        super(1);
        this.f315638l = recyclerView;
        this.f315639m = runnable;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f315638l.removeCallbacks(this.f315639m);
        return G0.f406611a;
    }
}
