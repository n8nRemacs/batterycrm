package fq;

import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StagesTransitionInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lfq/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lfq/b$a;", "Lfq/b$b;", "Lfq/b$c;", "Lfq/b$d;", "Lfq/b$e;", "Lfq/b$f;", "Lfq/b$g;", "Lfq/b$h;", "Lfq/b$i;", "Lfq/b$j;", "Lfq/b$k;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40464b {

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$a;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$a */
    public static final /* data */ class a implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StagesTransitionResult f396138a;

        public a(@Y61.k StagesTransitionResult stagesTransitionResult) {
            this.f396138a = stagesTransitionResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f396138a, ((a) obj).f396138a);
        }

        public final int hashCode() {
            return this.f396138a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Close(result=" + this.f396138a + ')';
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$b;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11177b implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final org.threeten.bp.e f396139a;

        public C11177b(@l org.threeten.bp.e eVar) {
            this.f396139a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11177b) && L.f(this.f396139a, ((C11177b) obj).f396139a);
        }

        public final int hashCode() {
            org.threeten.bp.e eVar = this.f396139a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowDatePicker(date=" + this.f396139a + ')';
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$c;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$c */
    public static final /* data */ class c implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final org.threeten.bp.g f396140a;

        public c(@l org.threeten.bp.g gVar) {
            this.f396140a = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396140a, ((c) obj).f396140a);
        }

        public final int hashCode() {
            org.threeten.bp.g gVar = this.f396140a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.f(new StringBuilder("ShowTimePicker(time="), this.f396140a, ')');
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$d;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$d */
    public static final /* data */ class d implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f396141a;

        public d(@Y61.k ApiError apiError) {
            this.f396141a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396141a, ((d) obj).f396141a);
        }

        public final int hashCode() {
            return this.f396141a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("SubmitError(error="), this.f396141a, ')');
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/b$e;", "Lfq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$e */
    public static final /* data */ class e implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f396142a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 713802280;
        }

        @Y61.k
        public final String toString() {
            return "SubmitStarted";
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$f;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$f */
    public static final /* data */ class f implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StagesTransitionResult f396143a;

        public f(@Y61.k StagesTransitionResult stagesTransitionResult) {
            this.f396143a = stagesTransitionResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f396143a, ((f) obj).f396143a);
        }

        public final int hashCode() {
            return this.f396143a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SubmitSuccess(result=" + this.f396143a + ')';
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$g;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$g */
    public static final /* data */ class g implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f396144a;

        public g(@Y61.k String str) {
            this.f396144a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f396144a, ((g) obj).f396144a);
        }

        public final int hashCode() {
            return this.f396144a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateCommentValue(value="), this.f396144a, ')');
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$h;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$h */
    public static final /* data */ class h implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final org.threeten.bp.e f396145a;

        public h(@l org.threeten.bp.e eVar) {
            this.f396145a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f396145a, ((h) obj).f396145a);
        }

        public final int hashCode() {
            org.threeten.bp.e eVar = this.f396145a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateDate(date=" + this.f396145a + ')';
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$i;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$i */
    public static final /* data */ class i implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f396146a;

        public i(@Y61.k String str) {
            this.f396146a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            iVar.getClass();
            return L.f(this.f396146a, iVar.f396146a);
        }

        public final int hashCode() {
            return this.f396146a.hashCode() + 2135939059;
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateInputValue(id=itemLink, value="), this.f396146a, ')');
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$j;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$j */
    public static final /* data */ class j implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f396147a;

        public j(@Y61.k String str) {
            this.f396147a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f396147a, ((j) obj).f396147a);
        }

        public final int hashCode() {
            return this.f396147a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateReasonsList(id="), this.f396147a, ')');
        }
    }

    /* compiled from: StagesTransitionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/b$k;", "Lfq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq.b$k */
    public static final /* data */ class k implements InterfaceC40464b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final org.threeten.bp.g f396148a;

        public k(@l org.threeten.bp.g gVar) {
            this.f396148a = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f396148a, ((k) obj).f396148a);
        }

        public final int hashCode() {
            org.threeten.bp.g gVar = this.f396148a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.f(new StringBuilder("UpdateTime(time="), this.f396148a, ')');
        }
    }
}
