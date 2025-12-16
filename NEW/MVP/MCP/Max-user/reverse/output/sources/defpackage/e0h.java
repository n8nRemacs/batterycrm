package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e0h {
    public final us a;
    public final us b;
    public final us c;

    public e0h(us usVar, us usVar2, us usVar3) {
        this.a = usVar;
        this.b = usVar2;
        this.c = usVar3;
    }

    public abstract f0h a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        us usVar = this.c;
        Class cls2 = (Class) usVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        usVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        us usVar = this.a;
        Method method = (Method) usVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, e0h.class.getClassLoader()).getDeclaredMethod("read", e0h.class);
        usVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        us usVar = this.b;
        Method method = (Method) usVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, e0h.class);
        usVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((f0h) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((f0h) this).e.readParcelable(f0h.class.getClassLoader());
    }

    public final g0h h() {
        String string = ((f0h) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (g0h) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((f0h) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((f0h) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(g0h g0hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (g0hVar == null) {
            ((f0h) this).e.writeString(null);
            return;
        }
        try {
            ((f0h) this).e.writeString(b(g0hVar.getClass()).getName());
            f0h f0hVarA = a();
            try {
                d(g0hVar.getClass()).invoke(null, g0hVar, f0hVarA);
                Parcel parcel = f0hVarA.e;
                int i = f0hVarA.i;
                if (i >= 0) {
                    int i2 = f0hVarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(g0hVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
