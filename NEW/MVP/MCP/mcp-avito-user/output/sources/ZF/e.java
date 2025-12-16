package zF;

import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShiftApplyInfoV3Response.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"LzF/e;", "", "LzF/a;", "actionButton", "", "Lcom/avito/android/remote/model/text/AttributedText;", "applyRules", "", "disclaimerUrl", "promotionUrl", "LzF/d;", "sheet", "LzF/f;", "shiftSnippet", "successUri", "<init>", "(LzF/a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LzF/d;LzF/f;Ljava/lang/String;)V", "LzF/a;", "a", "()LzF/a;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "LzF/d;", "e", "()LzF/d;", "LzF/f;", "f", "()LzF/f;", "g", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    @com.google.gson.annotations.c("actionButton")
    @l
    private final C50452a actionButton;

    @com.google.gson.annotations.c("applyRules")
    @l
    private final List<AttributedText> applyRules;

    @com.google.gson.annotations.c("disclaimerUrl")
    @l
    private final String disclaimerUrl;

    @com.google.gson.annotations.c("promotionUrl")
    @l
    private final String promotionUrl;

    @com.google.gson.annotations.c("sheet")
    @l
    private final d sheet;

    @com.google.gson.annotations.c("shiftSnippet")
    @l
    private final f shiftSnippet;

    @com.google.gson.annotations.c("successUri")
    @l
    private final String successUri;

    public e(@l C50452a c50452a, @l List<AttributedText> list, @l String str, @l String str2, @l d dVar, @l f fVar, @l String str3) {
        this.actionButton = c50452a;
        this.applyRules = list;
        this.disclaimerUrl = str;
        this.promotionUrl = str2;
        this.sheet = dVar;
        this.shiftSnippet = fVar;
        this.successUri = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C50452a getActionButton() {
        return this.actionButton;
    }

    @l
    public final List<AttributedText> b() {
        return this.applyRules;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDisclaimerUrl() {
        return this.disclaimerUrl;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPromotionUrl() {
        return this.promotionUrl;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final d getSheet() {
        return this.sheet;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final f getShiftSnippet() {
        return this.shiftSnippet;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSuccessUri() {
        return this.successUri;
    }
}
