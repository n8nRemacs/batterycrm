package sC;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.favorite_comparison.presentation.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteComparisonEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LsC/d;", "", "<init>", "()V", "a", "LsC/d$a;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sC.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC48027d {

    /* compiled from: FavoriteComparisonEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsC/d$a;", "LsC/d;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sC.d$a */
    public static final /* data */ class a extends AbstractC48027d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f437537a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f437538b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a.C4551a f437539c;

        public a(@k String str, @k String str2, @k a.C4551a c4551a) {
            super(null);
            this.f437537a = str;
            this.f437538b = str2;
            this.f437539c = c4551a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437537a, aVar.f437537a) && L.f(this.f437538b, aVar.f437538b) && L.f(this.f437539c, aVar.f437539c);
        }

        public final int hashCode() {
            return this.f437539c.hashCode() + H.d(this.f437537a.hashCode() * 31, 31, this.f437538b);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f437537a + ", actionText=" + this.f437538b + ", action=" + this.f437539c + ')';
        }
    }

    public /* synthetic */ AbstractC48027d(C42822w c42822w) {
        this();
    }

    public AbstractC48027d() {
    }
}
