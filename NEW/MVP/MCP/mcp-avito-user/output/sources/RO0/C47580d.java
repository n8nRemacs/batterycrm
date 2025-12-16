package rO0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientAddState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LrO0/d;", "", "a", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rO0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C47580d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f429801g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f429802a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429803b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f429804c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f429805d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f429806e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f429807f;

    /* compiled from: ClientAddState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrO0/d$a;", "", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47580d(@k String str, @k String str2, @k String str3, @k String str4, boolean z12, boolean z13) {
        this.f429802a = str;
        this.f429803b = str2;
        this.f429804c = str3;
        this.f429805d = str4;
        this.f429806e = z12;
        this.f429807f = z13;
    }

    public static C47580d a(C47580d c47580d, String str, String str2, String str3, String str4, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = c47580d.f429802a;
        }
        String str5 = str;
        if ((i12 & 2) != 0) {
            str2 = c47580d.f429803b;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = c47580d.f429804c;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = c47580d.f429805d;
        }
        String str8 = str4;
        boolean z13 = c47580d.f429806e;
        if ((i12 & 32) != 0) {
            z12 = c47580d.f429807f;
        }
        c47580d.getClass();
        return new C47580d(str5, str6, str7, str8, z13, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47580d)) {
            return false;
        }
        C47580d c47580d = (C47580d) obj;
        return L.f(this.f429802a, c47580d.f429802a) && L.f(this.f429803b, c47580d.f429803b) && L.f(this.f429804c, c47580d.f429804c) && L.f(this.f429805d, c47580d.f429805d) && this.f429806e == c47580d.f429806e && this.f429807f == c47580d.f429807f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f429807f) + r.i(H.d(H.d(H.d(this.f429802a.hashCode() * 31, 31, this.f429803b), 31, this.f429804c), 31, this.f429805d), 31, this.f429806e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientAddState(firstName=");
        sb2.append(this.f429802a);
        sb2.append(", lastName=");
        sb2.append(this.f429803b);
        sb2.append(", phone=");
        sb2.append(this.f429804c);
        sb2.append(", email=");
        sb2.append(this.f429805d);
        sb2.append(", isRoot=");
        sb2.append(this.f429806e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f429807f, ')');
    }
}
