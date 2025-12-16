package GR;

import Y61.k;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.f;
import com.avito.android.lib.design.badge.g;
import com.avito.android.util.C35771d0;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.badge.state.j;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BadgeComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"LGR/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/badge/state/b;", "Lcom/avito/android/lib/design/badge/Badge;", "<init>", "()V", "a", "b", "_design-modules_beduin-v2_renderer_component_badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.badge.state.b, Badge> {

    /* compiled from: BadgeComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGR/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/badge/state/b;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GR.a$a, reason: collision with other inner class name */
    public static final class C0350a extends n<com.avito.beduin.v2.avito.component.badge.state.b> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0350a f6498c = new C0350a();

        public C0350a() {
            super(com.avito.beduin.v2.avito.component.badge.state.k.f333812c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* compiled from: BadgeComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LGR/a$b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/badge/state/b;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends n<com.avito.beduin.v2.avito.component.badge.state.b> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f6499c = new b();

        public b() {
            super(j.f333811c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.badge.state.b bVar) {
        r rVar;
        ColorStateList colorStateListValueOf;
        Badge badge = (Badge) view;
        com.avito.beduin.v2.avito.component.badge.state.b bVar2 = bVar;
        g gVar = (g) D.a(bVar2.f333799f, kVar);
        com.avito.beduin.v2.avito.component.badge.state.a aVar = bVar2.f333796c;
        badge.setStyle(g.a(gVar, null, 0, 0, null, aVar != null ? (int) aVar.f333792a : gVar.f178402g, (aVar == null || (rVar = aVar.f333793b) == null || (colorStateListValueOf = ColorStateList.valueOf(s(rVar))) == null) ? gVar.f178403h : C35771d0.b(colorStateListValueOf), 0, 0, 0.0f, null, 130879));
        String str = bVar2.f333794a;
        Integer num = bVar2.f333795b;
        if (num != null) {
            int iIntValue = num.intValue();
            String string = str == null ? "" : str;
            Integer numY0 = C43066x.y0(string);
            if (numY0 != null) {
                if (numY0.intValue() > iIntValue) {
                    string = null;
                }
                if (string == null || (string = string.toString()) == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIntValue);
                    sb2.append('+');
                    string = sb2.toString();
                }
            }
            if (string != null) {
                str = string;
            }
        }
        badge.setState(new f(str, Boolean.valueOf(bVar2.f333798e), bVar2.f333797d));
        D6.G(badge, bVar2.f333800g);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new Badge(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
