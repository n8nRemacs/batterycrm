package com.avito.android.oauth.repository;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccountData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/repository/a;", "", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f208457a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f208458b;

    public a(@k String str, @l Image image) {
        this.f208457a = str;
        this.f208458b = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f208457a, aVar.f208457a) && L.f(this.f208458b, aVar.f208458b);
    }

    public final int hashCode() {
        int iHashCode = this.f208457a.hashCode() * 31;
        Image image = this.f208458b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountData(name=");
        sb2.append(this.f208457a);
        sb2.append(", avatarImage=");
        return AK.c.o(sb2, this.f208458b, ')');
    }

    public /* synthetic */ a(String str, Image image, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : image);
    }
}
