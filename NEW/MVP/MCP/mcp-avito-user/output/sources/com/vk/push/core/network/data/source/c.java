package com.vk.push.core.network.data.source;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MasterHostApi.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "com.vk.push.core.network.data.source.MasterHostApi", f = "MasterHostApi.kt", i = {}, l = {55}, m = "getHostList-gIAlu-s", n = {}, s = {})
/* loaded from: classes7.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f367102q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f367103r;

    /* renamed from: s, reason: collision with root package name */
    public int f367104s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f367103r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f367102q = obj;
        this.f367104s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f367103r.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
