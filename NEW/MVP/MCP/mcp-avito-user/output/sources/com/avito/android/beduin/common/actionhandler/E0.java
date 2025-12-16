package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinPixelActionScreenPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinPixelActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/E0;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class E0 {

    /* renamed from: a, reason: collision with root package name */
    public int f100070a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public BeduinPixelActionScreenPosition f100071b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f100072c;

    public E0() {
        this(0, null, false, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f100070a == e02.f100070a && kotlin.jvm.internal.L.f(this.f100071b, e02.f100071b) && this.f100072c == e02.f100072c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f100070a) * 31;
        BeduinPixelActionScreenPosition beduinPixelActionScreenPosition = this.f100071b;
        return Boolean.hashCode(this.f100072c) + ((iHashCode + (beduinPixelActionScreenPosition == null ? 0 : beduinPixelActionScreenPosition.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPixelState(displayedTimes=");
        sb2.append(this.f100070a);
        sb2.append(", lastScreenPosition=");
        sb2.append(this.f100071b);
        sb2.append(", isDetached=");
        return androidx.appcompat.app.r.x(sb2, this.f100072c, ')');
    }

    public E0(int i12, BeduinPixelActionScreenPosition beduinPixelActionScreenPosition, boolean z12, int i13, C42822w c42822w) {
        i12 = (i13 & 1) != 0 ? 0 : i12;
        beduinPixelActionScreenPosition = (i13 & 2) != 0 ? null : beduinPixelActionScreenPosition;
        z12 = (i13 & 4) != 0 ? false : z12;
        this.f100070a = i12;
        this.f100071b = beduinPixelActionScreenPosition;
        this.f100072c = z12;
    }
}
