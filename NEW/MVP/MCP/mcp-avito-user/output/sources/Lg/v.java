package LG;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"LLG/v;", "", "LLG/w;", "hint", "", "isHighlighted", "", "name", "value", "<init>", "(LLG/w;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "LLG/w;", "a", "()LLG/w;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v {

    @com.google.gson.annotations.c("hint")
    @Y61.l
    private final w hint;

    @com.google.gson.annotations.c("isHighlighted")
    @Y61.l
    private final Boolean isHighlighted;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public v(@Y61.l w wVar, @Y61.l Boolean bool, @Y61.k String str, @Y61.k String str2) {
        this.hint = wVar;
        this.isHighlighted = bool;
        this.name = str;
        this.value = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final w getHint() {
        return this.hint;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
