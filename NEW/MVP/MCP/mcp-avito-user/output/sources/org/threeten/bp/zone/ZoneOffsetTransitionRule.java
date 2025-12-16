package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Month;
import org.threeten.bp.q;

/* loaded from: classes16.dex */
public final class ZoneOffsetTransitionRule implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: b, reason: collision with root package name */
    public final Month f422225b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f422226c;

    /* renamed from: d, reason: collision with root package name */
    public final DayOfWeek f422227d;

    /* renamed from: e, reason: collision with root package name */
    public final org.threeten.bp.g f422228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f422229f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeDefinition f422230g;

    /* renamed from: h, reason: collision with root package name */
    public final q f422231h;

    /* renamed from: i, reason: collision with root package name */
    public final q f422232i;

    /* renamed from: j, reason: collision with root package name */
    public final q f422233j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimeDefinition {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TimeDefinition[] f422234b = {new TimeDefinition("UTC", 0), new TimeDefinition("WALL", 1), new TimeDefinition("STANDARD", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        TimeDefinition EF5;

        public TimeDefinition() {
            throw null;
        }

        public static TimeDefinition valueOf(String str) {
            return (TimeDefinition) Enum.valueOf(TimeDefinition.class, str);
        }

        public static TimeDefinition[] values() {
            return (TimeDefinition[]) f422234b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422235a;

        static {
            int[] iArr = new int[TimeDefinition.values().length];
            f422235a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422235a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ZoneOffsetTransitionRule(Month month, int i12, DayOfWeek dayOfWeek, org.threeten.bp.g gVar, int i13, TimeDefinition timeDefinition, q qVar, q qVar2, q qVar3) {
        this.f422225b = month;
        this.f422226c = (byte) i12;
        this.f422227d = dayOfWeek;
        this.f422228e = gVar;
        this.f422229f = i13;
        this.f422230g = timeDefinition;
        this.f422231h = qVar;
        this.f422232i = qVar2;
        this.f422233j = qVar3;
    }

    public static ZoneOffsetTransitionRule a(DataInput dataInput) throws IOException {
        int i12 = dataInput.readInt();
        Month monthQ = Month.q(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        DayOfWeek dayOfWeekH = i14 == 0 ? null : DayOfWeek.h(i14);
        int i15 = (507904 & i12) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        int i19 = i15 == 31 ? dataInput.readInt() : i15 * 3600;
        q qVarW = q.w(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        int i22 = qVarW.f422109c;
        q qVarW2 = q.w(i17 == 3 ? dataInput.readInt() : (i17 * 1800) + i22);
        q qVarW3 = i18 == 3 ? q.w(dataInput.readInt()) : q.w((i18 * 1800) + i22);
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new ZoneOffsetTransitionRule(monthQ, i13, dayOfWeekH, org.threeten.bp.g.z(w81.d.d(i19, 86400)), i19 >= 0 ? i19 / 86400 : ((i19 + 1) / 86400) - 1, timeDefinition, qVarW, qVarW2, qVarW3);
    }

    private Object writeReplace() {
        return new org.threeten.bp.zone.a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransitionRule)) {
            return false;
        }
        ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
        return this.f422225b == zoneOffsetTransitionRule.f422225b && this.f422226c == zoneOffsetTransitionRule.f422226c && this.f422227d == zoneOffsetTransitionRule.f422227d && this.f422230g == zoneOffsetTransitionRule.f422230g && this.f422229f == zoneOffsetTransitionRule.f422229f && this.f422228e.equals(zoneOffsetTransitionRule.f422228e) && this.f422231h.equals(zoneOffsetTransitionRule.f422231h) && this.f422232i.equals(zoneOffsetTransitionRule.f422232i) && this.f422233j.equals(zoneOffsetTransitionRule.f422233j);
    }

    public final int hashCode() {
        int iJ2 = ((this.f422228e.J() + this.f422229f) << 15) + (this.f422225b.ordinal() << 11) + ((this.f422226c + 32) << 5);
        DayOfWeek dayOfWeek = this.f422227d;
        return ((this.f422231h.f422109c ^ (this.f422230g.ordinal() + (iJ2 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f422232i.f422109c) ^ this.f422233j.f422109c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        q qVar = this.f422232i;
        q qVar2 = this.f422233j;
        sb2.append(qVar2.f422109c - qVar.f422109c > 0 ? "Gap " : "Overlap ");
        sb2.append(qVar);
        sb2.append(" to ");
        sb2.append(qVar2);
        sb2.append(", ");
        Month month = this.f422225b;
        byte b12 = this.f422226c;
        DayOfWeek dayOfWeek = this.f422227d;
        if (dayOfWeek == null) {
            sb2.append(month.name());
            sb2.append(' ');
            sb2.append((int) b12);
        } else if (b12 == -1) {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or before last day of ");
            sb2.append(month.name());
        } else if (b12 < 0) {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or before last day minus ");
            sb2.append((-b12) - 1);
            sb2.append(" of ");
            sb2.append(month.name());
        } else {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or after ");
            sb2.append(month.name());
            sb2.append(' ');
            sb2.append((int) b12);
        }
        sb2.append(" at ");
        org.threeten.bp.g gVar = this.f422228e;
        int i12 = this.f422229f;
        if (i12 == 0) {
            sb2.append(gVar);
        } else {
            long J12 = (i12 * 1440) + (gVar.J() / 60);
            long jC2 = w81.d.c(J12, 60L);
            if (jC2 < 10) {
                sb2.append(0);
            }
            sb2.append(jC2);
            sb2.append(':');
            long jE2 = w81.d.e(60, J12);
            if (jE2 < 10) {
                sb2.append(0);
            }
            sb2.append(jE2);
        }
        sb2.append(" ");
        sb2.append(this.f422230g);
        sb2.append(", standard offset ");
        sb2.append(this.f422231h);
        sb2.append(']');
        return sb2.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        org.threeten.bp.g gVar = this.f422228e;
        int iJ2 = (this.f422229f * 86400) + gVar.J();
        q qVar = this.f422231h;
        int i12 = this.f422232i.f422109c;
        int i13 = qVar.f422109c;
        int i14 = i12 - i13;
        int i15 = this.f422233j.f422109c;
        int i16 = i15 - i13;
        byte b12 = (iJ2 % 3600 != 0 || iJ2 > 86400) ? (byte) 31 : iJ2 == 86400 ? (byte) 24 : gVar.f422072b;
        int i17 = i13 % 900 == 0 ? (i13 / 900) + 128 : 255;
        int i18 = (i14 == 0 || i14 == 1800 || i14 == 3600) ? i14 / 1800 : 3;
        int i19 = (i16 == 0 || i16 == 1800 || i16 == 3600) ? i16 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f422227d;
        objectOutput.writeInt((this.f422225b.h() << 28) + ((this.f422226c + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.d()) << 19) + (b12 << 14) + (this.f422230g.ordinal() << 12) + (i17 << 4) + (i18 << 2) + i19);
        if (b12 == 31) {
            objectOutput.writeInt(iJ2);
        }
        if (i17 == 255) {
            objectOutput.writeInt(i13);
        }
        if (i18 == 3) {
            objectOutput.writeInt(i12);
        }
        if (i19 == 3) {
            objectOutput.writeInt(i15);
        }
    }
}
