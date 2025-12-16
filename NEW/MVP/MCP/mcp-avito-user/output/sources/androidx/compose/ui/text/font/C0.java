package androidx.compose.ui.text.font;

import androidx.compose.runtime.I3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/C0;", "Landroidx/compose/runtime/I3;", "", "a", "b", "Landroidx/compose/ui/text/font/C0$a;", "Landroidx/compose/ui/text/font/C0$b;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface C0 extends I3<Object> {

    /* compiled from: FontFamilyResolver.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/C0$a;", "Landroidx/compose/ui/text/font/C0;", "Landroidx/compose/runtime/I3;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements C0, I3<Object> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C22624s f42166b;

        public a(@Y61.k C22624s c22624s) {
            this.f42166b = c22624s;
        }

        @Override // androidx.compose.runtime.I3
        @Y61.k
        /* renamed from: getValue */
        public final Object getF42167b() {
            return this.f42166b.getF42167b();
        }

        @Override // androidx.compose.ui.text.font.C0
        /* renamed from: s */
        public final boolean getF42168c() {
            return this.f42166b.f42302h;
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/C0$b;", "Landroidx/compose/ui/text/font/C0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements C0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f42167b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f42168c;

        public b(@Y61.k Object obj, boolean z12) {
            this.f42167b = obj;
            this.f42168c = z12;
        }

        @Override // androidx.compose.runtime.I3
        @Y61.k
        /* renamed from: getValue, reason: from getter */
        public final Object getF42167b() {
            return this.f42167b;
        }

        @Override // androidx.compose.ui.text.font.C0
        /* renamed from: s, reason: from getter */
        public final boolean getF42168c() {
            return this.f42168c;
        }

        public /* synthetic */ b(Object obj, boolean z12, int i12, C42822w c42822w) {
            this(obj, (i12 & 2) != 0 ? true : z12);
        }
    }

    /* renamed from: s */
    boolean getF42168c();
}
