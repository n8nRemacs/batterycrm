package hf0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummaryFeeDetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhf0/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40930c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f397347a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f397348b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final e f397349c;

    public C40930c(@l String str, @l AttributedText attributedText, @l e eVar) {
        this.f397347a = str;
        this.f397348b = attributedText;
        this.f397349c = eVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40930c)) {
            return false;
        }
        C40930c c40930c = (C40930c) obj;
        return L.f(this.f397347a, c40930c.f397347a) && L.f(this.f397348b, c40930c.f397348b) && L.f(this.f397349c, c40930c.f397349c);
    }

    public final int hashCode() {
        String str = this.f397347a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f397348b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        e eVar = this.f397349c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DeliverySummaryFeeDetailsItem(leftText=" + this.f397347a + ", rightText=" + this.f397348b + ", bottomSheetData=" + this.f397349c + ')';
    }
}
