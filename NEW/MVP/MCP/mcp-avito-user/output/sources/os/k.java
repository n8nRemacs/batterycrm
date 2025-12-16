package os;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Los/k;", "", "Los/l;", VoiceInfo.STATE, "", "text", "<init>", "(Los/l;Ljava/lang/String;)V", "Los/l;", "a", "()Los/l;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @Y61.l
    private final l state;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final String text;

    public k(@Y61.l l lVar, @Y61.l String str) {
        this.state = lVar;
        this.text = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final l getState() {
        return this.state;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
