package xA0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SupportDialogAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LxA0/a;", "", "<init>", "()V", "a", "b", "c", "d", "LxA0/a$a;", "LxA0/a$b;", "LxA0/a$c;", "LxA0/a$d;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC49803a {

    /* compiled from: SupportDialogAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/a$a;", "LxA0/a;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12849a extends AbstractC49803a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12849a f442278a = new C12849a();

        public C12849a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12849a);
        }

        public final int hashCode() {
            return -290844499;
        }

        @k
        public final String toString() {
            return "CallClick";
        }
    }

    /* compiled from: SupportDialogAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/a$b;", "LxA0/a;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.a$b */
    public static final /* data */ class b extends AbstractC49803a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f442279a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1919646733;
        }

        @k
        public final String toString() {
            return "ChatClick";
        }
    }

    /* compiled from: SupportDialogAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/a$c;", "LxA0/a;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.a$c */
    public static final /* data */ class c extends AbstractC49803a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f442280a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 778631725;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: SupportDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxA0/a$d;", "LxA0/a;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.a$d */
    public static final /* data */ class d extends AbstractC49803a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f442281a;

        public d(@l DeepLink deepLink) {
            super(null);
            this.f442281a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f442281a, ((d) obj).f442281a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f442281a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f442281a, ')');
        }
    }

    public /* synthetic */ AbstractC49803a(C42822w c42822w) {
        this();
    }

    public AbstractC49803a() {
    }
}
