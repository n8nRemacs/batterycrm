package com.my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class g1 {

    /* renamed from: b, reason: collision with root package name */
    final C37848w f365637b;

    /* renamed from: c, reason: collision with root package name */
    final AntiFraudConfig f365638c;

    /* renamed from: d, reason: collision with root package name */
    final Context f365639d;

    /* renamed from: e, reason: collision with root package name */
    a f365640e;

    /* renamed from: f, reason: collision with root package name */
    Runnable f365641f;

    /* renamed from: g, reason: collision with root package name */
    Runnable f365642g;

    /* renamed from: a, reason: collision with root package name */
    final AtomicInteger f365636a = new AtomicInteger();

    /* renamed from: h, reason: collision with root package name */
    long f365643h = -1;

    public static final class a implements SensorEventListener {

        /* renamed from: a, reason: collision with root package name */
        private final C37848w f365644a;

        /* renamed from: b, reason: collision with root package name */
        private final SensorManager f365645b;

        /* renamed from: c, reason: collision with root package name */
        private final AntiFraudConfig f365646c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList<Sensor> f365647d = new ArrayList<>();

        public a(C37848w c37848w, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f365644a = c37848w;
            this.f365645b = sensorManager;
            this.f365646c = antiFraudConfig;
        }

        public static a a(C37848w c37848w, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new a(c37848w, sensorManager, antiFraudConfig);
        }

        public void b() {
            e2.a("SensorEventListenerImpl: stop()");
            Iterator<Sensor> it = this.f365647d.iterator();
            while (it.hasNext()) {
                try {
                    this.f365645b.unregisterListener(this, it.next());
                } catch (Throwable th2) {
                    e2.a("SensorEventListenerImpl: exception at unregister listener: " + th2);
                }
            }
            this.f365647d.clear();
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            StringBuilder sb2;
            float f12;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                C37848w c37848w = this.f365644a;
                float[] fArr = sensorEvent.values;
                c37848w.b(fArr[0], fArr[1], fArr[2]);
                sb2 = new StringBuilder("SensorHandler: magnetometer - ");
                sb2.append(sensorEvent.values[0]);
                sb2.append(", ");
                sb2.append(sensorEvent.values[1]);
                sb2.append(", ");
                f12 = sensorEvent.values[2];
            } else if (type == 8) {
                this.f365644a.c(sensorEvent.values[0]);
                sb2 = new StringBuilder("SensorHandler: proximity - ");
                f12 = sensorEvent.values[0];
            } else if (type == 4) {
                C37848w c37848w2 = this.f365644a;
                float[] fArr2 = sensorEvent.values;
                c37848w2.a(fArr2[0], fArr2[1], fArr2[2]);
                sb2 = new StringBuilder("SensorHandler: gyroscope - ");
                sb2.append(sensorEvent.values[0]);
                sb2.append(", ");
                sb2.append(sensorEvent.values[1]);
                sb2.append(", ");
                f12 = sensorEvent.values[2];
            } else if (type == 5) {
                this.f365644a.a(sensorEvent.values[0]);
                sb2 = new StringBuilder("SensorHandler: light - ");
                f12 = sensorEvent.values[0];
            } else {
                if (type != 6) {
                    return;
                }
                this.f365644a.b(sensorEvent.values[0]);
                sb2 = new StringBuilder("SensorHandler: pressure - ");
                f12 = sensorEvent.values[0];
            }
            sb2.append(f12);
            e2.a(sb2.toString());
        }

        public void a() {
            e2.a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = iArr[i12];
                if ((i13 != 5 || this.f365646c.useLightSensor) && ((i13 != 2 || this.f365646c.useMagneticFieldSensor) && ((i13 != 4 || this.f365646c.useGyroscope) && ((i13 != 6 || this.f365646c.usePressureSensor) && (i13 != 8 || this.f365646c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.f365645b.getDefaultSensor(i13);
                        if (defaultSensor != null) {
                            this.f365645b.registerListener(this, defaultSensor, 1000000);
                            this.f365647d.add(defaultSensor);
                        }
                    } catch (Throwable th2) {
                        e2.a("SensorEventListenerImpl: exception at register listener: " + th2);
                    }
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i12) {
        }
    }

    public g1(C37848w c37848w, AntiFraudConfig antiFraudConfig, Context context) {
        this.f365637b = c37848w;
        this.f365638c = antiFraudConfig;
        this.f365639d = context.getApplicationContext();
    }

    public static g1 a(C37848w c37848w, AntiFraudConfig antiFraudConfig, Context context) {
        return new g1(c37848w, antiFraudConfig, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        C37835i.a(new L(this, 0));
    }

    public void c() {
        Runnable runnable = this.f365642g;
        if (runnable == null) {
            e2.a("SensorHandler: can't start, startRunnable is null");
        } else {
            C37835i.a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (!this.f365636a.compareAndSet(2, 1)) {
            e2.a("SensorHandler: handle isn't running");
        } else {
            this.f365640e.b();
            this.f365637b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j12) {
        if (!this.f365636a.compareAndSet(1, 2)) {
            e2.a("SensorHandler: handler can't start, current state: " + this.f365636a.get());
        } else if (this.f365640e == null) {
            e2.a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (c2.a() - j12 > 259200) {
            Locale locale = Locale.ENGLISH;
            e2.a("SensorHandler: more than 259200 seconds passed since the app was installed");
        } else {
            this.f365640e.a();
            C37835i.f365658a.postDelayed(this.f365641f, 20000L);
        }
    }

    public void a(long j12) {
        if (j12 <= 0) {
            e2.a("SensorHandler: install timestamp is empty, do nothing");
            return;
        }
        if (!this.f365636a.compareAndSet(0, 1)) {
            e2.a("SensorHandler: handler has already been initialized");
            return;
        }
        a aVarA = a.a(this.f365637b, this.f365639d.getApplicationContext(), this.f365638c);
        this.f365640e = aVarA;
        if (aVarA == null) {
            e2.a("SensorHandler: sensor event listener is null");
            return;
        }
        this.f365641f = new L(this, 1);
        this.f365642g = new androidx.media3.exoplayer.audio.f(2, j12, this);
        this.f365643h = j12;
        e2.a("SensorHandler: initialized");
        this.f365642g.run();
    }
}
