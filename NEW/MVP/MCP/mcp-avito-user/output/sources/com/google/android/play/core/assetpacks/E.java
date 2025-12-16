package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.internal.C37139i;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class E implements a2 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358106g = new com.google.android.play.core.assetpacks.internal.F("AssetPackServiceImpl");

    /* renamed from: h, reason: collision with root package name */
    public static final Intent f358107h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final String f358108a;

    /* renamed from: b, reason: collision with root package name */
    public final C37196z0 f358109b;

    /* renamed from: c, reason: collision with root package name */
    public final C37165o1 f358110c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final com.google.android.play.core.assetpacks.internal.Q f358111d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final com.google.android.play.core.assetpacks.internal.Q f358112e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f358113f = new AtomicBoolean();

    public E(Context context, C37196z0 c37196z0, C37165o1 c37165o1) throws NoSuchAlgorithmException {
        this.f358108a = context.getPackageName();
        this.f358109b = c37196z0;
        this.f358110c = c37165o1;
        boolean zA2 = C37139i.a(context);
        com.google.android.play.core.assetpacks.internal.F f12 = f358106g;
        if (zA2) {
            Context applicationContext = context.getApplicationContext();
            applicationContext = applicationContext == null ? context : applicationContext;
            int i12 = b2.f358305a;
            Intent intent = f358107h;
            this.f358111d = new com.google.android.play.core.assetpacks.internal.Q(applicationContext, f12, "AssetPackService", intent);
            Context applicationContext2 = context.getApplicationContext();
            this.f358112e = new com.google.android.play.core.assetpacks.internal.Q(applicationContext2 != null ? applicationContext2 : context, f12, "AssetPackService-keepAlive", intent);
        }
        f12.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle h() {
        Bundle bundleE = AK.c.e(11004, "playcore_version_code");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundleE.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundleE.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundleE;
    }

    public static Task i() {
        f358106g.b("onError(%d)", -11);
        return C37030m.e(new AssetPackException(-11));
    }

    public static /* bridge */ /* synthetic */ Bundle k(HashMap map) {
        Bundle bundleH = h();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleH.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleH;
    }

    public static /* bridge */ /* synthetic */ ArrayList l(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void a(int i12) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            throw new C37184v0("The Play Store app is not installed or is an unofficial version.", i12);
        }
        f358106g.d("notifySessionFailed", new Object[0]);
        C37028k c37028k = new C37028k();
        q12.c(new C37169q(this, c37028k, i12, c37028k), c37028k);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void b(int i12, String str) {
        j(i12, 10, str);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final Task c(int i12, int i13, String str, String str2) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            return i();
        }
        f358106g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i13), Integer.valueOf(i12));
        C37028k c37028k = new C37028k();
        q12.c(new r(this, c37028k, i12, str, str2, i13, c37028k), c37028k);
        return c37028k.f355672a;
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final Task d(HashMap map) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            return i();
        }
        f358106g.d("syncPacks", new Object[0]);
        C37028k c37028k = new C37028k();
        q12.c(new C37157m(this, c37028k, map, c37028k), c37028k);
        return c37028k.f355672a;
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void e(int i12, int i13, String str, String str2) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            throw new C37184v0("The Play Store app is not installed or is an unofficial version.", i12);
        }
        f358106g.d("notifyChunkTransferred", new Object[0]);
        C37028k c37028k = new C37028k();
        q12.c(new C37163o(this, c37028k, i12, str, str2, i13, c37028k), c37028k);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void f(List list) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            return;
        }
        f358106g.d("cancelDownloads(%s)", list);
        C37028k c37028k = new C37028k();
        q12.c(new C37154l(this, c37028k, list, c37028k), c37028k);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void g(String str) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            return;
        }
        f358106g.d("removePack(%s)", str);
        C37028k c37028k = new C37028k();
        q12.c(new C37128i(this, c37028k, str, c37028k), c37028k);
    }

    public final void j(int i12, int i13, String str) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358111d;
        if (q12 == null) {
            throw new C37184v0("The Play Store app is not installed or is an unofficial version.", i12);
        }
        f358106g.d("notifyModuleCompleted", new Object[0]);
        C37028k c37028k = new C37028k();
        q12.c(new C37166p(this, c37028k, i12, str, c37028k, i13), c37028k);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final synchronized void f() {
        if (this.f358112e == null) {
            f358106g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        com.google.android.play.core.assetpacks.internal.F f12 = f358106g;
        f12.d("keepAlive", new Object[0]);
        if (!this.f358113f.compareAndSet(false, true)) {
            f12.d("Service is already kept alive.", new Object[0]);
        } else {
            C37028k c37028k = new C37028k();
            this.f358112e.c(new C37174s(this, c37028k, c37028k), c37028k);
        }
    }
}
