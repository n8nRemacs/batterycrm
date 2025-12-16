package C;

import D.f;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.w;
import androidx.camera.core.C20140q0;
import androidx.camera.core.InterfaceC20142t;
import j.N;
import j.P;
import j.S;
import j.X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Camera2CameraCoordinator.java */
@X
/* loaded from: classes.dex */
public class a implements E.a {

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Set<Set<String>> f1849d;

    /* renamed from: e, reason: collision with root package name */
    public int f1850e = 0;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final HashMap f1847b = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    @N
    public final ArrayList f1846a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @N
    public final ArrayList f1848c = new ArrayList();

    public a(@N w wVar) {
        this.f1849d = new HashSet();
        try {
            this.f1849d = wVar.f23241a.e();
        } catch (CameraAccessExceptionCompat unused) {
            C20140q0.b("Camera2CameraCoordinator");
        }
        Iterator<Set<String>> it = this.f1849d.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                HashMap map = this.f1847b;
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList());
                }
                if (!map.containsKey(str2)) {
                    map.put(str2, new ArrayList());
                }
                ((List) map.get(str)).add((String) arrayList.get(1));
                ((List) map.get(str2)).add((String) arrayList.get(0));
            }
        }
    }

    @Override // E.a
    public final int a() {
        return this.f1850e;
    }

    @S
    @P
    public final String b(@N String str) {
        HashMap map = this.f1847b;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = this.f1848c.iterator();
            while (it.hasNext()) {
                if (str2.equals(f.a((InterfaceC20142t) it.next()).f2838a.f23525a)) {
                    return str2;
                }
            }
        }
        return null;
    }
}
