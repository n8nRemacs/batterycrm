package KZ;

import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;

/* compiled from: ApplicationAddApplicantItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/a;", "LKZ/p;", "", "title", "description", "", "canAddSpouseMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14271a implements InterfaceC14286p {

    @com.google.gson.annotations.c("canAddSpouse")
    @Y61.l
    private final Boolean canAddSpouseMeta;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14271a(@Y61.k String str, @Y61.k String str2, @Y61.l Boolean bool) {
        this.title = str;
        this.description = str2;
        this.canAddSpouseMeta = bool;
    }

    public final boolean a() {
        Boolean bool = this.canAddSpouseMeta;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14271a)) {
            return false;
        }
        C14271a c14271a = (C14271a) obj;
        return kotlin.jvm.internal.L.f(this.title, c14271a.title) && kotlin.jvm.internal.L.f(this.description, c14271a.description) && kotlin.jvm.internal.L.f(this.canAddSpouseMeta, c14271a.canAddSpouseMeta);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.description);
        Boolean bool = this.canAddSpouseMeta;
        return iD2 + (bool == null ? 0 : bool.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAddApplicantItemValue(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", canAddSpouseMeta=");
        return C0.g(sb2, this.canAddSpouseMeta, ')');
    }
}
