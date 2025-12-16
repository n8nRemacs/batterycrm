package com.avito.avcalls.android.signaling;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SignalingApiImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.signaling.SignalingApiImpl", f = "SignalingApiImpl.kt", i = {0, 0, 0}, l = {297}, m = "createCall", n = {"analyticsLabel$iv", "requestResult$iv", "mark$iv$iv$iv"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes5.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f332000q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f332001r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f332002s;

    /* renamed from: t, reason: collision with root package name */
    public long f332003t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f332004u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f332005v;

    /* renamed from: w, reason: collision with root package name */
    public int f332006w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332005v = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332004u = obj;
        this.f332006w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332005v.d(null, null, null, false, null, null, this);
    }
}
