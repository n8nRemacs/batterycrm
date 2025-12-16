package com.esiasdk.android.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AuthRepositoryBase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.esiasdk.android.domain.AuthRepositoryBase", f = "AuthRepositoryBase.kt", i = {0}, l = {71}, m = "getPermissionsUrl$suspendImpl", n = {"permissions"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f339690q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f339691r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f339692s;

    /* renamed from: t, reason: collision with root package name */
    public int f339693t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f339692s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f339691r = obj;
        this.f339693t |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.b(this.f339692s, null, null, null, this);
    }
}
