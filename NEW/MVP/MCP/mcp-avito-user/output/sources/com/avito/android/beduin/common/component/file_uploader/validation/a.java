package com.avito.android.beduin.common.component.file_uploader.validation;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileMetaData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/validation/a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Uri f101332a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f101333b;

    /* renamed from: c, reason: collision with root package name */
    public final long f101334c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f101335d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f101336e;

    public a(@k Uri uri, @k String str, long j12, @k String str2, @k String str3) {
        this.f101332a = uri;
        this.f101333b = str;
        this.f101334c = j12;
        this.f101335d = str2;
        this.f101336e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f101332a, aVar.f101332a) && L.f(this.f101333b, aVar.f101333b) && this.f101334c == aVar.f101334c && L.f(this.f101335d, aVar.f101335d) && L.f(this.f101336e, aVar.f101336e);
    }

    public final int hashCode() {
        return this.f101336e.hashCode() + H.d(r.g(H.d(this.f101332a.hashCode() * 31, 31, this.f101333b), 31, this.f101334c), 31, this.f101335d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileMetaData(uri=");
        sb2.append(this.f101332a);
        sb2.append(", id=");
        sb2.append(this.f101333b);
        sb2.append(", size=");
        sb2.append(this.f101334c);
        sb2.append(", name=");
        sb2.append(this.f101335d);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f101336e, ')');
    }
}
