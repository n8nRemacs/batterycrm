package com.avito.android.developments_catalog.deeplink;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DevelopmentsCatalogPhoneLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.developments_catalog.deeplink.DevelopmentsCatalogPhoneLinkHandler", f = "DevelopmentsCatalogPhoneLinkHandler.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f139110q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f139111r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f139112s;

    /* renamed from: t, reason: collision with root package name */
    public int f139113t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f139112s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f139111r = obj;
        this.f139113t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f139112s.o(null, this);
    }
}
