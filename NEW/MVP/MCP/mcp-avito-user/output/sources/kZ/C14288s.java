package KZ;

import com.avito.android.mortgage.api.model.items.application.ImmutableInfoDescription;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import kotlin.Metadata;

/* compiled from: ApplicationImmutableInfoItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LKZ/s;", "LKZ/p;", "", "id", "title", "applicantType", "LKZ/M;", MessageSuggest.PREVIEW, "Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescription;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LKZ/M;Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescription;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "a", "LKZ/M;", "d", "()LKZ/M;", "Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescription;", "b", "()Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescription;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14288s implements InterfaceC14286p {

    @com.google.gson.annotations.c("applicantType")
    @Y61.k
    private final String applicantType;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final ImmutableInfoDescription description;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c(MessageSuggest.PREVIEW)
    @Y61.k
    private final M preview;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14288s(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k M m12, @Y61.k ImmutableInfoDescription immutableInfoDescription) {
        this.id = str;
        this.title = str2;
        this.applicantType = str3;
        this.preview = m12;
        this.description = immutableInfoDescription;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getApplicantType() {
        return this.applicantType;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ImmutableInfoDescription getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final M getPreview() {
        return this.preview;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14288s)) {
            return false;
        }
        C14288s c14288s = (C14288s) obj;
        return kotlin.jvm.internal.L.f(this.id, c14288s.id) && kotlin.jvm.internal.L.f(this.title, c14288s.title) && kotlin.jvm.internal.L.f(this.applicantType, c14288s.applicantType) && kotlin.jvm.internal.L.f(this.preview, c14288s.preview) && kotlin.jvm.internal.L.f(this.description, c14288s.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + ((this.preview.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.id.hashCode() * 31, 31, this.title), 31, this.applicantType)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationImmutableInfoItemValue(id=" + this.id + ", title=" + this.title + ", applicantType=" + this.applicantType + ", preview=" + this.preview + ", description=" + this.description + ')';
    }
}
