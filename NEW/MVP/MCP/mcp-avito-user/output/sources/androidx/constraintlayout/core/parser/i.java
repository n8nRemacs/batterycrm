package androidx.constraintlayout.core.parser;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* compiled from: CLToken.java */
/* loaded from: classes.dex */
public class i extends c {

    /* compiled from: CLToken.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43368a;

        static {
            int[] iArr = new int[b.values().length];
            f43368a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43368a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43368a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43368a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CLToken.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f43369b = {new b(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0), new b("TRUE", 1), new b("FALSE", 2), new b("NULL", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f43369b.clone();
        }
    }
}
