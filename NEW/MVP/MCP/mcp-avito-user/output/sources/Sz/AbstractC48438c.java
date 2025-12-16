package sz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SendReportAction.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lsz/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lsz/c$a;", "Lsz/c$b;", "Lsz/c$c;", "Lsz/c$d;", "Lsz/c$e;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC48438c {

    /* compiled from: SendReportAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsz/c$a;", "Lsz/c;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz.c$a */
    public static final /* data */ class a extends AbstractC48438c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f438943a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1862389701;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SendReportAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz/c$b;", "Lsz/c;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz.c$b */
    public static final /* data */ class b extends AbstractC48438c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f438944a;

        public b(@k DeepLink deepLink) {
            super(null);
            this.f438944a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f438944a, ((b) obj).f438944a);
        }

        public final int hashCode() {
            return this.f438944a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenPrivacyPolicy(deepLink="), this.f438944a, ')');
        }
    }

    /* compiled from: SendReportAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsz/c$c;", "Lsz/c;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12653c extends AbstractC48438c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12653c f438945a = new C12653c();

        public C12653c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12653c);
        }

        public final int hashCode() {
            return -274501329;
        }

        @k
        public final String toString() {
            return "SendReport";
        }
    }

    /* compiled from: SendReportAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz/c$d;", "Lsz/c;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz.c$d */
    public static final /* data */ class d extends AbstractC48438c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f438946a;

        public d(@k String str) {
            super(null);
            this.f438946a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f438946a, ((d) obj).f438946a);
        }

        public final int hashCode() {
            return this.f438946a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextWithDescriptionChanged(text="), this.f438946a, ')');
        }
    }

    /* compiled from: SendReportAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz/c$e;", "Lsz/c;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz.c$e */
    public static final /* data */ class e extends AbstractC48438c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f438947a;

        public e(@k String str) {
            super(null);
            this.f438947a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f438947a, ((e) obj).f438947a);
        }

        public final int hashCode() {
            return this.f438947a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextWithPhoneNumberChanged(text="), this.f438947a, ')');
        }
    }

    public /* synthetic */ AbstractC48438c(C42822w c42822w) {
        this();
    }

    public AbstractC48438c() {
    }
}
