package MV0;

import Y61.k;
import android.content.Context;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.C23434z;
import com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: SmoothScroller.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMV0/e;", "Landroidx/recyclerview/widget/z;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends C23434z {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f10710q = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public final ScrollToPositionInteraction.Alignment f10711p;

    /* compiled from: SmoothScroller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMV0/e$a;", "", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SmoothScroller.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: MV0.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0680a {
            static {
                int[] iArr = new int[ScrollToPositionInteraction.Alignment.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ScrollToPositionInteraction.Alignment alignment = ScrollToPositionInteraction.Alignment.f337821c;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ScrollToPositionInteraction.Alignment alignment2 = ScrollToPositionInteraction.Alignment.f337821c;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static int a(@k ScrollToPositionInteraction.Alignment alignment, int i12, int i13, int i14, int i15) {
            int iOrdinal = alignment.ordinal();
            if (iOrdinal == 0) {
                return i14 - i12;
            }
            if (iOrdinal == 1) {
                return i15 - i13;
            }
            if (iOrdinal == 2) {
                return r.f(i15, i14, 2, i14) - (((i13 - i12) / 2) + i12);
            }
            throw new NoWhenBranchMatchedException();
        }

        public a() {
        }
    }

    public e(@k Context context, @k ScrollToPositionInteraction.Alignment alignment) {
        super(context);
        this.f10711p = alignment;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int g(int i12, int i13, int i14, int i15, int i16) {
        f10710q.getClass();
        return a.a(this.f10711p, i12, i13, i14, i15);
    }
}
