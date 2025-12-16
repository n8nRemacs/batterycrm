package com.avito.beduin.v2.avito.component.common;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Shape.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/n;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Corner f334141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Corner f334142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Corner f334143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Corner f334144d;

    public n(@Y61.k Corner corner, @Y61.k Corner corner2, @Y61.k Corner corner3, @Y61.k Corner corner4) {
        this.f334141a = corner;
        this.f334142b = corner2;
        this.f334143c = corner3;
        this.f334144d = corner4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f334141a, nVar.f334141a) && L.f(this.f334142b, nVar.f334142b) && L.f(this.f334143c, nVar.f334143c) && L.f(this.f334144d, nVar.f334144d);
    }

    public final int hashCode() {
        return this.f334144d.hashCode() + ((this.f334143c.hashCode() + ((this.f334142b.hashCode() + (this.f334141a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Shape(cornerLeftTop=" + this.f334141a + ", cornerLeftBottom=" + this.f334142b + ", cornerRightTop=" + this.f334143c + ", cornerRightBottom=" + this.f334144d + ')';
    }
}
