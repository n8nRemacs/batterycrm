package com.avito.android.short_term_rent.view.components.toggle_v2;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToggleV2SelectManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/toggle_v2/e;", "Lcom/avito/android/short_term_rent/view/components/toggle_v2/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Integer, G0> f283071a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f283072b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Integer f283073c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super Integer, G0> lVar, @k l<? super Integer, G0> lVar2) {
        this.f283071a = lVar;
        this.f283072b = lVar2;
    }

    public final boolean a(int i12) {
        Integer num = this.f283073c;
        return num != null && num.intValue() == i12;
    }

    public final void b(int i12) {
        if (a(i12)) {
            return;
        }
        Integer num = this.f283073c;
        if (num != null) {
            this.f283072b.invoke(Integer.valueOf(num.intValue()));
        }
        this.f283073c = Integer.valueOf(i12);
        this.f283071a.invoke(Integer.valueOf(i12));
    }
}
