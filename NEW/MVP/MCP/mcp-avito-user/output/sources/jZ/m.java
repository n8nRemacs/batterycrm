package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageFormResponse.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LJZ/m;", "", "", "title", "", "needCheckAccess", "LJZ/u;", "verificationBanner", "LJZ/i;", "actionBanner", "", "LLZ/c;", "items", "<init>", "(Ljava/lang/String;ZLJZ/u;LJZ/i;Ljava/util/List;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Z", "d", "()Z", "LJZ/u;", "f", "()LJZ/u;", "LJZ/i;", "b", "()LJZ/i;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    @com.google.gson.annotations.c("actionBanner")
    @Y61.l
    private final i actionBanner;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<LZ.c> items;

    @com.google.gson.annotations.c("needCheckAccess")
    private final boolean needCheckAccess;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("verificationBanner")
    @Y61.l
    private final u verificationBanner;

    public m(@Y61.k String str, boolean z12, @Y61.l u uVar, @Y61.l i iVar, @Y61.k List<LZ.c> list) {
        this.title = str;
        this.needCheckAccess = z12;
        this.verificationBanner = uVar;
        this.actionBanner = iVar;
        this.items = list;
    }

    public static m a(m mVar, ArrayList arrayList) {
        return new m(mVar.title, mVar.needCheckAccess, mVar.verificationBanner, mVar.actionBanner, arrayList);
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final i getActionBanner() {
        return this.actionBanner;
    }

    @Y61.k
    public final List<LZ.c> c() {
        return this.items;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getNeedCheckAccess() {
        return this.needCheckAccess;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.title, mVar.title) && this.needCheckAccess == mVar.needCheckAccess && L.f(this.verificationBanner, mVar.verificationBanner) && L.f(this.actionBanner, mVar.actionBanner) && L.f(this.items, mVar.items);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final u getVerificationBanner() {
        return this.verificationBanner;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.title.hashCode() * 31, 31, this.needCheckAccess);
        u uVar = this.verificationBanner;
        int iHashCode = (i12 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        i iVar = this.actionBanner;
        return this.items.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageFormResponse(title=");
        sb2.append(this.title);
        sb2.append(", needCheckAccess=");
        sb2.append(this.needCheckAccess);
        sb2.append(", verificationBanner=");
        sb2.append(this.verificationBanner);
        sb2.append(", actionBanner=");
        sb2.append(this.actionBanner);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }
}
