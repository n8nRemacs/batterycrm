package com.avito.android.fees_methods.screen.fees_by_package.deeplink;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FeesApplyByPackageDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.fees_methods.screen.fees_by_package.deeplink.FeesApplyByPackageDeeplinkHandler", f = "FeesApplyByPackageDeeplinkHandler.kt", i = {0}, l = {31}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f157961q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f157962r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f157963s;

    /* renamed from: t, reason: collision with root package name */
    public int f157964t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f157963s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f157962r = obj;
        this.f157964t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f157963s.o(null, this);
    }
}
