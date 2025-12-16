package kB;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditBlockAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LkB/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LkB/a$a;", "LkB/a$b;", "LkB/a$c;", "LkB/a$d;", "LkB/a$e;", "LkB/a$f;", "LkB/a$g;", "LkB/a$h;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42561a {

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkB/a$a;", "LkB/a;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11607a implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11607a f406152a = new C11607a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11607a);
        }

        public final int hashCode() {
            return 2072119550;
        }

        @k
        public final String toString() {
            return "OnCloseClick";
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/a$b;", "LkB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$b */
    public static final /* data */ class b implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f406153a;

        public b(boolean z12) {
            this.f406153a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f406153a == ((b) obj).f406153a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406153a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnColorInvertedSwitched(checked="), this.f406153a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/a$c;", "LkB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$c */
    public static final /* data */ class c implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f406154a;

        public c(boolean z12) {
            this.f406154a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f406154a == ((c) obj).f406154a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406154a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnImageClick(isFirstUploader="), this.f406154a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/a$d;", "LkB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$d */
    public static final /* data */ class d implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406155a;

        public d(@k String str) {
            this.f406155a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f406155a, ((d) obj).f406155a);
        }

        public final int hashCode() {
            return this.f406155a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnImageEdited(operationId="), this.f406155a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/a$e;", "LkB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$e */
    public static final /* data */ class e implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406156a;

        public e(@k String str) {
            this.f406156a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f406156a, ((e) obj).f406156a);
        }

        public final int hashCode() {
            return this.f406156a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnImagePicked(operationId="), this.f406156a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/a$f;", "LkB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$f */
    public static final /* data */ class f implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f406157a;

        public f(boolean z12) {
            this.f406157a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f406157a == ((f) obj).f406157a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406157a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnImageRemoveClick(isFirstUploader="), this.f406157a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkB/a$g;", "LkB/a;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$g */
    public static final /* data */ class g implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f406158a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1093248579;
        }

        @k
        public final String toString() {
            return "OnSaveClick";
        }
    }

    /* compiled from: UniversalWidgetEditBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/a$h;", "LkB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kB.a$h */
    public static final /* data */ class h implements InterfaceC42561a {

        /* renamed from: a, reason: collision with root package name */
        public final int f406159a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f406160b;

        public h(int i12, @k String str) {
            this.f406159a = i12;
            this.f406160b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f406159a == hVar.f406159a && L.f(this.f406160b, hVar.f406160b);
        }

        public final int hashCode() {
            return this.f406160b.hashCode() + (Integer.hashCode(this.f406159a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTextInput(indexOfInput=");
            sb2.append(this.f406159a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f406160b, ')');
        }
    }
}
