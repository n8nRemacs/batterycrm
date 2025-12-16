package com.avito.android.remote.model.inn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationInputBillAmountResult.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationInputBillAmountResult;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "action", "Lcom/avito/android/remote/model/common/VerificationAction;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/common/VerificationAction;Ljava/util/List;)V", "getAction", "()Lcom/avito/android/remote/model/common/VerificationAction;", "getFields", "()Ljava/util/List;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationInputBillAmountResult {

    @c("action")
    @l
    private final VerificationAction action;

    @c(LocalPublishState.FIELDS)
    @k
    private final List<VerificationInnItem> fields;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationInputBillAmountResult(@k String str, @l AttributedText attributedText, @l VerificationAction verificationAction, @k List<? extends VerificationInnItem> list) {
        this.title = str;
        this.subtitle = attributedText;
        this.action = verificationAction;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerificationInputBillAmountResult copy$default(VerificationInputBillAmountResult verificationInputBillAmountResult, String str, AttributedText attributedText, VerificationAction verificationAction, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationInputBillAmountResult.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = verificationInputBillAmountResult.subtitle;
        }
        if ((i12 & 4) != 0) {
            verificationAction = verificationInputBillAmountResult.action;
        }
        if ((i12 & 8) != 0) {
            list = verificationInputBillAmountResult.fields;
        }
        return verificationInputBillAmountResult.copy(str, attributedText, verificationAction, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final VerificationAction getAction() {
        return this.action;
    }

    @k
    public final List<VerificationInnItem> component4() {
        return this.fields;
    }

    @k
    public final VerificationInputBillAmountResult copy(@k String title, @l AttributedText subtitle, @l VerificationAction action, @k List<? extends VerificationInnItem> fields) {
        return new VerificationInputBillAmountResult(title, subtitle, action, fields);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationInputBillAmountResult)) {
            return false;
        }
        VerificationInputBillAmountResult verificationInputBillAmountResult = (VerificationInputBillAmountResult) other;
        return L.f(this.title, verificationInputBillAmountResult.title) && L.f(this.subtitle, verificationInputBillAmountResult.subtitle) && L.f(this.action, verificationInputBillAmountResult.action) && L.f(this.fields, verificationInputBillAmountResult.fields);
    }

    @l
    public final VerificationAction getAction() {
        return this.action;
    }

    @k
    public final List<VerificationInnItem> getFields() {
        return this.fields;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        VerificationAction verificationAction = this.action;
        return this.fields.hashCode() + ((iHashCode2 + (verificationAction != null ? verificationAction.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationInputBillAmountResult(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", fields=");
        return H.p(sb2, this.fields, ')');
    }
}
