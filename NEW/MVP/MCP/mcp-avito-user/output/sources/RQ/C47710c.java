package rq;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SubmittingSuccessState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrq/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47710c extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f430264b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f430265c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f430266d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Uri f430267e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f430268f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f430269g;

    public C47710c() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47710c)) {
            return false;
        }
        C47710c c47710c = (C47710c) obj;
        return L.f(this.f430264b, c47710c.f430264b) && L.f(this.f430265c, c47710c.f430265c) && L.f(this.f430266d, c47710c.f430266d) && L.f(this.f430267e, c47710c.f430267e) && L.f(this.f430268f, c47710c.f430268f) && L.f(this.f430269g, c47710c.f430269g);
    }

    public final int hashCode() {
        String str = this.f430264b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f430265c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f430266d;
        int iE2 = m.e(this.f430267e, (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31);
        String str3 = this.f430268f;
        int iHashCode3 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f430269g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmittingSuccessState(title=");
        sb2.append(this.f430264b);
        sb2.append(", subtitle=");
        sb2.append(this.f430265c);
        sb2.append(", image=");
        sb2.append(this.f430266d);
        sb2.append(", promoUrl=");
        sb2.append(this.f430267e);
        sb2.append(", detailsButtonText=");
        sb2.append(this.f430268f);
        sb2.append(", proceedButtonText=");
        return C22026a.c(sb2, this.f430269g, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C47710c(String str, String str2, UniversalImage universalImage, Uri uri, String str3, String str4, int i12, C42822w c42822w) {
        String str5 = (i12 & 1) != 0 ? null : str;
        String str6 = (i12 & 2) != 0 ? null : str2;
        this((i12 & 8) != 0 ? Uri.EMPTY : uri, (i12 & 4) != 0 ? null : universalImage, str5, str6, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4);
    }

    public C47710c(@k Uri uri, @l UniversalImage universalImage, @l String str, @l String str2, @l String str3, @l String str4) {
        this.f430264b = str;
        this.f430265c = str2;
        this.f430266d = universalImage;
        this.f430267e = uri;
        this.f430268f = str3;
        this.f430269g = str4;
    }
}
