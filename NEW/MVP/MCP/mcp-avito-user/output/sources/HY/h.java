package HY;

import HY.c;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.printable_text.PrintableText;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: ChannelsListState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LHY/h;", "", "a", "b", "c", "d", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final b f7214l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final h f7215m = new h(d.b.f7238a, false, false, e.b.f7244a, false, false, C42784z0.f406748b, a.C0421a.f7227a, c.b.f7233a, false, B0.f406639b);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f7216a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7217b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7218c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f7219d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7221f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<ChannelsListItem> f7222g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a f7223h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final c f7224i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7225j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Set<String> f7226k;

    /* compiled from: ChannelsListState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LHY/h$a;", "", "a", "b", "LHY/h$a$a;", "LHY/h$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/h$a$a;", "LHY/h$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: HY.h$a$a, reason: collision with other inner class name */
        public static final class C0421a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C0421a f7227a = new C0421a();
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$a$b;", "LHY/h$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList f7228a;

            public b(@Y61.k ArrayList arrayList) {
                this.f7228a = arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f7228a.equals(((b) obj).f7228a);
            }

            public final int hashCode() {
                return this.f7228a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Shown(menu="), this.f7228a, ')');
            }
        }
    }

    /* compiled from: ChannelsListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/h$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ChannelsListState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LHY/h$c;", "", "a", "b", "c", "d", "LHY/h$c$b;", "LHY/h$c$c;", "LHY/h$c$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$c$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final PrintableText f7229a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final PrintableText f7230b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final PrintableText f7231c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final PrintableText f7232d;

            public a(@Y61.l PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.k PrintableText printableText3, @Y61.k PrintableText printableText4) {
                this.f7229a = printableText;
                this.f7230b = printableText2;
                this.f7231c = printableText3;
                this.f7232d = printableText4;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f7229a, aVar.f7229a) && L.f(this.f7230b, aVar.f7230b) && L.f(this.f7231c, aVar.f7231c) && L.f(this.f7232d, aVar.f7232d);
            }

            public final int hashCode() {
                PrintableText printableText = this.f7229a;
                return this.f7232d.hashCode() + com.avito.android.actions_sheet.a.f(this.f7231c, com.avito.android.actions_sheet.a.f(this.f7230b, (printableText == null ? 0 : printableText.hashCode()) * 31, 31), 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Confirmation(title=");
                sb2.append(this.f7229a);
                sb2.append(", message=");
                sb2.append(this.f7230b);
                sb2.append(", confirmButtonText=");
                sb2.append(this.f7231c);
                sb2.append(", cancelButtonText=");
                return AK.c.m(sb2, this.f7232d, ')');
            }
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/h$c$b;", "LHY/h$c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f7233a = new b();
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$c$c;", "LHY/h$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: HY.h$c$c, reason: collision with other inner class name */
        public static final /* data */ class C0422c implements c {
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0422c)) {
                    return false;
                }
                ((C0422c) obj).getClass();
                return L.f(null, null) && L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @Y61.k
            public final String toString() {
                return "Shown(confirmation=null, onConfirm=null, onDismiss=null)";
            }
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$c$d;", "LHY/h$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f7234a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final c.b.C0412c f7235b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final c.b.a f7236c;

            public d(@Y61.k a aVar, @Y61.k c.b.C0412c c0412c, @Y61.k c.b.a aVar2) {
                this.f7234a = aVar;
                this.f7235b = c0412c;
                this.f7236c = aVar2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f7234a.equals(dVar.f7234a) && this.f7235b.equals(dVar.f7235b) && L.f(this.f7236c, dVar.f7236c);
            }

            public final int hashCode() {
                int iHashCode = (this.f7235b.hashCode() + (this.f7234a.hashCode() * 31)) * 31;
                this.f7236c.getClass();
                return (-2106432314) + iHashCode;
            }

            @Y61.k
            public final String toString() {
                return "ShownWithActions(confirmation=" + this.f7234a + ", onConfirm=" + this.f7235b + ", onDismiss=" + this.f7236c + ')';
            }
        }
    }

    /* compiled from: ChannelsListState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LHY/h$d;", "", "<init>", "()V", "a", "b", "c", "LHY/h$d$a;", "LHY/h$d$b;", "LHY/h$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$d$a;", "LHY/h$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f7237a;

            public a(@Y61.k Throwable th2) {
                super(null);
                this.f7237a = th2;
            }

            @Y61.k
            public final String toString() {
                return "ProgressOverlayState.Error";
            }
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/h$d$b;", "LHY/h$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f7238a = new b();

            public b() {
                super(null);
            }

            @Y61.k
            public final String toString() {
                return "ProgressOverlayState.Hidden";
            }
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/h$d$c;", "LHY/h$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f7239a = new c();

            public c() {
                super(null);
            }

            @Y61.k
            public final String toString() {
                return "ProgressOverlayState.Loading";
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: ChannelsListState.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LHY/h$e;", "", "<init>", "()V", "a", "b", "LHY/h$e$a;", "LHY/h$e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LHY/h$e$a;", "LHY/h$e;", "a", "b", "LHY/h$e$a$a;", "LHY/h$e$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f7240a;

            /* compiled from: ChannelsListState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$e$a$a;", "LHY/h$e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: HY.h$e$a$a, reason: collision with other inner class name */
            public static final class C0423a extends a {

                /* renamed from: b, reason: collision with root package name */
                public final int f7241b;

                public C0423a(@Y61.k Throwable th2) {
                    super(th2, null);
                    this.f7241b = 2;
                }

                @Override // HY.h.e
                /* renamed from: a, reason: from getter */
                public final int getF7243c() {
                    return this.f7241b;
                }

                @Y61.k
                public final String toString() {
                    return "SnackbarState.Error.Network";
                }
            }

            /* compiled from: ChannelsListState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/h$e$a$b;", "LHY/h$e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final PrintableText f7242b;

                /* renamed from: c, reason: collision with root package name */
                public final int f7243c;

                public b(@Y61.k PrintableText printableText, @Y61.k Throwable th2) {
                    super(th2, null);
                    this.f7242b = printableText;
                    this.f7243c = 1;
                }

                @Override // HY.h.e
                /* renamed from: a, reason: from getter */
                public final int getF7243c() {
                    return this.f7243c;
                }

                @Y61.k
                public final String toString() {
                    return "SnackbarState.Error.Unknown";
                }
            }

            public a(Throwable th2, C42822w c42822w) {
                super(null);
                this.f7240a = th2;
            }
        }

        /* compiled from: ChannelsListState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/h$e$b;", "LHY/h$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f7244a = new b();

            public b() {
                super(null);
            }

            @Override // HY.h.e
            /* renamed from: a */
            public final int getF7243c() {
                return 0;
            }

            @Y61.k
            public final String toString() {
                return "SnackbarState.Hidden";
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        /* renamed from: a */
        public abstract int getF7243c();

        public e() {
        }
    }

    public h(@Y61.k d dVar, boolean z12, boolean z13, @Y61.k e eVar, boolean z14, boolean z15, @Y61.k List list, @Y61.k a aVar, @Y61.k c cVar, boolean z16, @Y61.k Set set) {
        this.f7216a = dVar;
        this.f7217b = z12;
        this.f7218c = z13;
        this.f7219d = eVar;
        this.f7220e = z14;
        this.f7221f = z15;
        this.f7222g = list;
        this.f7223h = aVar;
        this.f7224i = cVar;
        this.f7225j = z16;
        this.f7226k = set;
    }

    public static h a(h hVar, d dVar, boolean z12, boolean z13, e eVar, boolean z14, boolean z15, ArrayList arrayList, a aVar, c cVar, boolean z16, Set set, int i12) {
        d dVar2 = (i12 & 1) != 0 ? hVar.f7216a : dVar;
        boolean z17 = (i12 & 2) != 0 ? hVar.f7217b : z12;
        boolean z18 = (i12 & 4) != 0 ? hVar.f7218c : z13;
        e eVar2 = (i12 & 8) != 0 ? hVar.f7219d : eVar;
        hVar.getClass();
        boolean z19 = (i12 & 32) != 0 ? hVar.f7220e : z14;
        boolean z22 = (i12 & 64) != 0 ? hVar.f7221f : z15;
        hVar.getClass();
        hVar.getClass();
        List<ChannelsListItem> list = (i12 & 512) != 0 ? hVar.f7222g : arrayList;
        a aVar2 = (i12 & 1024) != 0 ? hVar.f7223h : aVar;
        c cVar2 = (i12 & 2048) != 0 ? hVar.f7224i : cVar;
        boolean z23 = (i12 & 4096) != 0 ? hVar.f7225j : z16;
        Set set2 = (i12 & 8192) != 0 ? hVar.f7226k : set;
        hVar.getClass();
        return new h(dVar2, z17, z18, eVar2, z19, z22, list, aVar2, cVar2, z23, set2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f7216a, hVar.f7216a) && this.f7217b == hVar.f7217b && this.f7218c == hVar.f7218c && L.f(this.f7219d, hVar.f7219d) && this.f7220e == hVar.f7220e && this.f7221f == hVar.f7221f && L.f(this.f7222g, hVar.f7222g) && L.f(this.f7223h, hVar.f7223h) && L.f(this.f7224i, hVar.f7224i) && this.f7225j == hVar.f7225j && L.f(this.f7226k, hVar.f7226k);
    }

    public final int hashCode() {
        return this.f7226k.hashCode() + r.i((this.f7224i.hashCode() + ((this.f7223h.hashCode() + H.e(r.i(r.i(r.i(r.i(r.i((this.f7219d.hashCode() + r.i(r.i(this.f7216a.hashCode() * 31, 31, this.f7217b), 31, this.f7218c)) * 31, 31, false), 31, this.f7220e), 31, this.f7221f), 31, true), 31, false), 31, this.f7222g)) * 31)) * 31, 31, this.f7225j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelsListState(\n            | progressOverlayState=");
        sb2.append(this.f7216a);
        sb2.append(",\n            | swipeToRefreshIsShown=");
        sb2.append(this.f7217b);
        sb2.append(",\n            | paginationIsEnabled=");
        sb2.append(this.f7218c);
        sb2.append(", \n            | snackbarState=");
        sb2.append(this.f7219d);
        sb2.append(", \n            | scrollToTopButtonIsShown=false, \n            | showEmptyView=");
        sb2.append(this.f7220e);
        sb2.append(", \n            | scrolledToTop=true, \n            | importantUpdates=false, \n            | listItems=(");
        D8.r(this.f7222g, sb2, ")[add logging to see contents], \n            | actionsDialogState=");
        sb2.append(this.f7223h);
        sb2.append(", \n            | confirmationDialogState=");
        sb2.append(this.f7224i);
        sb2.append(", \n            | shouldScrollToTop=");
        sb2.append(this.f7225j);
        sb2.append(", \n            | channelIdsToBeDeleted=");
        sb2.append(this.f7226k);
        sb2.append("\n            |)");
        return C43066x.F0(sb2.toString());
    }
}
