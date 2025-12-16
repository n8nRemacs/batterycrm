package Ua0;

import androidx.compose.runtime.C22026a;
import com.avito.android.profile.PhotoPickerContract;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserProfileOneTimeEvent.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LUa0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "LUa0/b$a;", "LUa0/b$b;", "LUa0/b$c;", "LUa0/b$d;", "LUa0/b$e;", "LUa0/b$f;", "LUa0/b$g;", "LUa0/b$h;", "LUa0/b$i;", "LUa0/b$j;", "LUa0/b$k;", "LUa0/b$l;", "LUa0/b$m;", "LUa0/b$n;", "LUa0/b$o;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ua0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15504b {

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$a;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$a */
    public static final class a implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f16475a = new a();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$b;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$b, reason: collision with other inner class name */
    public static final class C1131b implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C1131b f16476a = new C1131b();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$c;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$c */
    public static final /* data */ class c implements InterfaceC15504b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "OpenEditProfileScreen(avatarShape=null)";
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$d;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$d */
    public static final /* data */ class d implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f16477a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f16477a, ((d) obj).f16477a);
        }

        public final int hashCode() {
            String str = this.f16477a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenHelpCenter(url="), this.f16477a, ')');
        }

        public d(@Y61.l String str) {
            this.f16477a = str;
        }

        public /* synthetic */ d(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$e;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$e */
    public static final class e implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f16478a = new e();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$f;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$f */
    public static final class f implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f16479a = new f();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$g;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$g */
    public static final /* data */ class g implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhotoPickerContract.Args.Type f16480a;

        public g(@Y61.k PhotoPickerContract.Args.Type type) {
            this.f16480a = type;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f16480a == ((g) obj).f16480a;
        }

        public final int hashCode() {
            return this.f16480a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenPhotoPicker(type=" + this.f16480a + ')';
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$h;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$h */
    public static final /* data */ class h implements InterfaceC15504b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -1405959847;
        }

        @Y61.k
        public final String toString() {
            return "OpenProfileSettingsScreen(source=avatar)";
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$i;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$i */
    public static final class i implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f16481a = new i();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$j;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$j */
    public static final /* data */ class j implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16482a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f16483b;

        public j(@Y61.k String str, @Y61.k String str2) {
            this.f16482a = str;
            this.f16483b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f16482a, jVar.f16482a) && L.f(this.f16483b, jVar.f16483b);
        }

        public final int hashCode() {
            return this.f16483b.hashCode() + (this.f16482a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenShareDialog(title=");
            sb2.append(this.f16482a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f16483b, ')');
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$k;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$k */
    public static final class k implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f16484a = new k();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/b$l;", "LUa0/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$l */
    public static final class l implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f16485a = new l();
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$m;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$m */
    public static final /* data */ class m implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16486a;

        public m(@Y61.k String str) {
            this.f16486a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f16486a, ((m) obj).f16486a);
        }

        public final int hashCode() {
            return this.f16486a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackBar(message="), this.f16486a, ')');
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$n;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$n */
    public static final /* data */ class n implements InterfaceC15504b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: UserProfileOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/b$o;", "LUa0/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.b$o */
    public static final /* data */ class o implements InterfaceC15504b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f16487a;

        public o(@Y61.k String str) {
            this.f16487a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f16487a, ((o) obj).f16487a);
        }

        public final int hashCode() {
            return this.f16487a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastBar(message="), this.f16487a, ')');
        }
    }
}
