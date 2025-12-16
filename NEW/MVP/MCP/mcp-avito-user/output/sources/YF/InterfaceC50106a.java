package yF;

import J81.f;
import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import zF.e;

/* compiled from: ApplyScreenApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"LyF/a;", "", "", "shiftId", "Lcom/avito/android/remote/model/TypedResult;", "LAF/c;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LzF/e;", "b", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: yF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC50106a {
    @o("2/gig/shift/{shiftId}/apply")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("shiftId") long j12, @k Continuation<? super TypedResult<AF.c>> continuation);

    @f("3/gig/shift/{shiftId}/apply-info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("shiftId") long j12, @k Continuation<? super TypedResult<e>> continuation);
}
