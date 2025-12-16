package com.akita.compose.component.modal;

import androidx.compose.runtime.H0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModalButtons.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/modal/b;", "", "modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.component.modal.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C27348b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f62030a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f62031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.button.t f62032c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f62033d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f62034e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f62035f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62036g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f62037h;

    public C27348b(@Y61.k String str, @Y61.k Y41.a<G0> aVar, @Y61.k com.akita.compose.component.button.t tVar, @Y61.l String str2, @Y61.l Integer num, @Y61.l Integer num2, boolean z12, boolean z13) {
        this.f62030a = str;
        this.f62031b = aVar;
        this.f62032c = tVar;
        this.f62033d = str2;
        this.f62034e = num;
        this.f62035f = num2;
        this.f62036g = z12;
        this.f62037h = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27348b)) {
            return false;
        }
        C27348b c27348b = (C27348b) obj;
        return L.f(this.f62030a, c27348b.f62030a) && L.f(this.f62031b, c27348b.f62031b) && L.f(this.f62032c, c27348b.f62032c) && L.f(this.f62033d, c27348b.f62033d) && L.f(this.f62034e, c27348b.f62034e) && L.f(this.f62035f, c27348b.f62035f) && this.f62036g == c27348b.f62036g && this.f62037h == c27348b.f62037h;
    }

    public final int hashCode() {
        int iHashCode = (this.f62032c.hashCode() + androidx.appcompat.app.r.h(this.f62030a.hashCode() * 31, 31, this.f62031b)) * 31;
        String str = this.f62033d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f62034e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f62035f;
        return Boolean.hashCode(this.f62037h) + androidx.appcompat.app.r.i((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f62036g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModalButton(title=");
        sb2.append(this.f62030a);
        sb2.append(", onClick=");
        sb2.append(this.f62031b);
        sb2.append(", style=");
        sb2.append(this.f62032c);
        sb2.append(", subtitle=");
        sb2.append(this.f62033d);
        sb2.append(", iconLeft=");
        sb2.append(this.f62034e);
        sb2.append(", iconRight=");
        sb2.append(this.f62035f);
        sb2.append(", isSpinnerEnabled=");
        sb2.append(this.f62036g);
        sb2.append(", enabled=");
        return androidx.appcompat.app.r.x(sb2, this.f62037h, ')');
    }

    public /* synthetic */ C27348b(String str, Y41.a aVar, com.akita.compose.component.button.t tVar, String str2, Integer num, Integer num2, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, aVar, tVar, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? true : z13);
    }
}
