package h20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetClientFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh20/i;", "", "", "acceptButton", "Lh20/b;", "actionBanner", "Lh20/f;", "clientSearch", "clientSearchErrorText", "screenSubtitle", "screenTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;Lh20/b;Lh20/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lh20/b;", "b", "()Lh20/b;", "Lh20/f;", "c", "()Lh20/f;", "d", "e", "f", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {

    @com.google.gson.annotations.c("acceptButton")
    @k
    private final String acceptButton;

    @com.google.gson.annotations.c("actionBanner")
    @l
    private final b actionBanner;

    @com.google.gson.annotations.c("clientSearch")
    @k
    private final f clientSearch;

    @com.google.gson.annotations.c("clientSearchErrorText")
    @k
    private final String clientSearchErrorText;

    @com.google.gson.annotations.c("screenSubtitle")
    @l
    private final String screenSubtitle;

    @com.google.gson.annotations.c("screenTitle")
    @k
    private final String screenTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public i(@k String str, @l b bVar, @k f fVar, @k String str2, @l String str3, @k String str4, @k AttributedText attributedText) {
        this.acceptButton = str;
        this.actionBanner = bVar;
        this.clientSearch = fVar;
        this.clientSearchErrorText = str2;
        this.screenSubtitle = str3;
        this.screenTitle = str4;
        this.title = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAcceptButton() {
        return this.acceptButton;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final b getActionBanner() {
        return this.actionBanner;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final f getClientSearch() {
        return this.clientSearch;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getClientSearchErrorText() {
        return this.clientSearchErrorText;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
