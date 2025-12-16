package j40;

import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiPdConsentInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lj40/b;", "", "", "Lj40/c;", "consent", "", "fio", "phone", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42192b {

    @com.google.gson.annotations.c("consent")
    @l
    private final List<C42193c> consent;

    @com.google.gson.annotations.c("fio")
    @l
    private final String fio;

    @com.google.gson.annotations.c("phone")
    @l
    private final String phone;

    public C42192b(@l List<C42193c> list, @l String str, @l String str2) {
        this.consent = list;
        this.fio = str;
        this.phone = str2;
    }

    @l
    public final List<C42193c> a() {
        return this.consent;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getFio() {
        return this.fio;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }
}
