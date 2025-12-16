package CL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.Action;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CompetitiveVasResult.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LCL0/c;", "", "", "title", "actionTitle", "Lcom/avito/android/remote/model/Action;", "infoAction", "", "LCL0/d;", "tabs", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "bblFooter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/util/List;Lcom/avito/android/mnz_common/data/MnzFloatingFooter;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "a", "Lcom/avito/android/remote/model/Action;", "c", "()Lcom/avito/android/remote/model/Action;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "b", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("actionTitle")
    @k
    private final String actionTitle;

    @com.google.gson.annotations.c("bblFooter")
    @l
    private final MnzFloatingFooter bblFooter;

    @com.google.gson.annotations.c("infoAction")
    @l
    private final Action infoAction;

    @com.google.gson.annotations.c("tabs")
    @k
    private final List<d> tabs;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k String str, @k String str2, @l Action action, @k List<d> list, @l MnzFloatingFooter mnzFloatingFooter) {
        this.title = str;
        this.actionTitle = str2;
        this.infoAction = action;
        this.tabs = list;
        this.bblFooter = mnzFloatingFooter;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final MnzFloatingFooter getBblFooter() {
        return this.bblFooter;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Action getInfoAction() {
        return this.infoAction;
    }

    @k
    public final List<d> d() {
        return this.tabs;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
