package ru.cyberity.cbr.core.common;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;

/* compiled from: FinishReason.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/common/a0;", "", "<init>", "()V", "a", "b", "c", "d", "Lru/cyberity/cbr/core/common/a0$a;", "Lru/cyberity/cbr/core/common/a0$b;", "Lru/cyberity/cbr/core/common/a0$c;", "Lru/cyberity/cbr/core/common/a0$d;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a0 {

    /* compiled from: FinishReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/common/a0$a;", "Lru/cyberity/cbr/core/common/a0;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends a0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f432636a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: FinishReason.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/common/a0$b;", "Lru/cyberity/cbr/core/common/a0;", "", "goToNextDocument", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b extends a0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean goToNextDocument;

        public b() {
            this(false, 1, null);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getGoToNextDocument() {
            return this.goToNextDocument;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.goToNextDocument == ((b) other).goToNextDocument;
        }

        public int hashCode() {
            boolean z12 = this.goToNextDocument;
            if (z12) {
                return 1;
            }
            return z12 ? 1 : 0;
        }

        @Y61.k
        public String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("Completed(goToNextDocument="), this.goToNextDocument, ')');
        }

        public b(boolean z12) {
            super(null);
            this.goToNextDocument = z12;
        }

        public /* synthetic */ b(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12);
        }
    }

    /* compiled from: FinishReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/common/a0$c;", "Lru/cyberity/cbr/core/common/a0;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends a0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f432638a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: FinishReason.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/common/a0$d;", "Lru/cyberity/cbr/core/common/a0;", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRCompletionResult;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "b", "()Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d extends a0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CBRCompletionResult result;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final CBRCompletionResult getResult() {
            return this.result;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && L.f(this.result, ((d) other).result);
        }

        public int hashCode() {
            CBRCompletionResult cBRCompletionResult = this.result;
            if (cBRCompletionResult == null) {
                return 0;
            }
            return cBRCompletionResult.hashCode();
        }

        @Y61.k
        public String toString() {
            return "Terminated(result=" + this.result + ')';
        }

        public d(@Y61.l CBRCompletionResult cBRCompletionResult) {
            super(null);
            this.result = cBRCompletionResult;
        }

        public /* synthetic */ d(CBRCompletionResult cBRCompletionResult, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : cBRCompletionResult);
        }
    }

    public /* synthetic */ a0(C42822w c42822w) {
        this();
    }

    private a0() {
    }
}
