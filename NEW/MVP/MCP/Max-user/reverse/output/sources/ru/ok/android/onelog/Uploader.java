package ru.ok.android.onelog;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.az1;
import defpackage.jt0;
import defpackage.ml;
import defpackage.mri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.commons.app.ApplicationProvider;

/* loaded from: classes2.dex */
final class Uploader {
    private static final String FORM_FACTOR_PHONE = "phone";
    private static final String FORM_FACTOR_TABLET = "tablet";
    private static String applicationString;
    private static String platformString;
    private final String collector;
    private final Provider<File> file;
    private final Lock lock;

    public Uploader(Provider<File> provider, Lock lock, String str) {
        this.file = provider;
        this.lock = lock;
        this.collector = str;
    }

    public static void execute(ml mlVar, OneLogItem oneLogItem) throws IOException, ApiException {
        executeCollector(mlVar, oneLogItem.collector(), Collections.singleton(oneLogItem));
    }

    private static void executeCollector(ml mlVar, String str, Collection<OneLogItem> collection) throws IOException, ApiException {
        executeCollector(mlVar, str, new SimpleOneLogItemsApiValue(collection));
    }

    public static String getApplicationParam() throws PackageManager.NameNotFoundException {
        String str = applicationString;
        if (str != null) {
            return str;
        }
        Application application = ApplicationProvider.a;
        String str2 = mri.a().getPackageName() + ":" + mri.d() + ":" + mri.c();
        applicationString = str2;
        return str2;
    }

    public static String getPlatformParam() {
        String str = platformString;
        if (str != null) {
            return str;
        }
        Application application = ApplicationProvider.a;
        StringBuilder sbN = az1.n("android:", mri.a().getResources().getConfiguration().smallestScreenWidthDp < 600 ? FORM_FACTOR_PHONE : FORM_FACTOR_TABLET, ":");
        sbN.append(Build.VERSION.RELEASE);
        String string = sbN.toString();
        platformString = string;
        return string;
    }

    private static String getSingleCollectorOrNull(Iterable<OneLogItem> iterable) {
        Iterator<OneLogItem> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        String strCollector = it.next().collector();
        while (it.hasNext()) {
            if (!it.next().collector().equals(strCollector)) {
                return null;
            }
        }
        return strCollector;
    }

    public void drop() {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                Files.delete(file);
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        this.lock.unlock();
    }

    public void upload() {
        try {
            ml apiClient = OneLogImpl.getInstance().getApiClient();
            File file = this.file.get();
            try {
                try {
                    this.lock.lock();
                } finally {
                    this.lock.unlock();
                }
            } catch (IOException | ApiException unused) {
            }
            if (!file.exists() || file.length() == 0) {
                return;
            }
            try {
                executeCollector(apiClient, this.collector, new StreamingOneLogItemsApiValue(file));
            } catch (ApiInvocationException e) {
                int i = e.a;
                if (i == 2 || i == 453 || i == 102 || i == 103) {
                    throw e;
                }
            } catch (ApiRequestException e2) {
                e2.getMessage();
            }
            Files.delete(file);
        } catch (Exception unused2) {
        }
    }

    public static void execute(ml mlVar, Collection<OneLogItem> collection) throws IOException, ApiException {
        if (collection.isEmpty()) {
            return;
        }
        String singleCollectorOrNull = getSingleCollectorOrNull(collection);
        if (singleCollectorOrNull != null) {
            executeCollector(mlVar, singleCollectorOrNull, collection);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(collection.size());
        for (OneLogItem oneLogItem : collection) {
            String strCollector = oneLogItem.collector();
            Collection arrayList = (Collection) linkedHashMap.get(strCollector);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strCollector, arrayList);
            }
            arrayList.add(oneLogItem);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            executeCollector(mlVar, (String) entry.getKey(), (Collection<OneLogItem>) entry.getValue());
        }
    }

    private static void executeCollector(ml mlVar, String str, jt0 jt0Var) throws IOException, ApiException {
        mlVar.a(new OneLogApiRequest(str, getApplicationParam(), getPlatformParam(), jt0Var));
    }
}
