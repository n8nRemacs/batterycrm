package YB0;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff.remote.model.bar.BarProgressState;
import kotlin.Metadata;

/* compiled from: BarProgress.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LYB0/b;", "", "", "value", "Lcom/avito/android/tariff/remote/model/bar/BarProgressState;", VoiceInfo.STATE, "<init>", "(FLcom/avito/android/tariff/remote/model/bar/BarProgressState;)V", "F", "b", "()F", "Lcom/avito/android/tariff/remote/model/bar/BarProgressState;", "a", "()Lcom/avito/android/tariff/remote/model/bar/BarProgressState;", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @k
    private final BarProgressState state;

    @com.google.gson.annotations.c("value")
    private final float value;

    public b(float f12, @k BarProgressState barProgressState) {
        this.value = f12;
        this.state = barProgressState;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final BarProgressState getState() {
        return this.state;
    }

    /* renamed from: b, reason: from getter */
    public final float getValue() {
        return this.value;
    }
}
