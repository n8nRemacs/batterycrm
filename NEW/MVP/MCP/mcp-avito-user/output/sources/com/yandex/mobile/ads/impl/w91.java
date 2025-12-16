package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class w91 implements rg {

    /* renamed from: d, reason: collision with root package name */
    public static final w91 f391352d = new w91(new v91[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final rg.a<w91> f391353e = new Q0(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f391354a;

    /* renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.embedded.guava.collect.p<v91> f391355b;

    /* renamed from: c, reason: collision with root package name */
    private int f391356c;

    public w91(v91... v91VarArr) {
        this.f391355b = com.yandex.mobile.ads.embedded.guava.collect.p.b(v91VarArr);
        this.f391354a = v91VarArr.length;
        a();
    }

    public final v91 a(int i12) {
        return this.f391355b.get(i12);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w91.class != obj.getClass()) {
            return false;
        }
        w91 w91Var = (w91) obj;
        return this.f391354a == w91Var.f391354a && this.f391355b.equals(w91Var.f391355b);
    }

    public final int hashCode() {
        if (this.f391356c == 0) {
            this.f391356c = this.f391355b.hashCode();
        }
        return this.f391356c;
    }

    public final int a(v91 v91Var) {
        int iIndexOf = this.f391355b.indexOf(v91Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    private void a() {
        int i12 = 0;
        while (i12 < this.f391355b.size()) {
            int i13 = i12 + 1;
            for (int i14 = i13; i14 < this.f391355b.size(); i14++) {
                if (this.f391355b.get(i12).equals(this.f391355b.get(i14))) {
                    ka0.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i12 = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w91 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            return new w91(new v91[0]);
        }
        return new w91((v91[]) sg.a(v91.f390830f, parcelableArrayList).toArray(new v91[0]));
    }
}
