package com.avito.beduin.v2.component.box.android_view;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import com.avito.beduin.v2.component.box.android_view.f;
import com.avito.beduin.v2.component.box.state.a;
import com.avito.beduin.v2.component.box.state.b;
import com.avito.beduin.v2.component.common.Alignments;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BoxComponent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u0007¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/a;", "Lcom/avito/beduin/v2/component/box/state/a;", "S", "Lcom/avito/beduin/v2/component/box/android_view/f;", "V", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/component/box/state/b$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a<S extends com.avito.beduin.v2.component.box.state.a, V extends f> extends q<S, V, b.a> implements s.c<b.a> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f335548o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f335549m;

    /* renamed from: n, reason: collision with root package name */
    public s<b.a> f335550n;

    /* compiled from: BoxComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.box.android_view.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10385a {
        static {
            int[] iArr = new int[Alignments.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Alignments alignments = Alignments.f335642b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Alignments alignments2 = Alignments.f335642b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Alignments alignments3 = Alignments.f335642b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Alignments alignments4 = Alignments.f335642b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Alignments alignments5 = Alignments.f335642b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Alignments alignments6 = Alignments.f335642b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Alignments alignments7 = Alignments.f335642b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Alignments alignments8 = Alignments.f335642b;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public a(@k A a12) {
        super(null, 1, null);
        this.f335549m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
        return ((b.a) interfaceC36244d).f335577b.equals(((b.a) interfaceC36244d2).f335577b);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
        int i12;
        b.a.C10388a c10388a = ((b.a) interfaceC36244d).f335577b;
        f.b bVar = new f.b(e.a(resources, c10388a.f335579b), e.a(resources, c10388a.f335580c));
        ET0.b bVar2 = c10388a.f335581d;
        bVar.setMargins(e.a(resources, bVar2 != null ? bVar2.f4016a : 0), e.a(resources, bVar2 != null ? bVar2.f4019d : 0), e.a(resources, bVar2 != null ? bVar2.f4017b : 0), e.a(resources, bVar2 != null ? bVar2.f4018c : 0));
        switch (c10388a.f335578a.ordinal()) {
            case 0:
                i12 = 8388659;
                break;
            case 1:
                i12 = 49;
                break;
            case 2:
                i12 = 8388661;
                break;
            case 3:
                i12 = 8388627;
                break;
            case 4:
                i12 = 17;
                break;
            case 5:
                i12 = 8388629;
                break;
            case 6:
                i12 = 8388691;
                break;
            case 7:
                i12 = 81;
                break;
            case 8:
                i12 = 8388693;
                break;
            default:
                throw new IllegalArgumentException();
        }
        bVar.f335555a = i12;
        return bVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean h(InterfaceC36244d interfaceC36244d) {
        return ((b.a) interfaceC36244d).f335577b.f335582e;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        f fVar = (f) view;
        com.avito.beduin.v2.component.box.state.a aVar = (com.avito.beduin.v2.component.box.state.a) obj;
        Y41.a<G0> aVarU = aVar.u();
        fVar.setOnClickListener(aVarU != null ? new i(15, aVarU) : null);
        fVar.setClickable(aVar.u() != null);
        M.a(fVar, aVar.getF334412c());
        ET0.b f335571d = aVar.getF335571d();
        int iB2 = ET0.d.b(fVar.getResources(), f335571d != null ? f335571d.f4016a : 0);
        ET0.b f335571d2 = aVar.getF335571d();
        int iB3 = ET0.d.b(fVar.getResources(), f335571d2 != null ? f335571d2.f4019d : 0);
        ET0.b f335571d3 = aVar.getF335571d();
        int iB4 = ET0.d.b(fVar.getResources(), f335571d3 != null ? f335571d3.f4017b : 0);
        ET0.b f335571d4 = aVar.getF335571d();
        fVar.setPadding(iB2, iB3, iB4, ET0.d.b(fVar.getResources(), f335571d4 != null ? f335571d4.f4018c : 0));
        fVar.setBackgroundColor(s(aVar.getF335569b()));
        s<b.a> sVar = this.f335550n;
        s.a(b.f335551l, sVar != null ? sVar : null, kVar, aVar.getF335568a());
        v(fVar, kVar, aVar);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        f fVarW = w(viewGroup);
        A a12 = this.f335549m;
        this.f335550n = new s<>(a12, a12.f337907c, fVarW, this, R.id.box_child_component, this);
        return fVarW;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<b.a> sVar = this.f335550n;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }

    public abstract void v(@k V v12, @k com.avito.beduin.v2.theme.k kVar, @k S s5);

    @k
    public abstract V w(@k ViewGroup viewGroup);
}
