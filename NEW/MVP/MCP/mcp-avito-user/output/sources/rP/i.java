package rp;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubmittingSuccessModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/i;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final UniversalImage f430222a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430223b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f430224c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Uri f430225d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f430226e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f430227f;

    public i(@k Uri uri, @l UniversalImage universalImage, @k String str, @l String str2, @l String str3, @l String str4) {
        this.f430222a = universalImage;
        this.f430223b = str;
        this.f430224c = str2;
        this.f430225d = uri;
        this.f430226e = str3;
        this.f430227f = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f430222a, iVar.f430222a) && L.f(this.f430223b, iVar.f430223b) && L.f(this.f430224c, iVar.f430224c) && L.f(this.f430225d, iVar.f430225d) && L.f(this.f430226e, iVar.f430226e) && L.f(this.f430227f, iVar.f430227f);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f430222a;
        int iD2 = H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.f430223b);
        String str = this.f430224c;
        int iE2 = m.e(this.f430225d, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f430226e;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f430227f;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmittingSuccessBody(image=");
        sb2.append(this.f430222a);
        sb2.append(", title=");
        sb2.append(this.f430223b);
        sb2.append(", subtitle=");
        sb2.append(this.f430224c);
        sb2.append(", detailsUrl=");
        sb2.append(this.f430225d);
        sb2.append(", detailsButtonText=");
        sb2.append(this.f430226e);
        sb2.append(", proceedButtonText=");
        return C22026a.c(sb2, this.f430227f, ')');
    }
}
