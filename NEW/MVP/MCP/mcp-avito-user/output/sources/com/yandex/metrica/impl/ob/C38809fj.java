package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.fj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38809fj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f380594a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final B0 f380595b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38911jm f380596c;

    @j.k0
    public C38809fj(@j.N Context context, @j.N B0 b02, @j.N C38911jm c38911jm) {
        this.f380594a = context;
        this.f380595b = b02;
        this.f380596c = c38911jm;
    }

    @j.P
    public String a() {
        return L0.a(this.f380595b.a(this.f380594a, "uuid.dat"));
    }

    @j.P
    public String a(@j.P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f380596c.a();
            }
            File fileA = this.f380595b.a(this.f380594a, "uuid.dat");
            if (fileA != null) {
                L0.a(str, "uuid.dat", new FileOutputStream(fileA));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
