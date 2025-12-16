package com.yandex.div.core.view2.errors;

import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.C38029k;
import kotlin.Metadata;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/errors/n;", "Lcom/yandex/div/core/f;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class n implements InterfaceC37911f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C38029k f369086b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f369087c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.internal.widget.f f369088d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public b f369089e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public o f369090f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final c f369091g;

    public n(@Y61.k C38029k c38029k, @Y61.k i iVar) {
        this.f369086b = c38029k;
        this.f369087c = iVar;
        k kVar = new k(this);
        iVar.f369075b.add(kVar);
        kVar.invoke(iVar.f369080g);
        this.f369091g = new c(iVar, kVar, 1);
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f369091g.close();
        com.yandex.div.internal.widget.f fVar = this.f369088d;
        C38029k c38029k = this.f369086b;
        c38029k.removeView(fVar);
        c38029k.removeView(this.f369089e);
    }
}
