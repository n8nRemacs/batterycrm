package G20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessageSendAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LG20/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LG20/b$a;", "LG20/b$b;", "LG20/b$c;", "LG20/b$d;", "LG20/b$e;", "LG20/b$f;", "LG20/b$g;", "LG20/b$h;", "LG20/b$i;", "LG20/b$j;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/b$a;", "LG20/b;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6230a;

        public a(@k String str) {
            this.f6230a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f6230a, ((a) obj).f6230a);
        }

        public final int hashCode() {
            return this.f6230a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChanged(inputText="), this.f6230a, ')');
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/b$b;", "LG20/b;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: G20.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0329b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6231a;

        public C0329b(boolean z12) {
            this.f6231a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0329b) && this.f6231a == ((C0329b) obj).f6231a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6231a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardStateChanged(isOpened="), this.f6231a, ')');
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/b$c;", "LG20/b;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6232a;

        public c(@k String str) {
            this.f6232a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f6232a, ((c) obj).f6232a);
        }

        public final int hashCode() {
            return this.f6232a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnAnchorClick(ident="), this.f6232a, ')');
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG20/b$d;", "LG20/b;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6233a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2071013233;
        }

        @k
        public final String toString() {
            return "OnCloseClick";
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/b$e;", "LG20/b;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f6234a;

        public e(long j12) {
            this.f6234a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f6234a == ((e) obj).f6234a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f6234a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("OnItemClick(itemId="), this.f6234a, ')');
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/b$f;", "LG20/b;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6235a;

        public f(boolean z12) {
            this.f6235a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f6235a == ((f) obj).f6235a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6235a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnListDraw(isNeedShowAnchors="), this.f6235a, ')');
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/b$g;", "LG20/b;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6236a;

        public g(@k String str) {
            this.f6236a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f6236a, ((g) obj).f6236a);
        }

        public final int hashCode() {
            return this.f6236a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnListScroll(ident="), this.f6236a, ')');
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG20/b$h;", "LG20/b;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f6237a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1838815622;
        }

        @k
        public final String toString() {
            return "OnResetClick";
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG20/b$i;", "LG20/b;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f6238a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -557964865;
        }

        @k
        public final String toString() {
            return "OnSendClick";
        }
    }

    /* compiled from: MultiMessageSendAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG20/b$j;", "LG20/b;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f6239a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 108493229;
        }

        @k
        public final String toString() {
            return "RepeatLoadData";
        }
    }
}
