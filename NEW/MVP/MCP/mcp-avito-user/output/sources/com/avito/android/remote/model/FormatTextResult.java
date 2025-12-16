package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormatTextResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/FormatTextResult;", "", "isEdited", "", "text", "", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FormatTextResult {

    @c("isEdited")
    private final boolean isEdited;

    @c("text")
    @l
    private final String text;

    public FormatTextResult(boolean z12, @l String str) {
        this.isEdited = z12;
        this.text = str;
    }

    public static /* synthetic */ FormatTextResult copy$default(FormatTextResult formatTextResult, boolean z12, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = formatTextResult.isEdited;
        }
        if ((i12 & 2) != 0) {
            str = formatTextResult.text;
        }
        return formatTextResult.copy(z12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEdited() {
        return this.isEdited;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    public final FormatTextResult copy(boolean isEdited, @l String text) {
        return new FormatTextResult(isEdited, text);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormatTextResult)) {
            return false;
        }
        FormatTextResult formatTextResult = (FormatTextResult) other;
        return this.isEdited == formatTextResult.isEdited && L.f(this.text, formatTextResult.text);
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEdited) * 31;
        String str = this.text;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isEdited() {
        return this.isEdited;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FormatTextResult(isEdited=");
        sb2.append(this.isEdited);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }
}
