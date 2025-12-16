package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.H;
import j.InterfaceC42156l;
import j.P;

@RestrictTo
/* loaded from: classes10.dex */
public class DocumentData {

    /* renamed from: a, reason: collision with root package name */
    public String f59616a;

    /* renamed from: b, reason: collision with root package name */
    public String f59617b;

    /* renamed from: c, reason: collision with root package name */
    public float f59618c;

    /* renamed from: d, reason: collision with root package name */
    public Justification f59619d;

    /* renamed from: e, reason: collision with root package name */
    public int f59620e;

    /* renamed from: f, reason: collision with root package name */
    public float f59621f;

    /* renamed from: g, reason: collision with root package name */
    public float f59622g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC42156l
    public int f59623h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC42156l
    public int f59624i;

    /* renamed from: j, reason: collision with root package name */
    public float f59625j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59626k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public PointF f59627l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public PointF f59628m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Justification {

        /* renamed from: b, reason: collision with root package name */
        public static final Justification f59629b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Justification[] f59630c;

        /* JADX INFO: Fake field, exist only in values array */
        Justification EF0;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            Justification justification3 = new Justification("CENTER", 2);
            f59629b = justification3;
            f59630c = new Justification[]{justification, justification2, justification3};
        }

        public Justification() {
            throw null;
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) f59630c.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.f59619d.ordinal() + (((int) (H.d(this.f59616a.hashCode() * 31, 31, this.f59617b) + this.f59618c)) * 31)) * 31) + this.f59620e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f59621f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f59623h;
    }
}
