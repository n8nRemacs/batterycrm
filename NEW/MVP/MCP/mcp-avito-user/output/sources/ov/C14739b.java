package Ov;

import Ov.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Tariff.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LOv/b;", "LOv/k;", "LOv/l$b;", "tariffId", "Lcom/avito/android/printable_text/PrintableText;", "name", "", "description", "", "price", "LOv/a;", "baseTariff", "<init>", "(JLcom/avito/android/printable_text/PrintableText;Ljava/lang/String;JLOv/a;Lkotlin/jvm/internal/w;)V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ov.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14739b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f12668a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f12669b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f12670c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12671d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C14738a f12672e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12673f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12674g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12675h;

    /* renamed from: i, reason: collision with root package name */
    public final long f12676i;

    public C14739b(long j12, PrintableText printableText, String str, long j13, C14738a c14738a, C42822w c42822w) {
        this.f12668a = j12;
        this.f12669b = printableText;
        this.f12670c = str;
        this.f12671d = j13;
        this.f12672e = c14738a;
        this.f12673f = c14738a.f12662c;
        this.f12674g = c14738a.f12663d;
        this.f12675h = c14738a.f12664e;
        this.f12676i = j12;
    }

    @Override // Ov.k
    /* renamed from: a, reason: from getter */
    public final boolean getF12664e() {
        return this.f12675h;
    }

    @Override // Ov.k
    /* renamed from: b, reason: from getter */
    public final boolean getF12662c() {
        return this.f12673f;
    }

    @Override // Ov.k
    public final l c() {
        return l.b.a(this.f12668a);
    }

    @Override // Ov.k
    /* renamed from: d, reason: from getter */
    public final boolean getF12663d() {
        return this.f12674g;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14739b)) {
            return false;
        }
        C14739b c14739b = (C14739b) obj;
        return this.f12668a == c14739b.f12668a && L.f(this.f12669b, c14739b.f12669b) && L.f(this.f12670c, c14739b.f12670c) && this.f12671d == c14739b.f12671d && L.f(this.f12672e, c14739b.f12672e);
    }

    @Override // Ov.k
    @Y61.k
    /* renamed from: getDescription, reason: from getter */
    public final String getF12666g() {
        return this.f12670c;
    }

    @Override // Ov.k
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final PrintableText getF12660a() {
        return this.f12669b;
    }

    public final int hashCode() {
        return this.f12672e.hashCode() + r.g(H.d(com.avito.android.actions_sheet.a.f(this.f12669b, Long.hashCode(this.f12668a) * 31, 31), 31, this.f12670c), 31, this.f12671d);
    }

    @Y61.k
    public final String toString() {
        return "CustomTariff(tariffId=" + ((Object) ("CustomId(id=" + this.f12668a + ')')) + ", name=" + this.f12669b + ", description=" + this.f12670c + ", price=" + this.f12671d + ", baseTariff=" + this.f12672e + ')';
    }
}
