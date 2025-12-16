package BE;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1FeesByPackageGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LBE/c;", "", "LBE/d;", "hint", "", "iconName", "title", "<init>", "(LBE/d;Ljava/lang/String;Ljava/lang/String;)V", "LBE/d;", "a", "()LBE/d;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    @com.google.gson.annotations.c("hint")
    @l
    private final d hint;

    @com.google.gson.annotations.c("iconName")
    @k
    private final String iconName;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@l d dVar, @k String str, @k String str2) {
        this.hint = dVar;
        this.iconName = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final d getHint() {
        return this.hint;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
