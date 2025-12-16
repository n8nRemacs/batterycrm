package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import j.X;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AppComponentFactory.java */
@X
/* renamed from: androidx.core.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class AppComponentFactoryC22752j extends AppComponentFactory {
    @j.N
    public final Activity instantiateActivity(@j.N ClassLoader classLoader, @j.N String str, @j.P Intent intent) {
        try {
            return (Activity) CoreComponentFactory.a((Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e12) {
            throw new RuntimeException("Couldn't call constructor", e12);
        }
    }

    @j.N
    public final Application instantiateApplication(@j.N ClassLoader classLoader, @j.N String str) {
        try {
            return (Application) CoreComponentFactory.a((Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e12) {
            throw new RuntimeException("Couldn't call constructor", e12);
        }
    }

    @j.N
    public final ContentProvider instantiateProvider(@j.N ClassLoader classLoader, @j.N String str) {
        try {
            return (ContentProvider) CoreComponentFactory.a((ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e12) {
            throw new RuntimeException("Couldn't call constructor", e12);
        }
    }

    @j.N
    public final BroadcastReceiver instantiateReceiver(@j.N ClassLoader classLoader, @j.N String str, @j.P Intent intent) {
        try {
            return (BroadcastReceiver) CoreComponentFactory.a((BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e12) {
            throw new RuntimeException("Couldn't call constructor", e12);
        }
    }

    @j.N
    public final Service instantiateService(@j.N ClassLoader classLoader, @j.N String str, @j.P Intent intent) {
        try {
            return (Service) CoreComponentFactory.a((Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e12) {
            throw new RuntimeException("Couldn't call constructor", e12);
        }
    }
}
