package com.avito.android.deeplink_handler.view.impl;

import com.avito.android.deeplink_handler.view.a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeLoadingRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/c;", "Lcom/avito/android/deeplink_handler/view/a$g;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements a.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f134600b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<a> f134601c;

    /* compiled from: CompositeLoadingRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/c$a;", "Lcom/avito/android/deeplink_handler/view/a$g;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends a.g {
        boolean j1(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar);
    }

    public c(@Y61.k i iVar, @Y61.k List list) {
        this.f134600b = iVar;
        this.f134601c = list;
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        G0 g02;
        Object next;
        Iterator<T> it = this.f134601c.iterator();
        while (true) {
            g02 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((a) next).j1(aVar)) {
                    break;
                }
            }
        }
        a aVar2 = (a) next;
        if (aVar2 != null) {
            aVar2.g(aVar, z12);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            this.f134600b.a(z12);
        }
    }
}
