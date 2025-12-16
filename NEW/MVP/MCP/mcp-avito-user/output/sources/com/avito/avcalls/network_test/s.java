package com.avito.avcalls.network_test;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NetworkTestSocket.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.network_test.NetworkTestSocket", f = "NetworkTestSocket.kt", i = {0}, l = {85}, m = "receive", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public w f333040q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f333041r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f333042s;

    /* renamed from: t, reason: collision with root package name */
    public int f333043t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f333042s = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f333041r = obj;
        this.f333043t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f333042s.a(this);
    }
}
