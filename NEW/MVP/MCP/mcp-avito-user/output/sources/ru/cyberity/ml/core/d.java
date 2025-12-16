package ru.cyberity.ml.core;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuspendableProcessor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0006J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/cyberity/ml/core/d;", "Input", "Output", "", "input", "Lru/cyberity/ml/core/d$a;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface d<Input, Output> {

    /* compiled from: SuspendableProcessor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002:\u0004\u0004\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H&\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/ml/core/d$a;", "Output", "", "", "a", "<init>", "()V", "b", "c", "d", "Lru/cyberity/ml/core/d$a$a;", "Lru/cyberity/ml/core/d$a$b;", "Lru/cyberity/ml/core/d$a$c;", "Lru/cyberity/ml/core/d$a$d;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a<Output> {

        /* compiled from: SuspendableProcessor.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/ml/core/d$a$a;", "Output", "Lru/cyberity/ml/core/d$a;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.ml.core.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12570a<Output> extends a<Output> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @k
            private final Throwable throwable;

            public C12570a(@k Throwable th2) {
                super(null);
                this.throwable = th2;
            }

            @Override // ru.cyberity.ml.core.d.a
            @k
            public String a() {
                return "error";
            }

            @k
            /* renamed from: c, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C12570a) && L.f(this.throwable, ((C12570a) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @k
            public String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.throwable, ')');
            }
        }

        /* compiled from: SuspendableProcessor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lru/cyberity/ml/core/d$a$b;", "Output", "Lru/cyberity/ml/core/d$a;", "", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final class b<Output> extends a<Output> {
            public b() {
                super(null);
            }

            @Override // ru.cyberity.ml.core.d.a
            @k
            public String a() {
                return "skip";
            }
        }

        /* compiled from: SuspendableProcessor.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/ml/core/d$a$c;", "Output", "Lru/cyberity/ml/core/d$a;", "result", "<init>", "(Ljava/lang/Object;)V", "", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class c<Output> extends a<Output> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Output result;

            public c(Output output) {
                super(null);
                this.result = output;
            }

            @Override // ru.cyberity.ml.core.d.a
            @k
            public String a() {
                return "success";
            }

            public final Output c() {
                return this.result;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && L.f(this.result, ((c) other).result);
            }

            public int hashCode() {
                Output output = this.result;
                if (output == null) {
                    return 0;
                }
                return output.hashCode();
            }

            @k
            public String toString() {
                return H.n(new StringBuilder("Success(result="), this.result, ')');
            }
        }

        /* compiled from: SuspendableProcessor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lru/cyberity/ml/core/d$a$d;", "Output", "Lru/cyberity/ml/core/d$a;", "", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.ml.core.d$a$d, reason: collision with other inner class name */
        public static final class C12571d<Output> extends a<Output> {
            public C12571d() {
                super(null);
            }

            @Override // ru.cyberity.ml.core.d.a
            @k
            public String a() {
                return "timeout";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public abstract String a();

        private a() {
        }
    }

    @l
    Object a(Input input, @k Continuation<? super a<Output>> continuation);
}
