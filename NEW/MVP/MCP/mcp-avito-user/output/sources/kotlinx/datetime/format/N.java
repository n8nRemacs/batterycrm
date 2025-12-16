package kotlinx.datetime.format;

import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: LocalTimeFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/N;", "Lkotlinx/datetime/format/o0;", "Lkotlinx/datetime/internal/format/parser/c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class N implements InterfaceC43351o0, InterfaceC43377c<N> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Integer f412358a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f412359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AmPmMarker f412360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Integer f412361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Integer f412362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Integer f412363f;

    public N() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void A(@Y61.l Integer num) {
        this.f412361d = num;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void B(@Y61.l Integer num) {
        this.f412358a = num;
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43377c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final N a() {
        return new N(this.f412358a, this.f412359b, this.f412360c, this.f412361d, this.f412362e, this.f412363f);
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void c(@Y61.l Integer num) {
        this.f412362e = num;
    }

    @Y61.k
    public final kotlinx.datetime.w d() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f412358a;
        if (num != null) {
            iIntValue = num.intValue();
            Integer num2 = this.f412359b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new IllegalArgumentException(androidx.compose.foundation.H.j(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            AmPmMarker amPmMarker = this.f412360c;
            if (amPmMarker != null) {
                if ((amPmMarker == AmPmMarker.f412324b) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + amPmMarker).toString());
                }
            }
        } else {
            Integer num3 = this.f412359b;
            Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                AmPmMarker amPmMarker2 = this.f412360c;
                if (amPmMarker2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (amPmMarker2 != AmPmMarker.f412324b ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num4 = this.f412361d;
        S.b(num4, SelectionType.TYPE_MINUTE);
        int iIntValue4 = num4.intValue();
        Integer num5 = this.f412362e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f412363f;
        return new kotlinx.datetime.w(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof N) {
            N n12 = (N) obj;
            if (kotlin.jvm.internal.L.f(this.f412358a, n12.f412358a) && kotlin.jvm.internal.L.f(this.f412359b, n12.f412359b) && this.f412360c == n12.f412360c && kotlin.jvm.internal.L.f(this.f412361d, n12.f412361d) && kotlin.jvm.internal.L.f(this.f412362e, n12.f412362e) && kotlin.jvm.internal.L.f(this.f412363f, n12.f412363f)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void g(@Y61.l AmPmMarker amPmMarker) {
        this.f412360c = amPmMarker;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void h(@Y61.l I51.c cVar) {
        this.f412363f = cVar != null ? Integer.valueOf(cVar.a(9)) : null;
    }

    public final int hashCode() {
        Integer num = this.f412358a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f412359b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        AmPmMarker amPmMarker = this.f412360c;
        int iHashCode = ((amPmMarker != null ? amPmMarker.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f412361d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f412362e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f412363f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: j, reason: from getter */
    public final Integer getF412362e() {
        return this.f412362e;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: l, reason: from getter */
    public final Integer getF412361d() {
        return this.f412361d;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    public final I51.c m() {
        Integer num = this.f412363f;
        if (num != null) {
            return new I51.c(num.intValue(), 9);
        }
        return null;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: p, reason: from getter */
    public final Integer getF412359b() {
        return this.f412359b;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: s, reason: from getter */
    public final AmPmMarker getF412360c() {
        return this.f412360c;
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    public final void t(@Y61.l Integer num) {
        this.f412359b = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r4.f412358a
            java.lang.String r2 = "??"
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.Integer r3 = r4.f412361d
            if (r3 != 0) goto L19
            r3 = r2
        L19:
            r0.append(r3)
            r0.append(r1)
            java.lang.Integer r1 = r4.f412362e
            if (r1 != 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            r0.append(r2)
            r1 = 46
            r0.append(r1)
            java.lang.Integer r1 = r4.f412363f
            if (r1 == 0) goto L45
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = 9 - r2
            java.lang.String r1 = kotlin.text.C43066x.R(r2, r1)
            if (r1 != 0) goto L47
        L45:
            java.lang.String r1 = "???"
        L47:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.format.N.toString():java.lang.String");
    }

    @Override // kotlinx.datetime.format.InterfaceC43351o0
    @Y61.l
    /* renamed from: w, reason: from getter */
    public final Integer getF412358a() {
        return this.f412358a;
    }

    public N(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l AmPmMarker amPmMarker, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5) {
        this.f412358a = num;
        this.f412359b = num2;
        this.f412360c = amPmMarker;
        this.f412361d = num3;
        this.f412362e = num4;
        this.f412363f = num5;
    }

    public /* synthetic */ N(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : amPmMarker, (i12 & 8) != 0 ? null : num3, (i12 & 16) != 0 ? null : num4, (i12 & 32) != 0 ? null : num5);
    }
}
