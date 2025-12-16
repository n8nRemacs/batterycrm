package com.avito.android.mnz_common.ui.compose.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzFloatingFooterCompose.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mnz_common/ui/compose/model/c;", "", "a", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mnz_common.ui.compose.model.a f198007a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final a f198008b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f198009c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.mnz_common.ui.compose.model.a f198010d;

    /* compiled from: MnzFloatingFooterCompose.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/compose/model/c$a;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final e f198011a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f198012b;

        public a(@l e eVar, @k AttributedText attributedText) {
            this.f198011a = eVar;
            this.f198012b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f198011a, aVar.f198011a) && L.f(this.f198012b, aVar.f198012b);
        }

        public final int hashCode() {
            e eVar = this.f198011a;
            return this.f198012b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Contacts(current=");
            sb2.append(this.f198011a);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f198012b, ')');
        }
    }

    public c(@k com.avito.android.mnz_common.ui.compose.model.a aVar, @l a aVar2, @l AttributedText attributedText, @l com.avito.android.mnz_common.ui.compose.model.a aVar3) {
        this.f198007a = aVar;
        this.f198008b = aVar2;
        this.f198009c = attributedText;
        this.f198010d = aVar3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f198007a, cVar.f198007a) && L.f(this.f198008b, cVar.f198008b) && L.f(this.f198009c, cVar.f198009c) && L.f(this.f198010d, cVar.f198010d);
    }

    public final int hashCode() {
        int iHashCode = this.f198007a.hashCode() * 31;
        a aVar = this.f198008b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AttributedText attributedText = this.f198009c;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        com.avito.android.mnz_common.ui.compose.model.a aVar2 = this.f198010d;
        return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MnzFloatingFooterCompose(button=" + this.f198007a + ", contacts=" + this.f198008b + ", terms=" + this.f198009c + ", secondButton=" + this.f198010d + ')';
    }

    public /* synthetic */ c(com.avito.android.mnz_common.ui.compose.model.a aVar, a aVar2, AttributedText attributedText, com.avito.android.mnz_common.ui.compose.model.a aVar3, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : aVar2, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : aVar3);
    }
}
