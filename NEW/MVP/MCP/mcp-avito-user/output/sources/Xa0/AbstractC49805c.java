package xA0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SupportDialogOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LxA0/c;", "", "<init>", "()V", "a", "b", "c", "LxA0/c$a;", "LxA0/c$b;", "LxA0/c$c;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC49805c {

    /* compiled from: SupportDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/c$a;", "LxA0/c;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.c$a */
    public static final /* data */ class a extends AbstractC49805c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f442286a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1039584060;
        }

        @k
        public final String toString() {
            return "ChatError";
        }
    }

    /* compiled from: SupportDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxA0/c$b;", "LxA0/c;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.c$b */
    public static final /* data */ class b extends AbstractC49805c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f442287a;

        public b(@l DeepLink deepLink) {
            super(null);
            this.f442287a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442287a, ((b) obj).f442287a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f442287a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ChatLoaded(deepLink="), this.f442287a, ')');
        }
    }

    /* compiled from: SupportDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxA0/c$c;", "LxA0/c;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xA0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12851c extends AbstractC49805c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12851c f442288a = new C12851c();

        public C12851c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12851c);
        }

        public final int hashCode() {
            return -1446150466;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    public /* synthetic */ AbstractC49805c(C42822w c42822w) {
        this();
    }

    public AbstractC49805c() {
    }
}
