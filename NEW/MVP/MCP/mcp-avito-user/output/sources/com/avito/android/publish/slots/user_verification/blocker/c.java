package com.avito.android.publish.slots.user_verification.blocker;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationBlockerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/blocker/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245107b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f245108c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f245109d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f245110e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f245111f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f245112g;

    public c(@k AttributedText attributedText, @k AttributedText attributedText2, @l AttributedText attributedText3, @k String str, @l String str2, @l String str3) {
        this.f245107b = str;
        this.f245108c = str2;
        this.f245109d = attributedText;
        this.f245110e = attributedText2;
        this.f245111f = str3;
        this.f245112g = attributedText3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f245107b, cVar.f245107b) && L.f(this.f245108c, cVar.f245108c) && L.f(this.f245109d, cVar.f245109d) && L.f(this.f245110e, cVar.f245110e) && L.f(this.f245111f, cVar.f245111f) && L.f(this.f245112g, cVar.f245112g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF229357b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229357b() {
        return this.f245107b;
    }

    public final int hashCode() {
        int iHashCode = this.f245107b.hashCode() * 31;
        String str = this.f245108c;
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f245109d), 31, this.f245110e);
        String str2 = this.f245111f;
        int iHashCode2 = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f245112g;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserVerificationBlockerItem(stringId=");
        sb2.append(this.f245107b);
        sb2.append(", image=");
        sb2.append(this.f245108c);
        sb2.append(", title=");
        sb2.append(this.f245109d);
        sb2.append(", text=");
        sb2.append(this.f245110e);
        sb2.append(", buttonText=");
        sb2.append(this.f245111f);
        sb2.append(", supportText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f245112g, ')');
    }
}
