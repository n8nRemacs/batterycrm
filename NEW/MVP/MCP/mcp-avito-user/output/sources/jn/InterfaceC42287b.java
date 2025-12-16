package jN;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServicesDialogOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LjN/b;", "", "a", "b", "LjN/b$a;", "LjN/b$b;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC42287b {

    /* compiled from: ImvServicesDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjN/b$a;", "LjN/b;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jN.b$a */
    public static final /* data */ class a implements InterfaceC42287b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=null)";
        }
    }

    /* compiled from: ImvServicesDialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjN/b$b;", "LjN/b;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jN.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11563b implements InterfaceC42287b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f405593a;

        public C11563b(@l String str) {
            this.f405593a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11563b) && L.f(this.f405593a, ((C11563b) obj).f405593a);
        }

        public final int hashCode() {
            String str = this.f405593a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastMessage(message="), this.f405593a, ')');
        }
    }
}
