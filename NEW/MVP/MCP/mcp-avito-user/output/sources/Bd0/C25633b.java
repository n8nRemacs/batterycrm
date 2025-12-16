package bd0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkingStartState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbd0/b;", "", "a", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C25633b {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f57292e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C25633b f57293f = new C25633b(false, null, null, false, 15, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57294a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C25632a f57295b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f57296c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57297d;

    /* compiled from: VkLinkingStartState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbd0/b$a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bd0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25633b() {
        this(false, null, null, false, 15, null);
    }

    public static C25633b a(C25633b c25633b, boolean z12, C25632a c25632a, String str, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c25633b.f57294a;
        }
        if ((i12 & 2) != 0) {
            c25632a = c25633b.f57295b;
        }
        if ((i12 & 4) != 0) {
            str = c25633b.f57296c;
        }
        if ((i12 & 8) != 0) {
            z13 = c25633b.f57297d;
        }
        c25633b.getClass();
        return new C25633b(z12, c25632a, str, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25633b)) {
            return false;
        }
        C25633b c25633b = (C25633b) obj;
        return this.f57294a == c25633b.f57294a && L.f(this.f57295b, c25633b.f57295b) && L.f(this.f57296c, c25633b.f57296c) && this.f57297d == c25633b.f57297d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f57294a) * 31;
        C25632a c25632a = this.f57295b;
        int iHashCode2 = (iHashCode + (c25632a == null ? 0 : c25632a.hashCode())) * 31;
        String str = this.f57296c;
        return Boolean.hashCode(this.f57297d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkLinkingStartState(isLoading=");
        sb2.append(this.f57294a);
        sb2.append(", data=");
        sb2.append(this.f57295b);
        sb2.append(", errorMessage=");
        sb2.append(this.f57296c);
        sb2.append(", areTokensSending=");
        return r.x(sb2, this.f57297d, ')');
    }

    public C25633b(boolean z12, @l C25632a c25632a, @l String str, boolean z13) {
        this.f57294a = z12;
        this.f57295b = c25632a;
        this.f57296c = str;
        this.f57297d = z13;
    }

    public /* synthetic */ C25633b(boolean z12, C25632a c25632a, String str, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : c25632a, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? false : z13);
    }
}
