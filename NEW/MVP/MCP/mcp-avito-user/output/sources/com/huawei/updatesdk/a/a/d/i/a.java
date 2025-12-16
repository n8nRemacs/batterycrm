package com.huawei.updatesdk.a.a.d.i;

import android.car.Car;
import android.car.CarInfoManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Car f363763a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f363764b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f363765c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f363766d = false;

    /* renamed from: com.huawei.updatesdk.a.a.d.i.a$a, reason: collision with other inner class name */
    public static class ServiceConnectionC10758a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                CarInfoManager carInfoManager = (CarInfoManager) a.f363763a.getCarManager(RequestReviewResultKt.INFO_TYPE);
                String unused = a.f363765c = carInfoManager.getManufacturer();
                String unused2 = a.f363764b = carInfoManager.getModel();
                com.huawei.updatesdk.a.a.a.b("CarInfoUtil", "car getManufacturer = " + a.f363765c + "  getModel = " + a.f363764b);
            } catch (Throwable th2) {
                com.huawei.updatesdk.a.a.a.a("CarInfoUtil", "Car not connected in onServiceConnected" + th2.toString());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.huawei.updatesdk.a.a.a.b("CarInfoUtil", "onServiceDisconnected");
        }
    }

    public static String d() {
        return f363765c;
    }

    public static String e() {
        return f363764b;
    }

    private static void a(Context context) {
        if (context == null || f363766d) {
            return;
        }
        try {
            f363766d = true;
            Car carCreateCar = Car.createCar(context.getApplicationContext(), new ServiceConnectionC10758a());
            f363763a = carCreateCar;
            if (carCreateCar != null) {
                carCreateCar.connect();
            }
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.a("CarInfoUtil", "Car Service Connect Error" + th2.toString());
        }
    }

    public static void b(Context context) {
        a(context);
    }
}
