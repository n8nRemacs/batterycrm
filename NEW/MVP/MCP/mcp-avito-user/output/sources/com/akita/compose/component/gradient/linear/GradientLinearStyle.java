package com.akita.compose.component.gradient.linear;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: GradientLinearStyle.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/gradient/linear/GradientLinearStyle;", "", "Orientation", "gradient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GradientLinearStyle {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f61638a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f61639b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Orientation f61640c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GradientLinearStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/gradient/linear/GradientLinearStyle$Orientation;", "", "gradient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Orientation {

        /* renamed from: b, reason: collision with root package name */
        public static final Orientation f61641b;

        /* renamed from: c, reason: collision with root package name */
        public static final Orientation f61642c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Orientation[] f61643d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f61644e;

        static {
            Orientation orientation = new Orientation("HORIZONTAL", 0);
            f61641b = orientation;
            Orientation orientation2 = new Orientation("VERTICAL", 1);
            f61642c = orientation2;
            Orientation[] orientationArr = {orientation, orientation2};
            f61643d = orientationArr;
            f61644e = c.a(orientationArr);
        }

        public Orientation() {
            throw null;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) f61643d.clone();
        }
    }

    public GradientLinearStyle(@k p pVar, @k p pVar2, @k Orientation orientation) {
        this.f61638a = pVar;
        this.f61639b = pVar2;
        this.f61640c = orientation;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientLinearStyle)) {
            return false;
        }
        GradientLinearStyle gradientLinearStyle = (GradientLinearStyle) obj;
        return this.f61638a.equals(gradientLinearStyle.f61638a) && this.f61639b.equals(gradientLinearStyle.f61639b) && Float.compare(0.1f, 0.1f) == 0 && this.f61640c == gradientLinearStyle.f61640c;
    }

    public final int hashCode() {
        return this.f61640c.hashCode() + r.d(0.1f, s.b(this.f61639b, this.f61638a.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "GradientLinearStyle(colorStart=" + this.f61638a + ", colorEnd=" + this.f61639b + ", offset=0.1, orientation=" + this.f61640c + ')';
    }
}
