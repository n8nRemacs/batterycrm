package Wo0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sbc.autodispatches.SbcDispatchEditResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcDispatchEditOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LWo0/c;", "", "a", "b", "c", "d", "LWo0/c$a;", "LWo0/c$b;", "LWo0/c$c;", "LWo0/c$d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15787c {

    /* compiled from: SbcDispatchEditOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWo0/c$a;", "LWo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.c$a */
    public static final /* data */ class a implements InterfaceC15787c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f18056a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1217094332;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: SbcDispatchEditOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWo0/c$b;", "LWo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.c$b */
    public static final /* data */ class b implements InterfaceC15787c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SbcDispatchEditResult f18057a;

        public b(@k SbcDispatchEditResult sbcDispatchEditResult) {
            this.f18057a = sbcDispatchEditResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f18057a == ((b) obj).f18057a;
        }

        public final int hashCode() {
            return this.f18057a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithSuccessResult(result=" + this.f18057a + ')';
        }
    }

    /* compiled from: SbcDispatchEditOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWo0/c$c;", "LWo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1286c implements InterfaceC15787c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f18058a;

        public C1286c(@k ApiError apiError) {
            this.f18058a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1286c) && L.f(this.f18058a, ((C1286c) obj).f18058a);
        }

        public final int hashCode() {
            return this.f18058a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(apiError="), this.f18058a, ')');
        }
    }

    /* compiled from: SbcDispatchEditOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWo0/c$d;", "LWo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.c$d */
    public static final /* data */ class d implements InterfaceC15787c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.sbc_dispatch_edit_failed_general_error);
        }

        @k
        public final String toString() {
            return "ShowErrorMessageRes(messageRes=2131956754)";
        }
    }
}
