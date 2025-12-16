package com.avito.android.photo_list_view;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.photo_list_view.AbstractC33209c;
import com.avito.android.photo_list_view.InterfaceC33208b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoImageData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view/G;", "Lcom/avito/android/photo_list_view/b;", "a", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class G implements InterfaceC33208b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f218068a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f218069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33208b.InterfaceC6540b f218070c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<InterfaceC33208b.a> f218071d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f218072e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AbstractC33209c f218073f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final a f218074g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f218075h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f218076i;

    /* compiled from: PhotoImageData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/G$a;", "", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f218077a;

        /* renamed from: b, reason: collision with root package name */
        public final long f218078b;

        public a(@Y61.k String str, long j12) {
            this.f218077a = str;
            this.f218078b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f218077a, aVar.f218077a) && this.f218078b == aVar.f218078b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f218078b) + (this.f218077a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileInfo(displayName=");
            sb2.append(this.f218077a);
            sb2.append(", sizeInBytes=");
            return androidx.appcompat.app.r.u(sb2, this.f218078b, ')');
        }
    }

    public G(@Y61.k String str, @Y61.l Uri uri, @Y61.k InterfaceC33208b.InterfaceC6540b interfaceC6540b, @Y61.k List<InterfaceC33208b.a> list, @Y61.k String str2, @Y61.k AbstractC33209c abstractC33209c, @Y61.l a aVar, boolean z12, @Y61.l String str3) {
        this.f218068a = str;
        this.f218069b = uri;
        this.f218070c = interfaceC6540b;
        this.f218071d = list;
        this.f218072e = str2;
        this.f218073f = abstractC33209c;
        this.f218074g = aVar;
        this.f218075h = z12;
        this.f218076i = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static G c(G g12, ArrayList arrayList, AbstractC33209c abstractC33209c, a aVar, int i12) {
        String str = g12.f218068a;
        Uri uri = g12.f218069b;
        InterfaceC33208b.InterfaceC6540b interfaceC6540b = g12.f218070c;
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = g12.f218071d;
        }
        List list2 = list;
        String str2 = g12.f218072e;
        if ((i12 & 32) != 0) {
            abstractC33209c = g12.f218073f;
        }
        AbstractC33209c abstractC33209c2 = abstractC33209c;
        if ((i12 & 64) != 0) {
            aVar = g12.f218074g;
        }
        boolean z12 = g12.f218075h;
        String str3 = g12.f218076i;
        g12.getClass();
        return new G(str, uri, interfaceC6540b, list2, str2, abstractC33209c2, aVar, z12, str3);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.k
    public final List<InterfaceC33208b.a> a() {
        return this.f218071d;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Uri getF218069b() {
        return this.f218069b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g12 = (G) obj;
        return kotlin.jvm.internal.L.f(this.f218068a, g12.f218068a) && kotlin.jvm.internal.L.f(this.f218069b, g12.f218069b) && kotlin.jvm.internal.L.f(this.f218070c, g12.f218070c) && kotlin.jvm.internal.L.f(this.f218071d, g12.f218071d) && kotlin.jvm.internal.L.f(this.f218072e, g12.f218072e) && kotlin.jvm.internal.L.f(this.f218073f, g12.f218073f) && kotlin.jvm.internal.L.f(this.f218074g, g12.f218074g) && this.f218075h == g12.f218075h && kotlin.jvm.internal.L.f(this.f218076i, g12.f218076i);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF218068a() {
        return this.f218068a;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33208b
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final InterfaceC33208b.InterfaceC6540b getF218070c() {
        return this.f218070c;
    }

    public final int hashCode() {
        int iHashCode = this.f218068a.hashCode() * 31;
        Uri uri = this.f218069b;
        int iHashCode2 = (this.f218073f.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.e((this.f218070c.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31, 31, this.f218071d), 31, this.f218072e)) * 31;
        a aVar = this.f218074g;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f218075h);
        String str = this.f218076i;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoImageData(id=");
        sb2.append(this.f218068a);
        sb2.append(", localUri=");
        sb2.append(this.f218069b);
        sb2.append(", state=");
        sb2.append(this.f218070c);
        sb2.append(", labels=");
        sb2.append(this.f218071d);
        sb2.append(", uploadId=");
        sb2.append(this.f218072e);
        sb2.append(", scoringState=");
        sb2.append(this.f218073f);
        sb2.append(", info=");
        sb2.append(this.f218074g);
        sb2.append(", isEnhanced=");
        sb2.append(this.f218075h);
        sb2.append(", originalId=");
        return C22026a.c(sb2, this.f218076i, ')');
    }

    public G(String str, Uri uri, InterfaceC33208b.InterfaceC6540b interfaceC6540b, List list, String str2, AbstractC33209c abstractC33209c, a aVar, boolean z12, String str3, int i12, C42822w c42822w) {
        this(str, uri, (i12 & 4) != 0 ? InterfaceC33208b.InterfaceC6540b.d.f218120a : interfaceC6540b, (i12 & 8) != 0 ? C42784z0.f406748b : list, str2, (i12 & 32) != 0 ? AbstractC33209c.C6544c.f218157a : abstractC33209c, (i12 & 64) != 0 ? null : aVar, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? null : str3);
    }
}
