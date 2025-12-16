package com.avito.android.messenger.channels.mvi.list_feature;

import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$33$1$1$1", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class L extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f187766q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31772a f187767r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, C31772a c31772a, Continuation<? super L> continuation) {
        super(2, continuation);
        this.f187766q = str;
        this.f187767r = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new L(this.f187766q, this.f187767r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((L) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f187767r.f187926f, new WebViewLink.OnlyAvitoDomain(Uri.parse(this.f187766q), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), null, 4, null), null, null, 6);
        return kotlin.G0.f406611a;
    }
}
