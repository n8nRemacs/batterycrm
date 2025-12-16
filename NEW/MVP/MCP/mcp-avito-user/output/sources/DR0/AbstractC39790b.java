package dr0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SendEsiaDataInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ldr0/b;", "", "<init>", "()V", "a", "b", "c", "d", "Ldr0/b$a;", "Ldr0/b$b;", "Ldr0/b$c;", "Ldr0/b$d;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dr0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC39790b {

    /* compiled from: SendEsiaDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr0/b$a;", "Ldr0/b;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.b$a */
    public static final /* data */ class a extends AbstractC39790b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394154a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -455578113;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SendEsiaDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr0/b$b;", "Ldr0/b;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11042b extends AbstractC39790b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11042b f394155a = new C11042b();

        public C11042b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11042b);
        }

        public final int hashCode() {
            return -453549553;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SendEsiaDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr0/b$c;", "Ldr0/b;", "<init>", "()V", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.b$c */
    public static final /* data */ class c extends AbstractC39790b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f394156a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1862202221;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: SendEsiaDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldr0/b$d;", "Ldr0/b;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dr0.b$d */
    public static final /* data */ class d extends AbstractC39790b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f394157a;

        public d(@k DeepLink deepLink) {
            super(null);
            this.f394157a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f394157a, ((d) obj).f394157a);
        }

        public final int hashCode() {
            return this.f394157a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(deeplink="), this.f394157a, ')');
        }
    }

    public /* synthetic */ AbstractC39790b(C42822w c42822w) {
        this();
    }

    public AbstractC39790b() {
    }
}
