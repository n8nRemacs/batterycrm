package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.r;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: SqlTypesSupport.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f362162a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f362163b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f362164c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f362165d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f362166e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f362167f;

    /* compiled from: SqlTypesSupport.java */
    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    public class C10734a extends DefaultDateTypeAdapter.b<java.sql.Date> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        public final Date b(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    public class b extends DefaultDateTypeAdapter.b<Timestamp> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        public final Date b(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z12;
        try {
            Class.forName("java.sql.Date");
            z12 = true;
        } catch (ClassNotFoundException unused) {
            z12 = false;
        }
        f362162a = z12;
        if (z12) {
            f362163b = new C10734a(java.sql.Date.class);
            f362164c = new b(Timestamp.class);
            f362165d = SqlDateTypeAdapter.f362156b;
            f362166e = SqlTimeTypeAdapter.f362158b;
            f362167f = SqlTimestampTypeAdapter.f362160b;
            return;
        }
        f362163b = null;
        f362164c = null;
        f362165d = null;
        f362166e = null;
        f362167f = null;
    }
}
