package com.avito.android.developments_catalog.deeplink;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DevelopersCatalogPhoneLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.developments_catalog.deeplink.DevelopersCatalogPhoneLinkHandler", f = "DevelopersCatalogPhoneLinkHandler.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f139087q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f139088r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f139089s;

    /* renamed from: t, reason: collision with root package name */
    public int f139090t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f139089s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f139088r = obj;
        this.f139090t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f139089s.o(null, this);
    }
}
