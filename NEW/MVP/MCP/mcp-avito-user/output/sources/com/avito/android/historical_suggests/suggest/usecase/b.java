package com.avito.android.historical_suggests.suggest.usecase;

import Y41.p;
import Y61.l;
import android.util.Base64;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43047d;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import qI.C47300c;

/* compiled from: DecodeJwtUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LqI/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)LqI/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.usecase.DecodeJwtUseCase$invoke$2", f = "DecodeJwtUseCase.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super C47300c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f162151q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f162152r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f162153s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f162152r = str;
        this.f162153s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f162152r, this.f162153s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C47300c> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.arch.mvi.utils.c bVar;
        int i12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f162151q;
        if (i13 == 0) {
            C42729a0.b(obj);
            String str = this.f162152r;
            if (str != null) {
                this.f162151q = 1;
                this.f162153s.getClass();
                try {
                    int length = str.length();
                    int i14 = 0;
                    while (true) {
                        i12 = -1;
                        if (i14 >= length) {
                            i14 = -1;
                            break;
                        }
                        if (str.charAt(i14) == '.') {
                            break;
                        }
                        i14++;
                    }
                    int i15 = i14 + 1;
                    int length2 = str.length() - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i16 = length2 - 1;
                            if (str.charAt(length2) == '.') {
                                i12 = length2;
                                break;
                            }
                            if (i16 < 0) {
                                break;
                            }
                            length2 = i16;
                        }
                    }
                    String str2 = new String(Base64.decode(str.substring(i15, i12), 8), C43047d.f410589b);
                    Gson gson = new Gson();
                    Type type = new a().getType();
                    bVar = new c.C2712c((C47300c) gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type)));
                } catch (Throwable th2) {
                    Q0.e(getF411447c());
                    bVar = new c.b(th2);
                }
                if (bVar instanceof c.C2712c) {
                    obj = (C47300c) ((c.C2712c) bVar).f92028b;
                } else {
                    if (!(bVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = null;
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        C47300c c47300c = (C47300c) obj;
        if (c47300c != null) {
            return c47300c;
        }
        return null;
    }
}
