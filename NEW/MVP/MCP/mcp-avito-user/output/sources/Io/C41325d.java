package iO;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InteriorPhotosBlockState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LiO/d;", "", "a", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iO.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C41325d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f398511c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C41325d f398512d = new C41325d(C42784z0.f406748b, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Image> f398513a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f398514b;

    /* compiled from: InteriorPhotosBlockState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiO/d$a;", "", "<init>", "()V", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iO.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41325d(@k List<Image> list, @l AttributedText attributedText) {
        this.f398513a = list;
        this.f398514b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41325d)) {
            return false;
        }
        C41325d c41325d = (C41325d) obj;
        return L.f(this.f398513a, c41325d.f398513a) && L.f(this.f398514b, c41325d.f398514b);
    }

    public final int hashCode() {
        int iHashCode = this.f398513a.hashCode() * 31;
        AttributedText attributedText = this.f398514b;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InteriorPhotosBlockState(images=");
        sb2.append(this.f398513a);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f398514b, ')');
    }
}
