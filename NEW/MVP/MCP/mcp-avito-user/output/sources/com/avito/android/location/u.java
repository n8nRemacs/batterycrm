package com.avito.android.location;

import com.avito.android.I1;
import com.avito.android.location.H;
import com.avito.android.location.u;
import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nW.InterfaceC44343a;

/* compiled from: SavedLocationInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location/u;", "Lcom/avito/android/location/r;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f181855a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.B f181856b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44343a f181857c;

    /* compiled from: SavedLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/u$a;", "Lcom/avito/android/location/H$b;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements H.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.B f181858a;

        public a(@Y61.k io.reactivex.rxjava3.core.B b12) {
            this.f181858a = b12;
        }
    }

    /* compiled from: SavedLocationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181859a;

        static {
            int[] iArr = new int[LocationSource.values().length];
            try {
                LocationSource locationSource = LocationSource.f181711c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LocationSource locationSource2 = LocationSource.f181711c;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LocationSource locationSource3 = LocationSource.f181711c;
                iArr[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f181859a = iArr;
        }
    }

    @Inject
    public u(@Y61.k H h12, @Y61.k com.avito.android.geo_common.interactor.B b12, @Y61.k I1 i12, @Y61.k InterfaceC44343a interfaceC44343a) {
        this.f181855a = h12;
        this.f181856b = b12;
        this.f181857c = interfaceC44343a;
    }

    @Override // com.avito.android.location.r
    public final void a(@Y61.l Location location, @Y61.l LocationSource locationSource, boolean z12) {
        H h12 = this.f181855a;
        if (location == null || (location.getId().length() <= 0 && location.getCoordinates() == null)) {
            h12.d();
            return;
        }
        int i12 = locationSource == null ? -1 : b.f181859a[locationSource.ordinal()];
        InterfaceC44343a interfaceC44343a = this.f181857c;
        if (i12 == 1) {
            interfaceC44343a.a(location, locationSource.f181721b);
            return;
        }
        if (i12 == 2) {
            interfaceC44343a.a(location, locationSource.f181721b);
        } else if (i12 != 3) {
            h12.a(location, locationSource, z12);
        } else {
            interfaceC44343a.a(location, locationSource.f181721b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    @Override // com.avito.android.location.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(@Y61.k java.lang.String r8) {
        /*
            r7 = this;
            com.avito.android.location.LocationSource r0 = com.avito.android.location.LocationSource.f181711c
            java.lang.String r0 = "location_for_search"
            java.lang.String r1 = r7.g(r0)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L31
            java.lang.String r5 = "location_from_filters"
            java.lang.String r5 = r7.g(r5)
            if (r5 == 0) goto L29
            boolean r6 = r8.equals(r1)
            if (r6 != 0) goto L23
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L23
            r1 = r3
            goto L24
        L23:
            r1 = r4
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L31
            boolean r1 = r1.booleanValue()
            goto L32
        L31:
            r1 = r4
        L32:
            if (r1 != 0) goto L61
            java.lang.String r0 = r7.g(r0)
            if (r0 == 0) goto L5c
            java.lang.String r1 = "location_from_filters_with_renaming"
            java.lang.String r1 = r7.g(r1)
            if (r1 == 0) goto L55
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L50
            boolean r8 = r0.equals(r1)
            if (r8 == 0) goto L50
            r8 = r3
            goto L51
        L50:
            r8 = r4
        L51:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
        L55:
            if (r2 == 0) goto L5c
            boolean r8 = r2.booleanValue()
            goto L5d
        L5c:
            r8 = r4
        L5d:
            if (r8 == 0) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location.u.b(java.lang.String):boolean");
    }

    @Override // com.avito.android.location.r
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C c() {
        return new io.reactivex.rxjava3.internal.operators.observable.C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.location.s
            @Override // io.reactivex.rxjava3.core.C
            public final void f(io.reactivex.rxjava3.core.B b12) {
                final u.a aVar = new u.a(b12);
                final u uVar = this.f181852b;
                uVar.f181855a.b(aVar);
                b12.f(new l41.f() { // from class: com.avito.android.location.t
                    @Override // l41.f
                    public final void cancel() {
                        uVar.f181855a.e(aVar);
                    }
                });
            }
        });
    }

    @Override // com.avito.android.location.r
    @Y61.k
    public final B0 d() {
        return h(false).d0(new z(this));
    }

    @Override // com.avito.android.location.r
    @Y61.k
    public final B0 e(boolean z12, boolean z13) {
        return h(z12).d0(new y(z13));
    }

    @Override // com.avito.android.location.r
    @Y61.l
    public final Location f() {
        LocationSource locationSource = LocationSource.f181711c;
        Location locationB = this.f181857c.b("location_from_filters");
        if (locationB != null) {
            return locationB;
        }
        return this.f181855a.c(LocationSource.f181712d, false).f181849a;
    }

    public final String g(String str) {
        Location locationB = this.f181857c.b(str);
        if (locationB != null) {
            return locationB.getId();
        }
        return null;
    }

    public final B0 h(boolean z12) {
        q qVarC;
        LocationSource locationSource = LocationSource.f181711c;
        Location locationB = this.f181857c.b("location_from_filters");
        if (locationB != null) {
            qVarC = new q(locationB, true, true);
        } else {
            qVarC = this.f181855a.c(LocationSource.f181712d, z12);
        }
        return io.reactivex.rxjava3.core.z.c0(qVarC).d0(x.f181860b);
    }
}
