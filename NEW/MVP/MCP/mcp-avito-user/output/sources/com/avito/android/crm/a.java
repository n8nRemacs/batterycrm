package com.avito.android.crm;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CrmDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm.CrmDeeplinkHandler", f = "CrmDeeplinkHandler.kt", i = {0}, l = {20}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f129123q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f129125s;

    /* renamed from: t, reason: collision with root package name */
    public int f129126t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129125s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f129124r = obj;
        this.f129126t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129125s.o(null, this);
    }
}
