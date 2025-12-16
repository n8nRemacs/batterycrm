package com.avito.android.util;

import com.avito.android.body_condition.CarBodyConditionItem;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.mandatory_verification.items.accountVerification.MandatoryVerificationAccountVerificationItem;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ParametersListContentsComparator.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/D3;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D3 implements com.avito.android.recycler.data_aware.b {
    @Inject
    public D3() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!kotlin.jvm.internal.L.f(aVar != null ? Long.valueOf(aVar.getF268996b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF268996b()) : null)) {
            return false;
        }
        if ((aVar instanceof com.avito.android.items.d) && (aVar2 instanceof com.avito.android.items.d)) {
            com.avito.android.items.d dVar = (com.avito.android.items.d) aVar;
            com.avito.android.items.d dVar2 = (com.avito.android.items.d) aVar2;
            if (!kotlin.jvm.internal.L.f(dVar.getF117481f(), dVar2.getF117481f()) || !kotlin.jvm.internal.L.f(dVar.getF244028f(), dVar2.getF244028f())) {
                return false;
            }
            DisplayingOptions f117489n = dVar.getF117489n();
            Boolean enabled = f117489n != null ? f117489n.getEnabled() : null;
            DisplayingOptions f117489n2 = dVar2.getF117489n();
            if (!kotlin.jvm.internal.L.f(enabled, f117489n2 != null ? f117489n2.getEnabled() : null)) {
                return false;
            }
            DisplayingOptions f117489n3 = dVar.getF117489n();
            String prefix = f117489n3 != null ? f117489n3.getPrefix() : null;
            DisplayingOptions f117489n4 = dVar2.getF117489n();
            if (!kotlin.jvm.internal.L.f(prefix, f117489n4 != null ? f117489n4.getPrefix() : null)) {
                return false;
            }
            DisplayingOptions f117489n5 = dVar.getF117489n();
            String postfix = f117489n5 != null ? f117489n5.getPostfix() : null;
            DisplayingOptions f117489n6 = dVar2.getF117489n();
            if (!kotlin.jvm.internal.L.f(postfix, f117489n6 != null ? f117489n6.getPostfix() : null) || !kotlin.jvm.internal.L.f(dVar.getF243982g(), dVar2.getF243982g()) || !kotlin.jvm.internal.L.f(dVar.getF117480e(), dVar2.getF117480e()) || !kotlin.jvm.internal.L.f(dVar.getF117478F(), dVar2.getF117478F())) {
                return false;
            }
        } else {
            if ((aVar instanceof com.avito.android.items.b) && (aVar2 instanceof com.avito.android.items.b)) {
                return false;
            }
            if ((aVar instanceof ParameterElement.H) && (aVar2 instanceof ParameterElement.H)) {
                ParameterElement.H h12 = (ParameterElement.H) aVar;
                ParameterElement.H h13 = (ParameterElement.H) aVar2;
                if (!kotlin.jvm.internal.L.f(h12.f117300f, h13.f117300f) || !kotlin.jvm.internal.L.f(h12.f117309o, h13.f117309o)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.C.b) && (aVar2 instanceof ParameterElement.C.b)) {
                ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
                ParameterElement.C.b bVar2 = (ParameterElement.C.b) aVar2;
                if (!kotlin.jvm.internal.L.f(bVar.f117210f, bVar2.f117210f) || !kotlin.jvm.internal.L.f(bVar.f117219o, bVar2.f117219o) || bVar.f117216l != bVar2.f117216l) {
                    return false;
                }
                AttributedText attributedText = bVar.f117211g;
                String text = attributedText != null ? attributedText.getText() : null;
                AttributedText attributedText2 = bVar2.f117211g;
                if (!kotlin.jvm.internal.L.f(text, attributedText2 != null ? attributedText2.getText() : null)) {
                    return false;
                }
                List<JO.m> list = bVar.f117236E;
                int size = list.size();
                List<JO.m> list2 = bVar2.f117236E;
                if (size != list2.size() || !kotlin.jvm.internal.L.f(list, list2) || !kotlin.jvm.internal.L.f(bVar.f117208d, bVar2.f117208d) || !kotlin.jvm.internal.L.f(bVar.f117209e, bVar2.f117209e) || !kotlin.jvm.internal.L.f(bVar.f117218n, bVar2.f117218n)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.C) && (aVar2 instanceof ParameterElement.C)) {
                ParameterElement.C c12 = (ParameterElement.C) aVar;
                ParameterElement.C c13 = (ParameterElement.C) aVar2;
                if (!kotlin.jvm.internal.L.f(c12.f117210f, c13.f117210f) || !kotlin.jvm.internal.L.f(c12.f117219o, c13.f117219o) || c12.f117216l != c13.f117216l) {
                    return false;
                }
                AttributedText attributedText3 = c12.f117211g;
                String text2 = attributedText3 != null ? attributedText3.getText() : null;
                AttributedText attributedText4 = c13.f117211g;
                if (!kotlin.jvm.internal.L.f(text2, attributedText4 != null ? attributedText4.getText() : null)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.v) && (aVar2 instanceof ParameterElement.v)) {
                ParameterElement.v vVar = (ParameterElement.v) aVar;
                ParameterElement.v vVar2 = (ParameterElement.v) aVar2;
                if (!kotlin.jvm.internal.L.f(vVar.f117544e, vVar2.f117544e) || !kotlin.jvm.internal.L.f(vVar.f117545f, vVar2.f117545f) || !kotlin.jvm.internal.L.f(vVar.f117555p, vVar2.f117555p)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.w) && (aVar2 instanceof ParameterElement.w)) {
                ParameterElement.w wVar = (ParameterElement.w) aVar;
                ParameterElement.w wVar2 = (ParameterElement.w) aVar2;
                if (!kotlin.jvm.internal.L.f(wVar.f117574j, wVar2.f117574j) || !kotlin.jvm.internal.L.f(wVar.f117577m, wVar2.f117577m)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.C29377e) && (aVar2 instanceof ParameterElement.C29377e)) {
                ParameterElement.C29377e c29377e = (ParameterElement.C29377e) aVar;
                ParameterElement.C29377e c29377e2 = (ParameterElement.C29377e) aVar2;
                if (!kotlin.jvm.internal.L.f(c29377e.f117408e, c29377e2.f117408e) || !kotlin.jvm.internal.L.f(c29377e.f117419p, c29377e2.f117419p)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.C29376d) && (aVar2 instanceof ParameterElement.C29376d)) {
                ParameterElement.C29376d c29376d = (ParameterElement.C29376d) aVar;
                ParameterElement.C29376d c29376d2 = (ParameterElement.C29376d) aVar2;
                if (!a(c29376d.f117401e, c29376d2.f117401e) || !a(c29376d.f117402f, c29376d2.f117402f)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.k) && (aVar2 instanceof ParameterElement.k)) {
                ParameterElement.k kVar = (ParameterElement.k) aVar;
                ParameterElement.k kVar2 = (ParameterElement.k) aVar2;
                if (!kotlin.jvm.internal.L.f(kVar.f117449d, kVar2.f117449d) || !kotlin.jvm.internal.L.f(kVar.f117450e, kVar2.f117450e) || !kotlin.jvm.internal.L.f(kVar.f117452g, kVar2.f117452g)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.y) && (aVar2 instanceof ParameterElement.y)) {
                ParameterElement.y yVar = (ParameterElement.y) aVar;
                ParameterElement.y yVar2 = (ParameterElement.y) aVar2;
                if (!kotlin.jvm.internal.L.f(yVar.f117605j, yVar2.f117605j) || yVar.f117602g != yVar2.f117602g) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.z) && (aVar2 instanceof ParameterElement.z)) {
                ParameterElement.z zVar = (ParameterElement.z) aVar;
                ParameterElement.z zVar2 = (ParameterElement.z) aVar2;
                if (!kotlin.jvm.internal.L.f(zVar.f117616j, zVar2.f117616j) || zVar.f117612f != zVar2.f117612f) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.I) && (aVar2 instanceof ParameterElement.I)) {
                ParameterElement.I i12 = (ParameterElement.I) aVar;
                ParameterElement.I i13 = (ParameterElement.I) aVar2;
                if (!kotlin.jvm.internal.L.f(i12.f117329j, i13.f117329j) || !kotlin.jvm.internal.L.f(i12.f117330k, i13.f117330k) || !kotlin.jvm.internal.L.f(i12.f117327h, i13.f117327h)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.C29379g) && (aVar2 instanceof ParameterElement.C29379g)) {
                ParameterElement.C29379g c29379g = (ParameterElement.C29379g) aVar;
                ParameterElement.C29379g c29379g2 = (ParameterElement.C29379g) aVar2;
                if (!kotlin.jvm.internal.L.f(c29379g.f117425e, c29379g2.f117425e) || !kotlin.jvm.internal.L.f(c29379g.f117432l, c29379g2.f117432l)) {
                    return false;
                }
            } else {
                if ((aVar instanceof CarBodyConditionItem) && (aVar2 instanceof CarBodyConditionItem)) {
                    return false;
                }
                if ((aVar instanceof ParameterElement.q) && (aVar2 instanceof ParameterElement.q)) {
                    return kotlin.jvm.internal.L.f(aVar, aVar2);
                }
                if ((aVar instanceof JO.a) && (aVar2 instanceof JO.a)) {
                    return false;
                }
                if ((aVar instanceof ParameterElement.J) && (aVar2 instanceof ParameterElement.J)) {
                    return kotlin.jvm.internal.L.f(aVar, aVar2);
                }
                if ((aVar instanceof ParameterElement.l) && (aVar2 instanceof ParameterElement.l)) {
                    ParameterElement.l lVar = (ParameterElement.l) aVar;
                    ParameterElement.l lVar2 = (ParameterElement.l) aVar2;
                    if (!kotlin.jvm.internal.L.f(lVar.f117458h, lVar2.f117458h) || !kotlin.jvm.internal.L.f(lVar.f117454d, lVar2.f117454d)) {
                        return false;
                    }
                } else {
                    if ((aVar instanceof ParameterElement.SelectorCardsCarousel) && (aVar2 instanceof ParameterElement.SelectorCardsCarousel)) {
                        return kotlin.jvm.internal.L.f(aVar, aVar2);
                    }
                    if ((aVar instanceof ParameterElement.t) && (aVar2 instanceof ParameterElement.t)) {
                        ParameterElement.t tVar = (ParameterElement.t) aVar;
                        ParameterElement.t tVar2 = (ParameterElement.t) aVar2;
                        if (!kotlin.jvm.internal.L.f(tVar.f117534e, tVar2.f117534e) || !kotlin.jvm.internal.L.f(tVar.f117541l, tVar2.f117541l)) {
                            return false;
                        }
                    } else {
                        if ((aVar instanceof JO.h) && (aVar2 instanceof JO.h)) {
                            return ((JO.h) aVar).b((JO.h) aVar2);
                        }
                        if ((aVar instanceof MandatoryVerificationAccountVerificationItem) && (aVar2 instanceof MandatoryVerificationAccountVerificationItem)) {
                            return kotlin.jvm.internal.L.f(aVar, aVar2);
                        }
                    }
                }
            }
        }
        return true;
    }
}
