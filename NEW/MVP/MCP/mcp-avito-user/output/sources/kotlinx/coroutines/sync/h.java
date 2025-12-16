package kotlinx.coroutines.sync;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.selects.r;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/selects/r;", "<anonymous parameter 0>", "", SearchParamsConverterKt.OWNER, "<anonymous parameter 2>", "Lkotlin/Function1;", "", "Lkotlin/G0;", "invoke", "(Lkotlinx/coroutines/selects/r;Ljava/lang/Object;Ljava/lang/Object;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class h extends N implements Y41.q<r<?>, Object, Object, Y41.l<? super Throwable, ? extends G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f412264l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar) {
        super(3);
        this.f412264l = dVar;
    }

    @Override // Y41.q
    public final Y41.l<? super Throwable, ? extends G0> invoke(r<?> rVar, Object obj, Object obj2) {
        return new g(this.f412264l, obj);
    }
}
