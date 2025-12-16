package com.avito.android.cjm_pro.deeplink;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CjmProDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cjm_pro.deeplink.CjmProDeeplinkHandler", f = "CjmProDeeplinkHandler.kt", i = {0}, l = {32}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f118515q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f118516r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f118517s;

    /* renamed from: t, reason: collision with root package name */
    public int f118518t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f118517s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f118516r = obj;
        this.f118518t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f118517s.o(null, this);
    }
}
