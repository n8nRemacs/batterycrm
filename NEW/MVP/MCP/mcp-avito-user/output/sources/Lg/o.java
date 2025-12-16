package LG;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LLG/o;", "", "LLG/p;", "hint", "", "name", "value", "<init>", "(LLG/p;Ljava/lang/String;Ljava/lang/String;)V", "LLG/p;", "getHint", "()LLG/p;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o {

    @com.google.gson.annotations.c("hint")
    @Y61.l
    private final p hint;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public o(@Y61.l p pVar, @Y61.k String str, @Y61.k String str2) {
        this.hint = pVar;
        this.name = str;
        this.value = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
