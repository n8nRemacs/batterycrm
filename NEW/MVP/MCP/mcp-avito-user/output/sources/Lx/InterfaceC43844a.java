package lx;

import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.C44148a;
import nx.C44486a;
import ox.C44953a;

/* compiled from: DevelopmentsCatalogApi.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llx/a;", "", "", "developerCompanyGroupId", "developmentId", "", SearchParamsConverterKt.SOURCE, "context", "Lcom/avito/android/remote/model/TypedResult;", "Lmx/a;", "b", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnx/a;", "a", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lox/b;", "request", "Lox/a;", "c", "(Lox/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: lx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC43844a {
    @f("2/newDevelopmentsCatalog/phone/{developmentId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("developmentId") long j12, @l @t(SearchParamsConverterKt.SOURCE) String str, @l @t("context") String str2, @k Continuation<? super TypedResult<C44486a>> continuation);

    @f("2/developersCatalog/phone/{developerCompanyGroupId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("developerCompanyGroupId") long j12, @l @t("developmentId") Long l12, @l @t(SearchParamsConverterKt.SOURCE) String str, @l @t("context") String str2, @k Continuation<? super TypedResult<C44148a>> continuation);

    @o("3/development/suggest")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k ox.b bVar, @k Continuation<? super TypedResult<C44953a>> continuation);
}
