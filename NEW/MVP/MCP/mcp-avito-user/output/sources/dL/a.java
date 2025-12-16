package DL;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Navigation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacOptionsResultV2.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0015\u0011\u0013BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"LDL/a;", "", "", "availableTimeFrom", "availableTimeTo", "", "availableTimeDisabled", "", "LDL/a$a;", "sessions", "iacMandatory", "LDL/a$c;", "workSchedule", "iacEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;LDL/a$c;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "LDL/a$c;", "g", "()LDL/a$c;", "d", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("availableTimeDisabled")
    @l
    private final Boolean availableTimeDisabled;

    @com.google.gson.annotations.c("availableTimeFrom")
    @l
    private final String availableTimeFrom;

    @com.google.gson.annotations.c("availableTimeTo")
    @l
    private final String availableTimeTo;

    @com.google.gson.annotations.c("iacEnabled")
    @l
    private final Boolean iacEnabled;

    @com.google.gson.annotations.c("iacMandatory")
    @l
    private final Boolean iacMandatory;

    @com.google.gson.annotations.c("sessions")
    @l
    private final List<C0169a> sessions;

    @com.google.gson.annotations.c("workSchedule")
    @l
    private final c workSchedule;

    /* compiled from: IacOptionsResultV2.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"LDL/a$a;", "", "", "deviceId", "deviceName", "", "iacEnable", "", "itemsCounter", "deviceSlug", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "getIacEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: DL.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0169a {

        @com.google.gson.annotations.c("deviceId")
        @k
        private final String deviceId;

        @com.google.gson.annotations.c("name")
        @k
        private final String deviceName;

        @com.google.gson.annotations.c("deviceSlug")
        @l
        private final String deviceSlug;

        @com.google.gson.annotations.c("iacEnabled")
        @l
        private final Boolean iacEnable;

        @com.google.gson.annotations.c("itemsCounter")
        @l
        private final Integer itemsCounter;

        public C0169a(@k String str, @k String str2, @l Boolean bool, @l Integer num, @l String str3) {
            this.deviceId = str;
            this.deviceName = str2;
            this.iacEnable = bool;
            this.itemsCounter = num;
            this.deviceSlug = str3;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getDeviceName() {
            return this.deviceName;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getDeviceSlug() {
            return this.deviceSlug;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Integer getItemsCounter() {
            return this.itemsCounter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0169a)) {
                return false;
            }
            C0169a c0169a = (C0169a) obj;
            return L.f(this.deviceId, c0169a.deviceId) && L.f(this.deviceName, c0169a.deviceName) && L.f(this.iacEnable, c0169a.iacEnable) && L.f(this.itemsCounter, c0169a.itemsCounter) && L.f(this.deviceSlug, c0169a.deviceSlug);
        }

        public final int hashCode() {
            int iD2 = H.d(this.deviceId.hashCode() * 31, 31, this.deviceName);
            Boolean bool = this.iacEnable;
            int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.itemsCounter;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.deviceSlug;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IacSession(deviceId=");
            sb2.append(this.deviceId);
            sb2.append(", deviceName=");
            sb2.append(this.deviceName);
            sb2.append(", iacEnable=");
            sb2.append(this.iacEnable);
            sb2.append(", itemsCounter=");
            sb2.append(this.itemsCounter);
            sb2.append(", deviceSlug=");
            return C22026a.c(sb2, this.deviceSlug, ')');
        }
    }

    /* compiled from: IacOptionsResultV2.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LDL/a$b;", "", "", "label", "value", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        @com.google.gson.annotations.c("description")
        @l
        private final String description;

        @com.google.gson.annotations.c("label")
        @k
        private final String label;

        @com.google.gson.annotations.c("value")
        @k
        private final String value;

        public b(@k String str, @k String str2, @l String str3) {
            this.label = str;
            this.value = str2;
            this.description = str3;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.label, bVar.label) && L.f(this.value, bVar.value) && L.f(this.description, bVar.description);
        }

        public final int hashCode() {
            int iD2 = H.d(this.label.hashCode() * 31, 31, this.value);
            String str = this.description;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScheduleConfig(label=");
            sb2.append(this.label);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", description=");
            return C22026a.c(sb2, this.description, ')');
        }
    }

    /* compiled from: IacOptionsResultV2.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDL/a$c;", "", "", "LDL/a$b;", Navigation.CONFIG, "", "value", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        @com.google.gson.annotations.c(Navigation.CONFIG)
        @k
        private final List<b> config;

        @com.google.gson.annotations.c("value")
        @k
        private final String value;

        public c(@k List<b> list, @k String str) {
            this.config = list;
            this.value = str;
        }

        @k
        public final List<b> a() {
            return this.config;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.config, cVar.config) && L.f(this.value, cVar.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.config.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WorkSchedule(config=");
            sb2.append(this.config);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }
    }

    public a(@l String str, @l String str2, @l Boolean bool, @l List<C0169a> list, @l Boolean bool2, @l c cVar, @l Boolean bool3) {
        this.availableTimeFrom = str;
        this.availableTimeTo = str2;
        this.availableTimeDisabled = bool;
        this.sessions = list;
        this.iacMandatory = bool2;
        this.workSchedule = cVar;
        this.iacEnabled = bool3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getAvailableTimeDisabled() {
        return this.availableTimeDisabled;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getAvailableTimeFrom() {
        return this.availableTimeFrom;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAvailableTimeTo() {
        return this.availableTimeTo;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getIacEnabled() {
        return this.iacEnabled;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIacMandatory() {
        return this.iacMandatory;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.availableTimeFrom, aVar.availableTimeFrom) && L.f(this.availableTimeTo, aVar.availableTimeTo) && L.f(this.availableTimeDisabled, aVar.availableTimeDisabled) && L.f(this.sessions, aVar.sessions) && L.f(this.iacMandatory, aVar.iacMandatory) && L.f(this.workSchedule, aVar.workSchedule) && L.f(this.iacEnabled, aVar.iacEnabled);
    }

    @l
    public final List<C0169a> f() {
        return this.sessions;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final c getWorkSchedule() {
        return this.workSchedule;
    }

    public final int hashCode() {
        String str = this.availableTimeFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.availableTimeTo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.availableTimeDisabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<C0169a> list = this.sessions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.iacMandatory;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        c cVar = this.workSchedule;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Boolean bool3 = this.iacEnabled;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacOptionsResultV2(availableTimeFrom=");
        sb2.append(this.availableTimeFrom);
        sb2.append(", availableTimeTo=");
        sb2.append(this.availableTimeTo);
        sb2.append(", availableTimeDisabled=");
        sb2.append(this.availableTimeDisabled);
        sb2.append(", sessions=");
        sb2.append(this.sessions);
        sb2.append(", iacMandatory=");
        sb2.append(this.iacMandatory);
        sb2.append(", workSchedule=");
        sb2.append(this.workSchedule);
        sb2.append(", iacEnabled=");
        return C0.g(sb2, this.iacEnabled, ')');
    }
}
