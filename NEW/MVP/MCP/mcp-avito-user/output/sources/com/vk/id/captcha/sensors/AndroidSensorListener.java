package com.vk.id.captcha.sensors;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.vk.id.captcha.sensors.a.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: AndroidSensorListener.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001,B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/vk/id/captcha/sensors/AndroidSensorListener;", "Lcom/vk/id/captcha/sensors/model/SensorData;", "T", "Lcom/vk/id/captcha/sensors/BaseSensorListener;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "Lcom/vk/id/captcha/sensors/HandlerThreadProvider;", "handlerThreadProvider", "", "sensorType", "Lkotlin/Function1;", "", "toSensorData", "<init>", "(Landroid/content/Context;Lcom/vk/id/captcha/sensors/HandlerThreadProvider;ILY41/l;)V", "Landroid/hardware/SensorEvent;", "event", "Lkotlin/G0;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "listener", "setOnSensorChangedListener", "(LY41/l;)V", "Lcom/vk/id/captcha/sensors/model/PeriodMs;", "periodMs", "startListening-6M9zLzk", "(I)V", "startListening", "stopListening", "()V", "Lcom/vk/id/captcha/sensors/HandlerThreadProvider;", "onSensorChangedListener", "LY41/l;", "Landroid/hardware/Sensor;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "I", "Companion", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.c.a, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class AndroidSensorListener<T extends com.vk.id.captcha.sensors.a.a> implements SensorEventListener, BaseSensorListener<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f366787a = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    private final d f366788c;

    /* renamed from: d, reason: collision with root package name */
    private final int f366789d;

    /* renamed from: e, reason: collision with root package name */
    @k
    private final l<float[], T> f366790e;

    /* renamed from: f, reason: collision with root package name */
    @k
    private l<? super T, G0> f366791f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private final SensorManager f366792g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private final Sensor f366793h;

    /* compiled from: AndroidSensorListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/vk/id/captcha/c/a$a;", "", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AndroidSensorListener(@k Context context, @k d dVar, int i12, @k l<? super float[], ? extends T> lVar) {
        this.f366788c = dVar;
        this.f366789d = i12;
        this.f366790e = lVar;
        this.f366791f = AnonymousClass1.f366794a;
        Object systemService = context.getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        this.f366792g = sensorManager;
        this.f366793h = sensorManager != null ? sensorManager.getDefaultSensor(i12) : null;
    }

    @Override // com.vk.id.captcha.sensors.BaseSensorListener
    public final void a(int i12) {
        SensorManager sensorManager;
        Sensor sensor = this.f366793h;
        if (sensor == null || (sensorManager = this.f366792g) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, i12 * 1000, new Handler(this.f366788c.a().getLooper()));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(@Y61.l SensorEvent event) {
        Sensor sensor;
        if (event == null || (sensor = event.sensor) == null || sensor.getType() != this.f366789d) {
            return;
        }
        this.f366791f.invoke(this.f366790e.invoke(event.values));
    }

    @Override // com.vk.id.captcha.sensors.BaseSensorListener
    public final void a() {
        SensorManager sensorManager = this.f366792g;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        b.a().b();
    }

    @Override // com.vk.id.captcha.sensors.BaseSensorListener
    public final void a(@k l<? super T, G0> lVar) {
        this.f366791f = lVar;
    }

    public /* synthetic */ AndroidSensorListener(Context context, d dVar, int i12, l lVar, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? b.a() : dVar, i12, lVar);
    }

    /* compiled from: AndroidSensorListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/vk/id/captcha/c/a/a;", "T", "p0", "Lkotlin/G0;", "a", "(Lcom/vk/id/captcha/c/a/a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.c.a$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements l<T, G0> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f366794a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final /* synthetic */ G0 invoke(Object obj) {
            a((com.vk.id.captcha.sensors.a.a) obj);
            return G0.f406611a;
        }

        public final void a(@k T t12) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(@Y61.l Sensor sensor, int accuracy) {
    }
}
