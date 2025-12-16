package Iw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationGroupOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIw/b;", "", "a", "b", "LIw/b$a;", "LIw/b$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iw.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC14164b {

    /* compiled from: LocationGroupOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/b$a;", "LIw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.b$a */
    public static final /* data */ class a implements InterfaceC14164b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f8618a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -226970455;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: LocationGroupOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIw/b$b;", "LIw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0494b implements InterfaceC14164b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f8619a;

        public C0494b(@k SearchParams searchParams) {
            this.f8619a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0494b) && L.f(this.f8619a, ((C0494b) obj).f8619a);
        }

        public final int hashCode() {
            return this.f8619a.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("SendScreenResult(searchParams="), this.f8619a, ')');
        }
    }
}
