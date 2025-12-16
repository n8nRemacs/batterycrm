package com.avito.android.developments_agency_search.deeplink;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealtyAgencySearchLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLinkHandler", f = "RealtyAgencySearchLinkHandler.kt", i = {0, 0}, l = {41}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK}, s = {"L$0", "L$1"})
/* loaded from: classes13.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public v f136460q;

    /* renamed from: r, reason: collision with root package name */
    public RealtyAgencySearchLink f136461r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136462s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f136463t;

    /* renamed from: u, reason: collision with root package name */
    public int f136464u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f136463t = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f136462s = obj;
        this.f136464u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f136463t.o(null, this);
    }
}
