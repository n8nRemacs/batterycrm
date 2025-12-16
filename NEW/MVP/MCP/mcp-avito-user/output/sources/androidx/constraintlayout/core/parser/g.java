package androidx.constraintlayout.core.parser;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* compiled from: CLParser.java */
/* loaded from: classes.dex */
public class g {

    /* compiled from: CLParser.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43366a;

        static {
            int[] iArr = new int[b.values().length];
            f43366a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43366a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43366a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43366a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43366a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43366a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CLParser.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f43367b = {new b(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0), new b("OBJECT", 1), new b("ARRAY", 2), new b("NUMBER", 3), new b("STRING", 4), new b("KEY", 5), new b("TOKEN", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f43367b.clone();
        }
    }
}
