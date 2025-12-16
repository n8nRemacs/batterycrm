package com.otaliastudios.opengl.core;

import Y61.k;
import Y61.l;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.webrtc.EglBase;
import q11.C47185b;

/* compiled from: EglNativeConfigChooser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/opengl/core/d;", "", "<init>", "()V", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class d {

    /* compiled from: EglNativeConfigChooser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/opengl/core/d$a;", "", "<init>", "()V", "", "EGL_RECORDABLE_ANDROID", "I", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @l
    public static C47185b a(@k q11.d dVar, int i12, boolean z12) {
        int i13 = i12 >= 3 ? q11.e.f428966g | q11.e.f428967h : q11.e.f428966g;
        int[] iArr = {q11.e.f428968i, 8, q11.e.f428969j, 8, q11.e.f428970k, 8, q11.e.f428971l, 8, q11.e.f428972m, q11.e.f428973n | q11.e.f428974o, q11.e.f428975p, i13, z12 ? EglBase.EGL_RECORDABLE_ANDROID : q11.e.f428964e, z12 ? 1 : 0, q11.e.f428964e};
        C47185b[] c47185bArr = new C47185b[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(dVar.f428959a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (zEglChooseConfig) {
            kotlin.ranges.k it = new kotlin.ranges.l(0, 0, 1).iterator();
            while (it.f406910d) {
                int iA2 = it.a();
                EGLConfig eGLConfig = eGLConfigArr[iA2];
                c47185bArr[iA2] = eGLConfig == null ? null : new C47185b(eGLConfig);
            }
        }
        if (zEglChooseConfig) {
            return c47185bArr[0];
        }
        return null;
    }
}
