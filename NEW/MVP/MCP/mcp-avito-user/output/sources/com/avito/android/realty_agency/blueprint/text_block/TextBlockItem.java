package com.avito.android.realty_agency.blueprint.text_block;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextBlockItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/blueprint/text_block/TextBlockItem;", "Lcom/avito/conveyor_item/a;", "Alignment", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TextBlockItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250882b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f250883c;

    /* renamed from: d, reason: collision with root package name */
    public final int f250884d;

    /* renamed from: e, reason: collision with root package name */
    public final int f250885e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Alignment f250886f;

    /* renamed from: g, reason: collision with root package name */
    public final int f250887g;

    /* renamed from: h, reason: collision with root package name */
    public final int f250888h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/blueprint/text_block/TextBlockItem$Alignment;", "", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        /* renamed from: b, reason: collision with root package name */
        public static final Alignment f250889b;

        /* renamed from: c, reason: collision with root package name */
        public static final Alignment f250890c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f250891d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f250892e;

        static {
            Alignment alignment = new Alignment("LEFT", 0);
            f250889b = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            f250890c = alignment2;
            Alignment[] alignmentArr = {alignment, alignment2, new Alignment("RIGHT", 2)};
            f250891d = alignmentArr;
            f250892e = kotlin.enums.c.a(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f250891d.clone();
        }
    }

    public TextBlockItem(String str, PrintableText printableText, int i12, int i13, Alignment alignment, int i14, int i15, int i16, C42822w c42822w) {
        i12 = (i16 & 4) != 0 ? R.attr.textH25 : i12;
        i13 = (i16 & 8) != 0 ? R.attr.black : i13;
        alignment = (i16 & 16) != 0 ? Alignment.f250889b : alignment;
        i14 = (i16 & 32) != 0 ? 8 : i14;
        i15 = (i16 & 64) != 0 ? 8 : i15;
        this.f250882b = str;
        this.f250883c = printableText;
        this.f250884d = i12;
        this.f250885e = i13;
        this.f250886f = alignment;
        this.f250887g = i14;
        this.f250888h = i15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextBlockItem)) {
            return false;
        }
        TextBlockItem textBlockItem = (TextBlockItem) obj;
        return L.f(this.f250882b, textBlockItem.f250882b) && L.f(this.f250883c, textBlockItem.f250883c) && this.f250884d == textBlockItem.f250884d && this.f250885e == textBlockItem.f250885e && this.f250886f == textBlockItem.f250886f && this.f250887g == textBlockItem.f250887g && this.f250888h == textBlockItem.f250888h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF248509c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248509c() {
        return this.f250882b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250888h) + r.e(this.f250887g, (this.f250886f.hashCode() + r.e(this.f250885e, r.e(this.f250884d, com.avito.android.actions_sheet.a.f(this.f250883c, this.f250882b.hashCode() * 31, 31), 31), 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextBlockItem(stringId=");
        sb2.append(this.f250882b);
        sb2.append(", text=");
        sb2.append(this.f250883c);
        sb2.append(", appearanceAttrId=");
        sb2.append(this.f250884d);
        sb2.append(", color=");
        sb2.append(this.f250885e);
        sb2.append(", alignment=");
        sb2.append(this.f250886f);
        sb2.append(", topPaddingDp=");
        sb2.append(this.f250887g);
        sb2.append(", bottomPaddingDp=");
        return r.t(sb2, this.f250888h, ')');
    }
}
