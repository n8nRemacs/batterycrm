package ru.cyberity.cbr.core.data.source.common;

import J81.f;
import J81.n;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonObject;
import okhttp3.RequestBody;
import ru.cyberity.cbr.core.data.model.CBRInitConfig;
import ru.cyberity.cbr.core.data.model.remote.i;
import ru.cyberity.cbr.core.data.model.remote.response.d;

/* compiled from: CommonService.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u001d\u0010\r\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011J'\u0010\r\u001a\u00020\u00152\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0016J\u001d\u0010\u0003\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\tJ\u001f\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J)\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\tJ\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004J'\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001dJ)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u00172\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010!ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/common/b;", "", "Lru/cyberity/cbr/core/data/model/remote/response/f;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "actionId", "Lkotlinx/serialization/json/JsonObject;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicantId", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "e", "a", "Lokhttp3/RequestBody;", "applicantAndLanguage", "Lru/cyberity/cbr/core/data/model/remote/response/d;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "conf", "language", "Lru/cyberity/cbr/core/data/model/remote/i;", "(Lru/cyberity/cbr/core/data/model/CBRInitConfig;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "", "Lru/cyberity/cbr/core/data/model/d;", "Lru/cyberity/cbr/core/data/model/b;", "agreement", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/ff/model/a;", "requestedFlags", "Lru/cyberity/ff/model/b;", "(Lru/cyberity/ff/model/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface b {
    @f("resources/applicantActions/{actionId}/one")
    @l
    Object a(@s("actionId") @k String str, @k Continuation<? super d.c.C12460d> continuation);

    @o("resources/applicants/{applicantId}/agreement")
    @l
    Object a(@s("applicantId") @k String str, @J81.a @k ru.cyberity.cbr.core.data.model.b bVar, @k Continuation<? super d.c.C12460d> continuation);

    @f("resources/sdkIntegrations/-/clientIntegrationSettings")
    @l
    Object a(@k Continuation<? super Map<String, ? extends Object>> continuation);

    @n("resources/applicants")
    @l
    Object a(@J81.a @k RequestBody requestBody, @k Continuation<? super d> continuation);

    @o("resources/sdkIntegrations/msdkInit")
    @l
    Object a(@J81.a @k CBRInitConfig cBRInitConfig, @t("lang") @k String str, @k Continuation<? super i> continuation);

    @o("/resources/featureFlags/msdk")
    @l
    Object a(@J81.a @k ru.cyberity.ff.model.a aVar, @k Continuation<? super Map<String, ru.cyberity.ff.model.b>> continuation);

    @o("resources/sdkIntegrations/msdkReinit")
    @l
    Object b(@t("lang") @k String str, @k Continuation<? super i> continuation);

    @f("/resources/sdk/applicant/requiredIdDocsStatus")
    @l
    Object b(@k Continuation<? super ru.cyberity.cbr.core.data.model.remote.response.f> continuation);

    @f("/resources/msdk/i18n")
    @l
    Object c(@t("lang") @k String str, @k Continuation<? super Map<String, ? extends Object>> continuation);

    @f("/resources/applicantActions/{actionId}/requiredIdDocsStatus")
    @l
    Object d(@s("actionId") @k String str, @k Continuation<? super JsonObject> continuation);

    @f("/resources/sdkIntegrations/agreements")
    @l
    Object d(@k Continuation<? super List<ru.cyberity.cbr.core.data.model.d>> continuation);

    @f("resources/applicants/{applicantId}/one")
    @l
    Object e(@s("applicantId") @k String str, @k Continuation<? super d.c.C12460d> continuation);
}
