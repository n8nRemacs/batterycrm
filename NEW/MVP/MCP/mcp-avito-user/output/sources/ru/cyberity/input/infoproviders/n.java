package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: DevicePersonalizationInfoProvider.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/n;", "Lru/cyberity/fingerprint/infoproviders/m;", "", "c", "", "d", "()[Ljava/lang/String;", "b", "e", "a", "Landroid/media/RingtoneManager;", "Landroid/media/RingtoneManager;", "ringtoneManager", "Landroid/content/res/AssetManager;", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/content/res/Configuration;", "Landroid/content/res/Configuration;", "configuration", "<init>", "(Landroid/media/RingtoneManager;Landroid/content/res/AssetManager;Landroid/content/res/Configuration;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final RingtoneManager ringtoneManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final AssetManager assetManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Configuration configuration;

    /* compiled from: DevicePersonalizationInfoProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "a", "()[Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String[]> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            String[] locales;
            AssetManager assetManager = n.this.assetManager;
            if (assetManager != null && (locales = assetManager.getLocales()) != null) {
                ArrayList arrayList = new ArrayList(locales.length);
                for (String str : locales) {
                    arrayList.add(String.valueOf(str));
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (strArr != null) {
                    return strArr;
                }
            }
            return new String[0];
        }
    }

    /* compiled from: DevicePersonalizationInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f436029a = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Locale.getDefault().getLanguage();
        }
    }

    /* compiled from: DevicePersonalizationInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Locale locale;
            Configuration configuration = n.this.configuration;
            String country = (configuration == null || (locale = configuration.locale) == null) ? null : locale.getCountry();
            return country == null ? "" : country;
        }
    }

    /* compiled from: DevicePersonalizationInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Uri ringtoneUri;
            String string;
            RingtoneManager ringtoneManager = n.this.ringtoneManager;
            return (ringtoneManager == null || (ringtoneUri = ringtoneManager.getRingtoneUri(0)) == null || (string = ringtoneUri.toString()) == null) ? "" : string;
        }
    }

    /* compiled from: DevicePersonalizationInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f436032a = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return TimeZone.getDefault().getDisplayName();
        }
    }

    public n(@l RingtoneManager ringtoneManager, @l AssetManager assetManager, @l Configuration configuration) {
        this.ringtoneManager = ringtoneManager;
        this.assetManager = assetManager;
        this.configuration = configuration;
    }

    @Override // ru.cyberity.input.infoproviders.m
    @k
    public String[] d() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new a(), 1, null);
        String[] strArr = new String[0];
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = strArr;
        }
        return (String[]) objA;
    }

    @Override // ru.cyberity.input.infoproviders.m
    @k
    public String e() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, b.f436029a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.m
    @k
    public String a() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, e.f436032a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.m
    @k
    public String b() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new c(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.m
    @k
    public String c() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new d(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }
}
