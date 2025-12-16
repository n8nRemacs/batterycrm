package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.api.C36616a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f349386a;

    /* renamed from: b, reason: collision with root package name */
    public final C36688g f349387b;

    public V() {
        this(C36687f.f349287e);
    }

    @ResultIgnorabilityUnspecified
    public final int a(@j.N Context context, @j.N C36616a.f fVar) {
        C36729v.j(context);
        C36729v.j(fVar);
        int i12 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        SparseIntArray sparseIntArray = this.f349386a;
        int iC2 = sparseIntArray.get(minApkVersion, -1);
        if (iC2 == -1) {
            int i13 = 0;
            while (true) {
                if (i13 >= sparseIntArray.size()) {
                    i12 = -1;
                    break;
                }
                int iKeyAt = sparseIntArray.keyAt(i13);
                if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                    break;
                }
                i13++;
            }
            iC2 = i12 == -1 ? this.f349387b.c(minApkVersion, context) : i12;
            sparseIntArray.put(minApkVersion, iC2);
        }
        return iC2;
    }

    public V(@j.N C36688g c36688g) {
        this.f349386a = new SparseIntArray();
        C36729v.j(c36688g);
        this.f349387b = c36688g;
    }
}
