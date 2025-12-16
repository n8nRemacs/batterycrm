package com.avito.android.brandspace.brandspace.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39736a;
import gj.InterfaceC40691b;
import java.util.List;
import javax.inject.Inject;
import jk.AbstractC42392c;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import lj.InterfaceC43779a;
import lj.d;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Ljk/c;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements u<BrandspaceInternalAction, AbstractC42392c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f107674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f107675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47104b f107676d;

    @Inject
    public l(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k InterfaceC47104b interfaceC47104b) {
        this.f107674b = interfaceC35745a5;
        this.f107675c = interfaceC40691b;
        this.f107676d = interfaceC47104b;
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC42392c a(BrandspaceInternalAction brandspaceInternalAction, AbstractC42392c abstractC42392c) {
        BrandspaceInternalAction brandspaceInternalAction2 = brandspaceInternalAction;
        AbstractC42392c abstractC42392c2 = abstractC42392c;
        if (brandspaceInternalAction2 instanceof BrandspaceInternalAction.ShowLoading) {
            return AbstractC42392c.d.f405801b;
        }
        if (brandspaceInternalAction2 instanceof BrandspaceInternalAction.ShowError) {
            return new AbstractC42392c.a(((BrandspaceInternalAction.ShowError) brandspaceInternalAction2).f107653b);
        }
        if (!(brandspaceInternalAction2 instanceof BrandspaceInternalAction.Loaded)) {
            return abstractC42392c2;
        }
        InterfaceC40691b interfaceC40691b = this.f107675c;
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.j();
        InterfaceC43779a interfaceC43779aJ2 = interfaceC40691b.j();
        InterfaceC43779a interfaceC43779aJ3 = interfaceC40691b.j();
        InterfaceC47104b interfaceC47104b = this.f107676d;
        InterfaceC39736a interfaceC39736aF = interfaceC47104b.F();
        InterfaceC39736a interfaceC39736aF2 = interfaceC47104b.F();
        InterfaceC39736a interfaceC39736aF3 = interfaceC47104b.F();
        Brandspace brandspace = ((BrandspaceInternalAction.Loaded) brandspaceInternalAction2).f107652b;
        AbstractC42392c.C11579c c11579c = new AbstractC42392c.C11579c(this.f107674b, brandspace, interfaceC43779aJ, interfaceC43779aJ2, interfaceC43779aJ3, interfaceC39736aF, interfaceC39736aF2, interfaceC39736aF3);
        List<BeduinModel> topComponents = brandspace.getTopComponents();
        if (topComponents == null) {
            topComponents = C42784z0.f406748b;
        }
        String topFormId = brandspace.getTopFormId();
        if (topFormId == null) {
            topFormId = "top";
        }
        c11579c.f405792d.h(new d.k(topComponents, topFormId));
        List<BeduinModel> mainComponents = brandspace.getMainComponents();
        String mainFormId = brandspace.getMainFormId();
        if (mainFormId == null) {
            mainFormId = "main";
        }
        c11579c.f405793e.h(new d.k(mainComponents, mainFormId));
        List<BeduinModel> bottomComponents = brandspace.getBottomComponents();
        if (bottomComponents == null) {
            bottomComponents = C42784z0.f406748b;
        }
        String bottomFormId = brandspace.getBottomFormId();
        if (bottomFormId == null) {
            bottomFormId = "bottom";
        }
        c11579c.f405794f.h(new d.k(bottomComponents, bottomFormId));
        return c11579c;
    }
}
