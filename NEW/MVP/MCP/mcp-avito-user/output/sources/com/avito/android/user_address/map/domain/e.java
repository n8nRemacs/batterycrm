package com.avito.android.user_address.map.domain;

import com.avito.android.user_address.model.ValidateByCoordsResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressMapInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/domain/e;", "Lcom/avito/android/user_address/map/domain/d;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<TG0.a> f307587a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<VG0.a> f307588b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.a f307589c;

    /* compiled from: UserAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/avito/android/user_address/map/domain/e$a;", "", "<init>", "()V", "", "ADDRESS_ID", "Ljava/lang/String;", "ADDRESS_TEXT_KEY", "COORDINATE", "DETAILS_APT_KET", "DETAILS_COMMENT_KET", "DETAILS_ENTRANCE_KET", "DETAILS_FLOOR_KET", "GEOPOINT_LAT_KEY", "GEOPOINT_LNG_KEY", "GEO_SESSION_ID", "LATITUDE", "LONGITUDE", "REAL_ESTATE_KEY", "TITLE_KEY", "TYPE_KEY", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k h31.e<TG0.a> eVar, @Y61.k h31.e<VG0.a> eVar2, @Y61.k com.avito.android.user_address.a aVar) {
        this.f307587a = eVar;
        this.f307588b = eVar2;
        this.f307589c = aVar;
    }

    public static UserAddressMultiGeoData k(aH0.k kVar) throws Exception {
        String address;
        String house;
        aH0.i coordinate;
        aH0.i coordinate2;
        aH0.j displayAddress;
        String locality;
        aH0.j displayAddress2;
        String jwt = kVar.getJwt();
        aH0.h address2 = kVar.getAddress();
        if (address2 == null || (address = address2.getAddress()) == null) {
            throw new Exception(aH0.k.class + " toData: address.");
        }
        aH0.h address3 = kVar.getAddress();
        Integer addressId = address3 != null ? address3.getAddressId() : null;
        aH0.h address4 = kVar.getAddress();
        Integer locationId = address4 != null ? address4.getLocationId() : null;
        aH0.h address5 = kVar.getAddress();
        String str = "";
        if (address5 == null || (displayAddress2 = address5.getDisplayAddress()) == null || (house = displayAddress2.getHouse()) == null) {
            house = "";
        }
        aH0.h address6 = kVar.getAddress();
        if (address6 != null && (displayAddress = address6.getDisplayAddress()) != null && (locality = displayAddress.getLocality()) != null) {
            str = locality;
        }
        ValidateByCoordsResult.Address address7 = new ValidateByCoordsResult.Address(house, str);
        aH0.h address8 = kVar.getAddress();
        if (address8 == null || (coordinate = address8.getCoordinate()) == null) {
            throw new Exception(aH0.k.class + " toData: longitude.");
        }
        double longitude = coordinate.getLongitude();
        aH0.h address9 = kVar.getAddress();
        if (address9 != null && (coordinate2 = address9.getCoordinate()) != null) {
            return new UserAddressMultiGeoData(jwt, address, addressId, locationId, address7, longitude, coordinate2.getLatitude(), kVar.getError());
        }
        throw new Exception(aH0.k.class + " toData: latitude");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.user_address.map.domain.j
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.user_address.map.domain.j r0 = (com.avito.android.user_address.map.domain.j) r0
            int r1 = r0.f307603s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307603s = r1
            goto L18
        L13:
            com.avito.android.user_address.map.domain.j r0 = new com.avito.android.user_address.map.domain.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f307601q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f307603s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            TG0.a r6 = r4.j()
            com.avito.android.user_address.a r2 = r4.f307589c
            java.lang.String r2 = r2.getF307189a()
            r0.f307603s = r3
            java.lang.Object r6 = r6.r(r5, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L56
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            aH0.c r5 = (aH0.c) r5
            return r5
        L56:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L69
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L69:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r8, @Y61.k java.lang.String r9, int r10, double r11, double r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            boolean r0 = r15 instanceof com.avito.android.user_address.map.domain.l
            if (r0 == 0) goto L14
            r0 = r15
            com.avito.android.user_address.map.domain.l r0 = (com.avito.android.user_address.map.domain.l) r0
            int r1 = r0.f307611t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f307611t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.user_address.map.domain.l r0 = new com.avito.android.user_address.map.domain.l
            r0.<init>(r7, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f307609r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f307611t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.user_address.map.domain.e r8 = r6.f307608q
            kotlin.C42729a0.b(r15)
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r15)
            TG0.a r1 = r7.j()
            com.avito.android.util.A4 r15 = com.avito.android.util.A4.f318516a
            java.lang.Double r11 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r11)
            kotlin.Q r12 = new kotlin.Q
            java.lang.String r3 = "longitude"
            r12.<init>(r3, r11)
            java.lang.Double r11 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r13)
            kotlin.Q r13 = new kotlin.Q
            java.lang.String r14 = "latitude"
            r13.<init>(r14, r11)
            kotlin.Q[] r11 = new kotlin.Q[]{r12, r13}
            java.util.Map r11 = kotlin.collections.P0.g(r11)
            r15.getClass()
            java.lang.String r12 = "coordinate"
            java.util.Map r5 = com.avito.android.util.A4.h(r11, r12)
            r6.f307608q = r7
            r6.f307611t = r2
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r15 = r1.s(r2, r3, r4, r5, r6)
            if (r15 != r0) goto L73
            return r0
        L73:
            r8 = r7
        L74:
            com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
            boolean r9 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L8a
            com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
            java.lang.Object r9 = r15.getResult()
            aH0.k r9 = (aH0.k) r9
            r8.getClass()
            com.avito.android.user_address.map.domain.UserAddressMultiGeoData r8 = k(r9)
            return r8
        L8a:
            boolean r8 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L9d
            com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
            com.avito.android.remote.error.ApiError r8 = r15.getError()
            java.lang.Throwable r9 = r15.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        L9d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.b(java.lang.String, java.lang.String, int, double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k com.avito.android.user_address.map.domain.a r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.c(com.avito.android.user_address.map.domain.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(double r9, double r11, long r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws com.avito.android.util.ApiException {
        /*
            r8 = this;
            boolean r0 = r15 instanceof com.avito.android.user_address.map.domain.o
            if (r0 == 0) goto L14
            r0 = r15
            com.avito.android.user_address.map.domain.o r0 = (com.avito.android.user_address.map.domain.o) r0
            int r1 = r0.f307620s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f307620s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.android.user_address.map.domain.o r0 = new com.avito.android.user_address.map.domain.o
            r0.<init>(r8, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r7.f307618q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f307620s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r15)
            goto L4e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.C42729a0.b(r15)
            h31.e<VG0.a> r15 = r8.f307588b
            java.lang.Object r15 = r15.get()
            r1 = r15
            VG0.a r1 = (VG0.a) r1
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            r7.f307620s = r2
            r2 = r9
            r4 = r11
            java.lang.Object r15 = r1.a(r2, r4, r6, r7)
            if (r15 != r0) goto L4e
            return r0
        L4e:
            com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
            boolean r9 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L5d
            com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
            java.lang.Object r9 = r15.getResult()
            WG0.a r9 = (WG0.a) r9
            return r9
        L5d:
            boolean r9 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L70
            com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
            com.avito.android.remote.error.ApiError r9 = r15.getError()
            java.lang.Throwable r10 = r15.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r9, r10)
            throw r9
        L70:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.d(double, double, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.avito.android.util.ApiException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.user_address.map.domain.h
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.user_address.map.domain.h r0 = (com.avito.android.user_address.map.domain.h) r0
            int r1 = r0.f307597s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307597s = r1
            goto L18
        L13:
            com.avito.android.user_address.map.domain.h r0 = new com.avito.android.user_address.map.domain.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f307595q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f307597s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L5e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C42729a0.b(r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r2 = "addressId"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7.put(r2, r6)
            com.avito.android.user_address.a r6 = r5.f307589c
            java.lang.String r2 = r6.getF307189a()
            java.lang.String r4 = "geoSessionId"
            r7.put(r4, r2)
            TG0.a r2 = r5.j()
            java.lang.String r6 = r6.getF307189a()
            r0.f307597s = r3
            java.lang.Object r7 = r2.q(r6, r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L6d
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            aH0.e r6 = (aH0.e) r6
            return r6
        L6d:
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto L80
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r6 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r6, r7)
            throw r6
        L80:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.e(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k com.avito.android.user_address.map.domain.c r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.f(com.avito.android.user_address.map.domain.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(double r8, double r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.user_address.map.domain.i
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.user_address.map.domain.i r0 = (com.avito.android.user_address.map.domain.i) r0
            int r1 = r0.f307600s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f307600s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.user_address.map.domain.i r0 = new com.avito.android.user_address.map.domain.i
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f307598q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f307600s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r12)
            goto L45
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.C42729a0.b(r12)
            TG0.a r1 = r7.j()
            r6.f307600s = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.o(r2, r4, r6)
            if (r12 != r0) goto L45
            return r0
        L45:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto L54
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r8 = r12.getResult()
            com.avito.android.user_address.model.ValidateByCoordsResult r8 = (com.avito.android.user_address.model.ValidateByCoordsResult) r8
            return r8
        L54:
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L67
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r8 = r12.getError()
            java.lang.Throwable r9 = r12.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        L67:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.g(double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@Y61.k java.lang.String r6, @Y61.k java.lang.String r7, double r8, double r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws com.avito.android.util.ApiException {
        /*
            r5 = this;
            boolean r0 = r12 instanceof com.avito.android.user_address.map.domain.k
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.user_address.map.domain.k r0 = (com.avito.android.user_address.map.domain.k) r0
            int r1 = r0.f307607t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307607t = r1
            goto L18
        L13:
            com.avito.android.user_address.map.domain.k r0 = new com.avito.android.user_address.map.domain.k
            r0.<init>(r5, r12)
        L18:
            java.lang.Object r12 = r0.f307605r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f307607t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.user_address.map.domain.e r6 = r0.f307604q
            kotlin.C42729a0.b(r12)
            goto L6f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C42729a0.b(r12)
            TG0.a r12 = r5.j()
            com.avito.android.util.A4 r2 = com.avito.android.util.A4.f318516a
            java.lang.Double r8 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r8)
            kotlin.Q r9 = new kotlin.Q
            java.lang.String r4 = "longitude"
            r9.<init>(r4, r8)
            java.lang.Double r8 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r10)
            kotlin.Q r10 = new kotlin.Q
            java.lang.String r11 = "latitude"
            r10.<init>(r11, r8)
            kotlin.Q[] r8 = new kotlin.Q[]{r9, r10}
            java.util.Map r8 = kotlin.collections.P0.g(r8)
            r2.getClass()
            java.lang.String r9 = "coordinate"
            java.util.Map r8 = com.avito.android.util.A4.h(r8, r9)
            r0.f307604q = r5
            r0.f307607t = r3
            java.lang.Object r12 = r12.p(r6, r7, r8, r0)
            if (r12 != r1) goto L6e
            return r1
        L6e:
            r6 = r5
        L6f:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r7 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r7 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r7 = r12.getResult()
            aH0.k r7 = (aH0.k) r7
            r6.getClass()
            com.avito.android.user_address.map.domain.UserAddressMultiGeoData r6 = k(r7)
            return r6
        L85:
            boolean r6 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto L98
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r6 = r12.getError()
            java.lang.Throwable r7 = r12.getCause()
            com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r6, r7)
            throw r6
        L98:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.h(java.lang.String, java.lang.String, double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_address.map.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@Y61.k com.avito.android.user_address.map.domain.c r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.user_address.map.domain.n
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.user_address.map.domain.n r0 = (com.avito.android.user_address.map.domain.n) r0
            int r1 = r0.f307617s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307617s = r1
            goto L18
        L13:
            com.avito.android.user_address.map.domain.n r0 = new com.avito.android.user_address.map.domain.n
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f307615q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f307617s
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.C42729a0.b(r9)
            goto Lcb
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.C42729a0.b(r9)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r8.getClass()
            java.lang.String r2 = r8.f307583b
            if (r2 == 0) goto L49
            java.lang.String r4 = "addressText"
            java.lang.Object r2 = r9.put(r4, r2)
            java.lang.String r2 = (java.lang.String) r2
        L49:
            java.lang.String r2 = r8.f307584c
            java.lang.String r4 = "type"
            r9.put(r4, r2)
            com.avito.android.user_address.map.domain.b r2 = r8.f307586e
            double r4 = r2.f307580a
            float r4 = (float) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "geoPoint[lat]"
            r9.put(r5, r4)
            double r4 = r2.f307581b
            float r2 = (float) r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "geoPoint[lng]"
            r9.put(r4, r2)
            com.avito.android.user_address.a r2 = r7.f307589c
            java.lang.String r4 = r2.getF307189a()
            java.lang.String r5 = "geoSessionId"
            r9.put(r5, r4)
            aH0.g r4 = r8.f307585d
            java.lang.String r5 = r4.getApt()
            if (r5 == 0) goto L85
            java.lang.String r6 = "details[apt]"
            java.lang.Object r5 = r9.put(r6, r5)
            java.lang.String r5 = (java.lang.String) r5
        L85:
            java.lang.String r5 = r4.getEntrance()
            if (r5 == 0) goto L93
            java.lang.String r6 = "details[entrance]"
            java.lang.Object r5 = r9.put(r6, r5)
            java.lang.String r5 = (java.lang.String) r5
        L93:
            java.lang.String r5 = r4.getFloor()
            if (r5 == 0) goto La1
            java.lang.String r6 = "details[floor]"
            java.lang.Object r5 = r9.put(r6, r5)
            java.lang.String r5 = (java.lang.String) r5
        La1:
            java.lang.String r4 = r4.getComment()
            if (r4 == 0) goto Laf
            java.lang.String r5 = "details[comment]"
            java.lang.Object r4 = r9.put(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
        Laf:
            int r8 = r8.f307582a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "addressId"
            r9.put(r4, r8)
            TG0.a r8 = r7.j()
            java.lang.String r2 = r2.getF307189a()
            r0.f307617s = r3
            java.lang.Object r9 = r8.m(r2, r9, r0)
            if (r9 != r1) goto Lcb
            return r1
        Lcb:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto Lda
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r8 = r9.getResult()
            aH0.l r8 = (aH0.l) r8
            return r8
        Lda:
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto Led
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r8 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        Led:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.domain.e.i(com.avito.android.user_address.map.domain.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final TG0.a j() {
        return this.f307587a.get();
    }
}
