package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.webrtc.HardwareVideoEncoderFactory;

/* loaded from: classes.dex */
public final class f54 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public f54(fo4 fo4Var) {
        this.a = 3;
        this.e = (wd8) fo4Var.o;
        y6d y6dVar = (y6d) fo4Var.c;
        this.d = y6dVar;
        this.c = (hqa) fo4Var.b;
        y6dVar.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? ".concat(!w0a.a ? "yes" : "no"));
        y6dVar.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + fo4Var.a);
        this.b = fo4Var.a;
        this.i = (Context) fo4Var.X;
        this.f = new lt2(y6dVar);
        this.g = new i52(y6dVar);
        this.h = new rl(7);
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll((List) fo4Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [org.webrtc.CameraVideoCapturer] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.d12 a(defpackage.b32 r23) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f54.a(b32):d12");
    }

    public void b() {
        TabLayout tabLayout = (TabLayout) this.c;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        if (this.b) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        phd adapter = viewPager2.getAdapter();
        this.f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.b = true;
        my6 my6Var = new my6(tabLayout, 2);
        this.g = my6Var;
        viewPager2.b(my6Var);
        ac4 ac4Var = new ac4(viewPager2, 1);
        this.h = ac4Var;
        tabLayout.a(ac4Var);
        kd5 kd5Var = new kd5(8, this);
        this.i = kd5Var;
        ((phd) this.f).z(kd5Var);
        f();
        tabLayout.o(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    public void c() {
        phd phdVar = (phd) this.f;
        if (phdVar != null) {
            phdVar.B((kd5) this.i);
            this.i = null;
        }
        ((TabLayout) this.c).k((ac4) this.h);
        ((ViewPager2) this.d).g((my6) this.g);
        this.h = null;
        this.g = null;
        this.f = null;
        this.b = false;
    }

    public void d() {
        c54 c54Var = (c54) this.d;
        View view = (View) this.i;
        h54 h54Var = (h54) this.e;
        c54 c54Var2 = (c54) this.c;
        if (c54Var2 != null) {
            c54Var2.changeEnded(h54Var, (i54) this.f);
        }
        if (c54Var != null) {
            i54 i54Var = (i54) this.g;
            h54.c.remove(c54Var.getInstanceId());
            c54Var.changeEnded(h54Var, i54Var);
        }
        ArrayList arrayList = (ArrayList) this.h;
        boolean z = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g54) it.next()).b(c54Var, c54Var2, z);
        }
        if (h54Var.a) {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (!h54Var.d() || c54Var2 == null) {
            return;
        }
        c54Var2.setNeedsAttach(false);
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((shc) this.d).c();
            return null;
        }
    }

    public void f() {
        TabLayout tabLayout = (TabLayout) this.c;
        tabLayout.j();
        phd phdVar = (phd) this.f;
        if (phdVar != null) {
            int iJ = phdVar.j();
            for (int i = 0; i < iJ; i++) {
                iyf iyfVarI = tabLayout.i();
                ((lyf) this.e).h(iyfVarI, i);
                tabLayout.b(iyfVarI, tabLayout.b.size(), false);
            }
            if (iJ > 0) {
                int iMin = Math.min(((ViewPager2) this.d).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.n(tabLayout.h(iMin), true);
                }
            }
        }
    }

    public void g(int i, Serializable serializable) {
        ((Executor) this.c).execute(new mn1(this, i, serializable, 8));
    }

    public void h() {
        int i;
        ijd ijdVar = (ijd) this.d;
        PackageManager packageManager = (PackageManager) this.f;
        ArrayList arrayList = (ArrayList) this.h;
        if (this.b) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((l69.d == null ? false : l69.c().d) && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList2) {
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((hjd) arrayList.get(i3)).s0;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        hjd hjdVar = new hjd((Context) this.c, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        hjdVar.z0 = new xu9(this, hjdVar);
                        hjdVar.m();
                        i = i2 + 1;
                        arrayList.add(i2, hjdVar);
                        ((h69) ijdVar).a(hjdVar);
                    } else if (i3 >= i2) {
                        hjd hjdVar2 = (hjd) arrayList.get(i3);
                        hjdVar2.m();
                        if (hjdVar2.x0 == null) {
                            if (!hjdVar2.v0 || (hjdVar2.o == null && hjdVar2.u0.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                hjdVar2.n();
                                hjdVar2.i();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    hjd hjdVar3 = (hjd) arrayList.get(size2);
                    h69 h69Var = (h69) ijdVar;
                    j69 j69VarD = h69Var.d(hjdVar3);
                    if (j69VarD != null) {
                        hjdVar3.getClass();
                        l69.b();
                        hjdVar3.d = null;
                        hjdVar3.h(null);
                        h69Var.k(j69VarD, null);
                        if (l69.c) {
                            Log.d("MediaRouter", "Provider removed: " + j69VarD);
                        }
                        h69Var.m.b(514, j69VarD);
                        h69Var.i.remove(j69VarD);
                    }
                    arrayList.remove(hjdVar3);
                    hjdVar3.z0 = null;
                    if (hjdVar3.v0) {
                        if (hjd.A0) {
                            Log.d("MediaRouteProviderProxy", hjdVar3 + ": Stopping");
                        }
                        hjdVar3.v0 = false;
                        hjdVar3.o();
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return w0a.c(this);
            default:
                return super.toString();
        }
    }

    public f54(Context context, h69 h69Var) {
        this.a = 2;
        this.h = new ArrayList();
        this.g = new eo(10, this);
        this.i = new r98(17, this);
        this.c = context;
        this.d = h69Var;
        this.e = new Handler();
        this.f = context.getPackageManager();
    }

    public f54(TabLayout tabLayout, ViewPager2 viewPager2, lyf lyfVar) {
        this.a = 4;
        this.c = tabLayout;
        this.d = viewPager2;
        this.e = lyfVar;
    }

    public f54(AssetManager assetManager, Executor executor, shc shcVar, String str, File file) {
        byte[] bArr;
        this.a = 1;
        this.b = false;
        this.c = executor;
        this.d = shcVar;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = tfi.a;
        } else {
            switch (i) {
                case 26:
                    bArr = tfi.d;
                    break;
                case 27:
                    bArr = tfi.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = tfi.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.e = bArr;
    }

    public f54(c54 c54Var, h54 h54Var, i54 i54Var, c54 c54Var2, ArrayList arrayList, View view, i54 i54Var2, boolean z, ViewGroup viewGroup) {
        this.a = 0;
        this.c = c54Var;
        this.e = h54Var;
        this.f = i54Var;
        this.d = c54Var2;
        this.h = arrayList;
        this.i = view;
        this.g = i54Var2;
        this.b = z;
    }
}
