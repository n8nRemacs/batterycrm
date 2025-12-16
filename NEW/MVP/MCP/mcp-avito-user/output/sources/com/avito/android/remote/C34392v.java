package com.avito.android.remote;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConfigApiRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.remote.ConfigApiRepository", f = "ConfigApiRepository.kt", i = {0}, l = {37}, m = "fetchAppConfigSuspend", n = {"this"}, s = {"L$0"})
/* renamed from: com.avito.android.remote.v, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
final class C34392v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C34390u f254393q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f254394r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34390u f254395s;

    /* renamed from: t, reason: collision with root package name */
    public int f254396t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34392v(C34390u c34390u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f254395s = c34390u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f254394r = obj;
        this.f254396t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f254395s.c(this);
    }
}
