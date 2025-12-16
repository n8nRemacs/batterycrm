package ru.cyberity.input.infoproviders;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: BatteryInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0017R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/b;", "Lru/cyberity/fingerprint/infoproviders/a;", "", "batteryHealth", "", "a", "b", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b implements ru.cyberity.input.infoproviders.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Context applicationContext;

    /* compiled from: BatteryInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int intExtra;
            Intent intentRegisterReceiver = b.this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return (intentRegisterReceiver == null || (intExtra = intentRegisterReceiver.getIntExtra("health", -1)) == -1) ? "" : b.this.a(intExtra);
        }
    }

    /* compiled from: BatteryInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.infoproviders.b$b, reason: collision with other inner class name */
    public static final class C12559b extends N implements Y41.a<String> {
        public C12559b() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            return String.valueOf(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(b.this.applicationContext), new Object[0])).doubleValue());
        }
    }

    public b(@k Context context) {
        this.applicationContext = context;
    }

    @Override // ru.cyberity.input.infoproviders.a
    @k
    @SuppressLint({"PrivateApi"})
    public String b() {
        Object objA = c.a(0L, new C12559b(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.a
    @k
    public String a() {
        Object objA = c.a(0L, new a(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(int batteryHealth) {
        switch (batteryHealth) {
            case 2:
                return "good";
            case 3:
                return "overheat";
            case 4:
                return "dead";
            case 5:
                return "over voltage";
            case 6:
                return "unspecified failure";
            case 7:
                return "cold";
            default:
                return "unknown";
        }
    }
}
