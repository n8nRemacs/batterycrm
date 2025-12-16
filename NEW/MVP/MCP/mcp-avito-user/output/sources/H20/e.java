package h20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetClientFormGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh20/e;", "", "Lh20/f;", "email", "firstName", "lastName", "middleName", "phone", "", "title", "<init>", "(Lh20/f;Lh20/f;Lh20/f;Lh20/f;Lh20/f;Ljava/lang/String;)V", "Lh20/f;", "a", "()Lh20/f;", "b", "c", "d", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    @com.google.gson.annotations.c("email")
    @l
    private final f email;

    @com.google.gson.annotations.c("firstName")
    @k
    private final f firstName;

    @com.google.gson.annotations.c("lastName")
    @k
    private final f lastName;

    @com.google.gson.annotations.c("middleName")
    @k
    private final f middleName;

    @com.google.gson.annotations.c("phone")
    @k
    private final f phone;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@l f fVar, @k f fVar2, @k f fVar3, @k f fVar4, @k f fVar5, @k String str) {
        this.email = fVar;
        this.firstName = fVar2;
        this.lastName = fVar3;
        this.middleName = fVar4;
        this.phone = fVar5;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getEmail() {
        return this.email;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final f getFirstName() {
        return this.firstName;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final f getLastName() {
        return this.lastName;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final f getMiddleName() {
        return this.middleName;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final f getPhone() {
        return this.phone;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
