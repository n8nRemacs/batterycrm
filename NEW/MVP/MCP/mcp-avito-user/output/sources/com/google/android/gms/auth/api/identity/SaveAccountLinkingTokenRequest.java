package com.google.android.gms.auth.api.identity;

import OX0.o;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new o();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final PendingIntent f348674b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348675c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348676d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348677e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348678f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348679g;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PendingIntent f348680a;

        /* renamed from: b, reason: collision with root package name */
        public String f348681b;

        /* renamed from: c, reason: collision with root package name */
        public String f348682c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f348683d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public String f348684e;

        /* renamed from: f, reason: collision with root package name */
        public int f348685f;
    }

    @SafeParcelable.b
    public SaveAccountLinkingTokenRequest(@SafeParcelable.e PendingIntent pendingIntent, @SafeParcelable.e String str, @SafeParcelable.e String str2, @SafeParcelable.e ArrayList arrayList, @SafeParcelable.e @P String str3, @SafeParcelable.e int i12) {
        this.f348674b = pendingIntent;
        this.f348675c = str;
        this.f348676d = str2;
        this.f348677e = arrayList;
        this.f348678f = str3;
        this.f348679g = i12;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f348677e;
        return arrayList.size() == saveAccountLinkingTokenRequest.f348677e.size() && arrayList.containsAll(saveAccountLinkingTokenRequest.f348677e) && C36727t.a(this.f348674b, saveAccountLinkingTokenRequest.f348674b) && C36727t.a(this.f348675c, saveAccountLinkingTokenRequest.f348675c) && C36727t.a(this.f348676d, saveAccountLinkingTokenRequest.f348676d) && C36727t.a(this.f348678f, saveAccountLinkingTokenRequest.f348678f) && this.f348679g == saveAccountLinkingTokenRequest.f348679g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348674b, this.f348675c, this.f348676d, this.f348677e, this.f348678f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348674b, i12, false);
        TX0.a.j(parcel, 2, this.f348675c, false);
        TX0.a.j(parcel, 3, this.f348676d, false);
        TX0.a.l(this.f348677e, parcel, 4);
        TX0.a.j(parcel, 5, this.f348678f, false);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f348679g);
        TX0.a.p(parcel, iO2);
    }
}
