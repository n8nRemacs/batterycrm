package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import one.video.gl.EGL14Utils$EGL14UtilsException;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public abstract class gke {
    public static bke a(bke bkeVar) {
        nn8 nn8Var = bkeVar.a;
        nn8Var.b();
        return nn8Var.s0 > 0 ? bkeVar : bke.b;
    }

    public static void b(String str, int... iArr) {
        String strH;
        int iEglGetError = EGL14.eglGetError();
        Integer numValueOf = Integer.valueOf(iEglGetError);
        if (iEglGetError == 12288) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (iIntValue == 12291) {
                strH = "EGL_BAD_ALLOC";
            } else if (iIntValue == 12293) {
                strH = "EGL_BAD_CONFIG";
            } else if (iIntValue != 12297) {
                switch (iIntValue) {
                    case 12299:
                        strH = "EGL_BAD_NATIVE_WINDOW";
                        break;
                    case 12300:
                        strH = "EGL_BAD_PARAMETER";
                        break;
                    case 12301:
                        strH = "EGL_BAD_SURFACE";
                        break;
                    default:
                        strH = wy1.h("0x", Integer.toHexString(iIntValue));
                        break;
                }
            } else {
                strH = "EGL_BAD_MATCH";
            }
            String str2 = str + ": " + strH;
            Log.e("EGL14Utils", str2);
            if (ys.g(iIntValue, iArr)) {
                return;
            }
            new EGL14Utils$EGL14UtilsException(str2);
        }
    }

    public static EGLConfig c(EGLDisplay eGLDisplay, int i) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, i, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("Unable to find EGL config");
    }

    public static LinkedHashSet d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(to8.i(objArr.length));
        ys.B(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e(Set set, Set set2) {
        Collection collectionD0 = set2;
        if (set2 == null) {
            collectionD0 = ue3.d0(set2);
        }
        if (collectionD0.isEmpty()) {
            return ue3.h0(set);
        }
        if (!(collectionD0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionD0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!collectionD0.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet f(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(to8.i(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet g(Set set, Collection collection) {
        Integer numValueOf = collection != null ? Integer.valueOf(collection.size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(to8.i(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        af3.v(linkedHashSet, collection);
        return linkedHashSet;
    }

    public static Set h(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return rd5.a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(to8.i(objArr.length));
        ys.B(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
