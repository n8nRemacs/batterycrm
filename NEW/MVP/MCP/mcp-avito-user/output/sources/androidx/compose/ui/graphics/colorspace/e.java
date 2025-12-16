package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.r;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.j0;
import androidx.compose.ui.text.input.k0;
import androidx.compose.ui.text.l0;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements j, l0, k0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39389c;

    public /* synthetic */ e(int i12) {
        this.f39389c = i12;
    }

    public static int d(int i12, int i13, double d12) {
        return (Double.hashCode(d12) + i12) * i13;
    }

    public static int e(int i12, int i13, int i14, int i15) {
        return ((i12 * i13) / i14) + i15;
    }

    public static int f(int i12, int i13, List list) {
        return (list.size() * i12) + i13;
    }

    public static int g(ArrayList arrayList, int i12, int i13) {
        return (arrayList.hashCode() + i12) * i13;
    }

    public static String h(int i12, int i13, String str) {
        return str.substring(i13, str.length() - i12);
    }

    public static String i(long j12, String str, String str2) {
        return str + j12 + str2;
    }

    public static String j(File file, String str) {
        return str + file;
    }

    public static String k(Class cls, String str) {
        return str + cls;
    }

    public static String l(String str, char c12) {
        return str + c12;
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String o(StringBuilder sb2, double d12, char c12) {
        sb2.append(d12);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, ArrayList arrayList, char c12) {
        sb2.append(arrayList);
        sb2.append(c12);
        return sb2.toString();
    }

    public static StringBuilder q(int i12, String str) {
        StringBuilder sb2 = new StringBuilder(i12);
        sb2.append(str);
        return sb2;
    }

    public static ArrayList r(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    public static kotlin.reflect.l s(Class cls, String str, String str2, int i12, n0 n0Var) {
        return n0Var.e(new Y(cls, str, str2, i12));
    }

    public static void t(int i12, int i13, int i14, int i15, int i16) {
        androidx.compose.ui.input.key.i.a(i12);
        androidx.compose.ui.input.key.i.a(i13);
        androidx.compose.ui.input.key.i.a(i14);
        androidx.compose.ui.input.key.i.a(i15);
        androidx.compose.ui.input.key.i.a(i16);
    }

    public static void u(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
    }

    public static /* bridge */ /* synthetic */ boolean v() {
        throw null;
    }

    public static int w(int i12, int i13, int i14, int i15) {
        return CodedOutputStream.D(i12) + i13 + i14 + i15;
    }

    public static int x(int i12, int i13, int i14, int i15) {
        return ((i12 / i13) * i14) + i15;
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double a(double d12) {
        switch (this.f39389c) {
            case 0:
                f fVar = f.f39390a;
                s sVar = f.f39393d;
                fVar.getClass();
                return f.b(sVar, d12);
            case 1:
                f fVar2 = f.f39390a;
                s sVar2 = f.f39393d;
                fVar2.getClass();
                return f.a(sVar2, d12);
            case 2:
                f fVar3 = f.f39390a;
                s sVar3 = f.f39394e;
                fVar3.getClass();
                return f.d(sVar3, d12);
            case 3:
                f fVar4 = f.f39390a;
                s sVar4 = f.f39394e;
                fVar4.getClass();
                return f.c(sVar4, d12);
            default:
                r.a aVar = r.f39446r;
                return d12;
        }
    }

    @Override // androidx.compose.ui.text.l0
    public boolean b(l0.j jVar, l0.j jVar2) {
        switch (this.f39389c) {
            case 12:
                l0.a aVar = l0.a.f42496a;
                return jVar.l(jVar2);
            default:
                l0.a aVar2 = l0.a.f42496a;
                return jVar2.a(jVar.f());
        }
    }

    @Override // androidx.compose.ui.text.input.k0
    public j0 c(C22602e c22602e) {
        k0.a aVar = k0.a.f42452a;
        L.f42358a.getClass();
        return new j0(c22602e, L.a.f42360b);
    }
}
