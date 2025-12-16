package f20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1ClientListGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf20/b;", "", "Lf20/c;", "email", "Lf20/d;", "fullName", "", "id", "Lf20/f;", "phone", "<init>", "(Lf20/c;Lf20/d;Ljava/lang/String;Lf20/f;)V", "Lf20/c;", "a", "()Lf20/c;", "Lf20/d;", "b", "()Lf20/d;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lf20/f;", "d", "()Lf20/f;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f20.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40221b {

    @com.google.gson.annotations.c("email")
    @k
    private final C40222c email;

    @com.google.gson.annotations.c("fullName")
    @k
    private final C40223d fullName;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("phone")
    @k
    private final C40225f phone;

    public C40221b(@k C40222c c40222c, @k C40223d c40223d, @k String str, @k C40225f c40225f) {
        this.email = c40222c;
        this.fullName = c40223d;
        this.id = str;
        this.phone = c40225f;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C40222c getEmail() {
        return this.email;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C40223d getFullName() {
        return this.fullName;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final C40225f getPhone() {
        return this.phone;
    }
}
