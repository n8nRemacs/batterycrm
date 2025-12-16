package Hj;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishFieldSet.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHj/a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C13996a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f7643a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ItemWithState.State f7644b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7645c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7646d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f7647e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f7648f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f7649g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f7650h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f7651i;

    public C13996a(@k String str, @k ItemWithState.State state, boolean z12, boolean z13, @l String str2, @l AttributedText attributedText, @l Y41.a<G0> aVar, @l AttributedText attributedText2, @l String str3) {
        this.f7643a = str;
        this.f7644b = state;
        this.f7645c = z12;
        this.f7646d = z13;
        this.f7647e = str2;
        this.f7648f = attributedText;
        this.f7649g = aVar;
        this.f7650h = attributedText2;
        this.f7651i = str3;
    }

    public static C13996a a(C13996a c13996a, ItemWithState.State state) {
        return new C13996a(c13996a.f7643a, state, c13996a.f7645c, c13996a.f7646d, c13996a.f7647e, c13996a.f7648f, c13996a.f7649g, c13996a.f7650h, c13996a.f7651i);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13996a)) {
            return false;
        }
        C13996a c13996a = (C13996a) obj;
        return L.f(this.f7643a, c13996a.f7643a) && L.f(this.f7644b, c13996a.f7644b) && this.f7645c == c13996a.f7645c && this.f7646d == c13996a.f7646d && L.f(this.f7647e, c13996a.f7647e) && L.f(this.f7648f, c13996a.f7648f) && L.f(this.f7649g, c13996a.f7649g) && L.f(this.f7650h, c13996a.f7650h) && L.f(this.f7651i, c13996a.f7651i);
    }

    public final int hashCode() {
        int i12 = r.i(r.i((this.f7644b.hashCode() + (this.f7643a.hashCode() * 31)) * 31, 31, this.f7645c), 31, this.f7646d);
        String str = this.f7647e;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f7648f;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Y41.a<G0> aVar = this.f7649g;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AttributedText attributedText2 = this.f7650h;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str2 = this.f7651i;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishFieldSet(title=");
        sb2.append(this.f7643a);
        sb2.append(", state=");
        sb2.append(this.f7644b);
        sb2.append(", hideTitle=");
        sb2.append(this.f7645c);
        sb2.append(", toFillIn=");
        sb2.append(this.f7646d);
        sb2.append(", subTitle=");
        sb2.append(this.f7647e);
        sb2.append(", attributedSubTitle=");
        sb2.append(this.f7648f);
        sb2.append(", onHelp=");
        sb2.append(this.f7649g);
        sb2.append(", motivation=");
        sb2.append(this.f7650h);
        sb2.append(", badgeText=");
        return C22026a.c(sb2, this.f7651i, ')');
    }

    public /* synthetic */ C13996a(String str, ItemWithState.State state, boolean z12, boolean z13, String str2, AttributedText attributedText, Y41.a aVar, AttributedText attributedText2, String str3, int i12, C42822w c42822w) {
        this(str, state, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : attributedText, (i12 & 64) != 0 ? null : aVar, (i12 & 128) != 0 ? null : attributedText2, (i12 & 256) != 0 ? null : str3);
    }
}
