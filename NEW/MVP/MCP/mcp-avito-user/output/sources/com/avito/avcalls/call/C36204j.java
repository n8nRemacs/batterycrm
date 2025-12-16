package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallManager", f = "CallManager.kt", i = {0}, l = {413}, m = "unregisterCallSession", n = {"callSessionInfo"}, s = {"L$0"})
/* renamed from: com.avito.avcalls.call.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36204j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f332690q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332691r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C36199e f332692s;

    /* renamed from: t, reason: collision with root package name */
    public int f332693t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36204j(C36199e c36199e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332692s = c36199e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332691r = obj;
        this.f332693t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C36199e.c(this.f332692s, null, null, this);
    }
}
