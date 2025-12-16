package com.avito.android.async_phone;

import Gd.InterfaceC13866a;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LegacyAsyncPhoneInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/x;", "Lcom/avito/android/async_phone/u;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13866a f92295a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WL.a f92296b;

    @Inject
    public x(@Y61.k InterfaceC13866a interfaceC13866a, @Y61.k WL.a aVar) {
        this.f92295a = interfaceC13866a;
        this.f92296b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    @Override // com.avito.android.async_phone.u
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.internal.operators.observable.B0 a(@Y61.k java.lang.String r18, @Y61.l java.lang.String r19, @Y61.k com.avito.android.serp.adapter.InAppCallsAwareItem r20, @Y61.k com.avito.android.analytics.event.ContactSource r21, @Y61.l java.lang.String r22, @Y61.l java.lang.Boolean r23) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.async_phone.x.a(java.lang.String, java.lang.String, com.avito.android.serp.adapter.InAppCallsAwareItem, com.avito.android.analytics.event.ContactSource, java.lang.String, java.lang.Boolean):io.reactivex.rxjava3.internal.operators.observable.B0");
    }

    @Override // com.avito.android.async_phone.u
    @Y61.k
    public final B0 b(@Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f92295a.a(str, str2, bool, str3, null).d0(v.f92293b);
    }
}
