package Zc0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VkRequestTokenState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZc0/d;", "", "a", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C19541d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f20306c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C19541d f20307d = new C19541d(false, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20308a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20309b;

    /* compiled from: VkRequestTokenState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/d$a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C19541d(boolean z12, boolean z13) {
        this.f20308a = z12;
        this.f20309b = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19541d)) {
            return false;
        }
        C19541d c19541d = (C19541d) obj;
        return this.f20308a == c19541d.f20308a && this.f20309b == c19541d.f20309b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20309b) + (Boolean.hashCode(this.f20308a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkRequestTokenState(isLoading=");
        sb2.append(this.f20308a);
        sb2.append(", loadingError=");
        return r.x(sb2, this.f20309b, ')');
    }
}
