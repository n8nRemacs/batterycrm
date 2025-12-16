package Fx0;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StoriesAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LFx0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LFx0/a$a;", "LFx0/a$b;", "LFx0/a$c;", "LFx0/a$d;", "LFx0/a$e;", "LFx0/a$f;", "LFx0/a$g;", "LFx0/a$h;", "LFx0/a$i;", "LFx0/a$j;", "LFx0/a$k;", "LFx0/a$l;", "LFx0/a$m;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13851a {

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$a;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0312a implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0312a f6066a = new C0312a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0312a);
        }

        public final int hashCode() {
            return 894000012;
        }

        @Y61.k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/a$b;", "LFx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$b */
    public static final /* data */ class b implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6067a;

        public b(@Y61.k String str) {
            this.f6067a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6067a, ((b) obj).f6067a);
        }

        public final int hashCode() {
            return this.f6067a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FullStoryViewed(id="), this.f6067a, ')');
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/a$c;", "LFx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$c */
    public static final /* data */ class c implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final P2<G0> f6068a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k P2<? super G0> p22) {
            this.f6068a = p22;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f6068a, ((c) obj).f6068a);
        }

        public final int hashCode() {
            return this.f6068a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HandleLoadState(state=" + this.f6068a + ')';
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/a$d;", "LFx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$d */
    public static final /* data */ class d implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f6069a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Bundle f6070b;

        public d(@Y61.k Uri uri, @Y61.l Bundle bundle) {
            this.f6069a = uri;
            this.f6070b = bundle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f6069a, dVar.f6069a) && L.f(this.f6070b, dVar.f6070b);
        }

        public final int hashCode() {
            int iHashCode = this.f6069a.hashCode() * 31;
            Bundle bundle = this.f6070b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleUri(uri=");
            sb2.append(this.f6069a);
            sb2.append(", args=");
            return H.m(sb2, this.f6070b, ')');
        }

        public /* synthetic */ d(Uri uri, Bundle bundle, int i12, C42822w c42822w) {
            this(uri, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$e;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$e */
    public static final /* data */ class e implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f6071a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1135968216;
        }

        @Y61.k
        public final String toString() {
            return "JsCloseView";
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$f;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$f */
    public static final /* data */ class f implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f6072a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1087600448;
        }

        @Y61.k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$g;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$g */
    public static final /* data */ class g implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f6073a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -543717445;
        }

        @Y61.k
        public final String toString() {
            return "OnPause";
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$h;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$h */
    public static final /* data */ class h implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f6074a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 385523464;
        }

        @Y61.k
        public final String toString() {
            return "OnResume";
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$i;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$i */
    public static final /* data */ class i implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f6075a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 430473029;
        }

        @Y61.k
        public final String toString() {
            return "OnSwiped";
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/a$j;", "LFx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$j */
    public static final /* data */ class j implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6076a;

        public j(@Y61.k String str) {
            this.f6076a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f6076a, ((j) obj).f6076a);
        }

        public final int hashCode() {
            return this.f6076a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectedPage(page="), this.f6076a, ')');
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/a$k;", "LFx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$k */
    public static final /* data */ class k implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6077a;

        public k(@Y61.k String str) {
            this.f6077a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f6077a, ((k) obj).f6077a);
        }

        public final int hashCode() {
            return this.f6077a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("StoryViewed(id="), this.f6077a, ')');
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/a$l;", "LFx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$l */
    public static final /* data */ class l implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6078a;

        public l(boolean z12) {
            this.f6078a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f6078a == ((l) obj).f6078a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6078a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("TriggerUxFeedback(needToShow="), this.f6078a, ')');
        }
    }

    /* compiled from: StoriesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/a$m;", "LFx0/a;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.a$m */
    public static final /* data */ class m implements InterfaceC13851a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f6079a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -658009758;
        }

        @Y61.k
        public final String toString() {
            return "ViewReady";
        }
    }
}
