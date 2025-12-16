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

/* compiled from: VerificationInputInnResult.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationInputInnResult;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "isClosable", "", "action", "Lcom/avito/android/remote/model/common/VerificationAction;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/common/VerificationAction;Ljava/util/List;)V", "getAction", "()Lcom/avito/android/remote/model/common/VerificationAction;", "getFields", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/common/VerificationAction;Ljava/util/List;)Lcom/avito/android/remote/model/inn/VerificationInputInnResult;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationInputInnResult {

    @c("action")
    @l
    private final VerificationAction action;

    @c(LocalPublishState.FIELDS)
    @k
    private final List<VerificationInnItem> fields;

    @c("isClosable")
    @l
    private final Boolean isClosable;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationInputInnResult(@k String str, @l AttributedText attributedText, @l Boolean bool, @l VerificationAction verificationAction, @k List<? extends VerificationInnItem> list) {
        this.title = str;
        this.subtitle = attributedText;
        this.isClosable = bool;
        this.action = verificationAction;
        this.fields = list;
    }

    public static /* synthetic */ VerificationInputInnResult copy$default(VerificationInputInnResult verificationInputInnResult, String str, AttributedText attributedText, Boolean bool, VerificationAction verificationAction, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationInputInnResult.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = verificationInputInnResult.subtitle;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 4) != 0) {
            bool = verificationInputInnResult.isClosable;
        }
        Boolean bool2 = bool;
        if ((i12 & 8) != 0) {
            verificationAction = verificationInputInnResult.action;
        }
        VerificationAction verificationAction2 = verificationAction;
        if ((i12 & 16) != 0) {
            list = verificationInputInnResult.fields;
        }
        return verificationInputInnResult.copy(str, attributedText2, bool2, verificationAction2, list);
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
    public final Boolean getIsClosable() {
        return this.isClosable;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final VerificationAction getAction() {
        return this.action;
    }

    @k
    public final List<VerificationInnItem> component5() {
        return this.fields;
    }

    @k
    public final VerificationInputInnResult copy(@k String title, @l AttributedText subtitle, @l Boolean isClosable, @l VerificationAction action, @k List<? extends VerificationInnItem> fields) {
        return new VerificationInputInnResult(title, subtitle, isClosable, action, fields);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationInputInnResult)) {
            return false;
        }
        VerificationInputInnResult verificationInputInnResult = (VerificationInputInnResult) other;
        return L.f(this.title, verificationInputInnResult.title) && L.f(this.subtitle, verificationInputInnResult.subtitle) && L.f(this.isClosable, verificationInputInnResult.isClosable) && L.f(this.action, verificationInputInnResult.action) && L.f(this.fields, verificationInputInnResult.fields);
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
        Boolean bool = this.isClosable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        VerificationAction verificationAction = this.action;
        return this.fields.hashCode() + ((iHashCode3 + (verificationAction != null ? verificationAction.hashCode() : 0)) * 31);
    }

    @l
    public final Boolean isClosable() {
        return this.isClosable;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationInputInnResult(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", isClosable=");
        sb2.append(this.isClosable);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", fields=");
        return H.p(sb2, this.fields, ')');
    }
}
