package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @j.N
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new B();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354167b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354168c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354169d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354170e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Bundle f354171f;

    @VisibleForTesting
    public ActivityRecognitionResult(@j.N DetectedActivity detectedActivity, long j12, long j13) {
        this(Collections.singletonList(detectedActivity), j12, j13, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.location.ActivityRecognitionResult extractResult(@j.N android.content.Intent r3) {
        /*
            boolean r0 = hasResult(r3)
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L2b
        L9:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L10
            goto L7
        L10:
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L25
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = com.google.android.gms.location.ActivityRecognitionResult.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = TX0.b.a(r0, r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L2b
        L25:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L7
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
        L2b:
            if (r0 == 0) goto L2e
            return r0
        L2e:
            java.util.List r3 = zza(r3)
            if (r3 == 0) goto L48
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3b
            goto L48
        L3b:
            int r0 = r3.size()
            int r0 = r0 + (-1)
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.extractResult(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public static boolean h(@j.P Bundle bundle, @j.P Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!h(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i12 = 0; i12 < length; i12++) {
                            if (C36727t.a(Array.get(obj, i12), Array.get(obj2, i12))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasResult(@j.P Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    @j.P
    public static List zza(@j.N Intent intent) {
        ArrayList arrayList = null;
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            Parcelable.Creator<ActivityRecognitionResult> creator = CREATOR;
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
            if (arrayList2 != null) {
                arrayList = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(TX0.b.a((byte[]) arrayList2.get(i12), creator));
                }
            }
        }
        return arrayList;
    }

    @InterfaceC36733z
    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f354168c == activityRecognitionResult.f354168c && this.f354169d == activityRecognitionResult.f354169d && this.f354170e == activityRecognitionResult.f354170e && C36727t.a(this.f354167b, activityRecognitionResult.f354167b) && h(this.f354171f, activityRecognitionResult.f354171f)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i12) {
        for (DetectedActivity detectedActivity : this.f354167b) {
            if (detectedActivity.getType() == i12) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.f354169d;
    }

    @j.N
    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.f354167b.get(0);
    }

    @j.N
    public List<DetectedActivity> getProbableActivities() {
        return this.f354167b;
    }

    public long getTime() {
        return this.f354168c;
    }

    @InterfaceC36733z
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f354168c), Long.valueOf(this.f354169d), Integer.valueOf(this.f354170e), this.f354167b, this.f354171f});
    }

    @j.N
    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + String.valueOf(this.f354167b) + ", timeMillis=" + this.f354168c + ", elapsedRealtimeMillis=" + this.f354169d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f354167b, false);
        TX0.a.q(parcel, 2, 8);
        parcel.writeLong(this.f354168c);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f354169d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f354170e);
        TX0.a.a(parcel, 5, this.f354171f, false);
        TX0.a.p(parcel, iO2);
    }

    public ActivityRecognitionResult(@j.N List<DetectedActivity> list, long j12, long j13) {
        this(list, j12, j13, 0, null);
    }

    @SafeParcelable.b
    @InterfaceC36733z
    public ActivityRecognitionResult(@SafeParcelable.e @j.N List list, @SafeParcelable.e long j12, @SafeParcelable.e long j13, @SafeParcelable.e int i12, @SafeParcelable.e @j.P Bundle bundle) {
        C36729v.a("Must have at least 1 detected activity", list != null && list.size() > 0);
        C36729v.a("Must set times", j12 > 0 && j13 > 0);
        this.f354167b = list;
        this.f354168c = j12;
        this.f354169d = j13;
        this.f354170e = i12;
        this.f354171f = bundle;
    }
}
