package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c69 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final List c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public c69(ArrayList arrayList, boolean z) {
        this.a = 0;
        this.c = arrayList == null ? Collections.EMPTY_LIST : arrayList;
        this.b = z;
    }

    public static c69 b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new h59(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new c69(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        py1 py1Var = new py1(3);
        wu1 wu1Var = (wu1) py1Var.b;
        this.c.add(wu1Var);
        Log.d("RequestMonitor", "RequestListener " + py1Var + " monitoring " + this);
        wu1Var.b.d(new zcd(this, py1Var, wu1Var, 4), ayi.a());
        return new iz1(Arrays.asList(py1Var, captureCallback));
    }

    public ha8 c() {
        List list = this.c;
        if (list.isEmpty()) {
            return ag7.c;
        }
        s98 s98VarK = wsf.k(new ArrayList(list));
        lz1 lz1Var = new lz1(15);
        return wsf.g(wsf.l(s98VarK, new usd(19, lz1Var), ayi.a()));
    }

    public void d() {
        LinkedList linkedList = new LinkedList(this.c);
        while (!linkedList.isEmpty()) {
            ha8 ha8Var = (ha8) linkedList.poll();
            Objects.requireNonNull(ha8Var);
            ha8Var.cancel(true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        h59 h59Var = (h59) list.get(i);
                        if (h59Var != null && h59Var.d()) {
                            i++;
                        }
                    }
                }
                return az1.k(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public c69(boolean z) {
        this.a = 1;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = z;
    }
}
