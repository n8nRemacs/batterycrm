package com.avito.android.tariff_lf_publication.save.deeplink;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TariffLfPublicationSaveDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.tariff_lf_publication.save.deeplink.TariffLfPublicationSaveDeeplinkHandler", f = "TariffLfPublicationSaveDeeplinkHandler.kt", i = {0}, l = {41}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f301135q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f301136r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f301137s;

    /* renamed from: t, reason: collision with root package name */
    public int f301138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f301137s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f301136r = obj;
        this.f301138t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f301137s.m(null, null, null, this);
    }
}
