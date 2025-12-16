package ER;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.beduin.v2.avito.component.animation.state.AvitoAnimationState;
import com.avito.beduin.v2.avito.component.animation.state.h;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AnimationComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LER/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState;", "Lcom/avito/android/lib/design/animation/AnimationView;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_animation"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<AvitoAnimationState, AnimationView> {

    /* renamed from: m, reason: collision with root package name */
    @l
    public AnimationView.a.e f4009m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public AvitoAnimationState.State f4010n;

    /* compiled from: AnimationComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LER/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_animation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ER.a$a, reason: collision with other inner class name */
    public static final class C0234a extends n<AvitoAnimationState> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0234a f4011c = new C0234a();

        public C0234a() {
            super(h.f333786c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* compiled from: AnimationComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AvitoAnimationState.RepeatMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoAnimationState.RepeatMode.a aVar = AvitoAnimationState.RepeatMode.f333761c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AvitoAnimationState.State.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvitoAnimationState.State.a aVar2 = AvitoAnimationState.State.f333766c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AvitoAnimationState.State.a aVar3 = AvitoAnimationState.State.f333766c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r10, com.avito.beduin.v2.theme.k r11, com.avito.beduin.v2.avito.component.animation.state.AvitoAnimationState r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ER.a.l(android.view.View, com.avito.beduin.v2.theme.k, java.lang.Object):void");
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new AnimationView(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
