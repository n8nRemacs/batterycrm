package com.vk.push.core.network.data.source;

import Y41.p;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.utils.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import l21.C43531a;
import okhttp3.Response;

/* compiled from: MasterHostApi.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "", "LT11/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.network.data.source.MasterHostApi$getAllExistingHostList$2", f = "MasterHostApi.kt", i = {1}, l = {104, 105}, m = "invokeSuspend", n = {"response$iv"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super Z<? extends List<? extends T11.a>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Response f367100q;

    /* renamed from: r, reason: collision with root package name */
    public int f367101r;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Z<? extends List<? extends T11.a>>> continuation) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Z.b bVar;
        Z.b bVar2;
        Response response;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f367101r;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        try {
            if (i12 == 1) {
                C42729a0.b(obj);
                Response response2 = (Response) obj;
                kotlinx.coroutines.scheduling.b bVar3 = C43262l0.f411947c;
                com.vk.push.core.network.utils.c cVar = new com.vk.push.core.network.utils.c(response2, null);
                this.f367100q = response2;
                this.f367101r = 2;
                Object objG = C43259k.g(bVar3, cVar, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                response = response2;
                obj = objG;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                response = this.f367100q;
                C42729a0.b(obj);
            }
            str = (String) obj;
        } catch (Exception e12) {
            int i13 = Z.f406624c;
            bVar = new Z.b(e12);
        }
        if (l.a(str)) {
            VkpnsRequestWithErrorBodyException vkpnsRequestWithErrorBodyException = new VkpnsRequestWithErrorBodyException(l.b(str).toString());
            int i14 = Z.f406624c;
            bVar2 = new Z.b(vkpnsRequestWithErrorBodyException);
            return Z.a(bVar2);
        }
        if (response.isSuccessful()) {
            com.vk.push.core.network.utils.a.f367123a.getClass();
            List<C43531a> listA = com.vk.push.core.network.utils.a.a(str);
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            for (C43531a c43531a : listA) {
                arrayList.add(new T11.a(c43531a.f413412a, c43531a.f413413b));
            }
            int i15 = Z.f406624c;
            bVar = arrayList;
        } else {
            VkpnsRequestException vkpnsRequestException = new VkpnsRequestException(response.message(), response.code());
            int i16 = Z.f406624c;
            bVar = new Z.b(vkpnsRequestException);
        }
        bVar2 = bVar;
        return Z.a(bVar2);
    }
}
