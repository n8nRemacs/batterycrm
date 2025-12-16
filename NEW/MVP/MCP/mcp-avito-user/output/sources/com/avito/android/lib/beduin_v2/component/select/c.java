package com.avito.android.lib.beduin_v2.component.select;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.select.Select;
import com.avito.android.lib.design.select.state.SelectState;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.select.state.AvitoSelectState;
import com.avito.beduin.v2.avito.component.select.state.q;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/select/c;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState;", "Lcom/avito/android/lib/design/select/Select;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_select"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC36333c<AvitoSelectState, Select> {

    /* compiled from: SelectComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/select/c$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_select"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<AvitoSelectState> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f175886c = new a();

        public a() {
            super(q.f335029c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new c();
        }
    }

    /* compiled from: SelectComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AvitoSelectState.SelectState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoSelectState.SelectState selectState = AvitoSelectState.SelectState.f334996c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, AvitoSelectState avitoSelectState) {
        SelectState.BorderState borderState;
        Object next;
        Select select = (Select) view;
        AvitoSelectState avitoSelectState2 = avitoSelectState;
        select.setStyle((com.avito.android.lib.design.select.style.d) D.a(avitoSelectState2.f334991m, kVar));
        d dVar = new d(kVar, this);
        String str = "";
        ArrayList<AvitoSelectState.b> arrayList = avitoSelectState2.f334988j.f4014b;
        String str2 = avitoSelectState2.f334986h;
        if (str2 != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((AvitoSelectState.b) next).f335003a.equals(str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AvitoSelectState.b bVar = (AvitoSelectState.b) next;
            if (bVar != null) {
                str = bVar.f335004b;
            }
        }
        String str3 = str;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (AvitoSelectState.b bVar2 : arrayList) {
            String str4 = bVar2.f335003a;
            AvitoSelectState.a aVar = bVar2.f335008f;
            Drawable drawable = aVar != null ? (Drawable) dVar.invoke(aVar) : null;
            AvitoSelectState.a aVar2 = bVar2.f335009g;
            arrayList2.add(new com.avito.android.lib.design.bottom_sheet.k(str4, bVar2.f335004b, null, bVar2.f335005c, null, bVar2.f335006d, null, bVar2.f335007e, null, bVar2.f335010h, drawable, aVar2 != null ? (Drawable) dVar.invoke(aVar2) : null, 340, null));
        }
        Drawable drawable2 = (Drawable) dVar.invoke(avitoSelectState2.f334985g);
        boolean z12 = avitoSelectState2.f334982d && !avitoSelectState2.f334983e;
        int iOrdinal = avitoSelectState2.f334984f.ordinal();
        if (iOrdinal == 0) {
            borderState = SelectState.BorderState.f180272b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            borderState = SelectState.BorderState.f180273c;
        }
        select.setState(new SelectState(str3, avitoSelectState2.f334979a, avitoSelectState2.f334980b, avitoSelectState2.f334983e, avitoSelectState2.f334987i, arrayList2, avitoSelectState2.f334989k, drawable2, null, avitoSelectState2.f334981c, z12, borderState, avitoSelectState2.f334990l, false, 0, 24832, null));
        D6.G(select, avitoSelectState2.f334992n);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new Select(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
