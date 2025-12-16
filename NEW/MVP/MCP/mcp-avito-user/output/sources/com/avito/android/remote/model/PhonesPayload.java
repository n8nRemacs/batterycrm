package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActualizePhonesScenarioResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/PhonesPayload;", "", "title", "", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "phones", "", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getPhones", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhonesPayload {

    @c("description")
    @k
    private final AttributedText description;

    @c("phones")
    @k
    private final List<String> phones;

    @c("title")
    @k
    private final String title;

    public PhonesPayload(@k String str, @k AttributedText attributedText, @k List<String> list) {
        this.title = str;
        this.description = attributedText;
        this.phones = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhonesPayload copy$default(PhonesPayload phonesPayload, String str, AttributedText attributedText, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = phonesPayload.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = phonesPayload.description;
        }
        if ((i12 & 4) != 0) {
            list = phonesPayload.phones;
        }
        return phonesPayload.copy(str, attributedText, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<String> component3() {
        return this.phones;
    }

    @k
    public final PhonesPayload copy(@k String title, @k AttributedText description, @k List<String> phones) {
        return new PhonesPayload(title, description, phones);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhonesPayload)) {
            return false;
        }
        PhonesPayload phonesPayload = (PhonesPayload) other;
        return L.f(this.title, phonesPayload.title) && L.f(this.description, phonesPayload.description) && L.f(this.phones, phonesPayload.phones);
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<String> getPhones() {
        return this.phones;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.phones.hashCode() + a.b(this.title.hashCode() * 31, 31, this.description);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhonesPayload(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", phones=");
        return H.p(sb2, this.phones, ')');
    }
}
