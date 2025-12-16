package com.avito.android.sbc.create.mvi.util;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClickableText.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/util/c;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f259905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f259906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f259907c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259908d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Uo0.e f259909e;

    public c(int i12, int i13, boolean z12, boolean z13, @Y61.k Uo0.e eVar) {
        this.f259905a = i12;
        this.f259906b = i13;
        this.f259907c = z12;
        this.f259908d = z13;
        this.f259909e = eVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f259905a == cVar.f259905a && this.f259906b == cVar.f259906b && this.f259907c == cVar.f259907c && this.f259908d == cVar.f259908d && L.f(this.f259909e, cVar.f259909e);
    }

    public final int hashCode() {
        return this.f259909e.hashCode() + r.i(r.i(r.e(this.f259906b, Integer.hashCode(this.f259905a) * 31, 31), 31, this.f259907c), 31, this.f259908d);
    }

    @Y61.k
    public final String toString() {
        return "ClickInfo(clickableFrom=" + this.f259905a + ", clickableTo=" + this.f259906b + ", isUnderlineText=" + this.f259907c + ", callSuperUpdateDrawState=" + this.f259908d + ", action=" + this.f259909e + ')';
    }

    public /* synthetic */ c(int i12, int i13, boolean z12, boolean z13, Uo0.e eVar, int i14, C42822w c42822w) {
        this(i12, i13, z12, (i14 & 8) != 0 ? true : z13, eVar);
    }
}
