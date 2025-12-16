package com.avito.android.developments_agency_search.deeplink;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DealCabinetLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.DealCabinetLinkHandler", f = "DealCabinetLinkHandler.kt", i = {0, 0, 0}, l = {36}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK, "redirectDeeplink"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.developments_agency_search.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29830a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C29832c f136397q;

    /* renamed from: r, reason: collision with root package name */
    public DealCabinetLink f136398r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f136399s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f136400t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29832c f136401u;

    /* renamed from: v, reason: collision with root package name */
    public int f136402v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29830a(C29832c c29832c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f136401u = c29832c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f136400t = obj;
        this.f136402v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f136401u.o(null, this);
    }
}
