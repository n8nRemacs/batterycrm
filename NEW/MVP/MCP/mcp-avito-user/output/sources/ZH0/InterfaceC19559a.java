package Zh0;

import Ju.InterfaceC14249c;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import ci0.C27201c;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckerboardAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LZh0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LZh0/a$a;", "LZh0/a$b;", "LZh0/a$c;", "LZh0/a$d;", "LZh0/a$e;", "LZh0/a$f;", "LZh0/a$g;", "LZh0/a$h;", "LZh0/a$i;", "LZh0/a$j;", "LZh0/a$k;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19559a {

    /* compiled from: CheckerboardAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LZh0/a$a;", "LZh0/a;", "a", "b", "c", "d", "e", "LZh0/a$a$a;", "LZh0/a$a$b;", "LZh0/a$a$c;", "LZh0/a$a$d;", "LZh0/a$a$e;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$a, reason: collision with other inner class name */
    public interface InterfaceC1446a extends InterfaceC19559a {

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$a$a;", "LZh0/a$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1447a implements InterfaceC1446a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C27201c f20387a;

            public C1447a(@Y61.k C27201c c27201c) {
                this.f20387a = c27201c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1447a) && L.f(this.f20387a, ((C1447a) obj).f20387a);
            }

            public final int hashCode() {
                return this.f20387a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ItemClick(lot=" + this.f20387a + ')';
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$a$b;", "LZh0/a$a;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$a$b */
        public static final /* data */ class b implements InterfaceC1446a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f20388a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1563440484;
            }

            @Y61.k
            public final String toString() {
                return "NextSectionClick";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$a$c;", "LZh0/a$a;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$a$c */
        public static final /* data */ class c implements InterfaceC1446a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f20389a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -680642456;
            }

            @Y61.k
            public final String toString() {
                return "PreviousSectionClick";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$a$d;", "LZh0/a$a;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$a$d */
        public static final /* data */ class d implements InterfaceC1446a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f20390a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -542041727;
            }

            @Y61.k
            public final String toString() {
                return "ReloadClick";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$a$e;", "LZh0/a$a;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$a$e */
        public static final /* data */ class e implements InterfaceC1446a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f20391a = new e();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -230062483;
            }

            @Y61.k
            public final String toString() {
                return "SelectSectionClick";
            }
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/a$b;", "LZh0/a;", "a", "b", "c", "LZh0/a$b$a;", "LZh0/a$b$b;", "LZh0/a$b$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$b */
    public interface b extends InterfaceC19559a {

        /* compiled from: CheckerboardAction.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LZh0/a$b$a;", "LZh0/a$b;", "a", "b", "c", "d", "LZh0/a$b$a$a;", "LZh0/a$b$a$b;", "LZh0/a$b$a$c;", "LZh0/a$b$a$d;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC1448a extends b {

            /* compiled from: CheckerboardAction.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/a$b$a$a;", "LZh0/a$b$a;", "a", "b", "c", "LZh0/a$b$a$a$a;", "LZh0/a$b$a$a$b;", "LZh0/a$b$a$a$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: Zh0.a$b$a$a, reason: collision with other inner class name */
            public interface InterfaceC1449a extends InterfaceC1448a {

                /* compiled from: CheckerboardAction.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$b$a$a$a;", "LZh0/a$b$a$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: Zh0.a$b$a$a$a, reason: collision with other inner class name */
                public static final /* data */ class C1450a implements InterfaceC1449a {

                    /* renamed from: a, reason: collision with root package name */
                    public final long f20392a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f20393b;

                    public C1450a(long j12, long j13) {
                        this.f20392a = j12;
                        this.f20393b = j13;
                    }

                    @Override // Zh0.InterfaceC19559a.b.InterfaceC1448a
                    /* renamed from: a, reason: from getter */
                    public final long getF20399b() {
                        return this.f20393b;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1450a)) {
                            return false;
                        }
                        C1450a c1450a = (C1450a) obj;
                        return this.f20392a == c1450a.f20392a && this.f20393b == c1450a.f20393b;
                    }

                    public final int hashCode() {
                        return Long.hashCode(this.f20393b) + (Long.hashCode(this.f20392a) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("BindingClick(developmentId=");
                        sb2.append(this.f20392a);
                        sb2.append(", lotId=");
                        return r.u(sb2, this.f20393b, ')');
                    }
                }

                /* compiled from: CheckerboardAction.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$b$a$a$b;", "LZh0/a$b$a$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: Zh0.a$b$a$a$b, reason: collision with other inner class name */
                public static final /* data */ class C1451b implements InterfaceC1449a {

                    /* renamed from: a, reason: collision with root package name */
                    public final long f20394a;

                    public C1451b(long j12) {
                        this.f20394a = j12;
                    }

                    @Override // Zh0.InterfaceC19559a.b.InterfaceC1448a
                    /* renamed from: a, reason: from getter */
                    public final long getF20399b() {
                        return this.f20394a;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1451b) && this.f20394a == ((C1451b) obj).f20394a;
                    }

                    public final int hashCode() {
                        return Long.hashCode(this.f20394a);
                    }

                    @Y61.k
                    public final String toString() {
                        return r.u(new StringBuilder("BookingClick(lotId="), this.f20394a, ')');
                    }
                }

                /* compiled from: CheckerboardAction.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$b$a$a$c;", "LZh0/a$b$a$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: Zh0.a$b$a$a$c */
                public static final /* data */ class c implements InterfaceC1449a {

                    /* renamed from: a, reason: collision with root package name */
                    public final long f20395a;

                    public c(long j12) {
                        this.f20395a = j12;
                    }

                    @Override // Zh0.InterfaceC19559a.b.InterfaceC1448a
                    /* renamed from: a, reason: from getter */
                    public final long getF20399b() {
                        return this.f20395a;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof c) && this.f20395a == ((c) obj).f20395a;
                    }

                    public final int hashCode() {
                        return Long.hashCode(this.f20395a);
                    }

                    @Y61.k
                    public final String toString() {
                        return r.u(new StringBuilder("Close(lotId="), this.f20395a, ')');
                    }
                }
            }

            /* compiled from: CheckerboardAction.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$b$a$b;", "LZh0/a$b$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: Zh0.a$b$a$b, reason: collision with other inner class name */
            public static final /* data */ class C1452b implements InterfaceC1448a {

                /* renamed from: a, reason: collision with root package name */
                public final long f20396a;

                public C1452b(long j12) {
                    this.f20396a = j12;
                }

                @Override // Zh0.InterfaceC19559a.b.InterfaceC1448a
                /* renamed from: a, reason: from getter */
                public final long getF20399b() {
                    return this.f20396a;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1452b) && this.f20396a == ((C1452b) obj).f20396a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f20396a);
                }

                @Y61.k
                public final String toString() {
                    return r.u(new StringBuilder("Click(lotId="), this.f20396a, ')');
                }
            }

            /* compiled from: CheckerboardAction.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$b$a$c;", "LZh0/a$b$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: Zh0.a$b$a$c */
            public static final /* data */ class c implements InterfaceC1448a {

                /* renamed from: a, reason: collision with root package name */
                public final long f20397a;

                public c(long j12) {
                    this.f20397a = j12;
                }

                @Override // Zh0.InterfaceC19559a.b.InterfaceC1448a
                /* renamed from: a, reason: from getter */
                public final long getF20399b() {
                    return this.f20397a;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.f20397a == ((c) obj).f20397a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f20397a);
                }

                @Y61.k
                public final String toString() {
                    return r.u(new StringBuilder("OnAddToSelectionClick(lotId="), this.f20397a, ')');
                }
            }

            /* compiled from: CheckerboardAction.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$b$a$d;", "LZh0/a$b$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: Zh0.a$b$a$d */
            public static final /* data */ class d implements InterfaceC1448a {

                /* renamed from: a, reason: collision with root package name */
                public final long f20398a;

                /* renamed from: b, reason: collision with root package name */
                public final long f20399b;

                public d(long j12, long j13) {
                    this.f20398a = j12;
                    this.f20399b = j13;
                }

                @Override // Zh0.InterfaceC19559a.b.InterfaceC1448a
                /* renamed from: a, reason: from getter */
                public final long getF20399b() {
                    return this.f20399b;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.f20398a == dVar.f20398a && this.f20399b == dVar.f20399b;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f20399b) + (Long.hashCode(this.f20398a) * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("OnAdditionalOptionsClick(developmentId=");
                    sb2.append(this.f20398a);
                    sb2.append(", lotId=");
                    return r.u(sb2, this.f20399b, ')');
                }
            }

            /* renamed from: a */
            long getF20399b();
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$b$b;", "LZh0/a$b;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1453b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1453b f20400a = new C1453b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1453b);
            }

            public final int hashCode() {
                return -862854473;
            }

            @Y61.k
            public final String toString() {
                return "OnSortingTypeClick";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$b$c;", "LZh0/a$b;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$b$c */
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f20401a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 800244526;
            }

            @Y61.k
            public final String toString() {
                return "RequestNewPage";
            }
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/a$c;", "LZh0/a;", "a", "b", "c", "LZh0/a$c$a;", "LZh0/a$c$b;", "LZh0/a$c$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$c */
    public interface c extends InterfaceC19559a {

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$c$a;", "LZh0/a$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C1454a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f20402a;

            public C1454a(long j12) {
                this.f20402a = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1454a) && this.f20402a == ((C1454a) obj).f20402a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f20402a);
            }

            @Y61.k
            public final String toString() {
                return r.u(new StringBuilder("BookingClick(lotId="), this.f20402a, ')');
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$c$b;", "LZh0/a$c;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$c$b */
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f20403a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -483240016;
            }

            @Y61.k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$c$c;", "LZh0/a$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$c$c, reason: collision with other inner class name */
        public static final /* data */ class C1455c implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f20404a;

            public C1455c(long j12) {
                this.f20404a = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1455c) && this.f20404a == ((C1455c) obj).f20404a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f20404a);
            }

            @Y61.k
            public final String toString() {
                return r.u(new StringBuilder("ShowLotCardClick(lotId="), this.f20404a, ')');
            }
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LZh0/a$d;", "LZh0/a;", "a", "b", "LZh0/a$d$a;", "LZh0/a$d$b;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$d */
    public interface d extends InterfaceC19559a {

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$d$a;", "LZh0/a$d;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C1456a implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1456a f20405a = new C1456a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1456a);
            }

            public final int hashCode() {
                return 1619544990;
            }

            @Y61.k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$d$b;", "LZh0/a$d;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$d$b */
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final LotSortingType f20406a;

            public b(@Y61.k LotSortingType lotSortingType) {
                this.f20406a = lotSortingType;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f20406a == ((b) obj).f20406a;
            }

            public final int hashCode() {
                return this.f20406a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Select(sortingType=" + this.f20406a + ')';
            }
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$e;", "LZh0/a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$e */
    public static final /* data */ class e implements InterfaceC19559a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MainContentTab f20407a;

        public e(@Y61.k MainContentTab mainContentTab) {
            this.f20407a = mainContentTab;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f20407a == ((e) obj).f20407a;
        }

        public final int hashCode() {
            return this.f20407a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MainContentTabSelect(tab=" + this.f20407a + ')';
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$f;", "LZh0/a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$f */
    public static final /* data */ class f implements InterfaceC19559a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20408a;

        public f(boolean z12) {
            this.f20408a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f20408a == ((f) obj).f20408a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20408a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("OnChangeMeetingMode(isEnabled="), this.f20408a, ')');
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$g;", "LZh0/a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$g */
    public static final /* data */ class g implements InterfaceC19559a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f20409a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC14249c f20410b;

        public g(@l String str, @Y61.k InterfaceC14249c interfaceC14249c) {
            this.f20409a = str;
            this.f20410b = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f20409a, gVar.f20409a) && L.f(this.f20410b, gVar.f20410b);
        }

        public final int hashCode() {
            String str = this.f20409a;
            return this.f20410b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnDeeplinkResult(requestKey=" + this.f20409a + ", result=" + this.f20410b + ')';
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$h;", "LZh0/a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$h */
    public static final /* data */ class h implements InterfaceC19559a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20411a;

        public h(boolean z12) {
            this.f20411a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f20411a == ((h) obj).f20411a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20411a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("OnInlineFiltersLoadingStateUpdated(loaded="), this.f20411a, ')');
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$i;", "LZh0/a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$i */
    public static final /* data */ class i implements InterfaceC19559a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f20412a;

        public i(@Y61.k SearchParams searchParams) {
            this.f20412a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f20412a, ((i) obj).f20412a);
        }

        public final int hashCode() {
            return this.f20412a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.bxcontent.mvi.entity.f.m(new StringBuilder("OnSearchParamsClarified(searchParams="), this.f20412a, ')');
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$j;", "LZh0/a;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$j */
    public static final /* data */ class j implements InterfaceC19559a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f20413a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1848785824;
        }

        @Y61.k
        public final String toString() {
            return "ReloadLotsListClick";
        }
    }

    /* compiled from: CheckerboardAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LZh0/a$k;", "LZh0/a;", "a", "b", "LZh0/a$k$a;", "LZh0/a$k$b;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.a$k */
    public interface k extends InterfaceC19559a {

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/a$k$a;", "LZh0/a$k;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$k$a, reason: collision with other inner class name */
        public static final /* data */ class C1457a implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1457a f20414a = new C1457a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1457a);
            }

            public final int hashCode() {
                return 1020519263;
            }

            @Y61.k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: CheckerboardAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/a$k$b;", "LZh0/a$k;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.a$k$b */
        public static final /* data */ class b implements k {

            /* renamed from: a, reason: collision with root package name */
            public final long f20415a;

            public b(long j12) {
                this.f20415a = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f20415a == ((b) obj).f20415a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f20415a);
            }

            @Y61.k
            public final String toString() {
                return r.u(new StringBuilder("Select(sectionId="), this.f20415a, ')');
            }
        }
    }
}
