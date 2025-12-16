package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.XmlResourceParser;
import android.hardware.camera2.CameraDevice;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes.dex */
public abstract class n2 implements CameraEnumerator, plb {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ n2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static float L(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public boolean A() {
        return this instanceof kc2;
    }

    public abstract void B();

    public void C() {
        eo eoVar = (eo) this.b;
        if (eoVar != null) {
            try {
                ((ho) this.c).u0.unregisterReceiver(eoVar);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract Object D(Context context, XmlResourceParser xmlResourceParser, int i);

    public abstract IntentFilter E();

    public void F(btc btcVar, String str) {
        ((bh8) this.c).debug("Discarding packet " + btcVar + ": " + str);
    }

    public Object G(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) maj.a(xmlResourceParser).get(((bh) this.b).a);
        return num != null ? D(context, xmlResourceParser, num.intValue()) : this.c;
    }

    public abstract int H();

    public ArrayList I() {
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = J().getSupportedFormats(str);
            arrayList.add(isFrontFacing(str) ? new h22(str, supportedFormats) : isBackFacing(str) ? new g22(str, supportedFormats) : new i22(str, supportedFormats));
        }
        return arrayList;
    }

    public abstract CameraEnumerator J();

    public j22 K(int i) {
        ArrayList arrayListI = I();
        int i2 = bj0.$EnumSwitchMapping$0[az1.v(i)];
        Object obj = null;
        if (i2 == 1) {
            Iterator it = arrayListI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((j22) next) instanceof h22) {
                    obj = next;
                    break;
                }
            }
            return (j22) obj;
        }
        if (i2 == 2) {
            Iterator it2 = arrayListI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((j22) next2) instanceof g22) {
                    obj = next2;
                    break;
                }
            }
            return (j22) obj;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it3 = arrayListI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((j22) next3) instanceof i22) {
                obj = next3;
                break;
            }
        }
        return (j22) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public int M() {
        if (this.c.e()) {
            return T().getMeasuredHeight();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public int N() {
        if (this.c.e()) {
            return T().getMeasuredWidth();
        }
        return 0;
    }

    public MenuItem O(MenuItem menuItem) {
        if (!(menuItem instanceof nrf)) {
            return menuItem;
        }
        nrf nrfVar = (nrf) menuItem;
        if (((z0f) this.c) == null) {
            this.c = new z0f(0);
        }
        MenuItem menuItem2 = (MenuItem) ((z0f) this.c).get(nrfVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        dg9 dg9Var = new dg9((Context) this.b, nrfVar);
        ((z0f) this.c).put(nrfVar, dg9Var);
        return dg9Var;
    }

    public short P() {
        return ((xhb) this.c).a;
    }

    public int Q() {
        return ((us) this.b).hashCode();
    }

    public sg8 R() {
        return lcj.B0;
    }

    public j0g S() {
        return j0g.d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public View T() {
        return (View) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public View U() {
        if (this.c.e()) {
            return T();
        }
        return null;
    }

    public abstract void V();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public void W(int i, int i2) {
        ?? r0 = this.c;
        if (r0.e()) {
            cri.c(T(), i, i2, 0, 12);
        }
    }

    public l2 X() {
        long jD0 = d0() - ((Number) ((bwf) this.c).getValue()).longValue();
        int i = s65.d;
        return new l2(jD0, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public void Y(int i, int i2) {
        ?? r0 = this.c;
        if (r0.e()) {
            ((View) r0.getValue()).measure(i, i2);
        }
    }

    public boolean Z() {
        return !(this instanceof g70);
    }

    public void a0(btc btcVar, bj bjVar) {
        ((plb) this.b).h(btcVar, bjVar);
    }

    public abstract void b0();

    public void c0(View view) {
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        try {
            return J().createCapturer(str, cameraEventsHandler, captureFormatHelper, cameraConfigurationProvider);
        } catch (Exception e) {
            y6d y6dVar = (y6d) this.b;
            String str2 = (String) this.c;
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            y6dVar.reportException(str2, message, e);
            return null;
        }
    }

    public abstract long d0();

    public abstract void e0(pk0 pk0Var);

    public abstract void f0();

    public void g0() {
        C();
        IntentFilter intentFilterE = E();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((eo) this.b) == null) {
            this.b = new eo(0, this);
        }
        ((ho) this.c).u0.registerReceiver((eo) this.b, intentFilterE);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        return J().getDeviceNames();
    }

    @Override // org.webrtc.CameraEnumerator
    public List getSupportedFormats(String str) {
        return J().getSupportedFormats(str);
    }

    public abstract void h0();

    public void i(String str, boolean z) {
        ((us) this.b).put(str, Boolean.valueOf(z));
    }

    public abstract void i0();

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        return J().isBackFacing(str);
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        return J().isFrontFacing(str);
    }

    public void j(int i, String str) {
        ((us) this.b).put(str, Integer.valueOf(i));
    }

    public void o(String str, List list) {
        ((us) this.b).put(str, list);
    }

    public void q(String str, long[] jArr) {
        ((us) this.b).put(str, jArr);
    }

    public void t(long j, String str) {
        ((us) this.b).put(str, Long.valueOf(j));
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return zdi.e((us) this.b, R());
            default:
                return super.toString();
        }
    }

    public void v(String str, Map map) {
        ((us) this.b).put(str, map);
    }

    public void x(String str, String str2) {
        ((us) this.b).put(str, str2);
    }

    public void y() {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        fqi.b(viewGroup, T(), new ViewGroup.LayoutParams(-2, -2));
        T().setVisibility(0);
    }

    public boolean z() {
        return this instanceof x5a;
    }

    public n2(y6d y6dVar) {
        this.a = 4;
        this.b = y6dVar;
        this.c = getClass().getSimpleName();
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        try {
            return J().createCapturer(str, cameraEventsHandler, cameraConfigurationProvider);
        } catch (Exception e) {
            y6d y6dVar = (y6d) this.b;
            String str2 = (String) this.c;
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            y6dVar.reportException(str2, message, e);
            return null;
        }
    }

    public n2(em6 em6Var) {
        this.a = 7;
        this.c = ipi.b(3, new m3(em6Var, 5, this));
    }

    public n2(y65 y65Var) {
        this.a = 0;
        this.b = y65Var;
        this.c = new bwf(new m2(0, this));
    }

    public n2(n2 n2Var) {
        this.a = 6;
        this.b = n2Var;
        this.c = new jbe(25);
    }

    public n2(xhb xhbVar) {
        this.a = 11;
        this.b = new us(0);
        this.c = xhbVar;
    }

    public n2(Context context) {
        this.a = 5;
        this.b = context;
    }

    public n2(ysc yscVar, bh8 bh8Var) {
        this.a = 6;
        this.b = yscVar;
        this.c = bh8Var == null ? new jbe(25) : bh8Var;
    }

    public n2(int i) {
        this.a = 9;
        this.c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.c).add(new p45());
        }
    }

    public n2(CameraDevice cameraDevice, a22 a22Var) {
        this.a = 8;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = a22Var;
    }

    public n2(ho hoVar) {
        this.a = 2;
        this.c = hoVar;
    }
}
