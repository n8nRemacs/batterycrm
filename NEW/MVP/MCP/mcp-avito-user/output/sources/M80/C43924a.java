package m80;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnhandledPhotoPickerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm80/a;", "Lm80/k;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C43924a implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f414336a;

    /* renamed from: b, reason: collision with root package name */
    public final float f414337b;

    /* renamed from: c, reason: collision with root package name */
    public final float f414338c;

    /* renamed from: d, reason: collision with root package name */
    public final long f414339d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f414340e;

    public C43924a(@Y61.k String str, float f12, float f13, long j12, @Y61.k String str2) {
        this.f414336a = str;
        this.f414337b = f12;
        this.f414338c = f13;
        this.f414339d = j12;
        this.f414340e = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43924a)) {
            return false;
        }
        C43924a c43924a = (C43924a) obj;
        return L.f(this.f414336a, c43924a.f414336a) && Float.compare(this.f414337b, c43924a.f414337b) == 0 && Float.compare(this.f414338c, c43924a.f414338c) == 0 && this.f414339d == c43924a.f414339d && L.f(this.f414340e, c43924a.f414340e);
    }

    public final int hashCode() {
        return this.f414340e.hashCode() + r.g(r.d(this.f414338c, r.d(this.f414337b, this.f414336a.hashCode() * 31, 31), 31), 31, this.f414339d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddPhotoEvent(photoFrom=");
        sb2.append(this.f414336a);
        sb2.append(", width=");
        sb2.append(this.f414337b);
        sb2.append(", height=");
        sb2.append(this.f414338c);
        sb2.append(", size=");
        sb2.append(this.f414339d);
        sb2.append(", extension=");
        return C22026a.c(sb2, this.f414340e, ')');
    }
}
