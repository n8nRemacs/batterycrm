package d91;

import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import kotlin.Metadata;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld91/g;", "", "Ld91/E;", PlatformActions.ExpandableData.CANCEL_ACTION, "", PlatformActions.ExpandableData.TITLE_SHORT, "<init>", "(Ld91/E;Ljava/lang/String;)V", "Ld91/E;", "a", "()Ld91/E;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d91.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39545g {

    @com.google.gson.annotations.c(PlatformActions.ExpandableData.CANCEL_ACTION)
    @Y61.l
    private final E cancelAction;

    @com.google.gson.annotations.c(PlatformActions.ExpandableData.TITLE_SHORT)
    @Y61.k
    private final String titleShort;

    public C39545g(@Y61.l E e12, @Y61.k String str) {
        this.cancelAction = e12;
        this.titleShort = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final E getCancelAction() {
        return this.cancelAction;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitleShort() {
        return this.titleShort;
    }
}
