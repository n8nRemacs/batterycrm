package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/u;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f112429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f112430b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f112431c;

    public u(@Y61.k String str, @Y61.k String str2, boolean z12) {
        this.f112429a = str;
        this.f112430b = str2;
        this.f112431c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f112429a, uVar.f112429a) && L.f(this.f112430b, uVar.f112430b) && this.f112431c == uVar.f112431c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112431c) + H.d(this.f112429a.hashCode() * 31, 31, this.f112430b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilterHintToastState(title=");
        sb2.append(this.f112429a);
        sb2.append(", subtitle=");
        sb2.append(this.f112430b);
        sb2.append(", shouldShow=");
        return androidx.appcompat.app.r.x(sb2, this.f112431c, ')');
    }
}
