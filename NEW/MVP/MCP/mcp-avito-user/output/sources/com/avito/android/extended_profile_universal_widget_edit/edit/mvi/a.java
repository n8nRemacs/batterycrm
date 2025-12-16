package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import iB.InterfaceC41263a;
import jB.InterfaceC42227a;
import jB.InterfaceC42228b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalWidgetEditActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LjB/a;", "LjB/b;", "LjB/d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42227a, InterfaceC42228b, jB.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditArguments f153932a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a f153933b;

    /* compiled from: UniversalWidgetEditActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4493a {
        static {
            int[] iArr = new int[UniversalWidgetSectionModel.ImageWithTextType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType3 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType4 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public a(@Y61.k UniversalWidgetEditArguments universalWidgetEditArguments, @Y61.k com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a aVar) {
        this.f153932a = universalWidgetEditArguments;
        this.f153933b = aVar;
    }

    public static boolean d(Integer num, String str) {
        return str == null || num == null || str.length() <= num.intValue();
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC42228b> b(InterfaceC42227a interfaceC42227a, jB.d dVar) {
        C43210w c43210w;
        boolean zD2;
        InterfaceC42227a interfaceC42227a2 = interfaceC42227a;
        jB.d dVar2 = dVar;
        boolean z12 = interfaceC42227a2 instanceof InterfaceC42227a.h;
        boolean z13 = dVar2.f405504e;
        UniversalWidgetEditArguments universalWidgetEditArguments = this.f153932a;
        UniversalWidgetSectionModel.Section section = dVar2.f405503d;
        if (z12) {
            if (c(section)) {
                return new C43210w(InterfaceC42228b.r.f405490a);
            }
            return new C43210w(new InterfaceC42228b.d(z13 != universalWidgetEditArguments.f153655e));
        }
        if (interfaceC42227a2 instanceof InterfaceC42227a.i) {
            return new C43210w(new InterfaceC42228b.d(z13 != universalWidgetEditArguments.f153655e));
        }
        boolean z14 = interfaceC42227a2 instanceof InterfaceC42227a.j ? true : interfaceC42227a2 instanceof InterfaceC42227a.m;
        com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a aVar = this.f153933b;
        if (z14) {
            if (!c(section)) {
                return new C43210w(new InterfaceC42228b.d(z13 != universalWidgetEditArguments.f153655e));
            }
            if (section instanceof UniversalWidgetSectionModel.FactoidSection) {
                zD2 = d(universalWidgetEditArguments.f153657g.getSectionsConfig().getFactoid().getCommonFactoid().getSectionTitleLimit(), ((UniversalWidgetSectionModel.FactoidSection) section).f153558d);
            } else {
                if (section instanceof UniversalWidgetSectionModel.ImageWithTextSection) {
                    UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection = (UniversalWidgetSectionModel.ImageWithTextSection) section;
                    int iOrdinal = imageWithTextSection.f153590c.ordinal();
                    String str = imageWithTextSection.f153594g;
                    if (iOrdinal == 0) {
                        zD2 = d(universalWidgetEditArguments.f153657g.getSectionsConfig().getImageWithText().getFullWidth().getSectionTitleLimit(), str);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            zD2 = d(universalWidgetEditArguments.f153657g.getSectionsConfig().getImageWithText().getTwoColumns().getSectionTitleLimit(), str);
                        } else if (iOrdinal == 3) {
                            zD2 = d(universalWidgetEditArguments.f153657g.getSectionsConfig().getImageWithText().getThreeColumns().getSectionTitleLimit(), str);
                        } else {
                            if (iOrdinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zD2 = d(universalWidgetEditArguments.f153657g.getSectionsConfig().getImageWithText().getFourColumns().getSectionTitleLimit(), str);
                        }
                    }
                } else if (!(section instanceof UniversalWidgetSectionModel.TextSection)) {
                    throw new NoWhenBranchMatchedException();
                }
                zD2 = true;
            }
            return zD2 ? aVar.a(section) : new C43210w(new InterfaceC42228b.e(true));
        }
        if (interfaceC42227a2 instanceof InterfaceC42227a.k) {
            return aVar.e();
        }
        if (interfaceC42227a2 instanceof InterfaceC42227a.C11550a) {
            return C43175k.G(new b(this, interfaceC42227a2, null));
        }
        if (interfaceC42227a2 instanceof InterfaceC42227a.d) {
            c43210w = new C43210w(new InterfaceC42228b.k(((InterfaceC42227a.d) interfaceC42227a2).f405457a));
        } else {
            if (interfaceC42227a2 instanceof InterfaceC42227a.c) {
                return new C43210w(new InterfaceC42228b.j(new UniversalWidgetEditBlockArguments(section, ((InterfaceC42227a.c) interfaceC42227a2).f405456a, universalWidgetEditArguments.f153653c, universalWidgetEditArguments.f153657g)));
            }
            if (interfaceC42227a2 instanceof InterfaceC42227a.e) {
                InterfaceC42227a.e eVar = (InterfaceC42227a.e) interfaceC42227a2;
                UniversalWidgetSectionModel.Block block = eVar.f405458a;
                if (block instanceof UniversalWidgetSectionModel.ImageWithTextBlock) {
                    aVar.b((UniversalWidgetSectionModel.ImageWithTextBlock) block);
                }
                return new C43210w(new InterfaceC42228b.u(block, eVar.f405459b));
            }
            if (interfaceC42227a2 instanceof InterfaceC42227a.l) {
                return new C43210w(InterfaceC42228b.s.f405491a);
            }
            if (interfaceC42227a2 instanceof InterfaceC42227a.o) {
                return new C43210w(InterfaceC42228b.t.f405492a);
            }
            if (interfaceC42227a2 instanceof InterfaceC42227a.n) {
                c43210w = new C43210w(new InterfaceC42228b.i(((InterfaceC42227a.n) interfaceC42227a2).f405469a));
            } else if (interfaceC42227a2 instanceof InterfaceC42227a.f) {
                c43210w = new C43210w(new InterfaceC42228b.q(((InterfaceC42227a.f) interfaceC42227a2).f405460a));
            } else {
                if (interfaceC42227a2 instanceof InterfaceC42227a.b) {
                    return new C43210w(new InterfaceC42228b.e(false, 1, null));
                }
                if (!(interfaceC42227a2 instanceof InterfaceC42227a.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC42227a.g gVar = (InterfaceC42227a.g) interfaceC42227a2;
                InterfaceC41263a.C11369a<?> c11369a = gVar.f405461a;
                c43210w = new C43210w(new InterfaceC42228b.a(new InterfaceC41263a.C11369a(gVar.f405462b, c11369a.f398420c, c11369a.f398418a)));
            }
        }
        return c43210w;
    }

    public final boolean c(UniversalWidgetSectionModel.Section section) {
        boolean z12 = section instanceof UniversalWidgetSectionModel.FactoidSection;
        UniversalWidgetEditArguments universalWidgetEditArguments = this.f153932a;
        if (z12) {
            if (((UniversalWidgetSectionModel.FactoidSection) section).f153557c == UniversalWidgetSectionModel.FactoidItemsCountType.f153553b) {
                return !UniversalWidgetSectionModel.FactoidSection.d(r0, null, null, C42745f0.E0(r0.f153562h, 3), 31).equals(universalWidgetEditArguments.f153654d);
            }
        }
        return !L.f(section, universalWidgetEditArguments.f153654d);
    }
}
