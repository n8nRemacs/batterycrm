package com.avito.android.c2c_trx.deeplinks;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddAutoToC2CTrxDeepLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.c2c_trx.deeplinks.AddAutoToC2CTrxDeepLinkHandler", f = "AddAutoToC2CTrxDeepLinkHandler.kt", i = {0}, l = {39}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f113287q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f113288r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f113289s;

    /* renamed from: t, reason: collision with root package name */
    public int f113290t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f113289s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f113288r = obj;
        this.f113290t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f113289s.o(null, this);
    }
}
