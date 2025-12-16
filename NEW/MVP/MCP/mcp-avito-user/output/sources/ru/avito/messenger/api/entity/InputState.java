package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lru/avito/messenger/api/entity/InputState;", "", "", "isDisabled", "", "reason", "description", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getReason", "getDescription", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputState {

    @c("description")
    @l
    private final String description;

    @c("isDisabled")
    private final boolean isDisabled;

    @c("reason")
    @l
    private final String reason;

    public InputState(boolean z12, @l String str, @l String str2) {
        this.isDisabled = z12;
        this.reason = str;
        this.description = str2;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputState)) {
            return false;
        }
        InputState inputState = (InputState) other;
        return this.isDisabled == inputState.isDisabled && L.f(this.reason, inputState.reason) && L.f(this.description, inputState.description);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isDisabled) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputState(isDisabled=");
        sb2.append(this.isDisabled);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }
}
