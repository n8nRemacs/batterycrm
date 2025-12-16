package com.avito.android.developments_agency_search.deeplink;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealtyAgencySearchLotsLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLotsLinkHandler", f = "RealtyAgencySearchLotsLinkHandler.kt", i = {0, 0}, l = {57}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK}, s = {"L$0", "L$1"})
/* loaded from: classes13.dex */
final class y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f136481q;

    /* renamed from: r, reason: collision with root package name */
    public RealtyAgencySearchLotsLink f136482r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136483s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f136484t;

    /* renamed from: u, reason: collision with root package name */
    public int f136485u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f136484t = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f136483s = obj;
        this.f136485u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f136484t.o(null, this);
    }
}
