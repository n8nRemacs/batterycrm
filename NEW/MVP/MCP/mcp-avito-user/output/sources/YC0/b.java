package Yc0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkedGroupState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LYc0/b;", "", "a", "b", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f19592g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f19593h = new b(false, null, null, false, false, null, 63, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19594a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C18253a f19595b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f19596c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19597d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19598e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C1399b f19599f;

    /* compiled from: VkLinkedGroupState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYc0/b$a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VkLinkedGroupState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYc0/b$b;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yc0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1399b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19600a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19601b;

        public C1399b(@k String str, @k String str2) {
            this.f19600a = str;
            this.f19601b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1399b)) {
                return false;
            }
            C1399b c1399b = (C1399b) obj;
            return L.f(this.f19600a, c1399b.f19600a) && L.f(this.f19601b, c1399b.f19601b);
        }

        public final int hashCode() {
            return this.f19601b.hashCode() + (this.f19600a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuccessfulUnlinkingDialog(title=");
            sb2.append(this.f19600a);
            sb2.append(", body=");
            return C22026a.c(sb2, this.f19601b, ')');
        }
    }

    public b() {
        this(false, null, null, false, false, null, 63, null);
    }

    public static b a(b bVar, boolean z12, C18253a c18253a, String str, boolean z13, boolean z14, C1399b c1399b, int i12) {
        if ((i12 & 1) != 0) {
            z12 = bVar.f19594a;
        }
        boolean z15 = z12;
        if ((i12 & 2) != 0) {
            c18253a = bVar.f19595b;
        }
        C18253a c18253a2 = c18253a;
        if ((i12 & 4) != 0) {
            str = bVar.f19596c;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z13 = bVar.f19597d;
        }
        boolean z16 = z13;
        if ((i12 & 16) != 0) {
            z14 = bVar.f19598e;
        }
        boolean z17 = z14;
        if ((i12 & 32) != 0) {
            c1399b = bVar.f19599f;
        }
        bVar.getClass();
        return new b(z15, c18253a2, str2, z16, z17, c1399b);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19594a == bVar.f19594a && L.f(this.f19595b, bVar.f19595b) && L.f(this.f19596c, bVar.f19596c) && this.f19597d == bVar.f19597d && this.f19598e == bVar.f19598e && L.f(this.f19599f, bVar.f19599f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19594a) * 31;
        C18253a c18253a = this.f19595b;
        int iHashCode2 = (iHashCode + (c18253a == null ? 0 : c18253a.hashCode())) * 31;
        String str = this.f19596c;
        int i12 = r.i(r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19597d), 31, this.f19598e);
        C1399b c1399b = this.f19599f;
        return i12 + (c1399b != null ? c1399b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VkLinkedGroupState(isLoading=" + this.f19594a + ", data=" + this.f19595b + ", errorMessage=" + this.f19596c + ", isUnlinking=" + this.f19597d + ", isBottomMenuShown=" + this.f19598e + ", successfulUnlinkingDialog=" + this.f19599f + ')';
    }

    public b(boolean z12, @l C18253a c18253a, @l String str, boolean z13, boolean z14, @l C1399b c1399b) {
        this.f19594a = z12;
        this.f19595b = c18253a;
        this.f19596c = str;
        this.f19597d = z13;
        this.f19598e = z14;
        this.f19599f = c1399b;
    }

    public /* synthetic */ b(boolean z12, C18253a c18253a, String str, boolean z13, boolean z14, C1399b c1399b, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : c18253a, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? false : z13, (i12 & 16) == 0 ? z14 : false, (i12 & 32) != 0 ? null : c1399b);
    }
}
