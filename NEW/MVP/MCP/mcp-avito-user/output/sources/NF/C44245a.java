package nF;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: GeoFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnF/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C44245a extends A0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f414956i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f414957b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f414958c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f414959d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f414960e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f414961f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f414962g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f414963h;

    static {
        h0 h0Var = new h0(C44245a.class, "addressSettingsInProfile", "getAddressSettingsInProfile()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f414956i = new n[]{n0Var.i(h0Var), C0.k(C44245a.class, "v2ModifyAndAddAddressResults", "getV2ModifyAndAddAddressResults()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44245a.class, "updateSuggestionsInLocationPicker", "getUpdateSuggestionsInLocationPicker()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44245a.class, "updateSuggestionsInHistoricalSuggests", "getUpdateSuggestionsInHistoricalSuggests()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44245a.class, "updateSuggestionsInSuggestLocation", "getUpdateSuggestionsInSuggestLocation()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44245a.class, "updateDeliveryLocationSuggestsEndpoint", "getUpdateDeliveryLocationSuggestsEndpoint()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44245a.class, "useRefactoredHistoricalSuggest", "getUseRefactoredHistoricalSuggest()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C44245a() {
        Owners owners = Owners.f210489g0;
        Boolean bool = Boolean.TRUE;
        this.f414957b = A0.u(this, "Switch profile api to enable address settings in profile", "addressSettingsInProfile", bool, true, 0, owners, 40);
        this.f414958c = A0.u(this, "ручки 1/addresses/update и 1/addresses/update возвращают полную информацию про адрес", "v2ModifyAndAddAddressResults", bool, true, 0, owners, 40);
        Boolean bool2 = Boolean.FALSE;
        this.f414959d = A0.u(this, "ручка 1/location/suggest/by_query заменена на 2/location/suggest/by_query и 1/location/coords/by_address", "updateSuggestionsInLocationPicker", bool2, true, 0, owners, 40);
        this.f414960e = A0.u(this, "ручка 1/location/suggest/by_query заменена на 2/location/suggest/by_query и 1/location/coords/by_address", "updateSuggestionsInHistoricalSuggests", bool2, true, 0, owners, 40);
        this.f414961f = A0.u(this, "ручка 1/location/suggest/by_query заменена на 2/location/suggest/by_query и 1/location/coords/by_address", "updateSuggestionsInSuggestLocation", bool2, true, 0, owners, 40);
        this.f414962g = A0.u(this, "ручка 1/location/suggest/by_query заменена на 2/location/suggest/by_query и 1/location/coords/by_address", "updateDeliveryLocationSuggestsEndpoint", bool2, true, 0, owners, 40);
        this.f414963h = A0.u(this, "Использовать обновленный HistoricalSuggest на подаче", "useRefactoredHistoricalSuggest", bool, true, 0, owners, 40);
    }

    @k
    public final DE0.a<Boolean> v() {
        n<Object> nVar = f414956i[6];
        return this.f414963h.a();
    }
}
