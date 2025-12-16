package KS;

import Y61.k;
import android.view.ViewGroup;
import com.avito.android.lib.design.surface.Surface;
import com.avito.beduin.v2.avito.component.common.Corner;
import com.avito.beduin.v2.avito.component.surface.state.e;
import com.avito.beduin.v2.component.box.android_view.f;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SurfaceComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LKS/a;", "Lcom/avito/beduin/v2/component/box/android_view/a;", "Lcom/avito/beduin/v2/avito/component/surface/state/a;", "Lcom/avito/android/lib/design/surface/Surface;", "a", "_design-modules_beduin-v2_renderer_component_surface"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.beduin.v2.component.box.android_view.a<com.avito.beduin.v2.avito.component.surface.state.a, Surface> {

    /* compiled from: SurfaceComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/surface/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_surface"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KS.a$a, reason: collision with other inner class name */
    public static final class C0570a extends n<com.avito.beduin.v2.avito.component.surface.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0570a f9459c = new C0570a();

        public C0570a() {
            super(e.f335223c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a(a12);
        }
    }

    /* compiled from: SurfaceComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9460a;

        static {
            int[] iArr = new int[Corner.Type.values().length];
            try {
                Corner.Type type = Corner.Type.f334112b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9460a = iArr;
        }
    }

    public static void x(Corner.Type type) {
        if (b.f9460a[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    @Override // com.avito.beduin.v2.component.box.android_view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.avito.beduin.v2.component.box.android_view.f r24, com.avito.beduin.v2.theme.k r25, com.avito.beduin.v2.component.box.state.a r26) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: KS.a.v(com.avito.beduin.v2.component.box.android_view.f, com.avito.beduin.v2.theme.k, com.avito.beduin.v2.component.box.state.a):void");
    }

    @Override // com.avito.beduin.v2.component.box.android_view.a
    public final f w(ViewGroup viewGroup) {
        Surface surface = new Surface(viewGroup.getContext(), null, 0, 0, 14, null);
        surface.setClipChildren(false);
        surface.setClipToPadding(false);
        return surface;
    }
}
