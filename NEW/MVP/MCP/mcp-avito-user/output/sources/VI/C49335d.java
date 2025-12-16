package vi;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.UniversalMapSettingsDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: UniversalMapTabContent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvi/d;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;", "", "pointListRequest", "pointInfoRequest", "filtersInfoRequest", "", "", "extraParameters", "screenName", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onOpenEvent", "Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "mapSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/universal_map/UniversalMapSettingsDto;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "g", "Lcom/avito/android/remote/model/ParametrizedEvent;", "d", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "c", "()Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vi.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49335d implements TabsScreenModel.c {

    @com.google.gson.annotations.c("extraParameters")
    @l
    private final Map<String, Object> extraParameters;

    @com.google.gson.annotations.c("filtersInfoRequest")
    @l
    private final String filtersInfoRequest;

    @com.google.gson.annotations.c("mapSettings")
    @l
    private final UniversalMapSettingsDto mapSettings;

    @com.google.gson.annotations.c("onOpenEvent")
    @l
    private final ParametrizedEvent onOpenEvent;

    @com.google.gson.annotations.c("pointInfoRequest")
    @k
    private final String pointInfoRequest;

    @com.google.gson.annotations.c("pointListRequest")
    @k
    private final String pointListRequest;

    @com.google.gson.annotations.c("screenName")
    @l
    private final String screenName;

    /* compiled from: UniversalMapTabContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvi/d$a;", "Lvi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vi.d$a */
    public static final class a implements InterfaceC49334c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440937a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final kotlin.reflect.d<C49335d> f440938b = m0.f406844a.b(C49335d.class);

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f440939c = "universalMap";

        @Override // vi.InterfaceC49334c
        @k
        public final String getType() {
            return f440939c;
        }

        @Override // vi.InterfaceC49334c
        @k
        public final kotlin.reflect.d<C49335d> getValue() {
            return f440938b;
        }
    }

    public C49335d(@k String str, @k String str2, @l String str3, @l Map<String, ? extends Object> map, @l String str4, @l ParametrizedEvent parametrizedEvent, @l UniversalMapSettingsDto universalMapSettingsDto) {
        this.pointListRequest = str;
        this.pointInfoRequest = str2;
        this.filtersInfoRequest = str3;
        this.extraParameters = map;
        this.screenName = str4;
        this.onOpenEvent = parametrizedEvent;
        this.mapSettings = universalMapSettingsDto;
    }

    @l
    public final Map<String, Object> a() {
        return this.extraParameters;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getFiltersInfoRequest() {
        return this.filtersInfoRequest;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalMapSettingsDto getMapSettings() {
        return this.mapSettings;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ParametrizedEvent getOnOpenEvent() {
        return this.onOpenEvent;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getPointInfoRequest() {
        return this.pointInfoRequest;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49335d)) {
            return false;
        }
        C49335d c49335d = (C49335d) obj;
        return L.f(this.pointListRequest, c49335d.pointListRequest) && L.f(this.pointInfoRequest, c49335d.pointInfoRequest) && L.f(this.filtersInfoRequest, c49335d.filtersInfoRequest) && L.f(this.extraParameters, c49335d.extraParameters) && L.f(this.screenName, c49335d.screenName) && L.f(this.onOpenEvent, c49335d.onOpenEvent) && L.f(this.mapSettings, c49335d.mapSettings);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getPointListRequest() {
        return this.pointListRequest;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    public final int hashCode() {
        int iD2 = H.d(this.pointListRequest.hashCode() * 31, 31, this.pointInfoRequest);
        String str = this.filtersInfoRequest;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.extraParameters;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.screenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onOpenEvent;
        int iHashCode4 = (iHashCode3 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        UniversalMapSettingsDto universalMapSettingsDto = this.mapSettings;
        return iHashCode4 + (universalMapSettingsDto != null ? universalMapSettingsDto.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UniversalMapTabContent(pointListRequest=" + this.pointListRequest + ", pointInfoRequest=" + this.pointInfoRequest + ", filtersInfoRequest=" + this.filtersInfoRequest + ", extraParameters=" + this.extraParameters + ", screenName=" + this.screenName + ", onOpenEvent=" + this.onOpenEvent + ", mapSettings=" + this.mapSettings + ')';
    }
}
