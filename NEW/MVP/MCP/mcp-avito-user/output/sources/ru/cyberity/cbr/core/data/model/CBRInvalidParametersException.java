package ru.cyberity.cbr.core.data.model;

import java.util.List;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRInvalidParametersException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "messages", "", "", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final class CBRInvalidParametersException extends Exception {

    @Y61.k
    private final List<String> messages;

    public CBRInvalidParametersException(@Y61.k List<String> list) {
        this.messages = list;
    }

    @Y61.k
    public final List<String> getMessages() {
        return this.messages;
    }
}
