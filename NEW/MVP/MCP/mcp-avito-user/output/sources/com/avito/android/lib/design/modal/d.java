package com.avito.android.lib.design.modal;

import PK0.n;
import VU.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ModalStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/modal/d;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final a f179720u = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f179721a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f179722b;

    /* renamed from: c, reason: collision with root package name */
    public final int f179723c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final VU.b f179724d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final n f179725e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final n f179726f;

    /* renamed from: g, reason: collision with root package name */
    public final int f179727g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179728h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final C35763c0 f179729i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f179730j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f179731k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Integer f179732l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Integer f179733m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Integer f179734n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Integer f179735o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Integer f179736p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Integer f179737q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Integer f179738r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final Integer f179739s;

    /* renamed from: t, reason: collision with root package name */
    public final int f179740t;

    /* compiled from: ModalStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/d$a;", "LLV/c;", "Lcom/avito/android/lib/design/modal/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<d> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static d b(@Y61.k TypedArray typedArray, @Y61.k Context context) {
            int resourceId = typedArray.getResourceId(25, R.style.Modal_Default_Window);
            Integer numValueOf = !typedArray.hasValue(24) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(24, 0));
            int dimensionPixelSize = typedArray.getDimensionPixelSize(17, 0);
            b.a aVar = VU.b.f17147t;
            int resourceId2 = typedArray.getResourceId(2, 0);
            aVar.getClass();
            VU.b bVarC = b.a.c(resourceId2, context);
            n nVarD = AK.c.d(typedArray, 22, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            n nVarA = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(19, 0), context);
            int i12 = typedArray.getInt(5, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(13, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            return new d(resourceId, numValueOf, dimensionPixelSize, bVarC, nVarD, nVarA, i12, dimensionPixelSize2, colorStateListA != null ? C35771d0.b(colorStateListA) : null, !typedArray.hasValue(12) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(12, 0)), !typedArray.hasValue(11) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(11, 0)), !typedArray.hasValue(15) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(15, 0)), !typedArray.hasValue(6) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(6, 0)), !typedArray.hasValue(20) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(20, 0)), !typedArray.hasValue(23) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(23, 0)), !typedArray.hasValue(1) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(1, 0)), !typedArray.hasValue(16) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(16, 0)), !typedArray.hasValue(18) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(18, 0)), !typedArray.hasValue(14) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(14, 0)), typedArray.getResourceId(8, 0));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178955Z);
            d dVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return dVarB;
        }

        public a() {
        }
    }

    public d() {
        this(0, null, 0, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f179721a == dVar.f179721a && L.f(this.f179722b, dVar.f179722b) && this.f179723c == dVar.f179723c && L.f(this.f179724d, dVar.f179724d) && L.f(this.f179725e, dVar.f179725e) && L.f(this.f179726f, dVar.f179726f) && this.f179727g == dVar.f179727g && this.f179728h == dVar.f179728h && L.f(this.f179729i, dVar.f179729i) && L.f(this.f179730j, dVar.f179730j) && L.f(this.f179731k, dVar.f179731k) && L.f(this.f179732l, dVar.f179732l) && L.f(this.f179733m, dVar.f179733m) && L.f(this.f179734n, dVar.f179734n) && L.f(this.f179735o, dVar.f179735o) && L.f(this.f179736p, dVar.f179736p) && L.f(this.f179737q, dVar.f179737q) && L.f(this.f179738r, dVar.f179738r) && L.f(this.f179739s, dVar.f179739s) && this.f179740t == dVar.f179740t;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f179721a) * 31;
        Integer num = this.f179722b;
        int iE2 = r.e(this.f179723c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        VU.b bVar = this.f179724d;
        int iHashCode2 = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        n nVar = this.f179725e;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f179726f;
        int iE3 = r.e(this.f179728h, r.e(this.f179727g, (iHashCode3 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31, 31), 31);
        C35763c0 c35763c0 = this.f179729i;
        int iHashCode4 = (iE3 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Integer num2 = this.f179730j;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f179731k;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f179732l;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f179733m;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f179734n;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f179735o;
        int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f179736p;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f179737q;
        int iHashCode12 = (iHashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f179738r;
        int iHashCode13 = (iHashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f179739s;
        return Integer.hashCode(this.f179740t) + ((iHashCode13 + (num11 != null ? num11.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModalStyle(windowStyleRes=");
        sb2.append(this.f179721a);
        sb2.append(", width=");
        sb2.append(this.f179722b);
        sb2.append(", minHorizontalMargin=");
        sb2.append(this.f179723c);
        sb2.append(", buttonStyle=");
        sb2.append(this.f179724d);
        sb2.append(", titleStyle=");
        sb2.append(this.f179725e);
        sb2.append(", subtitleStyle=");
        sb2.append(this.f179726f);
        sb2.append(", buttonsOrientation=");
        sb2.append(this.f179727g);
        sb2.append(", cornerRadius=");
        sb2.append(this.f179728h);
        sb2.append(", backgroundColor=");
        sb2.append(this.f179729i);
        sb2.append(", contentToButtonsSpacing=");
        sb2.append(this.f179730j);
        sb2.append(", contentToBottomEdgeSpacing=");
        sb2.append(this.f179731k);
        sb2.append(", imageToTextSpacing=");
        sb2.append(this.f179732l);
        sb2.append(", buttonsPadding=");
        sb2.append(this.f179733m);
        sb2.append(", textsPadding=");
        sb2.append(this.f179734n);
        sb2.append(", topModalPadding=");
        sb2.append(this.f179735o);
        sb2.append(", bottomModalPadding=");
        sb2.append(this.f179736p);
        sb2.append(", leftModalPadding=");
        sb2.append(this.f179737q);
        sb2.append(", rightModalPadding=");
        sb2.append(this.f179738r);
        sb2.append(", containerPadding=");
        sb2.append(this.f179739s);
        sb2.append(", closeButtonStyleRes=");
        return r.t(sb2, this.f179740t, ')');
    }

    public d(int i12, @Y61.l Integer num, int i13, @Y61.l VU.b bVar, @Y61.l n nVar, @Y61.l n nVar2, int i14, int i15, @Y61.l C35763c0 c35763c0, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l Integer num6, @Y61.l Integer num7, @Y61.l Integer num8, @Y61.l Integer num9, @Y61.l Integer num10, @Y61.l Integer num11, @f0 int i16) {
        this.f179721a = i12;
        this.f179722b = num;
        this.f179723c = i13;
        this.f179724d = bVar;
        this.f179725e = nVar;
        this.f179726f = nVar2;
        this.f179727g = i14;
        this.f179728h = i15;
        this.f179729i = c35763c0;
        this.f179730j = num2;
        this.f179731k = num3;
        this.f179732l = num4;
        this.f179733m = num5;
        this.f179734n = num6;
        this.f179735o = num7;
        this.f179736p = num8;
        this.f179737q = num9;
        this.f179738r = num10;
        this.f179739s = num11;
        this.f179740t = i16;
    }

    public /* synthetic */ d(int i12, Integer num, int i13, VU.b bVar, n nVar, n nVar2, int i14, int i15, C35763c0 c35763c0, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i16, int i17, C42822w c42822w) {
        this((i17 & 1) != 0 ? 0 : i12, (i17 & 2) != 0 ? null : num, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? null : bVar, (i17 & 16) != 0 ? null : nVar, (i17 & 32) != 0 ? null : nVar2, (i17 & 64) != 0 ? 0 : i14, (i17 & 128) != 0 ? 0 : i15, (i17 & 256) != 0 ? null : c35763c0, (i17 & 512) != 0 ? null : num2, (i17 & 1024) != 0 ? null : num3, (i17 & 2048) != 0 ? null : num4, (i17 & 4096) != 0 ? null : num5, (i17 & 8192) != 0 ? null : num6, (i17 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num7, (i17 & 32768) != 0 ? null : num8, (i17 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : num9, (i17 & 131072) != 0 ? null : num10, (i17 & 262144) != 0 ? null : num11, (i17 & 524288) != 0 ? 0 : i16);
    }
}
