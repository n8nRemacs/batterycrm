package Xc0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkedGroupOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LXc0/c;", "", "a", "b", "c", "d", "LXc0/c$a;", "LXc0/c$b;", "LXc0/c$c;", "LXc0/c$d;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: VkLinkedGroupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXc0/c$a;", "LXc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f18976a = new a();
    }

    /* compiled from: VkLinkedGroupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXc0/c$b;", "LXc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f18977a = new b();
    }

    /* compiled from: VkLinkedGroupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXc0/c$c;", "LXc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xc0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1341c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f18978a;

        public C1341c(@k String str) {
            this.f18978a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1341c) && L.f(this.f18978a, ((C1341c) obj).f18978a);
        }

        public final int hashCode() {
            return this.f18978a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UnlinkingError(message="), this.f18978a, ')');
        }
    }

    /* compiled from: VkLinkedGroupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXc0/c$d;", "LXc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f18979a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f18980b;

        public d(@k String str, @k String str2) {
            this.f18979a = str;
            this.f18980b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f18979a, dVar.f18979a) && L.f(this.f18980b, dVar.f18980b);
        }

        public final int hashCode() {
            return this.f18980b.hashCode() + (this.f18979a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnlinkingErrorWithRepeat(message=");
            sb2.append(this.f18979a);
            sb2.append(", repeatButtonText=");
            return C22026a.c(sb2, this.f18980b, ')');
        }
    }
}
