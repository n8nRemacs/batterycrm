package Zc0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkRequestTokenAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LZc0/a;", "", "a", "b", "c", "d", "e", "LZc0/a$a;", "LZc0/a$b;", "LZc0/a$c;", "LZc0/a$d;", "LZc0/a$e;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19538a {

    /* compiled from: VkRequestTokenAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/a$a;", "LZc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.a$a, reason: collision with other inner class name */
    public static final class C1441a implements InterfaceC19538a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1441a f20290a = new C1441a();
    }

    /* compiled from: VkRequestTokenAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/a$b;", "LZc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.a$b */
    public static final /* data */ class b implements InterfaceC19538a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20291a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f20292b;

        public b(@k String str, @k String str2) {
            this.f20291a = str;
            this.f20292b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f20291a, bVar.f20291a) && L.f(this.f20292b, bVar.f20292b);
        }

        public final int hashCode() {
            return this.f20292b.hashCode() + (this.f20291a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreenWithSuccess(code=");
            sb2.append(this.f20291a);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f20292b, ')');
        }
    }

    /* compiled from: VkRequestTokenAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/a$c;", "LZc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.a$c */
    public static final class c implements InterfaceC19538a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f20293a = new c();
    }

    /* compiled from: VkRequestTokenAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/a$d;", "LZc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.a$d */
    public static final /* data */ class d implements InterfaceC19538a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f20294a;

        public d(@k Throwable th2) {
            this.f20294a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f20294a, ((d) obj).f20294a);
        }

        public final int hashCode() {
            return this.f20294a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("PageLoadingError(throwable="), this.f20294a, ')');
        }
    }

    /* compiled from: VkRequestTokenAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/a$e;", "LZc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.a$e */
    public static final class e implements InterfaceC19538a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f20295a = new e();
    }
}
