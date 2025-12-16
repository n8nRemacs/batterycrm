package Jc0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJc0/a;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C14186a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9049a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9050b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9051c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f9052d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9053e;

    public C14186a(long j12, @k String str, @k String str2, @l Image image, boolean z12) {
        this.f9049a = j12;
        this.f9050b = str;
        this.f9051c = str2;
        this.f9052d = image;
        this.f9053e = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14186a)) {
            return false;
        }
        C14186a c14186a = (C14186a) obj;
        return this.f9049a == c14186a.f9049a && L.f(this.f9050b, c14186a.f9050b) && L.f(this.f9051c, c14186a.f9051c) && L.f(this.f9052d, c14186a.f9052d) && this.f9053e == c14186a.f9053e;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f9049a) * 31, 31, this.f9050b), 31, this.f9051c);
        Image image = this.f9052d;
        return Boolean.hashCode(this.f9053e) + ((iD2 + (image == null ? 0 : image.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkGroup(id=");
        sb2.append(this.f9049a);
        sb2.append(", name=");
        sb2.append(this.f9050b);
        sb2.append(", description=");
        sb2.append(this.f9051c);
        sb2.append(", image=");
        sb2.append(this.f9052d);
        sb2.append(", isDisabled=");
        return r.x(sb2, this.f9053e, ')');
    }
}
