package com.avito.android.publish.restriction;

import J81.o;
import J81.p;
import J81.s;
import J81.u;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.restriction.RestrictionCustomResponse;
import e30.InterfaceC39936a;
import e30.InterfaceC39937b;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: RestrictionApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ;\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\nJ;\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\f\u0010\nJ;\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/avito/android/publish/restriction/b;", "", "", "path", "", "params", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/restriction/RestrictionCustomResponse;", "a", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "c", "d", "b", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes16.dex */
public interface b {
    @o("{path}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @InterfaceC39937b
    @Y61.k
    I<TypedResult<RestrictionCustomResponse>> a(@s(encoded = true, value = "path") @Y61.k String path, @J81.d @Y61.k Map<String, String> params);

    @J81.f("{path}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39937b
    @Y61.k
    I<TypedResult<RestrictionCustomResponse>> b(@s(encoded = true, value = "path") @Y61.k String path, @u @Y61.k Map<String, String> params);

    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @InterfaceC39937b
    @p("{path}")
    @Y61.k
    I<TypedResult<RestrictionCustomResponse>> c(@s(encoded = true, value = "path") @Y61.k String path, @J81.d @Y61.k Map<String, String> params);

    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39937b
    @J81.b("{path}")
    @Y61.k
    I<TypedResult<RestrictionCustomResponse>> d(@s(encoded = true, value = "path") @Y61.k String path, @u @Y61.k Map<String, String> params);
}
