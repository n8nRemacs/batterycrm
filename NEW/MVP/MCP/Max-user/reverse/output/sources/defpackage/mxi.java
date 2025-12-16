package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class mxi {
    public static void a(CaptureRequest.Builder builder, fjb fjbVar) {
        ukd ukdVarL = a3b.m(fjbVar).l();
        for (s90 s90Var : ukdVarL.e()) {
            CaptureRequest.Key key = (CaptureRequest.Key) s90Var.c;
            try {
                builder.set(key, ukdVarL.f(s90Var));
            } catch (IllegalArgumentException unused) {
                gri.b("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i, cs0 cs0Var) {
        Map mapUnmodifiableMap;
        if (i == 3 && cs0Var.a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                cs0Var.getClass();
            } else if (cs0Var.b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(h52 h52Var, CameraDevice cameraDevice, HashMap map, boolean z, cs0 cs0Var) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        ArrayList arrayList = h52Var.a;
        fjb fjbVar = h52Var.b;
        int i = h52Var.c;
        TreeMap treeMap = fjbVar.a;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((zr4) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList2.add(surface);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        r02 r02Var = h52Var.h;
        if (i == 5 && r02Var != null && (r02Var.s() instanceof TotalCaptureResult)) {
            gri.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) r02Var.s());
        } else {
            gri.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        b(builderCreateCaptureRequest, i, cs0Var);
        s90 s90Var = h52.k;
        Object objF = ob0.f;
        try {
            objF = fjbVar.f(s90Var);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objF;
        Objects.requireNonNull(range);
        Object objF2 = ob0.f;
        if (!range.equals(objF2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objF2 = fjbVar.f(h52.k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objF2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (h52Var.b() == 1 || h52Var.c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (h52Var.b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (h52Var.c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        s90 s90Var2 = h52.i;
        if (treeMap.containsKey(s90Var2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) fjbVar.f(s90Var2));
        }
        s90 s90Var3 = h52.j;
        if (treeMap.containsKey(s90Var3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) fjbVar.f(s90Var3)).byteValue()));
        }
        a(builderCreateCaptureRequest, fjbVar);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(h52Var.g);
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest d(h52 h52Var, CameraDevice cameraDevice, cs0 cs0Var) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("template type = ");
        int i = h52Var.c;
        sb.append(i);
        gri.a("Camera2CaptureRequestBuilder", sb.toString());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        b(builderCreateCaptureRequest, i, cs0Var);
        a(builderCreateCaptureRequest, h52Var.b);
        return builderCreateCaptureRequest.build();
    }
}
