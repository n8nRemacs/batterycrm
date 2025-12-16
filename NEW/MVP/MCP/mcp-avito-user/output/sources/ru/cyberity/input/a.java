package ru.cyberity.input;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.hardware.SensorManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import ru.cyberity.input.fingerprintingsignals.t;
import ru.cyberity.input.infoproviders.a0;
import ru.cyberity.input.infoproviders.d0;
import ru.cyberity.input.infoproviders.e;
import ru.cyberity.input.infoproviders.f0;
import ru.cyberity.input.infoproviders.p;
import ru.cyberity.input.infoproviders.s;
import ru.cyberity.input.infoproviders.v;
import ru.cyberity.input.infoproviders.x;
import ru.cyberity.input.infoproviders.y;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: FingerprinterFactory.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u001f"}, d2 = {"Lru/cyberity/fingerprint/a;", "", "Landroid/content/Context;", "context", "Lru/cyberity/fingerprint/Fingerprinter;", "a", "e", "Lru/cyberity/fingerprint/infoproviders/k;", "c", "Lru/cyberity/fingerprint/infoproviders/x;", "i", "Lru/cyberity/fingerprint/infoproviders/a0;", "d", "Lru/cyberity/fingerprint/infoproviders/d0;", "j", "Lru/cyberity/fingerprint/infoproviders/v;", "h", "Lru/cyberity/fingerprint/infoproviders/f0;", "k", "Lru/cyberity/fingerprint/infoproviders/n;", "Lru/cyberity/fingerprint/infoproviders/p;", "Lru/cyberity/fingerprint/infoproviders/h;", "b", "Lru/cyberity/fingerprint/infoproviders/b;", "Lru/cyberity/fingerprint/infoproviders/e;", "Lru/cyberity/fingerprint/infoproviders/s;", "g", "Lru/cyberity/fingerprint/fingerprintingsignals/t;", "f", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f435697a = new a();

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/media/MediaCodecList;", "a", "()Landroid/media/MediaCodecList;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.a$a, reason: collision with other inner class name */
    public static final class C12556a extends N implements Y41.a<MediaCodecList> {

        /* renamed from: a, reason: collision with root package name */
        public static final C12556a f435698a = new C12556a();

        public C12556a() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaCodecList invoke() {
            return new MediaCodecList(1);
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/media/RingtoneManager;", "a", "()Landroid/media/RingtoneManager;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<RingtoneManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f435699a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RingtoneManager invoke() {
            return new RingtoneManager(this.f435699a);
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/AssetManager;", "a", "()Landroid/content/res/AssetManager;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.a$c, reason: from Kotlin metadata */
    public static final class AssetManager extends N implements Y41.a<android.content.res.AssetManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetManager(Context context) {
            super(0);
            this.f435700a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.content.res.AssetManager invoke() {
            return this.f435700a.getAssets();
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "a", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.a$d, reason: from Kotlin metadata */
    public static final class Configuration extends N implements Y41.a<android.content.res.Configuration> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435701a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Configuration(Context context) {
            super(0);
            this.f435701a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.content.res.Configuration invoke() {
            return this.f435701a.getResources().getConfiguration();
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/admin/DevicePolicyManager;", "a", "()Landroid/app/admin/DevicePolicyManager;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.a$e, reason: from Kotlin metadata */
    public static final class DevicePolicyManager extends N implements Y41.a<android.app.admin.DevicePolicyManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DevicePolicyManager(Context context) {
            super(0);
            this.f435702a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.app.admin.DevicePolicyManager invoke() {
            return (android.app.admin.DevicePolicyManager) this.f435702a.getSystemService("device_policy");
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/KeyguardManager;", "a", "()Landroid/app/KeyguardManager;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<KeyguardManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435703a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.f435703a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KeyguardManager invoke() {
            return (KeyguardManager) this.f435703a.getSystemService("keyguard");
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/fingerprint/b;", "a", "()Lru/cyberity/fingerprint/b;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<ru.cyberity.input.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.f435704a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.input.b invoke() {
            return new ru.cyberity.input.b(a.f435697a.f(this.f435704a));
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/ActivityManager;", "a", "()Landroid/app/ActivityManager;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends N implements Y41.a<ActivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.f435705a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityManager invoke() {
            return (ActivityManager) this.f435705a.getSystemService("activity");
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/hardware/input/InputManager;", "a", "()Landroid/hardware/input/InputManager;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.a$i, reason: from Kotlin metadata */
    public static final class InputManager extends N implements Y41.a<android.hardware.input.InputManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputManager(Context context) {
            super(0);
            this.f435706a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.hardware.input.InputManager invoke() {
            return (android.hardware.input.InputManager) this.f435706a.getSystemService("input");
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/ActivityManager;", "a", "()Landroid/app/ActivityManager;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends N implements Y41.a<ActivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(0);
            this.f435707a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityManager invoke() {
            return (ActivityManager) this.f435707a.getSystemService("activity");
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/StatFs;", "a", "()Landroid/os/StatFs;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends N implements Y41.a<StatFs> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f435708a = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatFs invoke() {
            return new StatFs(Environment.getRootDirectory().getAbsolutePath());
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/StatFs;", "a", "()Landroid/os/StatFs;"}, k = 3, mv = {1, 7, 1})
    public static final class l extends N implements Y41.a<StatFs> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435709a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context) {
            super(0);
            this.f435709a = context;
        }

        @Override // Y41.a
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatFs invoke() {
            File externalFilesDir = this.f435709a.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return null;
            }
            if (!externalFilesDir.canRead()) {
                externalFilesDir = null;
            }
            if (externalFilesDir != null) {
                return new StatFs(externalFilesDir.getAbsolutePath());
            }
            return null;
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/hardware/SensorManager;", "a", "()Landroid/hardware/SensorManager;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends N implements Y41.a<SensorManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context) {
            super(0);
            this.f435710a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SensorManager invoke() {
            return (SensorManager) this.f435710a.getSystemService("sensor");
        }
    }

    /* compiled from: FingerprinterFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/ContentResolver;", "a", "()Landroid/content/ContentResolver;"}, k = 3, mv = {1, 7, 1})
    public static final class n extends N implements Y41.a<ContentResolver> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f435711a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context) {
            super(0);
            this.f435711a = context;
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke() {
            return this.f435711a.getContentResolver();
        }
    }

    private a() {
    }

    private final ru.cyberity.input.infoproviders.h b() {
        Object objA = c.a(0L, C12556a.f435698a, 1, null);
        int i12 = Z.f406624c;
        return new ru.cyberity.input.infoproviders.h((MediaCodecList) (objA instanceof Z.b ? null : objA));
    }

    private final ru.cyberity.input.infoproviders.k c() {
        return new ru.cyberity.input.infoproviders.k();
    }

    private final a0 d() {
        return new a0();
    }

    private final Fingerprinter e(Context context) {
        return new Fingerprinter(new g(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t f(Context context) {
        return new t(c(), i(context), j(context), h(context), b(context), a(), g(context), d(), b(), d(context), k(context), c(context));
    }

    private final s g(Context context) {
        Object objA = c.a(0L, new h(context), 1, null);
        int i12 = Z.f406624c;
        return new s((ActivityManager) (objA instanceof Z.b ? null : objA));
    }

    private final v h(Context context) {
        Object objA = c.a(0L, new InputManager(context), 1, null);
        int i12 = Z.f406624c;
        return new v((android.hardware.input.InputManager) (objA instanceof Z.b ? null : objA));
    }

    private final x i(Context context) {
        Object objA = c.a(0L, new j(context), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = null;
        }
        ActivityManager activityManager = (ActivityManager) objA;
        Object objA2 = c.a(0L, k.f435708a, 1, null);
        if (objA2 instanceof Z.b) {
            objA2 = null;
        }
        StatFs statFs = (StatFs) objA2;
        Object objA3 = c.a(0L, new l(context), 1, null);
        return new y(activityManager, statFs, (StatFs) (objA3 instanceof Z.b ? null : objA3));
    }

    private final d0 j(Context context) {
        Object objA = c.a(0L, new m(context), 1, null);
        int i12 = Z.f406624c;
        return new d0((SensorManager) (objA instanceof Z.b ? null : objA));
    }

    private final f0 k(Context context) {
        Object objA = c.a(0L, new n(context), 1, null);
        int i12 = Z.f406624c;
        return new f0((ContentResolver) (objA instanceof Z.b ? null : objA));
    }

    @X41.n
    @Y61.k
    public static final Fingerprinter a(@Y61.k Context context) {
        return f435697a.e(context);
    }

    private final ru.cyberity.input.infoproviders.n c(Context context) {
        Object objA = c.a(0L, new b(context), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = null;
        }
        RingtoneManager ringtoneManager = (RingtoneManager) objA;
        Object objA2 = c.a(0L, new AssetManager(context), 1, null);
        if (objA2 instanceof Z.b) {
            objA2 = null;
        }
        android.content.res.AssetManager assetManager = (android.content.res.AssetManager) objA2;
        Object objA3 = c.a(0L, new Configuration(context), 1, null);
        return new ru.cyberity.input.infoproviders.n(ringtoneManager, assetManager, (android.content.res.Configuration) (objA3 instanceof Z.b ? null : objA3));
    }

    private final p d(Context context) {
        Object objA = c.a(0L, new DevicePolicyManager(context), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = null;
        }
        android.app.admin.DevicePolicyManager devicePolicyManager = (android.app.admin.DevicePolicyManager) objA;
        Object objA2 = c.a(0L, new f(context), 1, null);
        return new p(devicePolicyManager, (KeyguardManager) (objA2 instanceof Z.b ? null : objA2));
    }

    private final e a() {
        return new ru.cyberity.input.infoproviders.f();
    }

    private final ru.cyberity.input.infoproviders.b b(Context context) {
        return new ru.cyberity.input.infoproviders.b(context);
    }
}
