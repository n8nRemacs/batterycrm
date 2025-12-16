package com.avito.android.lib.design.time_line;

import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: PrivateTimeLineItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f180970a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f180971b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f180972c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TimeLineAlignment f180973d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TimeLineItemWidthType f180974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180975f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ItemType f180976g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final PK0.n f180977h;

    /* renamed from: i, reason: collision with root package name */
    public final int f180978i;

    /* renamed from: j, reason: collision with root package name */
    public final int f180979j;

    /* renamed from: k, reason: collision with root package name */
    public final int f180980k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final PK0.n f180981l;

    /* renamed from: m, reason: collision with root package name */
    public final int f180982m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f180983n;

    /* compiled from: PrivateTimeLineItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ItemType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ItemType itemType = ItemType.f180949b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ItemType itemType2 = ItemType.f180949b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(int i12, @InterfaceC42150f @Y61.l Integer num, @Y61.l String str, @Y61.k TimeLineAlignment timeLineAlignment, @Y61.k TimeLineItemWidthType timeLineItemWidthType, int i13, @Y61.k ItemType itemType, @Y61.k PK0.n nVar, int i14, int i15, int i16, @Y61.k PK0.n nVar2, int i17) {
        this.f180970a = i12;
        this.f180971b = num;
        this.f180972c = str;
        this.f180973d = timeLineAlignment;
        this.f180974e = timeLineItemWidthType;
        this.f180975f = i13;
        this.f180976g = itemType;
        this.f180977h = nVar;
        this.f180978i = i14;
        this.f180979j = i15;
        this.f180980k = i16;
        this.f180981l = nVar2;
        this.f180982m = i17;
        this.f180983n = itemType == ItemType.f180949b || itemType == ItemType.f180951d;
    }

    public final int a() {
        int iOrdinal = this.f180976g.ordinal();
        if (iOrdinal == 0) {
            return this.f180978i;
        }
        int i12 = this.f180980k;
        if (iOrdinal == 1 || iOrdinal == 2) {
            return i12;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f180970a == cVar.f180970a && L.f(this.f180971b, cVar.f180971b) && L.f(this.f180972c, cVar.f180972c) && this.f180973d == cVar.f180973d && this.f180974e == cVar.f180974e && this.f180975f == cVar.f180975f && this.f180976g == cVar.f180976g && L.f(this.f180977h, cVar.f180977h) && this.f180978i == cVar.f180978i && this.f180979j == cVar.f180979j && this.f180980k == cVar.f180980k && L.f(this.f180981l, cVar.f180981l) && this.f180982m == cVar.f180982m;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f180970a) * 31;
        Integer num = this.f180971b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f180972c;
        return Integer.hashCode(this.f180982m) + ((this.f180981l.hashCode() + androidx.appcompat.app.r.e(this.f180980k, androidx.appcompat.app.r.e(this.f180979j, androidx.appcompat.app.r.e(this.f180978i, (this.f180977h.hashCode() + ((this.f180976g.hashCode() + androidx.appcompat.app.r.e(this.f180975f, (this.f180974e.hashCode() + ((this.f180973d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31), 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PrivateTimeLineItem(index=");
        sb2.append(this.f180970a);
        sb2.append(", iconAttr=");
        sb2.append(this.f180971b);
        sb2.append(", text=");
        sb2.append(this.f180972c);
        sb2.append(", alignment=");
        sb2.append(this.f180973d);
        sb2.append(", widthType=");
        sb2.append(this.f180974e);
        sb2.append(", lineThickness=");
        sb2.append(this.f180975f);
        sb2.append(", itemType=");
        sb2.append(this.f180976g);
        sb2.append(", activeTextStyle=");
        sb2.append(this.f180977h);
        sb2.append(", activeColor=");
        sb2.append(this.f180978i);
        sb2.append(", activeTextColor=");
        sb2.append(this.f180979j);
        sb2.append(", inactiveColor=");
        sb2.append(this.f180980k);
        sb2.append(", inactiveTextStyle=");
        sb2.append(this.f180981l);
        sb2.append(", inactiveTextColor=");
        return androidx.appcompat.app.r.t(sb2, this.f180982m, ')');
    }
}
