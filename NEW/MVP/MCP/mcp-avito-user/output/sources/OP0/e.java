package op0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipLoadingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lop0/e;", "", "a", "b", "c", "Lop0/e$a;", "Lop0/e$b;", "Lop0/e$c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e {

    /* compiled from: BbipLoadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/e$a;", "Lop0/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d f420205a;

        public a(@k d dVar) {
            this.f420205a = dVar;
        }
    }

    /* compiled from: BbipLoadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/e$b;", "Lop0/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f420206a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f420207b;

        public b() {
            this(false, null, 3, null);
        }

        public b(boolean z12, Integer num, int i12, C42822w c42822w) {
            z12 = (i12 & 1) != 0 ? false : z12;
            num = (i12 & 2) != 0 ? null : num;
            this.f420206a = z12;
            this.f420207b = num;
        }
    }

    /* compiled from: BbipLoadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/e$c;", "Lop0/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h f420208a;

        public c(@k h hVar) {
            this.f420208a = hVar;
        }
    }
}
