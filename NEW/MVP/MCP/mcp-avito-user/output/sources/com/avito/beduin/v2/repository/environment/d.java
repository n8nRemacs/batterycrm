package com.avito.beduin.v2.repository.environment;

import Y41.q;
import android.content.res.Configuration;
import androidx.core.graphics.C22771k;
import com.avito.android.remote.model.Navigation;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidEnvironmentClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/res/Configuration;", Navigation.CONFIG, "Landroidx/core/graphics/k;", "insets", "Lcom/avito/beduin/v2/repository/environment/h;", "<anonymous>", "(Landroid/content/res/Configuration;Landroidx/core/graphics/k;)Lcom/avito/beduin/v2/repository/environment/h;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.environment.AndroidEnvironmentClient$envFlow$1", f = "AndroidEnvironmentClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements q<Configuration, C22771k, Continuation<? super h>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Configuration f338213q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ C22771k f338214r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f338215s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f338215s = gVar;
    }

    @Override // Y41.q
    public final Object invoke(Configuration configuration, C22771k c22771k, Continuation<? super h> continuation) {
        d dVar = new d(this.f338215s, continuation);
        dVar.f338213q = configuration;
        dVar.f338214r = c22771k;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f338215s.k(this.f338213q, this.f338214r);
    }
}
