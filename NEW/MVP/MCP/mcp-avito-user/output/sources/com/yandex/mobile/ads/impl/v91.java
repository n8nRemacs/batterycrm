package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.media3.common.C23088b;
import com.yandex.mobile.ads.impl.rg;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* loaded from: classes8.dex */
public final class v91 implements rg {

    /* renamed from: f, reason: collision with root package name */
    public static final rg.a<v91> f390830f = new Q0(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f390831a;

    /* renamed from: b, reason: collision with root package name */
    public final String f390832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f390833c;

    /* renamed from: d, reason: collision with root package name */
    private final vw[] f390834d;

    /* renamed from: e, reason: collision with root package name */
    private int f390835e;

    public v91(String str, vw... vwVarArr) {
        db.a(vwVarArr.length > 0);
        this.f390832b = str;
        this.f390834d = vwVarArr;
        this.f390831a = vwVarArr.length;
        int iA2 = qg0.a(vwVarArr[0].f391181l);
        this.f390833c = iA2 == -1 ? qg0.a(vwVarArr[0].f391180k) : iA2;
        a();
    }

    public final vw a(int i12) {
        return this.f390834d[i12];
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v91.class != obj.getClass()) {
            return false;
        }
        v91 v91Var = (v91) obj;
        return this.f390832b.equals(v91Var.f390832b) && Arrays.equals(this.f390834d, v91Var.f390834d);
    }

    public final int hashCode() {
        if (this.f390835e == 0) {
            this.f390835e = v2.a(this.f390832b, 527, 31) + Arrays.hashCode(this.f390834d);
        }
        return this.f390835e;
    }

    public final int a(vw vwVar) {
        int i12 = 0;
        while (true) {
            vw[] vwVarArr = this.f390834d;
            if (i12 >= vwVarArr.length) {
                return -1;
            }
            if (vwVar == vwVarArr[i12]) {
                return i12;
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v91 a(Bundle bundle) {
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.i();
        } else {
            pVarA = sg.a(vw.f391163H, parcelableArrayList);
        }
        return new v91(bundle.getString(Integer.toString(1, 36), ""), (vw[]) pVarA.toArray(new vw[0]));
    }

    private void a() {
        String str = this.f390834d[0].f391172c;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i12 = this.f390834d[0].f391174e | Http2.INITIAL_MAX_FRAME_SIZE;
        int i13 = 1;
        while (true) {
            vw[] vwVarArr = this.f390834d;
            if (i13 >= vwVarArr.length) {
                return;
            }
            String str2 = vwVarArr[i13].f391172c;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                vw[] vwVarArr2 = this.f390834d;
                ka0.a("TrackGroup", "", new IllegalStateException(AK.c.i(i13, ")", C23088b.b("Different languages combined in one TrackGroup: '", vwVarArr2[0].f391172c, "' (track 0) and '", vwVarArr2[i13].f391172c, "' (track "))));
                return;
            } else {
                vw[] vwVarArr3 = this.f390834d;
                if (i12 != (vwVarArr3[i13].f391174e | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    ka0.a("TrackGroup", "", new IllegalStateException(AK.c.i(i13, ")", C23088b.b("Different role flags combined in one TrackGroup: '", Integer.toBinaryString(vwVarArr3[0].f391174e), "' (track 0) and '", Integer.toBinaryString(this.f390834d[i13].f391174e), "' (track "))));
                    return;
                }
                i13++;
            }
        }
    }
}
