package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    public static final d f349512f = d.f349518b;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f349513b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349514c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f349515d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f349516e;

    @SafeParcelable.b
    public ApiFeatureRequest(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @N ArrayList arrayList, @SafeParcelable.e boolean z12) {
        C36729v.j(arrayList);
        this.f349513b = arrayList;
        this.f349514c = z12;
        this.f349515d = str;
        this.f349516e = str2;
    }

    public static ApiFeatureRequest h(List list, boolean z12) {
        TreeSet treeSet = new TreeSet(f349512f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((com.google.android.gms.common.api.k) it.next()).a());
        }
        return new ApiFeatureRequest(null, null, new ArrayList(treeSet), z12);
    }

    public final boolean equals(@P Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f349514c == apiFeatureRequest.f349514c && C36727t.a(this.f349513b, apiFeatureRequest.f349513b) && C36727t.a(this.f349515d, apiFeatureRequest.f349515d) && C36727t.a(this.f349516e, apiFeatureRequest.f349516e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f349514c), this.f349513b, this.f349515d, this.f349516e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f349513b, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349514c ? 1 : 0);
        TX0.a.j(parcel, 3, this.f349515d, false);
        TX0.a.j(parcel, 4, this.f349516e, false);
        TX0.a.p(parcel, iO2);
    }
}
