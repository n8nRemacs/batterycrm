package com.avito.android.lib.beduin_v2.component.description_list_parameter_line;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine;
import com.avito.beduin.v2.avito.component.description_list_parameter_line.state.DescriptionListLineStyle;
import com.avito.beduin.v2.avito.component.description_list_parameter_line.state.a;
import com.avito.beduin.v2.avito.component.description_list_parameter_line.state.m;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.theme.r;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionListParameterLineComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/description_list_parameter_line/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a;", "Lcom/avito/android/lib/design/description_list/parameter_line/DescriptionListParameterLine;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_description-list-parameter_line"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.description_list_parameter_line.state.a, DescriptionListParameterLine> {

    /* compiled from: DescriptionListParameterLineComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/description_list_parameter_line/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_description-list-parameter_line"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.description_list_parameter_line.a$a, reason: collision with other inner class name */
    public static final class C5185a extends n<com.avito.beduin.v2.avito.component.description_list_parameter_line.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C5185a f175589c = new C5185a();

        public C5185a() {
            super(m.f334296c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* compiled from: DescriptionListParameterLineComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DescriptionListLineStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DescriptionListLineStyle.a aVar = DescriptionListLineStyle.f334265c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.description_list_parameter_line.state.a aVar) {
        DescriptionListParameterLine.LineType lineType;
        r rVar;
        DescriptionListParameterLine descriptionListParameterLine = (DescriptionListParameterLine) view;
        com.avito.beduin.v2.avito.component.description_list_parameter_line.state.a aVar2 = aVar;
        descriptionListParameterLine.setStyle((com.avito.android.lib.design.description_list.parameter_line.b) D.a(aVar2.f334271b, kVar));
        int iOrdinal = aVar2.f334272c.ordinal();
        if (iOrdinal == 0) {
            lineType = DescriptionListParameterLine.LineType.f179058c;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lineType = DescriptionListParameterLine.LineType.f179057b;
        }
        ArrayList<a.C10374a> arrayList = aVar2.f334270a.f4014b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (a.C10374a c10374a : arrayList) {
            String str = c10374a.f334277a;
            Integer numValueOf = null;
            a.b bVar = c10374a.f334279c;
            Drawable drawableC = bVar != null ? D.c(kVar, bVar.f334281a, bVar.f334282b, Integer.valueOf(s(bVar.f334283c))) : null;
            Y41.a<G0> aVar3 = c10374a.f334280d;
            ViewOnClickListenerC31042l viewOnClickListenerC31042l = aVar3 != null ? new ViewOnClickListenerC31042l(4, new com.avito.android.lib.beduin_v2.component.description_list_parameter_line.b(aVar3)) : null;
            if (bVar != null && (rVar = bVar.f334283c) != null) {
                numValueOf = Integer.valueOf(s(rVar));
            }
            arrayList2.add(new com.avito.android.lib.design.description_list.a(str, c10374a.f334278b, viewOnClickListenerC31042l, drawableC, numValueOf));
        }
        descriptionListParameterLine.setState(new com.avito.android.lib.design.description_list.parameter_line.a(arrayList2, lineType));
        M.a(descriptionListParameterLine, aVar2.f334273d);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new DescriptionListParameterLine(viewGroup.getContext(), null, 0, 0, 2, null);
    }
}
