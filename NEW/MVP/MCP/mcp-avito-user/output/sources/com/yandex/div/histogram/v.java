package com.yandex.div.histogram;

import com.yandex.div.histogram.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t21.InterfaceC48467b;

/* compiled from: RenderConfiguration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/histogram/v;", "", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f370037a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f370038b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f370039c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f370040d;

    @X41.j
    public v() {
        this(null, null, null, null, 15, null);
    }

    public v(p pVar, p pVar2, p pVar3, p pVar4, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            p.f370030o2.getClass();
            pVar = p.a.f370033c;
        }
        if ((i12 & 2) != 0) {
            p.f370030o2.getClass();
            pVar2 = p.a.f370033c;
        }
        if ((i12 & 4) != 0) {
            p.f370030o2.getClass();
            pVar3 = p.a.f370033c;
        }
        if ((i12 & 8) != 0) {
            p.f370030o2.getClass();
            pVar4 = p.a.f370032b;
        }
        this.f370037a = pVar;
        this.f370038b = pVar2;
        this.f370039c = pVar3;
        this.f370040d = pVar4;
    }
}
