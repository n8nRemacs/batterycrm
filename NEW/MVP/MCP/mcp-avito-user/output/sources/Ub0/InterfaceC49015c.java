package ub0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeleteDeviceBottomSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lub0/c;", "", "a", "b", "c", "Lub0/c$a;", "Lub0/c$b;", "Lub0/c$c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49015c {

    /* compiled from: DeleteDeviceBottomSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/c$a;", "Lub0/c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.c$a */
    public static final /* data */ class a implements InterfaceC49015c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeviceListItem f440114a;

        public a(@k DeviceListItem deviceListItem) {
            this.f440114a = deviceListItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f440114a, ((a) obj).f440114a);
        }

        public final int hashCode() {
            return this.f440114a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithSuccess(device=" + this.f440114a + ')';
        }
    }

    /* compiled from: DeleteDeviceBottomSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/c$b;", "Lub0/c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.c$b */
    public static final /* data */ class b implements InterfaceC49015c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<DeviceListItem> f440115a;

        public b(@k List<DeviceListItem> list) {
            this.f440115a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440115a, ((b) obj).f440115a);
        }

        public final int hashCode() {
            return this.f440115a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowDeviceSelectorDialog(devices="), this.f440115a, ')');
        }
    }

    /* compiled from: DeleteDeviceBottomSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/c$c;", "Lub0/c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12723c implements InterfaceC49015c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f440116a;

        public C12723c(@k PrintableText printableText) {
            this.f440116a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12723c) && L.f(this.f440116a, ((C12723c) obj).f440116a);
        }

        public final int hashCode() {
            return this.f440116a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(errorMessage="), this.f440116a, ')');
        }
    }
}
