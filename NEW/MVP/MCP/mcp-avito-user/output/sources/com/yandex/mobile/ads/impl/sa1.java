package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes8.dex */
public final class sa1 implements rg {

    /* renamed from: b, reason: collision with root package name */
    public static final sa1 f389846b = new sa1(com.yandex.mobile.ads.embedded.guava.collect.p.i());

    /* renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.embedded.guava.collect.p<a> f389847a;

    public static final class a implements rg {

        /* renamed from: f, reason: collision with root package name */
        public static final rg.a<a> f389848f = new Q0(5);

        /* renamed from: a, reason: collision with root package name */
        public final int f389849a;

        /* renamed from: b, reason: collision with root package name */
        private final v91 f389850b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f389851c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f389852d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean[] f389853e;

        public a(v91 v91Var, boolean z12, int[] iArr, boolean[] zArr) {
            int i12 = v91Var.f390831a;
            this.f389849a = i12;
            boolean z13 = false;
            db.a(i12 == iArr.length && i12 == zArr.length);
            this.f389850b = v91Var;
            if (z12 && i12 > 1) {
                z13 = true;
            }
            this.f389851c = z13;
            this.f389852d = (int[]) iArr.clone();
            this.f389853e = (boolean[]) zArr.clone();
        }

        public final vw a(int i12) {
            return this.f389850b.a(i12);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f389851c == aVar.f389851c && this.f389850b.equals(aVar.f389850b) && Arrays.equals(this.f389852d, aVar.f389852d) && Arrays.equals(this.f389853e, aVar.f389853e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f389853e) + ((Arrays.hashCode(this.f389852d) + (((this.f389850b.hashCode() * 31) + (this.f389851c ? 1 : 0)) * 31)) * 31);
        }

        public final int a() {
            return this.f389850b.f390833c;
        }

        public final boolean b() {
            for (boolean z12 : this.f389853e) {
                if (z12) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            rg.a<v91> aVar = v91.f390830f;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            bundle2.getClass();
            v91 v91Var = (v91) aVar.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[v91Var.f390831a];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[v91Var.f390831a];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new a(v91Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }

        public final boolean b(int i12) {
            return this.f389853e[i12];
        }
    }

    public sa1(com.yandex.mobile.ads.embedded.guava.collect.p pVar) {
        this.f389847a = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) pVar);
    }

    public final com.yandex.mobile.ads.embedded.guava.collect.p<a> a() {
        return this.f389847a;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sa1.class != obj.getClass()) {
            return false;
        }
        return this.f389847a.equals(((sa1) obj).f389847a);
    }

    public final int hashCode() {
        return this.f389847a.hashCode();
    }

    public final boolean a(int i12) {
        for (int i13 = 0; i13 < this.f389847a.size(); i13++) {
            a aVar = this.f389847a.get(i13);
            if (aVar.b() && aVar.a() == i12) {
                return true;
            }
        }
        return false;
    }

    private static sa1 a(Bundle bundle) {
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.i();
        } else {
            pVarA = sg.a(a.f389848f, parcelableArrayList);
        }
        return new sa1(pVarA);
    }
}
