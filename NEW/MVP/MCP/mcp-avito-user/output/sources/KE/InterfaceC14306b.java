package Ke;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoLoansCabinetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LKe/b;", "", "a", "b", "LKe/b$a;", "LKe/b$b;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ke.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14306b {

    /* compiled from: AutoLoansCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe/b$a;", "LKe/b;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.b$a */
    public static final /* data */ class a implements InterfaceC14306b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9571a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1060254460;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: AutoLoansCabinetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe/b$b;", "LKe/b;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0585b implements InterfaceC14306b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9572a;

        public C0585b(@k DeepLink deepLink) {
            this.f9572a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0585b) && L.f(this.f9572a, ((C0585b) obj).f9572a);
        }

        public final int hashCode() {
            return this.f9572a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f9572a, ')');
        }
    }
}
