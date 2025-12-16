package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import j.X;

@RestrictTo
@X
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @RestrictTo
    public interface a {
        Object a();
    }

    public static <T> T a(T t12) {
        T t13;
        return (!(t12 instanceof a) || (t13 = (T) ((a) t12).a()) == null) ? t12 : t13;
    }

    @j.N
    public final Activity instantiateActivity(@j.N ClassLoader classLoader, @j.N String str, @j.P Intent intent) {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @j.N
    public final Application instantiateApplication(@j.N ClassLoader classLoader, @j.N String str) {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @j.N
    public final ContentProvider instantiateProvider(@j.N ClassLoader classLoader, @j.N String str) {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @j.N
    public final BroadcastReceiver instantiateReceiver(@j.N ClassLoader classLoader, @j.N String str, @j.P Intent intent) {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @j.N
    public final Service instantiateService(@j.N ClassLoader classLoader, @j.N String str, @j.P Intent intent) {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
