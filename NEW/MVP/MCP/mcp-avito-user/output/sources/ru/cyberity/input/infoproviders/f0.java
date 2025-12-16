package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: SettingsInfoProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/f0;", "Lru/cyberity/fingerprint/infoproviders/e0;", "", "key", "a", "b", "c", "l", "j", "i", "m", "h", "k", "n", "e", "d", "f", "g", "p", "o", "Landroid/content/ContentResolver;", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Landroid/content/ContentResolver;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ContentResolver contentResolver;

    /* compiled from: SettingsInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f436011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f436011b = str;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Settings.Global.getString(f0.this.contentResolver, this.f436011b);
        }
    }

    /* compiled from: SettingsInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f436013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f436013b = str;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Settings.Secure.getString(f0.this.contentResolver, this.f436013b);
        }
    }

    /* compiled from: SettingsInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f436015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f436015b = str;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Settings.System.getString(f0.this.contentResolver, this.f436015b);
        }
    }

    public f0(@l ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String b() {
        return c("date_format");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String c() {
        return a("http_proxy");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String d() {
        return c("font_scale");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String e() {
        return c("end_button_behavior");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String f() {
        return c("screen_off_timeout");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String g() {
        return c("auto_replace");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String h() {
        return b("default_input_method");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String i() {
        return a("window_animation_scale");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String j() {
        return a("transition_animation_scale");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String k() {
        return Build.VERSION.SDK_INT >= 28 ? b("rtt_calling_mode") : "";
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String l() {
        return a("development_settings_enabled");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String m() {
        return a("data_roaming");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String n() {
        return b("touch_exploration_enabled");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String o() {
        return c("time_12_24");
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String p() {
        return c("auto_punctuate");
    }

    private final String b(String key) {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new b(key), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    private final String c(String key) {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new c(key), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.e0
    @k
    public String a() {
        return a("adb_enabled");
    }

    private final String a(String key) {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new a(key), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }
}
