package Zc0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkRequestTokenInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LZc0/b;", "", "a", "b", "c", "d", "e", "LZc0/b$a;", "LZc0/b$b;", "LZc0/b$c;", "LZc0/b$d;", "LZc0/b$e;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19539b {

    /* compiled from: VkRequestTokenInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/b$a;", "LZc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.b$a */
    public static final class a implements InterfaceC19539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20296a = new a();
    }

    /* compiled from: VkRequestTokenInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/b$b;", "LZc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1442b implements InterfaceC19539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20297a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f20298b;

        public C1442b(@k String str, @k String str2) {
            this.f20297a = str;
            this.f20298b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1442b)) {
                return false;
            }
            C1442b c1442b = (C1442b) obj;
            return L.f(this.f20297a, c1442b.f20297a) && L.f(this.f20298b, c1442b.f20298b);
        }

        public final int hashCode() {
            return this.f20298b.hashCode() + (this.f20297a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreenWithSuccess(code=");
            sb2.append(this.f20297a);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f20298b, ')');
        }
    }

    /* compiled from: VkRequestTokenInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/b$c;", "LZc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.b$c */
    public static final /* data */ class c implements InterfaceC19539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20299a;

        public c(@k String str) {
            this.f20299a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f20299a, ((c) obj).f20299a);
        }

        public final int hashCode() {
            return this.f20299a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f20299a, ')');
        }
    }

    /* compiled from: VkRequestTokenInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/b$d;", "LZc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.b$d */
    public static final /* data */ class d implements InterfaceC19539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f20300a;

        public d(@k Throwable th2) {
            this.f20300a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f20300a, ((d) obj).f20300a);
        }

        public final int hashCode() {
            return this.f20300a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("PageLoadingError(throwable="), this.f20300a, ')');
        }
    }

    /* compiled from: VkRequestTokenInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/b$e;", "LZc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.b$e */
    public static final class e implements InterfaceC19539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f20301a = new e();
    }
}
