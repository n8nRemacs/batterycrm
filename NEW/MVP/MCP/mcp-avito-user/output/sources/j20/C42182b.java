package j20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetParticipantFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj20/b;", "", "Lj20/f;", "fullName", "phone", "", "title", "<init>", "(Lj20/f;Lj20/f;Ljava/lang/String;)V", "Lj20/f;", "a", "()Lj20/f;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j20.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42182b {

    @com.google.gson.annotations.c("fullName")
    @k
    private final f fullName;

    @com.google.gson.annotations.c("phone")
    @k
    private final f phone;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C42182b(@k f fVar, @k f fVar2, @k String str) {
        this.fullName = fVar;
        this.phone = fVar2;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final f getFullName() {
        return this.fullName;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final f getPhone() {
        return this.phone;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
