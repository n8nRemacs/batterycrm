package mC;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: FakeDoorDialogAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LmC/a;", "", "a", "b", "LmC/a$a;", "LmC/a$b;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mC.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC43943a {

    /* compiled from: FakeDoorDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmC/a$a;", "LmC/a;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mC.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11817a implements InterfaceC43943a {

        /* renamed from: a, reason: collision with root package name */
        public final int f414390a;

        public C11817a(int i12) {
            this.f414390a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11817a) && this.f414390a == ((C11817a) obj).f414390a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f414390a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnButtonClicked(buttonIndex="), this.f414390a, ')');
        }
    }

    /* compiled from: FakeDoorDialogAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmC/a$b;", "LmC/a;", "<init>", "()V", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mC.a$b */
    public static final class b implements InterfaceC43943a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414391a = new b();
    }
}
