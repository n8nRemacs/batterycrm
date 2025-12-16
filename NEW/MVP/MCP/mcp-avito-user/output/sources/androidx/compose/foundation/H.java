package androidx.compose.foundation;

import android.os.Bundle;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.l0;
import kotlin.text.C43059p;
import s0.C47949a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class H implements androidx.compose.ui.graphics.colorspace.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26714c;

    public static void A(androidx.compose.runtime.B b12, boolean z12, boolean z13, boolean z14) {
        b12.X(z12);
        b12.X(z13);
        b12.X(z14);
    }

    public static void B(androidx.compose.runtime.B b12, boolean z12, boolean z13, boolean z14, boolean z15) {
        b12.X(z12);
        b12.X(z13);
        b12.X(z14);
        b12.X(z15);
    }

    public static void C(a.b bVar, long j12) {
        bVar.a().i();
        bVar.j(j12);
    }

    public static int b(int i12, int i13, int i14, int i15) {
        return ((i12 - i13) * i14) + i15;
    }

    public static int c(int i12, int i13, androidx.compose.ui.text.x0 x0Var) {
        return (x0Var.hashCode() + i12) * i13;
    }

    public static int d(int i12, int i13, String str) {
        return (str.hashCode() + i12) * i13;
    }

    public static int e(int i12, int i13, List list) {
        return (list.hashCode() + i12) * i13;
    }

    public static int f(InterfaceC22363h0 interfaceC22363h0, long j12, ArrayList arrayList, int i12, int i13) {
        arrayList.add(interfaceC22363h0.I(j12));
        return i12 + i13;
    }

    public static InterfaceC22204y1 g(long j12, androidx.compose.runtime.A a12) {
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(androidx.compose.ui.graphics.T.a(j12), a12);
        a12.h();
        return interfaceC22204y1M;
    }

    public static String h(char c12, float f12, StringBuilder sb2) {
        sb2.append((Object) androidx.compose.ui.unit.h.c(f12));
        sb2.append(c12);
        return sb2.toString();
    }

    public static String i(char c12, String str, String str2) {
        return str + c12 + str2;
    }

    public static String j(int i12, int i13, String str, String str2) {
        return str + i12 + str2 + i13;
    }

    public static String k(String str, String str2, String str3) {
        return new C43059p(str).f(str2, str3);
    }

    public static String l(StringBuilder sb2, Y41.l lVar, char c12) {
        sb2.append(lVar);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, Bundle bundle, char c12) {
        sb2.append(bundle);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, Object obj, char c12) {
        sb2.append(obj);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, char c12, String str2) {
        sb2.append(str);
        sb2.append(c12);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, List list, char c12) {
        sb2.append(list);
        sb2.append(c12);
        return sb2.toString();
    }

    public static StringBuilder q(long j12, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j12);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder r(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static KotlinNothingValueException s(String str) {
        C47949a.c(str);
        return new KotlinNothingValueException();
    }

    public static l0.h t(Object obj) {
        C42729a0.b(obj);
        return new l0.h();
    }

    public static void u(float f12, String str, StringBuilder sb2) {
        sb2.append((Object) androidx.compose.ui.unit.h.c(f12));
        sb2.append(str);
    }

    public static void v(int i12, C22096n c22096n, androidx.compose.runtime.B b12, boolean z12) {
        c22096n.invoke(b12, Integer.valueOf(i12));
        b12.X(z12);
    }

    public static void w(int i12, C22096n c22096n, androidx.compose.runtime.B b12, boolean z12, boolean z13) {
        c22096n.invoke(b12, Integer.valueOf(i12));
        b12.X(z12);
        b12.X(z13);
    }

    public static void x(int i12, C22096n c22096n, J2 j22, androidx.compose.runtime.A a12, int i13) {
        c22096n.invoke(j22, a12, Integer.valueOf(i12));
        a12.I(i13);
    }

    public static void y(int i12, C22096n c22096n, J2 j22, androidx.compose.runtime.B b12, int i13) {
        c22096n.invoke(j22, b12, Integer.valueOf(i12));
        b12.I(i13);
    }

    public static void z(long j12, String str, StringBuilder sb2) {
        sb2.append((Object) androidx.compose.ui.graphics.T.j(j12));
        sb2.append(str);
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double a(double d12) {
        switch (this.f26714c) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                androidx.compose.ui.graphics.colorspace.f fVar = androidx.compose.ui.graphics.colorspace.f.f39390a;
                double d13 = d12 < 0.0d ? -d12 : d12;
                return Math.copySign(d13 >= 0.0031308049535603718d ? (Math.pow(d13, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d13 / 0.07739938080495357d, d12);
            default:
                androidx.compose.ui.graphics.colorspace.f fVar2 = androidx.compose.ui.graphics.colorspace.f.f39390a;
                double d14 = d12 < 0.0d ? -d12 : d12;
                return Math.copySign(d14 >= 0.04045d ? Math.pow((0.9478672985781991d * d14) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d14, d12);
        }
    }
}
