package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class V0 implements Parcelable {
    public static final Parcelable.Creator<V0> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private ResultReceiver f379750a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private List<String> f379751b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private Map<String, String> f379752c;

    public class a implements Y41.a<I> {
        public a(V0 v02) {
        }

        @Override // Y41.a
        public I invoke() {
            return F0.g().d();
        }
    }

    public class b implements Parcelable.Creator<V0> {
        @Override // android.os.Parcelable.Creator
        public V0 createFromParcel(Parcel parcel) {
            return new V0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public V0[] newArray(int i12) {
            return new V0[i12];
        }
    }

    public V0(@j.P List<String> list, @j.P Map<String, String> map, @j.P ResultReceiver resultReceiver) {
        this.f379751b = list;
        this.f379750a = resultReceiver;
        this.f379752c = map == null ? new HashMap() : new HashMap(map);
    }

    public boolean a(@j.N C39057pi c39057pi) {
        return C39007ni.a(c39057pi, this.f379751b, this.f379752c, new a(this));
    }

    @j.P
    public List<String> b() {
        return this.f379751b;
    }

    @j.P
    public ResultReceiver c() {
        return this.f379750a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f379750a);
        if (this.f379751b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList<>(this.f379751b));
        }
        Map<String, String> map = this.f379752c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", Tl.c(map));
        }
        parcel.writeBundle(bundle);
    }

    @j.N
    public Map<String, String> a() {
        return this.f379752c;
    }

    public V0(Parcel parcel) {
        Bundle bundle = parcel.readBundle(ResultReceiverC38790f0.class.getClassLoader());
        if (bundle != null) {
            this.f379750a = (ResultReceiver) bundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f379751b = bundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f379752c = Tl.a(bundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f379752c = new HashMap();
    }
}
