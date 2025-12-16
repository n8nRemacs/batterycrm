package b91;

import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import kotlin.Metadata;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lb91/x;", "", "Lb91/a0;", PlatformActions.ExpandableData.CANCEL_ACTION, "", PlatformActions.ExpandableData.TITLE_SHORT, "<init>", "(Lb91/a0;Ljava/lang/String;)V", "Lb91/a0;", "a", "()Lb91/a0;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b91.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C25482x {

    @com.google.gson.annotations.c(PlatformActions.ExpandableData.CANCEL_ACTION)
    @Y61.l
    private final a0 cancelAction;

    @com.google.gson.annotations.c(PlatformActions.ExpandableData.TITLE_SHORT)
    @Y61.k
    private final String titleShort;

    public C25482x(@Y61.l a0 a0Var, @Y61.k String str) {
        this.cancelAction = a0Var;
        this.titleShort = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final a0 getCancelAction() {
        return this.cancelAction;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitleShort() {
        return this.titleShort;
    }
}
