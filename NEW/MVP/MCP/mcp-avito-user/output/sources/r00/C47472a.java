package r00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetConsultationSlotsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr00/a;", "", "", "Lr00/b;", "callDays", "", "phone", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C47472a {

    @com.google.gson.annotations.c("callDays")
    @k
    private final List<C47473b> callDays;

    @com.google.gson.annotations.c("phone")
    @l
    private final String phone;

    public C47472a(@k List<C47473b> list, @l String str) {
        this.callDays = list;
        this.phone = str;
    }

    @k
    public final List<C47473b> a() {
        return this.callDays;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }
}
