package com.avito.android.mortgage.root.list.items.bank;

import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BankItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f202303b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f202304c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f202305d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f202306e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<e> f202307f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ApplicationAppealComment f202308g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final f f202309h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final d f202310i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final d f202311j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f202312k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f202313l;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText, @Y61.k List<e> list, @Y61.l ApplicationAppealComment applicationAppealComment, @Y61.l f fVar, @Y61.l d dVar, @Y61.l d dVar2, boolean z12, boolean z13) {
        this.f202303b = str;
        this.f202304c = str2;
        this.f202305d = str3;
        this.f202306e = attributedText;
        this.f202307f = list;
        this.f202308g = applicationAppealComment;
        this.f202309h = fVar;
        this.f202310i = dVar;
        this.f202311j = dVar2;
        this.f202312k = z12;
        this.f202313l = z13;
    }

    public static c a(c cVar, f fVar, d dVar, int i12) {
        String str = cVar.f202303b;
        String str2 = cVar.f202304c;
        String str3 = cVar.f202305d;
        AttributedText attributedText = cVar.f202306e;
        List<e> list = cVar.f202307f;
        ApplicationAppealComment applicationAppealComment = cVar.f202308g;
        if ((i12 & 64) != 0) {
            fVar = cVar.f202309h;
        }
        f fVar2 = fVar;
        d dVar2 = cVar.f202310i;
        if ((i12 & 256) != 0) {
            dVar = cVar.f202311j;
        }
        d dVar3 = dVar;
        boolean z12 = cVar.f202312k;
        boolean z13 = (i12 & 1024) != 0 ? cVar.f202313l : false;
        cVar.getClass();
        return new c(str, str2, str3, attributedText, list, applicationAppealComment, fVar2, dVar2, dVar3, z12, z13);
    }

    @Override // a10.InterfaceC19664a
    @Y61.k
    public final InterfaceC19665b N() {
        return a(this, null, null, 1023);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202303b, cVar.f202303b) && L.f(this.f202304c, cVar.f202304c) && L.f(this.f202305d, cVar.f202305d) && L.f(this.f202306e, cVar.f202306e) && L.f(this.f202307f, cVar.f202307f) && L.f(this.f202308g, cVar.f202308g) && L.f(this.f202309h, cVar.f202309h) && L.f(this.f202310i, cVar.f202310i) && L.f(this.f202311j, cVar.f202311j) && this.f202312k == cVar.f202312k && this.f202313l == cVar.f202313l;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202396f() {
        return this.f202313l;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281447b() {
        return this.f202303b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f202303b.hashCode() * 31, 31, this.f202304c), 31, this.f202305d);
        AttributedText attributedText = this.f202306e;
        int iE2 = H.e((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f202307f);
        ApplicationAppealComment applicationAppealComment = this.f202308g;
        int iHashCode = (iE2 + (applicationAppealComment == null ? 0 : applicationAppealComment.hashCode())) * 31;
        f fVar = this.f202309h;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.f202310i;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f202311j;
        return Boolean.hashCode(this.f202313l) + r.i((iHashCode3 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31, this.f202312k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankItem(stringId=");
        sb2.append(this.f202303b);
        sb2.append(", iconUrl=");
        sb2.append(this.f202304c);
        sb2.append(", title=");
        sb2.append(this.f202305d);
        sb2.append(", subtitle=");
        sb2.append(this.f202306e);
        sb2.append(", creditInfoFields=");
        sb2.append(this.f202307f);
        sb2.append(", comment=");
        sb2.append(this.f202308g);
        sb2.append(", selectBankAction=");
        sb2.append(this.f202309h);
        sb2.append(", textToManagerAction=");
        sb2.append(this.f202310i);
        sb2.append(", goToApplicationAction=");
        sb2.append(this.f202311j);
        sb2.append(", isClickable=");
        sb2.append(this.f202312k);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202313l, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, AttributedText attributedText, List list, ApplicationAppealComment applicationAppealComment, f fVar, d dVar, d dVar2, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, str3, attributedText, list, applicationAppealComment, fVar, dVar, dVar2, z12, (i12 & 1024) != 0 ? true : z13);
    }
}
