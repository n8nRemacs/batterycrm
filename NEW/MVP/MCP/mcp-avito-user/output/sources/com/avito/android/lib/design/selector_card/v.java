package com.avito.android.lib.design.selector_card;

import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardStateManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/v;", "Lcom/avito/android/lib/design/selector_card/u;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public SelectorCardSelectStrategy f180451a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f180452b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, Boolean, G0> f180453c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, Boolean, G0> f180454d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f180455e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, Boolean> f180456f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f180457g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Boolean, Integer, G0> f180458h;

    /* renamed from: i, reason: collision with root package name */
    public int f180459i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f180460j = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public v(@Y61.k SelectorCardSelectStrategy selectorCardSelectStrategy, boolean z12, int i12, @Y61.k Y41.p<? super Integer, ? super Boolean, G0> pVar, @Y61.k Y41.p<? super Integer, ? super Boolean, G0> pVar2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super Integer, Boolean> lVar, @Y61.k Y41.l<? super Integer, G0> lVar2, @Y61.k Y41.p<? super Boolean, ? super Integer, G0> pVar3) {
        this.f180451a = selectorCardSelectStrategy;
        this.f180452b = z12;
        this.f180453c = pVar;
        this.f180454d = pVar2;
        this.f180455e = aVar;
        this.f180456f = lVar;
        this.f180457g = lVar2;
        this.f180458h = pVar3;
        this.f180459i = i12;
    }

    public final boolean a(int i12) {
        return this.f180460j.contains(Integer.valueOf(i12));
    }
}
