package com.avito.android.realty_agency.checkerboard.deeplink;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CheckerboardLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.deeplink.CheckerboardLinkHandler", f = "CheckerboardLinkHandler.kt", i = {0, 0}, l = {32}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f251088q;

    /* renamed from: r, reason: collision with root package name */
    public CheckerboardLink f251089r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f251090s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f251091t;

    /* renamed from: u, reason: collision with root package name */
    public int f251092u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f251091t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f251090s = obj;
        this.f251092u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f251091t.o(null, this);
    }
}
