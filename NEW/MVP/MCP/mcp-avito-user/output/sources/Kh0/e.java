package Kh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: RatingCounterTextWatcher.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LKh0/e;", "", "a", "b", "c", "LKh0/e$a;", "LKh0/e$b;", "LKh0/e$c;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: RatingCounterTextWatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh0/e$a;", "LKh0/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final int f9624a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9625b;

        public a(int i12, int i13) {
            this.f9624a = i12;
            this.f9625b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9624a == aVar.f9624a && this.f9625b == aVar.f9625b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9625b) + (Integer.hashCode(this.f9624a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FailedInputData(currentCount=");
            sb2.append(this.f9624a);
            sb2.append(", targetCount=");
            return r.t(sb2, this.f9625b, ')');
        }
    }

    /* compiled from: RatingCounterTextWatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh0/e$b;", "LKh0/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final int f9626a;

        public b(int i12) {
            this.f9626a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f9626a == ((b) obj).f9626a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9626a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("NoInputData(targetCount="), this.f9626a, ')');
        }
    }

    /* compiled from: RatingCounterTextWatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh0/e$c;", "LKh0/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final int f9627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9628b;

        public c(int i12, int i13) {
            this.f9627a = i12;
            this.f9628b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f9627a == cVar.f9627a && this.f9628b == cVar.f9628b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9628b) + (Integer.hashCode(this.f9627a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuccessInputData(currentCount=");
            sb2.append(this.f9627a);
            sb2.append(", targetCount=");
            return r.t(sb2, this.f9628b, ')');
        }
    }
}
