package com.huawei.updatesdk.a.a.d.i;

import android.content.Context;
import com.huawei.updatesdk.a.a.d.f;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes7.dex */
public class b extends com.huawei.updatesdk.a.b.c.c.b {
    private String abis_;
    private String deviceFeatures_;
    private int dpi_;
    private String preferLan_;

    /* renamed from: com.huawei.updatesdk.a.a.d.i.b$b, reason: collision with other inner class name */
    public static class C10759b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f363767a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f363768b;

        /* renamed from: c, reason: collision with root package name */
        private Set<String> f363769c;

        /* renamed from: d, reason: collision with root package name */
        private String[] f363770d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f363771e;

        public C10759b(Context context) {
            this.f363767a = context;
        }

        private String b() {
            ArrayList arrayList = new ArrayList(c.c(this.f363767a));
            Set<String> set = this.f363769c;
            if (set != null) {
                for (String str : set) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return this.f363771e ? f.a(c.a(arrayList, this.f363770d), ",") : f.a(arrayList, ",");
        }

        public C10759b a(boolean z12) {
            this.f363768b = z12;
            return this;
        }

        public b a() {
            b bVar = new b();
            bVar.abis_ = f.a(c.h(), ",");
            bVar.dpi_ = Integer.parseInt(c.e(this.f363767a));
            bVar.preferLan_ = b();
            if (this.f363768b) {
                bVar.deviceFeatures_ = c.a(this.f363767a);
            }
            return bVar;
        }
    }

    private b() {
    }
}
