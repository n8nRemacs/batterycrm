package io.ktor.http;

import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Url.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/T0;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final O0 f399902a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f399903b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399904c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f399905d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41550v0 f399906e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f399907f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f399908g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f399909h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f399910i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f399911j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f399912k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f399913l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f399914m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f399915n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f399916o;

    /* compiled from: Url.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/T0$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public T0(@Y61.k O0 o02, @Y61.k String str, int i12, @Y61.k ArrayList arrayList, @Y61.k InterfaceC41550v0 interfaceC41550v0, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.k String str4) {
        this.f399902a = o02;
        this.f399903b = str;
        this.f399904c = i12;
        this.f399905d = arrayList;
        this.f399906e = interfaceC41550v0;
        this.f399907f = str2;
        this.f399908g = str3;
        this.f399909h = z12;
        this.f399910i = str4;
        if ((i12 < 0 || i12 >= 65536) && i12 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.f399911j = C42727D.c(new W0(this));
        this.f399912k = C42727D.c(new Y0(this));
        this.f399913l = C42727D.c(new X0(this));
        this.f399914m = C42727D.c(new Z0(this));
        this.f399915n = C42727D.c(new V0(this));
        this.f399916o = C42727D.c(new U0(this));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && T0.class == obj.getClass() && kotlin.jvm.internal.L.f(this.f399910i, ((T0) obj).f399910i);
    }

    public final int hashCode() {
        return this.f399910i.hashCode();
    }

    @Y61.k
    /* renamed from: toString, reason: from getter */
    public final String getF399910i() {
        return this.f399910i;
    }
}
