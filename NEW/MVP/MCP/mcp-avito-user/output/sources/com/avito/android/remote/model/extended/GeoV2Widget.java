package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoWidgets.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoV2Widget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/GeoV2Widget$Config;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/GeoV2Widget$Config;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/GeoV2Widget$Config;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Address", "Config", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoV2Widget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: GeoWidgets.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoV2Widget$Address;", "", "addressName", "", AddressParameter.TYPE, "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAddressName", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Address {

        @c(AddressParameter.TYPE)
        @l
        private final String address;

        @c("addressName")
        @l
        private final String addressName;

        public Address(@l String str, @l String str2) {
            this.addressName = str;
            this.address = str2;
        }

        public static /* synthetic */ Address copy$default(Address address, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = address.addressName;
            }
            if ((i12 & 2) != 0) {
                str2 = address.address;
            }
            return address.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getAddressName() {
            return this.addressName;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @k
        public final Address copy(@l String addressName, @l String address) {
            return new Address(addressName, address);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return L.f(this.addressName, address.addressName) && L.f(this.address, address.address);
        }

        @l
        public final String getAddress() {
            return this.address;
        }

        @l
        public final String getAddressName() {
            return this.addressName;
        }

        public int hashCode() {
            String str = this.addressName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.address;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Address(addressName=");
            sb2.append(this.addressName);
            sb2.append(", address=");
            return C22026a.c(sb2, this.address, ')');
        }
    }

    /* compiled from: GeoWidgets.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoV2Widget$Config;", "", "actionButton", "Lcom/avito/android/remote/model/DeeplinkAction;", "title", "", "subtitle", "addresses", "", "Lcom/avito/android/remote/model/extended/GeoV2Widget$Address;", "(Lcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActionButton", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getAddresses", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("actionButton")
        @l
        private final DeeplinkAction actionButton;

        @c("addresses")
        @l
        private final List<Address> addresses;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        public Config(@l DeeplinkAction deeplinkAction, @l String str, @l String str2, @l List<Address> list) {
            this.actionButton = deeplinkAction;
            this.title = str;
            this.subtitle = str2;
            this.addresses = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, DeeplinkAction deeplinkAction, String str, String str2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deeplinkAction = config.actionButton;
            }
            if ((i12 & 2) != 0) {
                str = config.title;
            }
            if ((i12 & 4) != 0) {
                str2 = config.subtitle;
            }
            if ((i12 & 8) != 0) {
                list = config.addresses;
            }
            return config.copy(deeplinkAction, str, str2, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeeplinkAction getActionButton() {
            return this.actionButton;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final List<Address> component4() {
            return this.addresses;
        }

        @k
        public final Config copy(@l DeeplinkAction actionButton, @l String title, @l String subtitle, @l List<Address> addresses) {
            return new Config(actionButton, title, subtitle, addresses);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.actionButton, config.actionButton) && L.f(this.title, config.title) && L.f(this.subtitle, config.subtitle) && L.f(this.addresses, config.addresses);
        }

        @l
        public final DeeplinkAction getActionButton() {
            return this.actionButton;
        }

        @l
        public final List<Address> getAddresses() {
            return this.addresses;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            DeeplinkAction deeplinkAction = this.actionButton;
            int iHashCode = (deeplinkAction == null ? 0 : deeplinkAction.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Address> list = this.addresses;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(actionButton=");
            sb2.append(this.actionButton);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", addresses=");
            return H.p(sb2, this.addresses, ')');
        }
    }

    public GeoV2Widget(@k Config config, @l String str) {
        this.config = config;
        this.widgetName = str;
    }

    public static /* synthetic */ GeoV2Widget copy$default(GeoV2Widget geoV2Widget, Config config, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = geoV2Widget.config;
        }
        if ((i12 & 2) != 0) {
            str = geoV2Widget.widgetName;
        }
        return geoV2Widget.copy(config, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final GeoV2Widget copy(@k Config config, @l String widgetName) {
        return new GeoV2Widget(config, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoV2Widget)) {
            return false;
        }
        GeoV2Widget geoV2Widget = (GeoV2Widget) other;
        return L.f(this.config, geoV2Widget.config) && L.f(this.widgetName, geoV2Widget.widgetName);
    }

    @k
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        String str = this.widgetName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeoV2Widget(config=");
        sb2.append(this.config);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
