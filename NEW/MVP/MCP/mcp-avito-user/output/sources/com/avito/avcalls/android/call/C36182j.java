package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallManager", f = "CallManager.kt", i = {0}, l = {389}, m = "unregisterCallSession", n = {"callSessionInfo"}, s = {"L$0"})
/* renamed from: com.avito.avcalls.android.call.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36182j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f331522q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331523r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C36177e f331524s;

    /* renamed from: t, reason: collision with root package name */
    public int f331525t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36182j(C36177e c36177e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331524s = c36177e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331523r = obj;
        this.f331525t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C36177e.c(this.f331524s, null, null, this);
    }
}
