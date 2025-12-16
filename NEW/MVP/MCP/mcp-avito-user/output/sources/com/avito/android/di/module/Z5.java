package com.avito.android.di.module;

import Yy.C18347a;
import Zk0.C19571a;
import com.avito.android.employee_mode_impl.generated.api.EmployeeModeApi;
import com.avito.android.profile.pro.impl.generated.api.ProfileProApi;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import okhttp3.Request;
import s40.InterfaceC47995b;
import y90.C50087a;
import z40.InterfaceC50372a;

/* compiled from: OfflineWhitelistsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/Z5;", "Lz40/a;", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Z5 implements InterfaceC50372a {

    /* compiled from: OfflineWhitelistsModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<EmployeeModeApi, Continuation<? super TypedResult<C18347a>>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final a f144218b = new a();

        public a() {
            super(2, EmployeeModeApi.class, "apiUserInfoV2", "apiUserInfoV2(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.p
        public final Object invoke(EmployeeModeApi employeeModeApi, Continuation<? super TypedResult<C18347a>> continuation) {
            return employeeModeApi.apiUserInfoV2(continuation);
        }
    }

    /* compiled from: OfflineWhitelistsModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.p<ProfileProApi, Continuation<? super TypedResult<C50087a>>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final b f144219b = new b();

        public b() {
            super(2, ProfileProApi.class, "proEnabledV3", "proEnabledV3(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.p
        public final Object invoke(ProfileProApi profileProApi, Continuation<? super TypedResult<C50087a>> continuation) {
            return profileProApi.proEnabledV3(continuation);
        }
    }

    /* compiled from: OfflineWhitelistsModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.s<ProfileApi, String, String, String, Continuation<? super TypedResult<C19571a>>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final c f144220b = new c();

        public c() {
            super(5, ProfileApi.class, "api3InternalBannerRotationBannersGet", "api3InternalBannerRotationBannersGet(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.s
        public final Object invoke(ProfileApi profileApi, String str, String str2, String str3, Continuation<? super TypedResult<C19571a>> continuation) {
            return profileApi.api3InternalBannerRotationBannersGet(str, str2, str3, continuation);
        }
    }

    @Override // z40.InterfaceC50372a
    @Y61.k
    public final InterfaceC47995b a(@Y61.k Request request) {
        String strEncodedPath = request.url().encodedPath();
        return kotlin.jvm.internal.L.f(strEncodedPath, C29995b6.a(a.f144218b)) ? new InterfaceC47995b.C12608b(6600L, null, 2, null) : kotlin.jvm.internal.L.f(strEncodedPath, C29995b6.a(b.f144219b)) ? new InterfaceC47995b.C12608b(6500L, null, 2, null) : kotlin.jvm.internal.L.f(strEncodedPath, C29995b6.a(c.f144220b)) ? new InterfaceC47995b.C12608b(2000L, null, 2, null) : InterfaceC47995b.a.f437464a;
    }
}
