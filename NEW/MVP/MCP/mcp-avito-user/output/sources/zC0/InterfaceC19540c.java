package Zc0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkRequestTokenOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZc0/c;", "", "a", "b", "c", "LZc0/c$a;", "LZc0/c$b;", "LZc0/c$c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19540c {

    /* compiled from: VkRequestTokenOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/c$a;", "LZc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.c$a */
    public static final class a implements InterfaceC19540c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20302a = new a();
    }

    /* compiled from: VkRequestTokenOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/c$b;", "LZc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.c$b */
    public static final /* data */ class b implements InterfaceC19540c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20303a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f20304b;

        public b(@k String str, @k String str2) {
            this.f20303a = str;
            this.f20304b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f20303a, bVar.f20303a) && L.f(this.f20304b, bVar.f20304b);
        }

        public final int hashCode() {
            return this.f20304b.hashCode() + (this.f20303a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreenWithSuccess(code=");
            sb2.append(this.f20303a);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f20304b, ')');
        }
    }

    /* compiled from: VkRequestTokenOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc0/c$c;", "LZc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1443c implements InterfaceC19540c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20305a;

        public C1443c(@k String str) {
            this.f20305a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1443c) && L.f(this.f20305a, ((C1443c) obj).f20305a);
        }

        public final int hashCode() {
            return this.f20305a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f20305a, ')');
        }
    }
}
