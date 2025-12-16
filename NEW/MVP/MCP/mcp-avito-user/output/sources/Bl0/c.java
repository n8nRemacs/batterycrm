package BL0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.vas_performance.remote.model.applied.StickerState;
import kotlin.Metadata;

/* compiled from: AppliedSticker.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LBL0/c;", "", "", "title", "Lcom/avito/android/vas_performance/remote/model/applied/StickerState;", VoiceInfo.STATE, "<init>", "(Ljava/lang/String;Lcom/avito/android/vas_performance/remote/model/applied/StickerState;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/vas_performance/remote/model/applied/StickerState;", "a", "()Lcom/avito/android/vas_performance/remote/model/applied/StickerState;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @k
    private final StickerState state;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k String str, @k StickerState stickerState) {
        this.title = str;
        this.state = stickerState;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final StickerState getState() {
        return this.state;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
