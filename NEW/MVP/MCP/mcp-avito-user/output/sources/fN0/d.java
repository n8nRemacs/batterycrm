package fN0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoPickerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LfN0/d;", "", "a", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f395875b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f395876c = new d(C42784z0.f406748b);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.android.video_picker.ui.item.video_card.c> f395877a;

    /* compiled from: VideoPickerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfN0/d$a;", "", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k List<com.avito.android.video_picker.ui.item.video_card.c> list) {
        this.f395877a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f395877a, ((d) obj).f395877a);
    }

    public final int hashCode() {
        return this.f395877a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("VideoPickerState(videoCards="), this.f395877a, ')');
    }
}
