package BL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AppliedVasResult.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"LBL0/d;", "", "", "LBL0/b;", "sections", "Lcom/avito/android/remote/model/Action;", "secondaryAction", "action", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/Action;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "b", "()Lcom/avito/android/remote/model/Action;", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("secondaryAction")
    @l
    private final Action secondaryAction;

    @com.google.gson.annotations.c("sections")
    @k
    private final List<b> sections;

    public d(@k List<b> list, @l Action action, @l Action action2) {
        this.sections = list;
        this.secondaryAction = action;
        this.action = action2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Action getSecondaryAction() {
        return this.secondaryAction;
    }

    @k
    public final List<b> c() {
        return this.sections;
    }
}
