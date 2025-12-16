package id0;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import jd0.C42361a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ProgressInfoToastBarApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JR\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lid0/a;", "", "", "vacancyId", "", "vacancyTitle", SearchParamsConverterKt.LOCATION_ID, "", "nonBlockingProgress", "screenType", "Lcom/avito/android/remote/model/TypedResult;", "Ljd0/a;", "a", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: id0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC41386a {
    @f("2/job/seekers/vacancy/progress")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("vacancyId") Long l12, @l @t("vacancyTitle") String str, @l @t(SearchParamsConverterKt.LOCATION_ID) Long l13, @l @t("nonBlockingProgress") Boolean bool, @l @t("screenType") String str2, @k Continuation<? super TypedResult<C42361a>> continuation);
}
