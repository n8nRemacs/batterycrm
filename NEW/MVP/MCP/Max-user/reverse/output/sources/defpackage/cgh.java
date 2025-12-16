package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class cgh extends egh {
    public static cgh c;
    public static final jmf d = new jmf(2);
    public final Application b;

    public cgh(Application application) {
        this.b = application;
    }

    public static yfh d(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return woi.d(cls);
        }
        try {
            return (yfh) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // defpackage.egh, defpackage.dgh
    public final yfh a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.egh, defpackage.dgh
    public final yfh b(Class cls, d8a d8aVar) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) d8aVar.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (AndroidViewModel.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return woi.d(cls);
    }
}
