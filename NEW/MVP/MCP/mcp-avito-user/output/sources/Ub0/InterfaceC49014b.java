package ub0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeleteDeviceBottomSheetInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lub0/b;", "", "a", "b", "c", "d", "e", "Lub0/b$a;", "Lub0/b$b;", "Lub0/b$c;", "Lub0/b$d;", "Lub0/b$e;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49014b {

    /* compiled from: DeleteDeviceBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/b$a;", "Lub0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.b$a */
    public static final /* data */ class a implements InterfaceC49014b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f440109a;

        public a(@k Throwable th2) {
            this.f440109a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f440109a, ((a) obj).f440109a);
        }

        public final int hashCode() {
            return this.f440109a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("DeviceDeletedError(error="), this.f440109a, ')');
        }
    }

    /* compiled from: DeleteDeviceBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/b$b;", "Lub0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12722b implements InterfaceC49014b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeviceListItem f440110a;

        public C12722b(@k DeviceListItem deviceListItem) {
            this.f440110a = deviceListItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12722b) && L.f(this.f440110a, ((C12722b) obj).f440110a);
        }

        public final int hashCode() {
            return this.f440110a.hashCode();
        }

        @k
        public final String toString() {
            return "DeviceDeletedSuccess(device=" + this.f440110a + ')';
        }
    }

    /* compiled from: DeleteDeviceBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/b$c;", "Lub0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.b$c */
    public static final /* data */ class c implements InterfaceC49014b {

        /* renamed from: a, reason: collision with root package name */
        public final int f440111a;

        public c(int i12) {
            this.f440111a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f440111a == ((c) obj).f440111a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440111a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectReplacementDevice(index="), this.f440111a, ')');
        }
    }

    /* compiled from: DeleteDeviceBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/b$d;", "Lub0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.b$d */
    public static final /* data */ class d implements InterfaceC49014b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<DeviceListItem> f440112a;

        public d(@k List<DeviceListItem> list) {
            this.f440112a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f440112a, ((d) obj).f440112a);
        }

        public final int hashCode() {
            return this.f440112a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowReplacementDeviceBottomSheet(devices="), this.f440112a, ')');
        }
    }

    /* compiled from: DeleteDeviceBottomSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lub0/b$e;", "Lub0/b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.b$e */
    public static final /* data */ class e implements InterfaceC49014b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f440113a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1284114898;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }
}
