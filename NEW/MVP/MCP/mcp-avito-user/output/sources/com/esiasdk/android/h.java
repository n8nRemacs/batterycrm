package com.esiasdk.android;

import android.net.Uri;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EsiaAuthVm.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/esiasdk/android/esiaLoginClient/TokenParameters;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.esiasdk.android.EsiaAuthVm$processRedirectUrl$1", f = "EsiaAuthVm.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements Y41.l<Continuation<? super TokenParameters>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f339709q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f339710r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f339711s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Uri uri, Continuation<? super h> continuation) {
        super(1, continuation);
        this.f339710r = nVar;
        this.f339711s = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new h(this.f339710r, this.f339711s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TokenParameters> continuation) {
        return ((h) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws EsiaErrorResponse {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f339709q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n nVar = this.f339710r;
            this.f339709q = 1;
            nVar.f339722E.getClass();
            Uri uri = this.f339711s;
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter == null) {
                throw new EsiaErrorResponse(Boxing.boxInt(3), null, "Access code not found!", 2, null);
            }
            String queryParameter2 = uri.getQueryParameter(VoiceInfo.STATE);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : queryParameterNames) {
                if (!C42745f0.U("code", VoiceInfo.STATE).contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            int iF2 = P0.f(C42745f0.q(arrayList, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String queryParameter3 = uri.getQueryParameter((String) next);
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                linkedHashMap.put(next, queryParameter3);
            }
            obj = new TokenParameters(queryParameter, queryParameter2, linkedHashMap);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
