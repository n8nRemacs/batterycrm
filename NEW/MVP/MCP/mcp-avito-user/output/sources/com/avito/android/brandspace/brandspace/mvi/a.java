package com.avito.android.brandspace.brandspace.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BrandspaceActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.brandspace.brandspace.mvi.BrandspaceActor", f = "BrandspaceActor.kt", i = {0, 0, 1}, l = {58, 59, 62, 65}, m = "emitLoading", n = {"this", "$this$emitLoading", "$this$emitLoading"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes11.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f107620q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f107621r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f107622s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f107623t;

    /* renamed from: u, reason: collision with root package name */
    public int f107624u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f107623t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f107622s = obj;
        this.f107624u |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.c(this.f107623t, null, this);
    }
}
