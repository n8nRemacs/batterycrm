package com.avito.android.tariff_entrypoint.deeplink;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TariffEntryPointDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointDeeplinkHandler", f = "TariffEntryPointDeeplinkHandler.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f298706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f298707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f298708s;

    /* renamed from: t, reason: collision with root package name */
    public int f298709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f298708s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f298707r = obj;
        this.f298709t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f298708s.o(null, this);
    }
}
