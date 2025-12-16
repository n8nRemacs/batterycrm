package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.MediaCodecInfo;
import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.View;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class i3 implements u3c, dbd {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static ei4 C0(em6 em6Var) {
        hi4 hi4Var = new hi4();
        em6Var.invoke(hi4Var);
        return new ei4(hi4Var.b());
    }

    public static long r0(Typeface typeface) throws NoSuchFieldException, SecurityException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public boolean A0(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        v3g v3gVar = (v3g) this.b;
        if (v3gVar == null) {
            return i0();
        }
        int iM = v3gVar.m(i, charSequence);
        if (iM == 0) {
            return true;
        }
        if (iM != 1) {
            return i0();
        }
        return false;
    }

    public boolean B0() {
        int i;
        v7f v7fVar = (v7f) this.b;
        View view = v7fVar.c.S0;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(ho7.f(visibility, "Unknown visibility "));
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = v7fVar.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        return this.b;
    }

    public void D0() {
        ((em5) this).o1(false);
    }

    public abstract void E0(int i, long j, boolean z);

    public void F0(int i, long j) {
        E0(((em5) this).t(), j, false);
    }

    public void G0(int i, long j) {
        em5 em5Var = (em5) this;
        long jE = em5Var.e() + j;
        long duration = em5Var.getDuration();
        if (duration != -9223372036854775807L) {
            jE = Math.min(jE, duration);
        }
        F0(i, Math.max(jE, 0L));
    }

    public void H0(int i) {
        int iK;
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            iK = -1;
        } else {
            int iT = em5Var.t();
            em5Var.A1();
            int i2 = em5Var.Q0;
            if (i2 == 1) {
                i2 = 0;
            }
            em5Var.A1();
            iK = s9gVarV.k(iT, i2, em5Var.R0);
        }
        if (iK == -1) {
            v0();
        } else if (iK == em5Var.t()) {
            E0(em5Var.t(), -9223372036854775807L, true);
        } else {
            E0(iK, -9223372036854775807L, false);
        }
    }

    public void I0(String str, Bundle bundle) {
        if (str != null && ((str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) && (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)))) {
            throw new IllegalArgumentException(ho7.i("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        ((MediaController.TransportControls) this.b).sendCustomAction(str, bundle);
    }

    public void J0(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        Bundle bundle = new Bundle();
        bundle.putFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, f);
        I0(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED, bundle);
    }

    public abstract void K0(ArrayList arrayList);

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        Object obj3 = this.b;
        this.b = obj2;
        a0(obj3, obj2);
    }

    @Override // defpackage.u3c
    public boolean S(int i) {
        em5 em5Var = (em5) this;
        em5Var.A1();
        return em5Var.Y0.a(i);
    }

    public abstract void a0(Object obj, Object obj2);

    public void b0() {
        ((em5) this).j1(0, Integer.MAX_VALUE);
    }

    public void c0(i3 i3Var) {
        ((BitSet) this.b).or((BitSet) i3Var.b);
    }

    public abstract Object d0(Object obj);

    @Override // defpackage.u3c
    public abstract long e();

    public abstract Typeface e0(Context context, je6 je6Var, Resources resources, int i);

    @Override // defpackage.u3c
    public abstract boolean f();

    public abstract Typeface f0(Context context, me6[] me6VarArr, int i);

    @Override // defpackage.u3c
    public abstract long g();

    public Typeface g0(Context context, Resources resources, int i, String str, int i2) {
        File fileE = hni.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (hni.b(fileE, resources, i)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @Override // defpackage.u3c
    public abstract int getRepeatMode();

    @Override // defpackage.u3c
    public void h(k09 k09Var, long j) {
        ((em5) this).A(0, j, wg7.m(k09Var));
    }

    public Typeface h0(Context context, Typeface typeface, int i) {
        Typeface typefaceA;
        try {
            typefaceA = a2i.a(this, context, typeface, i);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    public abstract boolean i0();

    @Override // defpackage.u3c
    public abstract int j();

    public me6 j0(me6[] me6VarArr, int i) {
        int i2 = (i & 1) == 0 ? HttpStatus.SC_BAD_REQUEST : 700;
        boolean z = (i & 2) != 0;
        me6 me6Var = null;
        int i3 = Integer.MAX_VALUE;
        for (me6 me6Var2 : me6VarArr) {
            int iAbs = (Math.abs(me6Var2.c - i2) * 2) + (me6Var2.d == z ? 0 : 1);
            if (me6Var == null || i3 > iAbs) {
                me6Var = me6Var2;
                i3 = iAbs;
            }
        }
        return me6Var;
    }

    @Override // defpackage.u3c
    public void k() {
        E0(((em5) this).t(), -9223372036854775807L, false);
    }

    public abstract void k0(Rect rect, Rect rect2);

    @Override // defpackage.u3c
    public abstract int l();

    public Object l0(Object obj) {
        synchronized (((HashMap) this.b)) {
            try {
                if (((HashMap) this.b).containsKey(obj)) {
                    return ((HashMap) this.b).get(obj);
                }
                Object objD0 = d0(obj);
                ((HashMap) this.b).put(obj, objD0);
                return objD0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long m0() {
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            return -9223372036854775807L;
        }
        return zxg.m0(s9gVarV.m(em5Var.t(), (q9g) this.b, 0L).m);
    }

    public long n0() {
        q9g q9gVar = (q9g) this.b;
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p() || s9gVarV.m(em5Var.t(), q9gVar, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (zxg.E(q9gVar.g) - q9gVar.f) - em5Var.p();
    }

    public abstract r9g o0();

    @Override // defpackage.u3c
    public abstract long p();

    public ii4 p0() {
        return (ii4) ((k18) this.b).getValue();
    }

    @Override // defpackage.u3c
    public void play() {
        ((em5) this).o1(true);
    }

    public abstract void q0();

    @Override // defpackage.u3c
    public abstract int s();

    public void s0(ei4 ei4Var) {
        p0().b(ei4Var.b, null);
    }

    @Override // defpackage.u3c
    public abstract int t();

    public boolean t0() {
        int iE;
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            iE = -1;
        } else {
            int iT = em5Var.t();
            em5Var.A1();
            int i = em5Var.Q0;
            if (i == 1) {
                i = 0;
            }
            em5Var.A1();
            iE = s9gVarV.e(iT, i, em5Var.R0);
        }
        return iE != -1;
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public boolean u0() {
        int iK;
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            iK = -1;
        } else {
            int iT = em5Var.t();
            em5Var.A1();
            int i = em5Var.Q0;
            if (i == 1) {
                i = 0;
            }
            em5Var.A1();
            iK = s9gVarV.k(iT, i, em5Var.R0);
        }
        return iK != -1;
    }

    public void v0() {
        ((em5) this).A1();
    }

    public boolean w0() {
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        return !s9gVarV.p() && s9gVarV.m(em5Var.t(), (q9g) this.b, 0L).i;
    }

    @Override // defpackage.u3c
    public void x(k09 k09Var) {
        ((em5) this).C(wg7.m(k09Var));
    }

    public boolean x0() {
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        return !s9gVarV.p() && s9gVarV.m(em5Var.t(), (q9g) this.b, 0L).a();
    }

    public boolean y0() {
        em5 em5Var = (em5) this;
        s9g s9gVarV = em5Var.v();
        return !s9gVarV.p() && s9gVarV.m(em5Var.t(), (q9g) this.b, 0L).h;
    }

    public boolean z0() {
        em5 em5Var = (em5) this;
        return em5Var.getPlaybackState() == 3 && em5Var.i() && em5Var.u() == 0;
    }

    public i3(k18 k18Var) {
        this.a = 5;
        this.b = new bwf(new nz(k18Var, 12));
    }

    public i3(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new q9g();
                break;
            case 8:
                this.b = new HashMap();
                break;
            case 9:
                this.b = new BitSet(20);
                break;
            case 11:
                this.b = ji4.a.getAccessor().d(116);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = new p9g();
                break;
        }
    }

    public i3(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        this.a = 7;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(wy1.h("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
