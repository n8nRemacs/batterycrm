package com.avito.android.auto_evidence_request.items.upload_file_form_item;

import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.auto_evidence_request.s;
import com.avito.android.photo_cache.q;
import com.avito.android.remote.model.validation.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: UploadFileFormItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/items/upload_file_form_item/c;", "Lcom/avito/conveyor_item/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f95199b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95200c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f95201d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f95202e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f95203f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<Error> f95204g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final q f95205h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Uri f95206i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Long f95207j;

    /* renamed from: k, reason: collision with root package name */
    public final int f95208k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f95209l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final s.a f95210m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final s.b f95211n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f95212o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f95213p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f95214q;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l List<Error> list, @Y61.l q qVar, @Y61.l Uri uri, @Y61.l Long l12, int i12, boolean z12, @Y61.l s.a aVar, @Y61.l s.b bVar, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8) {
        this.f95199b = str;
        this.f95200c = str2;
        this.f95201d = str3;
        this.f95202e = str4;
        this.f95203f = str5;
        this.f95204g = list;
        this.f95205h = qVar;
        this.f95206i = uri;
        this.f95207j = l12;
        this.f95208k = i12;
        this.f95209l = z12;
        this.f95210m = aVar;
        this.f95211n = bVar;
        this.f95212o = str6;
        this.f95213p = str7;
        this.f95214q = str8;
    }

    public static c a(c cVar, q qVar, Uri uri, Long l12, String str, String str2, String str3, int i12) {
        String str4 = cVar.f95199b;
        String str5 = cVar.f95200c;
        String str6 = cVar.f95201d;
        String str7 = cVar.f95202e;
        String str8 = cVar.f95203f;
        List<Error> list = cVar.f95204g;
        q qVar2 = (i12 & 64) != 0 ? cVar.f95205h : qVar;
        Uri uri2 = (i12 & 128) != 0 ? cVar.f95206i : uri;
        Long l13 = (i12 & 256) != 0 ? cVar.f95207j : l12;
        int i13 = cVar.f95208k;
        boolean z12 = cVar.f95209l;
        s.a aVar = cVar.f95210m;
        s.b bVar = cVar.f95211n;
        String str9 = (i12 & 8192) != 0 ? cVar.f95212o : str;
        String str10 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f95213p : str2;
        String str11 = (i12 & 32768) != 0 ? cVar.f95214q : str3;
        cVar.getClass();
        return new c(str4, str5, str6, str7, str8, list, qVar2, uri2, l13, i13, z12, aVar, bVar, str9, str10, str11);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f95199b, cVar.f95199b) && L.f(this.f95200c, cVar.f95200c) && L.f(this.f95201d, cVar.f95201d) && L.f(this.f95202e, cVar.f95202e) && L.f(this.f95203f, cVar.f95203f) && L.f(this.f95204g, cVar.f95204g) && L.f(this.f95205h, cVar.f95205h) && L.f(this.f95206i, cVar.f95206i) && L.f(this.f95207j, cVar.f95207j) && this.f95208k == cVar.f95208k && this.f95209l == cVar.f95209l && L.f(this.f95210m, cVar.f95210m) && L.f(this.f95211n, cVar.f95211n) && L.f(this.f95212o, cVar.f95212o) && L.f(this.f95213p, cVar.f95213p) && L.f(this.f95214q, cVar.f95214q);
    }

    @Override // TV0.a
    public final long getId() {
        return getStringId().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f95199b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f95199b.hashCode() * 31, 31, this.f95200c), 31, this.f95201d);
        String str = this.f95202e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95203f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Error> list = this.f95204g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        q qVar = this.f95205h;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Uri uri = this.f95206i;
        int iHashCode5 = (iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31;
        Long l12 = this.f95207j;
        int i12 = r.i(r.e(this.f95208k, (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31, 31), 31, this.f95209l);
        s.a aVar = this.f95210m;
        int iHashCode6 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s.b bVar = this.f95211n;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f95212o;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95213p;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95214q;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadFileFormItem(stringId=");
        sb2.append(this.f95199b);
        sb2.append(", text=");
        sb2.append(this.f95200c);
        sb2.append(", name=");
        sb2.append(this.f95201d);
        sb2.append(", type=");
        sb2.append(this.f95202e);
        sb2.append(", icon=");
        sb2.append(this.f95203f);
        sb2.append(", errors=");
        sb2.append(this.f95204g);
        sb2.append(", loadingProgress=");
        sb2.append(this.f95205h);
        sb2.append(", imageLocalUri=");
        sb2.append(this.f95206i);
        sb2.append(", imageLoadingId=");
        sb2.append(this.f95207j);
        sb2.append(", maxCount=");
        sb2.append(this.f95208k);
        sb2.append(", required=");
        sb2.append(this.f95209l);
        sb2.append(", toastCancel=");
        sb2.append(this.f95210m);
        sb2.append(", toastDeleted=");
        sb2.append(this.f95211n);
        sb2.append(", errorMessage=");
        sb2.append(this.f95212o);
        sb2.append(", fileName=");
        sb2.append(this.f95213p);
        sb2.append(", fileSize=");
        return C22026a.c(sb2, this.f95214q, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, List list, q qVar, Uri uri, Long l12, int i12, boolean z12, s.a aVar, s.b bVar, String str6, String str7, String str8, int i13, C42822w c42822w) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : list, (i13 & 64) != 0 ? null : qVar, (i13 & 128) != 0 ? null : uri, (i13 & 256) != 0 ? null : l12, (i13 & 512) != 0 ? 1 : i12, (i13 & 1024) != 0 ? false : z12, (i13 & 2048) != 0 ? null : aVar, (i13 & 4096) != 0 ? null : bVar, (i13 & 8192) != 0 ? null : str6, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7, (i13 & 32768) != 0 ? null : str8);
    }
}
