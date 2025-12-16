package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43047d;

/* compiled from: URLBuilder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/I0;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class I0 {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final T0 f399861k;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public O0 f399862a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f399863b;

    /* renamed from: c, reason: collision with root package name */
    public int f399864c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f399865d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f399866e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public String f399867f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public String f399868g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public List<String> f399869h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public C41554x0 f399870i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public a1 f399871j;

    /* compiled from: URLBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/I0$a;", "", "<init>", "()V", "Lio/ktor/http/T0;", "originUrl", "Lio/ktor/http/T0;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f399861k = S0.b("http://localhost");
    }

    public I0() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    public final void a() {
        if (this.f399863b.length() <= 0 && !kotlin.jvm.internal.L.f(this.f399862a.f399889a, "file")) {
            T0 t02 = f399861k;
            this.f399863b = t02.f399903b;
            O0 o02 = this.f399862a;
            O0.f399884c.getClass();
            if (kotlin.jvm.internal.L.f(o02, O0.f399885d)) {
                this.f399862a = t02.f399902a;
            }
            if (this.f399864c == 0) {
                this.f399864c = t02.f399904c;
            }
        }
    }

    @Y61.k
    public final T0 b() {
        a();
        O0 o02 = this.f399862a;
        String str = this.f399863b;
        int i12 = this.f399864c;
        List<String> list = this.f399869h;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C41508b.d((String) it.next()));
        }
        InterfaceC41550v0 interfaceC41550v0A = b1.a(this.f399871j.f399923a);
        C41508b.e(0, 0, this.f399868g, 15);
        String str2 = this.f399866e;
        String strC = str2 != null ? C41508b.c(str2, 0, str2.length(), false, C43047d.f410589b) : null;
        String str3 = this.f399867f;
        String strC2 = str3 != null ? C41508b.c(str3, 0, str3.length(), false, C43047d.f410589b) : null;
        boolean z12 = this.f399865d;
        a();
        StringBuilder sb2 = new StringBuilder(256);
        L0.a(this, sb2);
        return new T0(o02, str, i12, arrayList, interfaceC41550v0A, strC, strC2, z12, sb2.toString());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        L0.a(this, sb2);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I0(io.ktor.http.O0 r18, java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, java.util.List r23, io.ktor.http.InterfaceC41550v0 r24, java.lang.String r25, boolean r26, int r27, kotlin.jvm.internal.C42822w r28) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.I0.<init>(io.ktor.http.O0, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, io.ktor.http.v0, java.lang.String, boolean, int, kotlin.jvm.internal.w):void");
    }
}
