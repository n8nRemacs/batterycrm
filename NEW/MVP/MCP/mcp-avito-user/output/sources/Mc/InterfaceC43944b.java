package mC;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FakeDoorDialogInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LmC/b;", "", "a", "b", "c", "LmC/b$a;", "LmC/b$b;", "LmC/b$c;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mC.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC43944b {

    /* compiled from: FakeDoorDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmC/b$a;", "LmC/b;", "<init>", "()V", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mC.b$a */
    public static final class a implements InterfaceC43944b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414392a = new a();
    }

    /* compiled from: FakeDoorDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmC/b$b;", "LmC/b;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mC.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11818b implements InterfaceC43944b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f414393a;

        public C11818b(@l DeepLink deepLink) {
            this.f414393a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11818b) && L.f(this.f414393a, ((C11818b) obj).f414393a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f414393a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f414393a, ')');
        }
    }

    /* compiled from: FakeDoorDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmC/b$c;", "LmC/b;", "<init>", "()V", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mC.b$c */
    public static final class c implements InterfaceC43944b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414394a = new c();
    }
}
