package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.C20199a;
import androidx.media3.exoplayer.analytics.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes10.dex */
public abstract class VersionedParcel {

    /* renamed from: a, reason: collision with root package name */
    public final C20199a<String, Method> f54952a;

    /* renamed from: b, reason: collision with root package name */
    public final C20199a<String, Method> f54953b;

    /* renamed from: c, reason: collision with root package name */
    public final C20199a<String, Class> f54954c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C20199a<String, Method> c20199a, C20199a<String, Method> c20199a2, C20199a<String, Class> c20199a3) {
        this.f54952a = c20199a;
        this.f54953b = c20199a2;
        this.f54954c = c20199a3;
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class<? extends h> cls) throws ClassNotFoundException {
        String name = cls.getName();
        C20199a<String, Class> c20199a = this.f54954c;
        Class cls2 = c20199a.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(m.l(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        c20199a.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException, SecurityException {
        C20199a<String, Method> c20199a = this.f54952a;
        Method method = c20199a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        c20199a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C20199a<String, Method> c20199a = this.f54953b;
        Method method = c20199a.get(name);
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, VersionedParcel.class);
        c20199a.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return this instanceof g;
    }

    public abstract boolean g();

    public abstract byte[] h();

    public abstract CharSequence i();

    public abstract boolean j(int i12);

    public abstract int k();

    public final int l(int i12, int i13) {
        return !j(i13) ? i12 : k();
    }

    public abstract <T extends Parcelable> T m();

    public abstract String n();

    public final <T extends h> T o() {
        String strN = n();
        if (strN == null) {
            return null;
        }
        try {
            return (T) d(strN).invoke(null, b());
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e14);
        } catch (InvocationTargetException e15) {
            if (e15.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e15.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e15);
        }
    }

    public abstract void p(int i12);

    public abstract void r(boolean z12);

    public abstract void s(byte[] bArr);

    public abstract void t(CharSequence charSequence);

    public abstract void u(int i12);

    public final void v(int i12, int i13) {
        p(i13);
        u(i12);
    }

    public abstract void w(Parcelable parcelable);

    public abstract void x(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(h hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (hVar == null) {
            x(null);
            return;
        }
        try {
            x(c(hVar.getClass()).getName());
            VersionedParcel versionedParcelB = b();
            try {
                e(hVar.getClass()).invoke(null, hVar, versionedParcelB);
                versionedParcelB.a();
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e12);
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e13);
            } catch (NoSuchMethodException e14) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e14);
            } catch (InvocationTargetException e15) {
                if (!(e15.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e15);
                }
                throw ((RuntimeException) e15.getCause());
            }
        } catch (ClassNotFoundException e16) {
            throw new RuntimeException(hVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e16);
        }
    }

    public void q(boolean z12, boolean z13) {
    }
}
