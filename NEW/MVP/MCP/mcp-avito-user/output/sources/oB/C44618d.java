package oB;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/d;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44618d implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Image f419507b;

    public C44618d(@Y61.l Image image) {
        this.f419507b = image;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44618d) && L.f(this.f419507b, ((C44618d) obj).f419507b);
    }

    public final int hashCode() {
        Image image = this.f419507b;
        if (image == null) {
            return 0;
        }
        return image.hashCode();
    }

    @Y61.k
    public final String toString() {
        return AK.c.o(new StringBuilder("AvatarClickAction(image="), this.f419507b, ')');
    }
}
