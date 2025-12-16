package lo;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Specific;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileChangeSpecificAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Llo/a;", "", "a", "b", "c", "d", "Llo/a$a;", "Llo/a$b;", "Llo/a$c;", "Llo/a$d;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43808a {

    /* compiled from: ExtendedProfileChangeSpecificAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo/a$a;", "Llo/a;", "<init>", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.a$a, reason: collision with other inner class name */
    public static final class C11802a implements InterfaceC43808a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11802a f414198a = new C11802a();
    }

    /* compiled from: ExtendedProfileChangeSpecificAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo/a$b;", "Llo/a;", "<init>", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.a$b */
    public static final class b implements InterfaceC43808a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414199a = new b();
    }

    /* compiled from: ExtendedProfileChangeSpecificAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo/a$c;", "Llo/a;", "<init>", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.a$c */
    public static final class c implements InterfaceC43808a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414200a = new c();
    }

    /* compiled from: ExtendedProfileChangeSpecificAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llo/a$d;", "Llo/a;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.a$d */
    public static final /* data */ class d implements InterfaceC43808a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Specific f414201a;

        public d(@k Specific specific) {
            this.f414201a = specific;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f414201a, ((d) obj).f414201a);
        }

        public final int hashCode() {
            return this.f414201a.hashCode();
        }

        @k
        public final String toString() {
            return "SpecificClicked(specific=" + this.f414201a + ')';
        }
    }
}
