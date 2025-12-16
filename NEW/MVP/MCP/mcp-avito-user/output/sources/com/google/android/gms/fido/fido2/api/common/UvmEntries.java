package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<UvmEntries> CREATOR = new D();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ArrayList f349850b;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
        public a() {
            new ArrayList();
        }
    }

    @SafeParcelable.b
    public UvmEntries(@SafeParcelable.e @j.P ArrayList arrayList) {
        this.f349850b = arrayList;
    }

    public final boolean equals(@j.P Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        ArrayList arrayList2 = this.f349850b;
        return (arrayList2 == null && uvmEntries.f349850b == null) || (arrayList2 != null && (arrayList = uvmEntries.f349850b) != null && arrayList2.containsAll(arrayList) && uvmEntries.f349850b.containsAll(arrayList2));
    }

    @j.N
    public final JSONArray h() throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f349850b;
            if (arrayList != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    UvmEntry uvmEntry = (UvmEntry) arrayList.get(i12);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.f349853d);
                    jSONArray2.put((int) uvmEntry.f349852c);
                    jSONArray2.put((int) uvmEntry.f349853d);
                    jSONArray.put(i12, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e12) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e12);
        }
    }

    public final int hashCode() {
        ArrayList arrayList = this.f349850b;
        return Arrays.hashCode(new Object[]{arrayList == null ? null : new HashSet(arrayList)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f349850b, false);
        TX0.a.p(parcel, iO2);
    }
}
