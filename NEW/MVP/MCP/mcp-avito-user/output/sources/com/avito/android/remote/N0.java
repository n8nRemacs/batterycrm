package com.avito.android.remote;

import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PublishVerticalApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JG\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/N0;", "", "", "", Navigation.ATTRIBUTES, "categoryId", "activeFieldId", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/T0;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_publish-vertical-main"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface N0 {

    /* compiled from: PublishVerticalApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("1/publishDraftVertical")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<T0>> a(@J81.d @Y61.k Map<String, String> attributes, @J81.c("categoryId") @Y61.k String categoryId, @J81.c("activeFieldId") @Y61.l String activeFieldId);
}
