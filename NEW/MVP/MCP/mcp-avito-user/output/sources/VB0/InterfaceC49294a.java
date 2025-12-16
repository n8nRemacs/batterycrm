package vb0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: IacEnableBottomSheetAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lvb0/a;", "", "a", "Lvb0/a$a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49294a {

    /* compiled from: IacEnableBottomSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvb0/a$a;", "Lvb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vb0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12782a implements InterfaceC49294a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440870a;

        public C12782a(boolean z12) {
            this.f440870a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12782a) && this.f440870a == ((C12782a) obj).f440870a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440870a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnIacEnabledSwitchStateChanged(iacEnable="), this.f440870a, ')');
        }
    }
}
