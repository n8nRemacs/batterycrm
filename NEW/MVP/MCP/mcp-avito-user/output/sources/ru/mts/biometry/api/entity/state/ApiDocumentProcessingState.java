package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentProcessingState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentProcessingState;", "", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentProcessingState {

    @k
    private final String text;

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiDocumentProcessingState) && L.f(this.text, ((ApiDocumentProcessingState) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ApiDocumentProcessingState(text="), this.text, ')');
    }
}
