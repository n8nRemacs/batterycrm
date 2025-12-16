package com.avito.avcalls.rtc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PCSessionLogsWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.rtc.PCSessionLogsWrapper", f = "PCSessionLogsWrapper.kt", i = {0}, l = {34}, m = "createAnswer", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public q f333197q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f333198r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f333199s;

    /* renamed from: t, reason: collision with root package name */
    public int f333200t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f333199s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f333198r = obj;
        this.f333200t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f333199s.L(null, this);
    }
}
