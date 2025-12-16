package mO;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IntermediaryVerificationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LmO/a;", "", "a", "b", "c", "d", "LmO/a$a;", "LmO/a$b;", "LmO/a$c;", "LmO/a$d;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC43987a {

    /* compiled from: IntermediaryVerificationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmO/a$a;", "LmO/a;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mO.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11827a implements InterfaceC43987a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11827a f414485a = new C11827a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11827a);
        }

        public final int hashCode() {
            return -778683776;
        }

        @k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: IntermediaryVerificationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmO/a$b;", "LmO/a;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mO.a$b */
    public static final /* data */ class b implements InterfaceC43987a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414486a;

        public b(@k DeepLink deepLink) {
            this.f414486a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f414486a, ((b) obj).f414486a);
        }

        public final int hashCode() {
            return this.f414486a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f414486a, ')');
        }
    }

    /* compiled from: IntermediaryVerificationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmO/a$c;", "LmO/a;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mO.a$c */
    public static final /* data */ class c implements InterfaceC43987a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414487a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1680102946;
        }

        @k
        public final String toString() {
            return "LeavePublish";
        }
    }

    /* compiled from: IntermediaryVerificationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmO/a$d;", "LmO/a;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mO.a$d */
    public static final /* data */ class d implements InterfaceC43987a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f414488a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1555587717;
        }

        @k
        public final String toString() {
            return "LeaveWithVerificationUpdate";
        }
    }
}
