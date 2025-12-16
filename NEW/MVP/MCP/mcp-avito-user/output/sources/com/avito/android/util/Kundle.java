package com.avito.android.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Kundle.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/Kundle;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Kundle implements Parcelable {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<Kundle> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bundle f318647b;

    /* compiled from: Kundle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/util/Kundle;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Parcel, Kundle> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f318648l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Kundle invoke(Parcel parcel) {
            return new Kundle(parcel, null);
        }
    }

    /* compiled from: Kundle.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/util/Kundle$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/util/Kundle;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        a aVar = a.f318648l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
        new Kundle(Bundle.EMPTY);
    }

    public Kundle() {
        this.f318647b = new Bundle();
    }

    @Y61.l
    public final Boolean a(@Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return (Boolean) bundle.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Y61.l
    public final Integer b(@Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return (Integer) bundle.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Y61.l
    public final HashMap c(@Y61.k String str) {
        Bundle bundle = this.f318647b.getBundle(str);
        HashMap mapG = bundle != null ? G.g(bundle) : null;
        if (mapG != null) {
            return mapG;
        }
        return null;
    }

    @Y61.l
    public final <T extends Parcelable> T d(@Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    public final <T extends Parcelable> List<T> e(@Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return (List) bundle.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof Kundle)) {
            return false;
        }
        return G.b(this.f318647b, ((Kundle) obj).f318647b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap f(@Y61.k java.lang.String r7) {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f318647b
            boolean r1 = r0.containsKey(r7)
            r2 = 0
            if (r1 == 0) goto L10
            java.lang.Object r7 = r0.get(r7)
            com.avito.android.util.Kundle r7 = (com.avito.android.util.Kundle) r7     // Catch: java.lang.ClassCastException -> L10
            goto L11
        L10:
            r7 = r2
        L11:
            if (r7 != 0) goto L14
            return r2
        L14:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            android.os.Bundle r7 = r7.f318647b
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L4e
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r7.containsKey(r3)
            if (r4 == 0) goto L46
            java.lang.Object r4 = r7.get(r3)
            boolean r5 = r4 instanceof android.os.Parcelable     // Catch: java.lang.ClassCastException -> L46
            if (r5 == 0) goto L46
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch: java.lang.ClassCastException -> L46
            goto L47
        L46:
            r4 = r2
        L47:
            if (r4 != 0) goto L4a
            goto L29
        L4a:
            r0.put(r3, r4)
            goto L29
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.Kundle.f(java.lang.String):java.util.LinkedHashMap");
    }

    @Y61.l
    public final String g(@Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return (String) bundle.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Y61.k
    public final void h(@Y61.l Boolean bool, @Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (bool == null) {
            bundle.remove(str);
        } else {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    @Y61.k
    public final void i(@Y61.l Integer num, @Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (num == null) {
            bundle.remove(str);
        } else {
            bundle.putInt(str, num.intValue());
        }
    }

    @Y61.k
    public final void j(@Y61.l Parcelable parcelable, @Y61.k String str) {
        Bundle bundle = this.f318647b;
        if (parcelable == null) {
            bundle.remove(str);
        } else {
            bundle.putParcelable(str, parcelable);
        }
    }

    @Y61.k
    public final void k(@Y61.k String str, @Y61.l List list) {
        Bundle bundle = this.f318647b;
        if (list == null) {
            bundle.remove(str);
        } else {
            G.e(str, bundle, list);
        }
    }

    @Y61.k
    public final void l(@Y61.k String str, @Y61.l HashMap map) {
        Bundle bundle = this.f318647b;
        if (map == null) {
            bundle.remove(str);
            return;
        }
        Kundle kundle = new Kundle();
        for (Map.Entry entry : map.entrySet()) {
            kundle.j((Parcelable) entry.getValue(), (String) entry.getKey());
        }
        bundle.putParcelable(str, kundle);
    }

    @Y61.k
    public final void m(@Y61.k String str, @Y61.l String str2) {
        Bundle bundle = this.f318647b;
        if (str2 == null) {
            bundle.remove(str);
        } else {
            bundle.putString(str, str2);
        }
    }

    @Y61.k
    public final void n(@Y61.k String str, @Y61.l Map map) {
        Bundle bundle = this.f318647b;
        if (map == null) {
            bundle.remove(str);
        } else {
            G.d(bundle, str, map);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeBundle(this.f318647b);
    }

    public Kundle(@Y61.k Bundle bundle) {
        this.f318647b = new Bundle(bundle);
    }

    public Kundle(Parcel parcel, C42822w c42822w) {
        Bundle bundle = parcel.readBundle(Kundle.class.getClassLoader());
        this.f318647b = bundle == null ? new Bundle(0) : bundle;
    }
}
