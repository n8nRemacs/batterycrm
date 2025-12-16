package jh;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorV3Result.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljh/D;", "", "", ConstraintKt.WARNING, "", "duration", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "a", "()I", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jh.D, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42379D {

    @com.google.gson.annotations.c("duration")
    private final int duration;

    @com.google.gson.annotations.c(ConstraintKt.WARNING)
    @Y61.k
    private final String warning;

    public C42379D(@Y61.k String str, int i12) {
        this.warning = str;
        this.duration = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }
}
