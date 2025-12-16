package wZ;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzFloatingFooterDomain.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwZ/g;", "", "a", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final a f441560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f441561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C49578b f441562c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C49578b f441563d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C49578b f441564e;

    /* compiled from: MnzFloatingFooterDomain.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/g$a;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final C49582f f441565a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f441566b;

        public a(@Y61.k AttributedText attributedText, @Y61.l C49582f c49582f) {
            this.f441565a = c49582f;
            this.f441566b = attributedText;
        }

        public static a a(a aVar, C49582f c49582f) {
            AttributedText attributedText = aVar.f441566b;
            aVar.getClass();
            return new a(attributedText, c49582f);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f441565a, aVar.f441565a) && L.f(this.f441566b, aVar.f441566b);
        }

        public final int hashCode() {
            C49582f c49582f = this.f441565a;
            return this.f441566b.hashCode() + ((c49582f == null ? 0 : c49582f.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Contacts(current=");
            sb2.append(this.f441565a);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f441566b, ')');
        }
    }

    public g(@Y61.l a aVar, @Y61.l AttributedText attributedText, @Y61.k C49578b c49578b, @Y61.l C49578b c49578b2, @Y61.l C49578b c49578b3) {
        this.f441560a = aVar;
        this.f441561b = attributedText;
        this.f441562c = c49578b;
        this.f441563d = c49578b2;
        this.f441564e = c49578b3;
    }

    public static g a(g gVar, a aVar, C49578b c49578b, int i12) {
        if ((i12 & 1) != 0) {
            aVar = gVar.f441560a;
        }
        a aVar2 = aVar;
        AttributedText attributedText = gVar.f441561b;
        C49578b c49578b2 = gVar.f441562c;
        C49578b c49578b3 = gVar.f441563d;
        if ((i12 & 16) != 0) {
            c49578b = gVar.f441564e;
        }
        gVar.getClass();
        return new g(aVar2, attributedText, c49578b2, c49578b3, c49578b);
    }

    @Y61.k
    public final g b(@Y61.l C49582f c49582f, boolean z12) {
        a aVar = this.f441560a;
        if (z12) {
            return a(this, aVar != null ? a.a(aVar, c49582f) : null, null, 30);
        }
        if (c49582f != null) {
            return a(this, aVar != null ? a.a(aVar, c49582f) : null, null, 30);
        }
        return this;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f441560a, gVar.f441560a) && L.f(this.f441561b, gVar.f441561b) && L.f(this.f441562c, gVar.f441562c) && L.f(this.f441563d, gVar.f441563d) && L.f(this.f441564e, gVar.f441564e);
    }

    public final int hashCode() {
        a aVar = this.f441560a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        AttributedText attributedText = this.f441561b;
        int iHashCode2 = (this.f441562c.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        C49578b c49578b = this.f441563d;
        int iHashCode3 = (iHashCode2 + (c49578b == null ? 0 : c49578b.hashCode())) * 31;
        C49578b c49578b2 = this.f441564e;
        return iHashCode3 + (c49578b2 != null ? c49578b2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "MnzFloatingFooterDomain(contacts=" + this.f441560a + ", terms=" + this.f441561b + ", button=" + this.f441562c + ", secondButton=" + this.f441563d + ", additionalButton=" + this.f441564e + ')';
    }

    public /* synthetic */ g(a aVar, AttributedText attributedText, C49578b c49578b, C49578b c49578b2, C49578b c49578b3, int i12, C42822w c42822w) {
        this(aVar, attributedText, c49578b, c49578b2, (i12 & 16) != 0 ? null : c49578b3);
    }
}
