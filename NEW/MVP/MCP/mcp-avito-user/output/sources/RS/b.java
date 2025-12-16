package RS;

import PK0.b;
import Y61.k;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.text.state.C;
import com.avito.beduin.v2.avito.component.text.state.C36232a;
import com.avito.beduin.v2.avito.component.text.state.i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TextComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LRS/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/text/state/a;", "Lcom/avito/android/lib/design/text_view/a;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_text"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<C36232a, com.avito.android.lib.design.text_view.a> {

    /* compiled from: TextComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LRS/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/text/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_text"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<C36232a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f14447c = new a();

        public a() {
            super(i.f335350c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, C36232a c36232a) {
        int i12;
        PK0.b bVar;
        ColorStateList colorStateListValueOf;
        com.avito.android.lib.design.text_view.a aVar = (com.avito.android.lib.design.text_view.a) view;
        C36232a c36232a2 = c36232a;
        aVar.setText(c36232a2.f335332a);
        D6.G(aVar, c36232a2.f335339h);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        if (!c36232a2.f335333b) {
            truncateAt = null;
        }
        aVar.setEllipsize(truncateAt);
        int i13 = c36232a2.f335334c;
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 <= 0) {
            numValueOf = null;
        }
        aVar.setMaxLines(numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE);
        int iOrdinal = c36232a2.f335335d.ordinal();
        if (iOrdinal == 0) {
            i12 = 8388611;
        } else if (iOrdinal == 1) {
            i12 = 8388613;
        } else if (iOrdinal != 2) {
            i12 = 3;
            if (iOrdinal == 3) {
                i12 = 7;
            } else if (iOrdinal != 4) {
                i12 = 5;
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i12 = 17;
        }
        aVar.setGravity(i12);
        PK0.n nVar = (PK0.n) D.a(c36232a2.f335336e, kVar);
        C c12 = c36232a2.f335338g;
        if (c12 == null) {
            bVar = null;
        } else {
            String str = c12.f335318f;
            Drawable drawable = str != null ? (Drawable) kVar.f338363a.c(str, null) : null;
            r rVar = c12.f335317e;
            C35763c0 c35763c0B = (rVar == null || (colorStateListValueOf = ColorStateList.valueOf(s(rVar))) == null) ? null : C35771d0.b(colorStateListValueOf);
            PK0.n nVar2 = (PK0.n) D.a(c12.f335316d, kVar);
            bVar = new PK0.b(c12.f335313a, c12.f335314b, c12.f335315c, 0, c35763c0B, drawable, new b.a(nVar2.f12987a, nVar2.f12989c));
        }
        aVar.setTextStyleData(PK0.n.a(nVar, null, null, null, null, null, null, null, null, bVar, 4095));
        ET0.b bVar2 = c36232a2.f335337f;
        aVar.setPadding(bVar2 != null ? y6.b(bVar2.f4016a) : 0, bVar2 != null ? y6.b(bVar2.f4019d) : 0, bVar2 != null ? y6.b(bVar2.f4017b) : 0, bVar2 != null ? y6.b(bVar2.f4018c) : 0);
        aVar.setOnExpandListener(c12 != null ? c12.f335319g : null);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new com.avito.android.lib.design.text_view.a(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
