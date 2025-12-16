package com.huawei.hms.opendevice;

/* compiled from: ReportAaidToken.java */
/* loaded from: classes7.dex */
public class n {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReportAaidToken.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f363595b = {new a("MOBILE", 0), new a("PC", 1), new a("TABLET", 2), new a("TV", 3), new a("SOUNDBOX", 4), new a("GLASS", 5), new a("WATCH", 6), new a("VEHICLE", 7), new a("OFFICE_DEVICE", 8), new a("IOT_DEVICES", 9), new a("HEALTHY", 10), new a("ENTERTAINMENT", 11), new a("TRANSPORT_DEVICES", 12)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f363595b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReportAaidToken.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f363596b = {new b("IOS", 0), new b("ANDROID", 1), new b("HARMONY", 2), new b("WINDOWS", 3), new b("EMBED", 4), new b("OTHERS", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f363596b.clone();
        }
    }
}
