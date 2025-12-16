package com.akita.compose.theme.re23.style;

import android.content.res.ColorStateList;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.InterfaceC35950u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class C0 {
    public static com.akita.compose.foundation.p A() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().f().getF18331a().getF18335c().getF18348e();
    }

    public static com.akita.compose.foundation.p B() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18297b().getF18309b();
    }

    public static com.akita.compose.foundation.p C() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().f().getF18331a().getF18338f();
    }

    public static com.akita.compose.foundation.p D() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18300e();
    }

    public static int a(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i12, int i13) {
        linkedHashMap.put(str, parcel.readString());
        return i12 + i13;
    }

    public static View b(ViewGroup viewGroup, int i12, ViewGroup viewGroup2, boolean z12) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i12, viewGroup2, z12);
    }

    public static com.akita.compose.foundation.p c() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18298c();
    }

    public static Boolean d(InterfaceC35950u interfaceC35950u, boolean z12) {
        interfaceC35950u.o().getClass();
        return Boolean.valueOf(z12);
    }

    public static Integer e(ColorStateList colorStateList, int[] iArr) {
        return Integer.valueOf(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()));
    }

    public static String f(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static String g(StringBuilder sb2, Boolean bool, char c12) {
        sb2.append(bool);
        sb2.append(c12);
        return sb2.toString();
    }

    public static Iterator h(Parcel parcel, int i12, Map map) {
        parcel.writeInt(i12);
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static Iterator i(Parcel parcel, Map map) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static Iterator j(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static kotlin.reflect.p k(Class cls, String str, String str2, int i12, kotlin.jvm.internal.n0 n0Var) {
        return n0Var.i(new kotlin.jvm.internal.h0(cls, str, str2, i12));
    }

    public static void l(Parcel parcel, int i12, Boolean bool) {
        parcel.writeInt(i12);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void m(Parcel parcel, int i12, Long l12) {
        parcel.writeInt(i12);
        parcel.writeLong(l12.longValue());
    }

    public static void n(com.akita.compose.theme.re23.semantic.b bVar, W2.q qVar) {
        bVar.getClass();
        qVar.getBorder().getClass();
    }

    public static com.akita.compose.foundation.p o() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18242a().getF18246a().getF18290b();
    }

    public static com.akita.compose.foundation.p p() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18301f();
    }

    public static com.akita.compose.foundation.p q() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18304i();
    }

    public static com.akita.compose.foundation.p r() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().v().getF18478b();
    }

    public static com.akita.compose.foundation.p s() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().y().getF18496c();
    }

    public static com.akita.compose.foundation.p t() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().y().getF18499f();
    }

    public static com.akita.compose.foundation.p u() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().y().getF18497d();
    }

    public static com.akita.compose.foundation.p v() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().y().getF18495b().getF18524a();
    }

    public static com.akita.compose.foundation.p w() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18242a().getF18246a().getF18291c();
    }

    public static com.akita.compose.foundation.p x() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().f().getF18332b().getF18357a().getF18365b();
    }

    public static com.akita.compose.foundation.p y() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18305j();
    }

    public static com.akita.compose.foundation.p z() {
        return com.akita.compose.theme.re23.b.w().a().getComponents().d().getF18243b().getF18297b().getF18308a();
    }
}
