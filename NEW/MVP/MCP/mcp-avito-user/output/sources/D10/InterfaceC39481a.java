package d10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ImmutableInfoDescriptionAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ld10/a;", "", "a", "b", "Ld10/a$a;", "Ld10/a$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC39481a {

    /* compiled from: ImmutableInfoDescriptionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld10/a$a;", "Ld10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11006a implements InterfaceC39481a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11006a f393614a = new C11006a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11006a);
        }

        public final int hashCode() {
            return -1824273043;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ImmutableInfoDescriptionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld10/a$b;", "Ld10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d10.a$b */
    public static final /* data */ class b implements InterfaceC39481a {

        /* renamed from: a, reason: collision with root package name */
        public final int f393615a;

        public b(int i12) {
            this.f393615a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f393615a == ((b) obj).f393615a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f393615a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectTab(tabIdx="), this.f393615a, ')');
        }
    }
}
