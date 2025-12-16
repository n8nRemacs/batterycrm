package j40;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiPdConsentInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lj40/c;", "", "", "hint", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j40.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42193c {

    @com.google.gson.annotations.c("hint")
    @l
    private final String hint;

    @com.google.gson.annotations.c("id")
    @l
    private final Long id;

    @com.google.gson.annotations.c("name")
    @l
    private final String name;

    public C42193c(@l String str, @l Long l12, @l String str2) {
        this.hint = str;
        this.id = l12;
        this.name = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
