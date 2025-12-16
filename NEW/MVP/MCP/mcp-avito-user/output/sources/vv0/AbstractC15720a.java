package Vv0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShiftListAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LVv0/a;", "", "<init>", "()V", "a", "b", "c", "d", "LVv0/a$a;", "LVv0/a$b;", "LVv0/a$c;", "LVv0/a$d;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15720a {

    /* compiled from: ShiftListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVv0/a$a;", "LVv0/a;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vv0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1212a extends AbstractC15720a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17478a;

        public C1212a(@k DeepLink deepLink) {
            super(null);
            this.f17478a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1212a) && L.f(this.f17478a, ((C1212a) obj).f17478a);
        }

        public final int hashCode() {
            return this.f17478a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ButtonClick(deeplink="), this.f17478a, ')');
        }
    }

    /* compiled from: ShiftListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/a$b;", "LVv0/a;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vv0.a$b */
    public static final /* data */ class b extends AbstractC15720a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17479a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1557020132;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ShiftListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/a$c;", "LVv0/a;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vv0.a$c */
    public static final /* data */ class c extends AbstractC15720a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f17480a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 292624879;
        }

        @k
        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: ShiftListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/a$d;", "LVv0/a;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vv0.a$d */
    public static final /* data */ class d extends AbstractC15720a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f17481a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1570669204;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    public /* synthetic */ AbstractC15720a(C42822w c42822w) {
        this();
    }

    public AbstractC15720a() {
    }
}
