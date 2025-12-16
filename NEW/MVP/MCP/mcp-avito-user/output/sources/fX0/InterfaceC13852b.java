package Fx0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StoriesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LFx0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LFx0/b$a;", "LFx0/b$b;", "LFx0/b$c;", "LFx0/b$d;", "LFx0/b$e;", "LFx0/b$f;", "LFx0/b$g;", "LFx0/b$h;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13852b {

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/b$b;", "LFx0/b;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0313b implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6085a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, String> f6086b;

        public C0313b(@k String str, @k Map<String, String> map) {
            this.f6085a = str;
            this.f6086b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0313b)) {
                return false;
            }
            C0313b c0313b = (C0313b) obj;
            return L.f(this.f6085a, c0313b.f6085a) && L.f(this.f6086b, c0313b.f6086b);
        }

        public final int hashCode() {
            return this.f6086b.hashCode() + (this.f6085a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadWebViewUrl(url=");
            sb2.append(this.f6085a);
            sb2.append(", headers=");
            return r.w(sb2, this.f6086b, ')');
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/b$c;", "LFx0/b;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$c */
    public static final /* data */ class c implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f6087a;

        public c(@k Uri uri) {
            this.f6087a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f6087a, ((c) obj).f6087a);
        }

        public final int hashCode() {
            return this.f6087a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenUri(uri="), this.f6087a, ')');
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/b$d;", "LFx0/b;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$d */
    public static final /* data */ class d implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6088a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -98538320;
        }

        @k
        public final String toString() {
            return "PauseView";
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/b$e;", "LFx0/b;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$e */
    public static final /* data */ class e implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f6089a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 739079197;
        }

        @k
        public final String toString() {
            return "ResumeView";
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/b$f;", "LFx0/b;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$f */
    public static final /* data */ class f implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f6090a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -923467784;
        }

        @k
        public final String toString() {
            return "SetDefaultBackground";
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFx0/b$g;", "LFx0/b;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$g */
    public static final /* data */ class g implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f6091a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -368993398;
        }

        @k
        public final String toString() {
            return "SetStoriesBackground";
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/b$h;", "LFx0/b;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$h */
    public static final /* data */ class h implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6092a;

        public h(@k String str) {
            this.f6092a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f6092a, ((h) obj).f6092a);
        }

        public final int hashCode() {
            return this.f6092a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f6092a, ')');
        }
    }

    /* compiled from: StoriesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFx0/b$a;", "LFx0/b;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fx0.b$a */
    public static final /* data */ class a implements InterfaceC13852b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6080a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6081b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f6082c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<String> f6083d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f6084e;

        public a(@l String str, @k List list, boolean z12, boolean z13, boolean z14) {
            this.f6080a = z12;
            this.f6081b = z13;
            this.f6082c = str;
            this.f6083d = list;
            this.f6084e = z14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6080a == aVar.f6080a && this.f6081b == aVar.f6081b && L.f(this.f6082c, aVar.f6082c) && L.f(this.f6083d, aVar.f6083d) && this.f6084e == aVar.f6084e;
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f6080a) * 31, 31, this.f6081b);
            String str = this.f6082c;
            return Boolean.hashCode(this.f6084e) + H.e((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6083d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Close(needAnimation=");
            sb2.append(this.f6080a);
            sb2.append(", needFinish=");
            sb2.append(this.f6081b);
            sb2.append(", selectedId=");
            sb2.append(this.f6082c);
            sb2.append(", viewedList=");
            sb2.append(this.f6083d);
            sb2.append(", needToShowUxFeedback=");
            return r.x(sb2, this.f6084e, ')');
        }

        public /* synthetic */ a(boolean z12, boolean z13, String str, List list, boolean z14, int i12, C42822w c42822w) {
            this(str, list, (i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13, z14);
        }
    }
}
