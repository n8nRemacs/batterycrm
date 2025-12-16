package com.avito.android.lib.design.time_line;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLineItemPayload.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/time_line/q;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class q {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final a f181024k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<Integer> f181025a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<String> f181026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<TimeLineAlignment> f181027c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<TimeLineItemWidthType> f181028d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<PK0.n> f181029e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<Integer> f181030f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<Integer> f181031g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<Integer> f181032h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<Integer> f181033i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.time_line.a<Integer> f181034j;

    /* compiled from: TimeLineItemPayload.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/time_line/q$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k com.avito.android.lib.design.time_line.a<Integer> aVar, @Y61.k com.avito.android.lib.design.time_line.a<String> aVar2, @Y61.k com.avito.android.lib.design.time_line.a<TimeLineAlignment> aVar3, @Y61.k com.avito.android.lib.design.time_line.a<TimeLineItemWidthType> aVar4, @Y61.k com.avito.android.lib.design.time_line.a<PK0.n> aVar5, @Y61.k com.avito.android.lib.design.time_line.a<Integer> aVar6, @Y61.k com.avito.android.lib.design.time_line.a<Integer> aVar7, @Y61.k com.avito.android.lib.design.time_line.a<Integer> aVar8, @Y61.k com.avito.android.lib.design.time_line.a<Integer> aVar9, @Y61.k com.avito.android.lib.design.time_line.a<Integer> aVar10) {
        this.f181025a = aVar;
        this.f181026b = aVar2;
        this.f181027c = aVar3;
        this.f181028d = aVar4;
        this.f181029e = aVar5;
        this.f181030f = aVar6;
        this.f181031g = aVar7;
        this.f181032h = aVar8;
        this.f181033i = aVar9;
        this.f181034j = aVar10;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f181025a, qVar.f181025a) && L.f(this.f181026b, qVar.f181026b) && L.f(this.f181027c, qVar.f181027c) && L.f(this.f181028d, qVar.f181028d) && L.f(this.f181029e, qVar.f181029e) && L.f(this.f181030f, qVar.f181030f) && L.f(this.f181031g, qVar.f181031g) && L.f(this.f181032h, qVar.f181032h) && L.f(this.f181033i, qVar.f181033i) && L.f(this.f181034j, qVar.f181034j);
    }

    public final int hashCode() {
        return this.f181034j.hashCode() + ((this.f181033i.hashCode() + ((this.f181032h.hashCode() + ((this.f181031g.hashCode() + ((this.f181030f.hashCode() + ((this.f181029e.hashCode() + ((this.f181028d.hashCode() + ((this.f181027c.hashCode() + ((this.f181026b.hashCode() + (this.f181025a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "TimeLineItemPayload(icon=" + this.f181025a + ", text=" + this.f181026b + ", alignment=" + this.f181027c + ", widthType=" + this.f181028d + ", textStyle=" + this.f181029e + ", textColor=" + this.f181030f + ", iconColor=" + this.f181031g + ", startLineColor=" + this.f181032h + ", endLineColor=" + this.f181033i + ", lineThickness=" + this.f181034j + ')';
    }
}
