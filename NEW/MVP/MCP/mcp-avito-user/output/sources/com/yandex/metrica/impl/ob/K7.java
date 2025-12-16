package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import com.yandex.metrica.CounterConfiguration;
import java.util.List;

/* loaded from: classes7.dex */
public class K7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final CounterConfiguration.b f378689a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final C38891j2 f378690b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final List<ContentValues> f378691a;

        /* renamed from: b, reason: collision with root package name */
        public final int f378692b;

        public a(@j.P List<ContentValues> list, int i12) {
            this.f378691a = list;
            this.f378692b = i12;
        }
    }

    public enum b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");


        /* renamed from: a, reason: collision with root package name */
        private final String f378696a;

        b(String str) {
            this.f378696a = str;
        }
    }

    public K7(@j.N CounterConfiguration.b bVar) {
        this(bVar, F0.g().p());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.yandex.metrica.impl.ob.K7.a a(@j.N android.database.sqlite.SQLiteDatabase r16, @j.N java.lang.String r17, @j.N java.lang.String r18, @j.N com.yandex.metrica.impl.ob.K7.b r19, @j.P java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.K7.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, com.yandex.metrica.impl.ob.K7$b, java.lang.String, boolean):com.yandex.metrica.impl.ob.K7$a");
    }

    @j.k0
    public K7(@j.N CounterConfiguration.b bVar, @j.P C38891j2 c38891j2) {
        this.f378689a = bVar;
        this.f378690b = c38891j2;
    }
}
