package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ui, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39176ui {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final a f381976a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final a f381977b;

    /* renamed from: com.yandex.metrica.impl.ob.ui$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f381978a;

        /* renamed from: b, reason: collision with root package name */
        public final long f381979b;

        public a(int i12, long j12) {
            this.f381978a = i12;
            this.f381979b = j12;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Item{refreshEventCount=");
            sb2.append(this.f381978a);
            sb2.append(", refreshPeriodSeconds=");
            return androidx.appcompat.app.r.u(sb2, this.f381979b, '}');
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ui$b */
    public enum b {
        WIFI,
        CELL
    }

    public C39176ui(@j.P a aVar, @j.P a aVar2) {
        this.f381976a = aVar;
        this.f381977b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.f381976a + ", wifi=" + this.f381977b + '}';
    }
}
