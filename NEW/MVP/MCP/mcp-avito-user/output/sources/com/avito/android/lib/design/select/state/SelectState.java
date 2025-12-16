package com.avito.android.lib.design.select.state;

import Y41.a;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: SelectState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/select/state/SelectState;", "", "BorderState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SelectState {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f180257a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f180258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f180259c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f180260d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CharSequence f180261e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<com.avito.android.lib.design.bottom_sheet.k> f180262f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<String, G0> f180263g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Drawable f180264h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final a<G0> f180265i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f180266j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f180267k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BorderState f180268l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final a<G0> f180269m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f180270n;

    /* renamed from: o, reason: collision with root package name */
    public final int f180271o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/select/state/SelectState$BorderState;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BorderState {

        /* renamed from: b, reason: collision with root package name */
        public static final BorderState f180272b;

        /* renamed from: c, reason: collision with root package name */
        public static final BorderState f180273c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ BorderState[] f180274d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180275e;

        static {
            BorderState borderState = new BorderState("Normal", 0);
            f180272b = borderState;
            BorderState borderState2 = new BorderState("Error", 1);
            f180273c = borderState2;
            BorderState[] borderStateArr = {borderState, borderState2, new BorderState("Warning", 2)};
            f180274d = borderStateArr;
            f180275e = c.a(borderStateArr);
        }

        public BorderState() {
            throw null;
        }

        public static BorderState valueOf(String str) {
            return (BorderState) Enum.valueOf(BorderState.class, str);
        }

        public static BorderState[] values() {
            return (BorderState[]) f180274d.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectState(@k String str, @l String str2, boolean z12, boolean z13, @l CharSequence charSequence, @l List<com.avito.android.lib.design.bottom_sheet.k> list, @l Y41.l<? super String, G0> lVar, @l Drawable drawable, @l a<G0> aVar, boolean z14, boolean z15, @k BorderState borderState, @l a<G0> aVar2, boolean z16, int i12) {
        this.f180257a = str;
        this.f180258b = str2;
        this.f180259c = z12;
        this.f180260d = z13;
        this.f180261e = charSequence;
        this.f180262f = list;
        this.f180263g = lVar;
        this.f180264h = drawable;
        this.f180265i = aVar;
        this.f180266j = z14;
        this.f180267k = z15;
        this.f180268l = borderState;
        this.f180269m = aVar2;
        this.f180270n = z16;
        this.f180271o = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.CharSequence] */
    public static SelectState a(SelectState selectState, String str, boolean z12, String str2, List list, Y41.l lVar, int i12) {
        String str3 = (i12 & 1) != 0 ? selectState.f180257a : str;
        String str4 = selectState.f180258b;
        boolean z13 = (i12 & 4) != 0 ? selectState.f180259c : z12;
        boolean z14 = selectState.f180260d;
        String str5 = (i12 & 16) != 0 ? selectState.f180261e : str2;
        List list2 = (i12 & 32) != 0 ? selectState.f180262f : list;
        Y41.l lVar2 = (i12 & 64) != 0 ? selectState.f180263g : lVar;
        Drawable drawable = selectState.f180264h;
        a<G0> aVar = selectState.f180265i;
        boolean z15 = selectState.f180266j;
        boolean z16 = selectState.f180267k;
        BorderState borderState = selectState.f180268l;
        a<G0> aVar2 = selectState.f180269m;
        boolean z17 = selectState.f180270n;
        int i13 = selectState.f180271o;
        selectState.getClass();
        return new SelectState(str3, str4, z13, z14, str5, list2, lVar2, drawable, aVar, z15, z16, borderState, aVar2, z17, i13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectState)) {
            return false;
        }
        SelectState selectState = (SelectState) obj;
        return L.f(this.f180257a, selectState.f180257a) && L.f(this.f180258b, selectState.f180258b) && this.f180259c == selectState.f180259c && this.f180260d == selectState.f180260d && L.f(this.f180261e, selectState.f180261e) && L.f(this.f180262f, selectState.f180262f) && L.f(this.f180263g, selectState.f180263g) && L.f(this.f180264h, selectState.f180264h) && L.f(this.f180265i, selectState.f180265i) && this.f180266j == selectState.f180266j && this.f180267k == selectState.f180267k && this.f180268l == selectState.f180268l && L.f(this.f180269m, selectState.f180269m) && this.f180270n == selectState.f180270n && this.f180271o == selectState.f180271o;
    }

    public final int hashCode() {
        int iHashCode = this.f180257a.hashCode() * 31;
        String str = this.f180258b;
        int i12 = r.i(r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f180259c), 31, this.f180260d);
        CharSequence charSequence = this.f180261e;
        int iHashCode2 = (i12 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List<com.avito.android.lib.design.bottom_sheet.k> list = this.f180262f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Y41.l<String, G0> lVar = this.f180263g;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Drawable drawable = this.f180264h;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        a<G0> aVar = this.f180265i;
        int iHashCode6 = (this.f180268l.hashCode() + r.i(r.i((iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f180266j), 31, this.f180267k)) * 31;
        a<G0> aVar2 = this.f180269m;
        return Integer.hashCode(this.f180271o) + r.i((iHashCode6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31, this.f180270n);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectState(text=");
        sb2.append(this.f180257a);
        sb2.append(", placeholder=");
        sb2.append(this.f180258b);
        sb2.append(", isEnabled=");
        sb2.append(this.f180259c);
        sb2.append(", readOnly=");
        sb2.append(this.f180260d);
        sb2.append(", bottomSheetTitle=");
        sb2.append((Object) this.f180261e);
        sb2.append(", options=");
        sb2.append(this.f180262f);
        sb2.append(", onSelect=");
        sb2.append(this.f180263g);
        sb2.append(", icon=");
        sb2.append(this.f180264h);
        sb2.append(", iconOnClick=");
        sb2.append(this.f180265i);
        sb2.append(", isLoading=");
        sb2.append(this.f180266j);
        sb2.append(", clearButtonVisible=");
        sb2.append(this.f180267k);
        sb2.append(", borderState=");
        sb2.append(this.f180268l);
        sb2.append(", onClear=");
        sb2.append(this.f180269m);
        sb2.append(", multiline=");
        sb2.append(this.f180270n);
        sb2.append(", multilineMaxLines=");
        return r.t(sb2, this.f180271o, ')');
    }

    public /* synthetic */ SelectState(String str, String str2, boolean z12, boolean z13, CharSequence charSequence, List list, Y41.l lVar, Drawable drawable, a aVar, boolean z14, boolean z15, BorderState borderState, a aVar2, boolean z16, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? true : z12, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : charSequence, (i13 & 32) != 0 ? null : list, (i13 & 64) != 0 ? null : lVar, (i13 & 128) != 0 ? null : drawable, (i13 & 256) != 0 ? null : aVar, (i13 & 512) != 0 ? false : z14, (i13 & 1024) != 0 ? false : z15, (i13 & 2048) != 0 ? BorderState.f180272b : borderState, (i13 & 4096) == 0 ? aVar2 : null, (i13 & 8192) == 0 ? z16 : false, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Integer.MAX_VALUE : i12);
    }
}
