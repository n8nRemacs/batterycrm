package com.yandex.div.core.tooltip;

import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;

/* compiled from: Handler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V", "androidx/core/os/m"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f367761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DivTooltip f367762c;

    public f(g gVar, DivTooltip divTooltip, C38029k c38029k) {
        this.f367761b = gVar;
        this.f367762c = divTooltip;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f367761b.c(this.f367762c.f372140e);
    }
}
