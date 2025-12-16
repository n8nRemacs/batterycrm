package jh;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ljh/q;", "", "Lcom/avito/android/remote/model/ButtonAction;", "nextAction", "skipAction", "<init>", "(Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "b", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {

    @com.google.gson.annotations.c("next")
    @Y61.k
    private final ButtonAction nextAction;

    @com.google.gson.annotations.c("skip")
    @Y61.k
    private final ButtonAction skipAction;

    public q(@Y61.k ButtonAction buttonAction, @Y61.k ButtonAction buttonAction2) {
        this.nextAction = buttonAction;
        this.skipAction = buttonAction2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final ButtonAction getNextAction() {
        return this.nextAction;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ButtonAction getSkipAction() {
        return this.skipAction;
    }
}
