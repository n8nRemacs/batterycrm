package com.avito.android.publish.drafts;

import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import nj0.InterfaceC44435b;

/* compiled from: LocalPublishState.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/avito/android/publish/drafts/IdValuePair;", "", "", "id", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/publish/drafts/IdValuePair;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getValue", "Companion", "a", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IdValuePair {

    /* renamed from: ID, reason: collision with root package name */
    @Y61.k
    public static final String f235324ID = "id";

    @Y61.k
    public static final String VALUE = "value";

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public IdValuePair(@Y61.k String str, @Y61.k String str2) {
        this.id = str;
        this.value = str2;
    }

    public static /* synthetic */ IdValuePair copy$default(IdValuePair idValuePair, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = idValuePair.id;
        }
        if ((i12 & 2) != 0) {
            str2 = idValuePair.value;
        }
        return idValuePair.copy(str, str2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Y61.k
    public final IdValuePair copy(@Y61.k String id2, @Y61.k String value) {
        return new IdValuePair(id2, value);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdValuePair)) {
            return false;
        }
        IdValuePair idValuePair = (IdValuePair) other;
        return kotlin.jvm.internal.L.f(this.id, idValuePair.id) && kotlin.jvm.internal.L.f(this.value, idValuePair.value);
    }

    @InterfaceC44435b(name = "id")
    @Y61.k
    public final String getId() {
        return this.id;
    }

    @InterfaceC44435b(name = "value")
    @Y61.k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.id.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdValuePair(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}
