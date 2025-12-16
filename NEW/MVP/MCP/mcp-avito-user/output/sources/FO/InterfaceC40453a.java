package fo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryWithParamsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lfo/a;", "", "a", "b", "Lfo/a$a;", "Lfo/a$b;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40453a {

    /* compiled from: CategoryWithParamsAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lfo/a$a;", "Lfo/a;", "a", "b", "Lfo/a$a$a;", "Lfo/a$a$b;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fo.a$a, reason: collision with other inner class name */
    public interface InterfaceC11170a extends InterfaceC40453a {

        /* compiled from: CategoryWithParamsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfo/a$a$a;", "Lfo/a$a;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: fo.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11171a implements InterfaceC11170a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f396075a;

            public C11171a() {
                this(false, 1, null);
            }

            @Override // fo.InterfaceC40453a.InterfaceC11170a
            /* renamed from: a, reason: from getter */
            public final boolean getF396076a() {
                return this.f396075a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11171a) && this.f396075a == ((C11171a) obj).f396075a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f396075a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("OnApplyButtonClicked(applyFilter="), this.f396075a, ')');
            }

            public C11171a(boolean z12, int i12, C42822w c42822w) {
                this.f396075a = (i12 & 1) != 0 ? true : z12;
            }
        }

        /* compiled from: CategoryWithParamsAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfo/a$a$b;", "Lfo/a$a;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: fo.a$a$b */
        public static final /* data */ class b implements InterfaceC11170a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f396076a;

            public b() {
                this(false, 1, null);
            }

            @Override // fo.InterfaceC40453a.InterfaceC11170a
            /* renamed from: a, reason: from getter */
            public final boolean getF396076a() {
                return this.f396076a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f396076a == ((b) obj).f396076a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f396076a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("OnCloseButtonClicked(applyFilter="), this.f396076a, ')');
            }

            public b(boolean z12, int i12, C42822w c42822w) {
                this.f396076a = (i12 & 1) != 0 ? false : z12;
            }
        }

        /* renamed from: a */
        boolean getF396076a();
    }

    /* compiled from: CategoryWithParamsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfo/a$b;", "Lfo/a;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fo.a$b */
    public static final /* data */ class b implements InterfaceC40453a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396077a;

        public b(@k String str) {
            this.f396077a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f396077a, ((b) obj).f396077a);
        }

        public final int hashCode() {
            return this.f396077a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnOptionClicked(id="), this.f396077a, ')');
        }
    }
}
