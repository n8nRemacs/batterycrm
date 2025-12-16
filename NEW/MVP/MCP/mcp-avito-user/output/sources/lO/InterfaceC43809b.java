package lo;

import Y61.k;
import Y61.l;
import com.avito.android.change_specific.ExtendedProfileChangeSpecificResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileChangeSpecificOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Llo/b;", "", "a", "b", "Llo/b$a;", "Llo/b$b;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43809b {

    /* compiled from: ExtendedProfileChangeSpecificOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llo/b$a;", "Llo/b;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.b$a */
    public static final /* data */ class a implements InterfaceC43809b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f414202a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ExtendedProfileChangeSpecificResult f414203b;

        public a(boolean z12, @l ExtendedProfileChangeSpecificResult extendedProfileChangeSpecificResult) {
            this.f414202a = z12;
            this.f414203b = extendedProfileChangeSpecificResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f414202a == aVar.f414202a && L.f(this.f414203b, aVar.f414203b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f414202a) * 31;
            ExtendedProfileChangeSpecificResult extendedProfileChangeSpecificResult = this.f414203b;
            return iHashCode + (extendedProfileChangeSpecificResult == null ? 0 : extendedProfileChangeSpecificResult.hashCode());
        }

        @k
        public final String toString() {
            return "CloseScreen(resultOk=" + this.f414202a + ", result=" + this.f414203b + ')';
        }

        public /* synthetic */ a(boolean z12, ExtendedProfileChangeSpecificResult extendedProfileChangeSpecificResult, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, extendedProfileChangeSpecificResult);
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llo/b$b;", "Llo/b;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lo.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11803b implements InterfaceC43809b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f414204a;

        public C11803b(@k Throwable th2) {
            this.f414204a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11803b) && L.f(this.f414204a, ((C11803b) obj).f414204a);
        }

        public final int hashCode() {
            return this.f414204a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f414204a, ')');
        }
    }
}
