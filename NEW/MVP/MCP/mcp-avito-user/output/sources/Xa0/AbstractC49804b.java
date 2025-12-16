package xA0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SupportDialogInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LxA0/b;", "", "<init>", "()V", "a", "b", "c", "d", "LxA0/b$a;", "LxA0/b$b;", "LxA0/b$c;", "LxA0/b$d;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC49804b {

    /* compiled from: SupportDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/b$a;", "LxA0/b;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.b$a */
    public static final /* data */ class a extends AbstractC49804b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f442282a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 747476560;
        }

        @k
        public final String toString() {
            return "ChatError";
        }
    }

    /* compiled from: SupportDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxA0/b$b;", "LxA0/b;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12850b extends AbstractC49804b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f442283a;

        public C12850b(@l DeepLink deepLink) {
            super(null);
            this.f442283a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12850b) && L.f(this.f442283a, ((C12850b) obj).f442283a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f442283a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ChatLoaded(deeplink="), this.f442283a, ')');
        }
    }

    /* compiled from: SupportDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/b$c;", "LxA0/b;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.b$c */
    public static final /* data */ class c extends AbstractC49804b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f442284a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1413893244;
        }

        @k
        public final String toString() {
            return "ChatLoading";
        }
    }

    /* compiled from: SupportDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/b$d;", "LxA0/b;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.b$d */
    public static final /* data */ class d extends AbstractC49804b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f442285a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1194011830;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    public /* synthetic */ AbstractC49804b(C42822w c42822w) {
        this();
    }

    public AbstractC49804b() {
    }
}
