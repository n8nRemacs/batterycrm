package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public e f363529b;

    /* renamed from: c, reason: collision with root package name */
    public final String f363530c;

    /* renamed from: d, reason: collision with root package name */
    public final d f363531d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f363532e;

    /* renamed from: f, reason: collision with root package name */
    public final String f363533f;

    /* renamed from: g, reason: collision with root package name */
    public final q01.c f363534g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.huawei.hms.framework.network.grs.g.a$a, reason: collision with other inner class name */
    public static final class EnumC10756a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC10756a f363535b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC10756a f363536c;

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC10756a f363537d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumC10756a[] f363538e;

        static {
            EnumC10756a enumC10756a = new EnumC10756a("GRSPOST", 0);
            f363535b = enumC10756a;
            EnumC10756a enumC10756a2 = new EnumC10756a("GRSGET", 1);
            f363536c = enumC10756a2;
            EnumC10756a enumC10756a3 = new EnumC10756a("GRSDEFAULT", 2);
            f363537d = enumC10756a3;
            f363538e = new EnumC10756a[]{enumC10756a, enumC10756a2, enumC10756a3};
        }

        public EnumC10756a() {
            throw null;
        }

        public static EnumC10756a valueOf(String str) {
            return (EnumC10756a) Enum.valueOf(EnumC10756a.class, str);
        }

        public static EnumC10756a[] values() {
            return (EnumC10756a[]) f363538e.clone();
        }
    }

    public a(String str, int i12, d dVar, Context context, String str2, GrsBaseInfo grsBaseInfo, q01.c cVar) {
        this.f363530c = str;
        this.f363531d = dVar;
        this.f363532e = context;
        this.f363533f = str2;
        this.f363534g = cVar;
    }

    public final EnumC10756a a() {
        String str = this.f363530c;
        boolean zIsEmpty = str.isEmpty();
        EnumC10756a enumC10756a = EnumC10756a.f363537d;
        if (zIsEmpty) {
            return enumC10756a;
        }
        String path = Uri.parse(str).getPath();
        return path.contains("1.0") ? EnumC10756a.f363536c : path.contains("2.0") ? EnumC10756a.f363535b : enumC10756a;
    }
}
