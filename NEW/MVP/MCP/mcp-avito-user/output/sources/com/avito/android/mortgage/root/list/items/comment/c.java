package com.avito.android.mortgage.root.list.items.comment;

import Y61.k;
import Y61.l;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationCommentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/comment/c;", "La10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202496b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f202497c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f202498d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f202499e;

    public c(@k String str, @l String str2, @l String str3, @k AttributedText attributedText) {
        this.f202496b = str;
        this.f202497c = str2;
        this.f202498d = str3;
        this.f202499e = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202496b, cVar.f202496b) && L.f(this.f202497c, cVar.f202497c) && L.f(this.f202498d, cVar.f202498d) && L.f(this.f202499e, cVar.f202499e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85138b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85139c() {
        return this.f202496b;
    }

    public final int hashCode() {
        int iHashCode = this.f202496b.hashCode() * 31;
        String str = this.f202497c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f202498d;
        return this.f202499e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationCommentItem(stringId=");
        sb2.append(this.f202496b);
        sb2.append(", title=");
        sb2.append(this.f202497c);
        sb2.append(", badgeTitle=");
        sb2.append(this.f202498d);
        sb2.append(", comment=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f202499e, ')');
    }
}
