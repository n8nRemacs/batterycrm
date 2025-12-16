package HL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VasVisualResult.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"LHL0/b;", "", "", "title", "actionTitle", "selectedActionTitle", "", "LHL0/c;", "vasList", "Lcom/avito/android/remote/model/Action;", "action", "checkoutContext", "emptyActionTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "helpDeepLink", "LHL0/b$a;", "helpAction", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "bblFooter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;LHL0/b$a;Lcom/avito/android/mnz_common/data/MnzFloatingFooter;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "getActionTitle", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "a", "()Lcom/avito/android/remote/model/Action;", "c", "d", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LHL0/b$a;", "e", "()LHL0/b$a;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "b", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("actionTitle")
    @l
    private final String actionTitle;

    @com.google.gson.annotations.c("bblFooter")
    @l
    private final MnzFloatingFooter bblFooter;

    @com.google.gson.annotations.c("checkoutContext")
    @l
    private final String checkoutContext;

    @com.google.gson.annotations.c("emptyActionTitle")
    @l
    private final String emptyActionTitle;

    @com.google.gson.annotations.c("help")
    @l
    private final a helpAction;

    @com.google.gson.annotations.c("helpUri")
    @l
    private final DeepLink helpDeepLink;

    @com.google.gson.annotations.c("selectedActionTitle")
    @l
    private final String selectedActionTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("list")
    @k
    private final List<c> vasList;

    /* compiled from: VasVisualResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LHL0/b$a;", "", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        public a(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    public b(@k String str, @l String str2, @l String str3, @k List<c> list, @l Action action, @l String str4, @l String str5, @l DeepLink deepLink, @l a aVar, @l MnzFloatingFooter mnzFloatingFooter) {
        this.title = str;
        this.actionTitle = str2;
        this.selectedActionTitle = str3;
        this.vasList = list;
        this.action = action;
        this.checkoutContext = str4;
        this.emptyActionTitle = str5;
        this.helpDeepLink = deepLink;
        this.helpAction = aVar;
        this.bblFooter = mnzFloatingFooter;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final MnzFloatingFooter getBblFooter() {
        return this.bblFooter;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCheckoutContext() {
        return this.checkoutContext;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getEmptyActionTitle() {
        return this.emptyActionTitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final a getHelpAction() {
        return this.helpAction;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final DeepLink getHelpDeepLink() {
        return this.helpDeepLink;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSelectedActionTitle() {
        return this.selectedActionTitle;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<c> i() {
        return this.vasList;
    }
}
