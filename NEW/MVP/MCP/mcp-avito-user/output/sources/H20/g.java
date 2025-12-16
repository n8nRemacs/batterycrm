package h20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetClientFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lh20/g;", "", "", "acceptButton", "Lh20/b;", "actionBanner", "Lh20/f;", "email", "fullName", "phone", "screenSubtitle", "screenTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;Lh20/b;Lh20/f;Lh20/f;Lh20/f;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lh20/b;", "b", "()Lh20/b;", "Lh20/f;", "c", "()Lh20/f;", "d", "e", "f", "g", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    @com.google.gson.annotations.c("acceptButton")
    @k
    private final String acceptButton;

    @com.google.gson.annotations.c("actionBanner")
    @l
    private final b actionBanner;

    @com.google.gson.annotations.c("email")
    @k
    private final f email;

    @com.google.gson.annotations.c("fullName")
    @k
    private final f fullName;

    @com.google.gson.annotations.c("phone")
    @k
    private final f phone;

    @com.google.gson.annotations.c("screenSubtitle")
    @l
    private final String screenSubtitle;

    @com.google.gson.annotations.c("screenTitle")
    @k
    private final String screenTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public g(@k String str, @l b bVar, @k f fVar, @k f fVar2, @k f fVar3, @l String str2, @k String str3, @k AttributedText attributedText) {
        this.acceptButton = str;
        this.actionBanner = bVar;
        this.email = fVar;
        this.fullName = fVar2;
        this.phone = fVar3;
        this.screenSubtitle = str2;
        this.screenTitle = str3;
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
    public final f getEmail() {
        return this.email;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final f getFullName() {
        return this.fullName;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final f getPhone() {
        return this.phone;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
