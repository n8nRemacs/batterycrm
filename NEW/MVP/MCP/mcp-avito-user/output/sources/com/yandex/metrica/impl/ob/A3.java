package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes7.dex */
public class A3 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ContentValues f377755a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private ResultReceiver f377756b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f377754c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<A3> CREATOR = new a();

    public class a implements Parcelable.Creator<A3> {
        @Override // android.os.Parcelable.Creator
        public A3 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC38790f0.class.getClassLoader());
            return new A3((ContentValues) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        @Override // android.os.Parcelable.Creator
        public A3[] newArray(int i12) {
            return new A3[i12];
        }
    }

    public A3(Context context, @j.P ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f377755a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f377754c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f377756b = resultReceiver;
    }

    @j.P
    public static A3 a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (A3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void b(@j.P com.yandex.metrica.j jVar) {
        synchronized (this) {
            try {
                if (A2.a((Object) jVar.f382343b)) {
                    List<String> list = jVar.f382343b;
                    synchronized (this) {
                        this.f377755a.put("PROCESS_CFG_CUSTOM_HOSTS", Tl.c(list));
                    }
                }
                if (A2.a((Object) jVar.f382342a)) {
                    Map<String, String> mapI = Tl.i(jVar.f382342a);
                    synchronized (this) {
                        this.f377755a.put("PROCESS_CFG_CLIDS", Tl.g(mapI));
                    }
                }
                a(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.P
    public ResultReceiver c() {
        return this.f377756b;
    }

    @j.P
    public String d() {
        return this.f377755a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @j.P
    public String e() {
        return this.f377755a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    @j.N
    public String f() {
        return this.f377755a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    @j.N
    public Integer g() {
        return this.f377755a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    @j.N
    public String h() {
        return this.f377755a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public int i() {
        return this.f377755a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    public boolean j() {
        return this.f377755a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f377755a + ", mDataResultReceiver=" + this.f377756b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f377755a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f377756b);
        parcel.writeBundle(bundle);
    }

    private void a(@j.N com.yandex.metrica.j jVar) {
        jVar.getClass();
        if (A2.a((Object) null)) {
            synchronized (this) {
                this.f377755a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", (String) null);
            }
            synchronized (this) {
                this.f377755a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    public synchronized void a(@j.P List<String> list) {
        this.f377755a.put("PROCESS_CFG_CUSTOM_HOSTS", Tl.c(list));
    }

    @j.P
    public Map<String, String> a() {
        return Tl.d(this.f377755a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public A3(A3 a32) {
        synchronized (a32) {
            this.f377755a = new ContentValues(a32.f377755a);
            this.f377756b = a32.f377756b;
        }
    }

    public synchronized void a(@j.P Map<String, String> map) {
        this.f377755a.put("PROCESS_CFG_CLIDS", Tl.g(map));
    }

    public synchronized void a(@j.P String str) {
        this.f377755a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    @j.P
    public List<String> b() {
        String asString = this.f377755a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return Tl.c(asString);
    }

    public synchronized void b(@j.P String str) {
        this.f377755a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public A3(@j.N ContentValues contentValues, @j.P ResultReceiver resultReceiver) {
        this.f377755a = contentValues == null ? new ContentValues() : contentValues;
        this.f377756b = resultReceiver;
    }
}
