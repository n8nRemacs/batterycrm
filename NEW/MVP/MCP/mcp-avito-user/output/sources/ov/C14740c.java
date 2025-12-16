package Ov;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorUiData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/c;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ov.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14740c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f12677a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f12678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final i f12679c;

    public C14740c(@Y61.k AttributedText attributedText, @Y61.l String str, @Y61.l i iVar) {
        this.f12677a = attributedText;
        this.f12678b = str;
        this.f12679c = iVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14740c)) {
            return false;
        }
        C14740c c14740c = (C14740c) obj;
        return L.f(this.f12677a, c14740c.f12677a) && L.f(this.f12678b, c14740c.f12678b) && L.f(this.f12679c, c14740c.f12679c);
    }

    public final int hashCode() {
        int iHashCode = this.f12677a.hashCode() * 31;
        String str = this.f12678b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f12679c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CustomTariffsCardOnboarding(text=" + this.f12677a + ", badgeText=" + this.f12678b + ", button=" + this.f12679c + ')';
    }
}
