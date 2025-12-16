package com.vk.id.captcha.sensors;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Handler;
import com.avito.android.search.filter.RunnableC34589p;
import com.vk.id.captcha.b.a;
import com.vk.id.captcha.sensors.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: SensorsDataRepositoryImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001:\u00016B;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001d\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u0014\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u00103\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/vk/id/captcha/sensors/SensorsDataRepositoryImpl;", "Lcom/vk/id/captcha/sensors/SensorsDataRepository;", "Landroid/os/Handler;", "handler", "Lcom/vk/id/captcha/sensors/BaseSensorListener;", "Lcom/vk/id/captcha/sensors/model/SensorData$AccelerometerSensorData;", "accelerometer", "Lcom/vk/id/captcha/sensors/model/SensorData$GyroscopeSensorData;", "gyroscope", "Lcom/vk/id/captcha/sensors/model/SensorData$MotionSensorData;", "motion", "<init>", "(Landroid/os/Handler;Lcom/vk/id/captcha/sensors/BaseSensorListener;Lcom/vk/id/captcha/sensors/BaseSensorListener;Lcom/vk/id/captcha/sensors/BaseSensorListener;)V", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "getCurrentData", "()Ljava/util/List;", "Lkotlin/Function1;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "Lkotlin/G0;", "onDataUpdate", "onNewData", "(LY41/l;)V", "Lcom/vk/id/captcha/sensors/model/Sensors;", "sensors", "Lcom/vk/id/captcha/sensors/model/PeriodMs;", "periodMs", "startListening-vmuVbT4", "(Ljava/util/List;ILY41/l;)V", "startListening", "stopListening", "()V", "Lcom/vk/id/captcha/sensors/BaseSensorListener;", "", "accelerometerChanged", "Z", "value", "currentAccelerometerSensorData", "Lcom/vk/id/captcha/sensors/model/SensorData$AccelerometerSensorData;", "setCurrentAccelerometerSensorData", "(Lcom/vk/id/captcha/sensors/model/SensorData$AccelerometerSensorData;)V", "currentGyroscopeSensorData", "Lcom/vk/id/captcha/sensors/model/SensorData$GyroscopeSensorData;", "setCurrentGyroscopeSensorData", "(Lcom/vk/id/captcha/sensors/model/SensorData$GyroscopeSensorData;)V", "currentMotionSensorData", "Lcom/vk/id/captcha/sensors/model/SensorData$MotionSensorData;", "setCurrentMotionSensorData", "(Lcom/vk/id/captcha/sensors/model/SensorData$MotionSensorData;)V", "currentSensors", "Ljava/util/List;", "gyroscopeChanged", "Landroid/os/Handler;", "motionChanged", "Companion", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.c.f, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class SensorsDataRepositoryImpl implements SensorsDataRepository {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f366820a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    private final Handler f366821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    private final BaseSensorListener<a.C10825a> f366822c;

    /* renamed from: d, reason: collision with root package name */
    @k
    private final BaseSensorListener<a.b> f366823d;

    /* renamed from: e, reason: collision with root package name */
    @k
    private final BaseSensorListener<a.c> f366824e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private a.C10825a f366825f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private a.b f366826g;

    /* renamed from: h, reason: collision with root package name */
    @l
    private a.c f366827h;

    /* renamed from: i, reason: collision with root package name */
    @k
    private List<? extends com.vk.id.captcha.sensors.a.b> f366828i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f366829j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f366830k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f366831l;

    /* compiled from: SensorsDataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/captcha/c/a/a$a;", "p0", "Lkotlin/G0;", "a", "(Lcom/vk/id/captcha/c/a/a$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.c.f$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<a.C10825a, G0> {
        private /* synthetic */ Y41.l<List<? extends com.vk.id.captcha.sensors.a.a>, G0> $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Y41.l<? super List<? extends com.vk.id.captcha.sensors.a.a>, G0> lVar) {
            super(1);
            this.$b = lVar;
        }

        public final void a(@k a.C10825a c10825a) {
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, c10825a);
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, this.$b);
        }

        @Override // Y41.l
        public final /* synthetic */ G0 invoke(a.C10825a c10825a) {
            a(c10825a);
            return G0.f406611a;
        }
    }

    /* compiled from: SensorsDataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/captcha/c/a/a$b;", "p0", "Lkotlin/G0;", "a", "(Lcom/vk/id/captcha/c/a/a$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.c.f$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements Y41.l<a.b, G0> {
        private /* synthetic */ Y41.l<List<? extends com.vk.id.captcha.sensors.a.a>, G0> $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Y41.l<? super List<? extends com.vk.id.captcha.sensors.a.a>, G0> lVar) {
            super(1);
            this.$b = lVar;
        }

        public final void a(@k a.b bVar) {
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, bVar);
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, this.$b);
        }

        @Override // Y41.l
        public final /* synthetic */ G0 invoke(a.b bVar) {
            a(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SensorsDataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/captcha/c/a/a$c;", "p0", "Lkotlin/G0;", "a", "(Lcom/vk/id/captcha/c/a/a$c;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.c.f$3, reason: invalid class name */
    public static final class AnonymousClass3 extends N implements Y41.l<a.c, G0> {
        private /* synthetic */ Y41.l<List<? extends com.vk.id.captcha.sensors.a.a>, G0> $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Y41.l<? super List<? extends com.vk.id.captcha.sensors.a.a>, G0> lVar) {
            super(1);
            this.$b = lVar;
        }

        public final void a(@k a.c cVar) {
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, cVar);
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, this.$b);
        }

        @Override // Y41.l
        public final /* synthetic */ G0 invoke(a.c cVar) {
            a(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SensorsDataRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/f$a;", "", "Landroid/content/Context;", "p0", "Lcom/vk/id/captcha/c/f;", "a", "(Landroid/content/Context;)Lcom/vk/id/captcha/c/f;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.f$a */
    public static final class a {

        /* compiled from: SensorsDataRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10829a extends H implements Y41.l<float[], a.C10825a> {
            public C10829a(a.C10825a.Companion companion) {
                super(1, companion, a.C10825a.Companion.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$a;", 0);
            }

            @Override // Y41.l
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.C10825a invoke(@k float[] fArr) {
                return ((a.C10825a.Companion) this.receiver).a(fArr);
            }
        }

        /* compiled from: SensorsDataRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.f$a$b */
        public /* synthetic */ class b extends H implements Y41.l<float[], a.b> {
            public b(a.b.Companion companion) {
                super(1, companion, a.b.Companion.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$b;", 0);
            }

            @Override // Y41.l
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.b invoke(@k float[] fArr) {
                return ((a.b.Companion) this.receiver).a(fArr);
            }
        }

        /* compiled from: SensorsDataRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.f$a$c */
        public /* synthetic */ class c extends H implements Y41.l<float[], a.c> {
            public c(a.c.Companion companion) {
                super(1, companion, a.c.Companion.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$c;", 0);
            }

            @Override // Y41.l
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.c invoke(@k float[] fArr) {
                return ((a.c.Companion) this.receiver).a(fArr);
            }
        }

        private a() {
        }

        @k
        public static SensorsDataRepositoryImpl a(@k Context p02) {
            AndroidSensorListener androidSensorListener = new AndroidSensorListener(p02, null, 1, new C10829a(a.C10825a.INSTANCE), 2, null);
            AndroidSensorListener androidSensorListener2 = new AndroidSensorListener(p02, null, 4, new b(a.b.INSTANCE), 2, null);
            AndroidSensorListener androidSensorListener3 = new AndroidSensorListener(p02, null, 11, new c(a.c.INSTANCE), 2, null);
            a.Companion c10824a = com.vk.id.captcha.b.a.INSTANCE;
            return new SensorsDataRepositoryImpl(new Handler(a.Companion.a().getB()), androidSensorListener, androidSensorListener2, androidSensorListener3, null);
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: SensorsDataRepositoryImpl.kt */
    /* renamed from: com.vk.id.captcha.c.f$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f366835a;

        static {
            int[] iArr = new int[com.vk.id.captcha.sensors.a.b.a().length];
            try {
                iArr[com.vk.id.captcha.sensors.a.b.f366810a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.vk.id.captcha.sensors.a.b.f366811b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.vk.id.captcha.sensors.a.b.f366812c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f366835a = iArr;
        }
    }

    public /* synthetic */ SensorsDataRepositoryImpl(Handler handler, BaseSensorListener baseSensorListener, BaseSensorListener baseSensorListener2, BaseSensorListener baseSensorListener3, C42822w c42822w) {
        this(handler, baseSensorListener, baseSensorListener2, baseSensorListener3);
    }

    private SensorsDataRepositoryImpl(Handler handler, BaseSensorListener<a.C10825a> baseSensorListener, BaseSensorListener<a.b> baseSensorListener2, BaseSensorListener<a.c> baseSensorListener3) {
        this.f366821b = handler;
        this.f366822c = baseSensorListener;
        this.f366823d = baseSensorListener2;
        this.f366824e = baseSensorListener3;
        this.f366828i = C42784z0.f406748b;
    }

    @Override // com.vk.id.captcha.sensors.SensorsDataRepository
    public final void a(@k List<? extends com.vk.id.captcha.sensors.a.b> list, int i12, @k Y41.l<? super List<? extends com.vk.id.captcha.sensors.a.a>, G0> lVar) {
        this.f366828i = list;
        Iterator<? extends com.vk.id.captcha.sensors.a.b> it = list.iterator();
        while (it.hasNext()) {
            int i13 = b.f366835a[it.next().ordinal()];
            if (i13 == 1) {
                this.f366822c.a(i12);
                this.f366822c.a(new AnonymousClass1(lVar));
            } else if (i13 == 2) {
                this.f366823d.a(i12);
                this.f366823d.a(new AnonymousClass2(lVar));
            } else if (i13 == 3) {
                this.f366824e.a(i12);
                this.f366824e.a(new AnonymousClass3(lVar));
            }
        }
    }

    @Override // com.vk.id.captcha.sensors.SensorsDataRepository
    public final void a() {
        this.f366822c.a();
        this.f366823d.a();
        this.f366824e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.l lVar, List list) {
        lVar.invoke(list);
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, a.C10825a c10825a) {
        sensorsDataRepositoryImpl.f366825f = c10825a;
        sensorsDataRepositoryImpl.f366829j = true;
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, Y41.l lVar) {
        a.C10825a c10825a = sensorsDataRepositoryImpl.f366825f;
        a.b bVar = sensorsDataRepositoryImpl.f366826g;
        a.c cVar = sensorsDataRepositoryImpl.f366827h;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.vk.id.captcha.sensors.a.b> it = sensorsDataRepositoryImpl.f366828i.iterator();
        while (it.hasNext()) {
            int i12 = b.f366835a[it.next().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3 && cVar != null && sensorsDataRepositoryImpl.f366831l) {
                        arrayList.add(cVar);
                    }
                } else if (bVar != null && sensorsDataRepositoryImpl.f366830k) {
                    arrayList.add(bVar);
                }
            } else if (c10825a != null && sensorsDataRepositoryImpl.f366829j) {
                arrayList.add(c10825a);
            }
        }
        if (arrayList.size() == sensorsDataRepositoryImpl.f366828i.size()) {
            sensorsDataRepositoryImpl.f366821b.post(new RunnableC34589p(29, lVar, arrayList));
            Iterator<? extends com.vk.id.captcha.sensors.a.b> it2 = sensorsDataRepositoryImpl.f366828i.iterator();
            while (it2.hasNext()) {
                int i13 = b.f366835a[it2.next().ordinal()];
                if (i13 == 1) {
                    sensorsDataRepositoryImpl.f366829j = false;
                } else if (i13 == 2) {
                    sensorsDataRepositoryImpl.f366830k = false;
                } else if (i13 == 3) {
                    sensorsDataRepositoryImpl.f366831l = false;
                }
            }
        }
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, a.b bVar) {
        sensorsDataRepositoryImpl.f366826g = bVar;
        sensorsDataRepositoryImpl.f366830k = true;
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, a.c cVar) {
        sensorsDataRepositoryImpl.f366827h = cVar;
        sensorsDataRepositoryImpl.f366831l = true;
    }
}
