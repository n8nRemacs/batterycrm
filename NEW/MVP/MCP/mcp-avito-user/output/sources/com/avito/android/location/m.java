package com.avito.android.location;

import android.content.SharedPreferences;
import android.util.SparseArray;
import androidx.collection.C20199a;
import com.avito.android.location.C31498b;
import com.avito.android.location.H;
import com.avito.android.location.u;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SimpleLocation;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PrefSavedLocationStorage.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location/m;", "Lcom/avito/android/location/H;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f181798a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31500d f181799b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f181800c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C20199a<H.b, a> f181801d = new C20199a<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Gson f181802e = new Gson();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<LocationSource> f181803f = C42745f0.U(LocationSource.f181712d, LocationSource.f181711c);

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public a f181804g;

    /* compiled from: PrefSavedLocationStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/m$a;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final H.b f181805a;

        public a(@Y61.k H.b bVar) {
            this.f181805a = bVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(@Y61.k SharedPreferences sharedPreferences, @Y61.l String str) {
            LocationSource locationSource = LocationSource.f181711c;
            if (L.f(str, "location_from_coords") || L.f(str, "location_from_list")) {
                ((u.a) this.f181805a).f181858a.onNext(G0.f406611a);
            }
        }
    }

    /* compiled from: PrefSavedLocationStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181806a;

        static {
            int[] iArr = new int[LocationSource.values().length];
            try {
                LocationSource locationSource = LocationSource.f181711c;
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f181806a = iArr;
        }
    }

    /* compiled from: PrefSavedLocationStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Location f181808m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Location location) {
            super(0);
            this.f181808m = location;
        }

        @Override // Y41.a
        public final G0 invoke() {
            LocationSource locationSource = LocationSource.f181711c;
            m.this.g(this.f181808m, "location_from_list");
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k AK0.l lVar, @Y61.k D d12, @Y61.k InterfaceC31500d interfaceC31500d) {
        this.f181798a = lVar;
        this.f181799b = interfaceC31500d;
        this.f181800c = lVar.getF316a();
        AK0.e.f299a.getClass();
        if (lVar.getInt(AK0.e.f302d, 0) == 2) {
            d12.a();
        }
    }

    @Override // com.avito.android.location.H
    public final void a(@Y61.k Location location, @Y61.l LocationSource locationSource, boolean z12) {
        String str;
        LocationParameter locationParameter = LocationParameter.f181708b;
        this.f181799b.b(z12);
        if ((locationSource == null ? -1 : b.f181806a[locationSource.ordinal()]) != 1) {
            if (locationSource != null) {
                str = locationSource.f181721b;
            } else {
                LocationSource locationSource2 = LocationSource.f181711c;
                str = "location_from_list";
            }
            g(location, str);
            return;
        }
        c cVar = new c(location);
        C20199a<H.b, a> c20199a = this.f181801d;
        a aVar = this.f181804g;
        a aVar2 = c20199a.get(aVar != null ? aVar.f181805a : null);
        SharedPreferences sharedPreferences = this.f181800c;
        if (aVar2 != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(aVar2);
        }
        cVar.invoke();
        sharedPreferences.registerOnSharedPreferenceChangeListener(aVar2);
    }

    @Override // com.avito.android.location.H
    public final void b(@Y61.k H.b bVar) {
        a aVar = new a(bVar);
        this.f181801d.put(bVar, aVar);
        this.f181800c.registerOnSharedPreferenceChangeListener(aVar);
        this.f181804g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8.getCoordinates() != null) goto L17;
     */
    @Override // com.avito.android.location.H
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.location.q c(@Y61.k com.avito.android.location.LocationSource r8, boolean r9) {
        /*
            r7 = this;
            com.avito.android.location.d r0 = r7.f181799b
            java.lang.String r8 = r8.f181721b
            AK0.l r1 = r7.f181798a
            java.lang.String r8 = r1.getString(r8)
            if (r8 == 0) goto L48
            com.google.gson.Gson r2 = r7.f181802e     // Catch: java.lang.Throwable -> L48
            java.lang.Class<com.avito.android.location.b> r3 = com.avito.android.location.C31498b.class
            java.lang.Object r8 = r2.d(r3, r8)     // Catch: java.lang.Throwable -> L48
            com.avito.android.location.b r8 = (com.avito.android.location.C31498b) r8     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto L48
            com.avito.android.remote.model.Location r8 = com.avito.android.location.C31499c.a(r8)     // Catch: java.lang.Throwable -> L48
            com.avito.android.location.LocationParameter r2 = com.avito.android.location.LocationParameter.f181708b     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = r0.a()     // Catch: java.lang.Throwable -> L48
            r3 = 0
            if (r2 == 0) goto L2a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            goto L2b
        L2a:
            r2 = r3
        L2b:
            if (r9 != 0) goto L30
            r0.b(r3)     // Catch: java.lang.Throwable -> L48
        L30:
            java.lang.String r9 = r8.getId()     // Catch: java.lang.Throwable -> L48
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L48
            if (r9 <= 0) goto L3b
            goto L41
        L3b:
            com.avito.android.remote.model.Coordinates r9 = r8.getCoordinates()     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto L48
        L41:
            com.avito.android.location.q r9 = new com.avito.android.location.q     // Catch: java.lang.Throwable -> L48
            r0 = 1
            r9.<init>(r8, r0, r2)     // Catch: java.lang.Throwable -> L48
            return r9
        L48:
            AK0.e r8 = AK0.e.f299a
            r8.getClass()
            java.lang.String r8 = AK0.e.f300b
            java.lang.String r8 = r1.d(r8)
            java.lang.String r9 = ""
            if (r8 != 0) goto L58
            r8 = r9
        L58:
            java.lang.String r0 = AK0.e.f301c
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L61
            goto L62
        L61:
            r9 = r0
        L62:
            com.avito.android.location.q r6 = new com.avito.android.location.q
            com.avito.android.remote.model.Location r1 = com.avito.android.remote.model.LocationKt.createLocation(r8, r9)
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location.m.c(com.avito.android.location.LocationSource, boolean):com.avito.android.location.q");
    }

    @Override // com.avito.android.location.H
    public final void d() {
        SharedPreferences.Editor editorEdit = this.f181800c.edit();
        AK0.e.f299a.getClass();
        editorEdit.remove(AK0.e.f302d);
        Iterator<T> it = this.f181803f.iterator();
        while (it.hasNext()) {
            editorEdit.remove(((LocationSource) it.next()).f181721b);
        }
        editorEdit.apply();
    }

    @Override // com.avito.android.location.H
    public final void e(@Y61.k H.b bVar) {
        a aVar = this.f181801d.get(bVar);
        if (aVar != null) {
            this.f181800c.unregisterOnSharedPreferenceChangeListener(aVar);
        }
    }

    @Override // com.avito.android.location.H
    @Y61.k
    public final HashMap<LocationSource, String> f() {
        String id2;
        HashMap<LocationSource, String> map = new HashMap<>();
        for (LocationSource locationSource : this.f181803f) {
            Location location = c(locationSource, false).f181849a;
            if (location == null || (id2 = location.getId()) == null) {
                id2 = "0";
            }
            map.put(locationSource, id2);
        }
        return map;
    }

    public final void g(Location location, String str) {
        SharedPreferences.Editor editorEdit = this.f181800c.edit();
        AK0.e.f299a.getClass();
        SharedPreferences.Editor editorPutInt = editorEdit.putInt(AK0.e.f302d, 3);
        System.currentTimeMillis();
        String id2 = location.getId();
        SparseArray<String> names = location.getNames().getNames();
        boolean hasMetro = location.getHasMetro();
        boolean hasChildren = location.getHasChildren();
        boolean hasDirections = location.getHasDirections();
        boolean hasDistricts = location.getHasDistricts();
        SimpleLocation parent = location.getParent();
        editorPutInt.putString(str, this.f181802e.l(new C31498b(id2, names, hasMetro, hasChildren, hasDirections, hasDistricts, parent == null ? null : new C31498b.a(parent.getId(), parent.getNames().getNames()), location.getCoordinates(), location.getForcedLocationForRecommendation()))).apply();
    }

    @Override // com.avito.android.location.H
    @Y61.l
    public final q j() {
        return c(LocationSource.f181712d, false);
    }
}
