package com.avito.android.async_phone;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.bxcontent.Y0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AsyncPhonePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/b;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: com.avito.android.async_phone.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28616b {

    /* compiled from: AsyncPhonePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.async_phone.b$a */
    public static final class a {
    }

    void K6(@Y61.k Y0 y02);

    void L6(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.k Q81.a aVar);

    void M6(@Y61.k AsyncPhoneItem asyncPhoneItem);

    boolean N6();

    @InterfaceC42830m
    void O6(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.l Q81.a aVar, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource, @Y61.l String str, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void e0();
}
