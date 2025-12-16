package Vc0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LVc0/c;", "", "a", "b", "c", "d", "e", "f", "LVc0/c$a;", "LVc0/c$b;", "LVc0/c$c;", "LVc0/c$d;", "LVc0/c$e;", "LVc0/c$f;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/c$a;", "LVc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17310a = new a();
    }

    /* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/c$b;", "LVc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17311a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f17312b;

        public b(@k DeepLink deepLink, @k String str) {
            this.f17311a = deepLink;
            this.f17312b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17311a, bVar.f17311a) && L.f(this.f17312b, bVar.f17312b);
        }

        public final int hashCode() {
            return this.f17312b.hashCode() + (this.f17311a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkAction(deeplink=");
            sb2.append(this.f17311a);
            sb2.append(", requestCode=");
            return C22026a.c(sb2, this.f17312b, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/c$c;", "LVc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1194c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VkPopup f17313a;

        public C1194c(@k VkPopup vkPopup) {
            this.f17313a = vkPopup;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1194c) && L.f(this.f17313a, ((C1194c) obj).f17313a);
        }

        public final int hashCode() {
            return this.f17313a.hashCode();
        }

        @k
        public final String toString() {
            return "NextPopupAction(dialog=" + this.f17313a + ')';
        }
    }

    /* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/c$d;", "LVc0/c;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f17314a = new d();
    }

    /* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/c$e;", "LVc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17315a;

        public e(@k String str) {
            this.f17315a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f17315a, ((e) obj).f17315a);
        }

        public final int hashCode() {
            return this.f17315a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackbar(message="), this.f17315a, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/c$f;", "LVc0/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17316a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f17317b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC15664a f17318c;

        public f(@k String str, @k String str2, @k InterfaceC15664a interfaceC15664a) {
            this.f17316a = str;
            this.f17317b = str2;
            this.f17318c = interfaceC15664a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f17316a, fVar.f17316a) && L.f(this.f17317b, fVar.f17317b) && L.f(this.f17318c, fVar.f17318c);
        }

        public final int hashCode() {
            return this.f17318c.hashCode() + H.d(this.f17316a.hashCode() * 31, 31, this.f17317b);
        }

        @k
        public final String toString() {
            return "ShowSnackbarWithAction(message=" + this.f17316a + ", buttonText=" + this.f17317b + ", action=" + this.f17318c + ')';
        }
    }
}
