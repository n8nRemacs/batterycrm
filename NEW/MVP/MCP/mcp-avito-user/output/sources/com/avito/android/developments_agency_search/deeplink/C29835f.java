package com.avito.android.developments_agency_search.deeplink;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DealRoomLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.DealRoomLinkHandler", f = "DealRoomLinkHandler.kt", i = {0, 0, 0}, l = {36}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK, "redirectDeeplink"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.developments_agency_search.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29835f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C29837h f136422q;

    /* renamed from: r, reason: collision with root package name */
    public DealRoomLink f136423r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f136424s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f136425t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29837h f136426u;

    /* renamed from: v, reason: collision with root package name */
    public int f136427v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29835f(C29837h c29837h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f136426u = c29837h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f136425t = obj;
        this.f136427v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f136426u.o(null, this);
    }
}
