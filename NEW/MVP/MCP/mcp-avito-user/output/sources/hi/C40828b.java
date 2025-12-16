package hI;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhI/b;", "", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C40828b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ActivePageType f397145a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f397146b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f397147c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C40829c f397148d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f397149e;

    public C40828b(@k ActivePageType activePageType, @k PrintableText printableText, @l PrintableText printableText2, @k C40829c c40829c, @k List<? extends TV0.a> list) {
        this.f397145a = activePageType;
        this.f397146b = printableText;
        this.f397147c = printableText2;
        this.f397148d = c40829c;
        this.f397149e = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40828b)) {
            return false;
        }
        C40828b c40828b = (C40828b) obj;
        return this.f397145a == c40828b.f397145a && this.f397146b.equals(c40828b.f397146b) && L.f(this.f397147c, c40828b.f397147c) && this.f397148d.equals(c40828b.f397148d) && L.f(this.f397149e, c40828b.f397149e);
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f397146b, this.f397145a.hashCode() * 31, 31);
        PrintableText printableText = this.f397147c;
        return this.f397149e.hashCode() + C23088b.a((iF2 + (printableText == null ? 0 : printableText.hashCode())) * 31, 31, this.f397148d.f397150a);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectorViewState(activePageType=");
        sb2.append(this.f397145a);
        sb2.append(", toolbarTitle=");
        sb2.append(this.f397146b);
        sb2.append(", toolbarSubtitle=");
        sb2.append(this.f397147c);
        sb2.append(", pickerViewState=");
        sb2.append(this.f397148d);
        sb2.append(", items=");
        return H.n(sb2, this.f397149e, ')');
    }
}
