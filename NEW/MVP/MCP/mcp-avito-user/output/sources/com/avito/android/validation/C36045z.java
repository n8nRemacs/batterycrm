package com.avito.android.validation;

import android.text.TextUtils;
import com.avito.android.Q1;
import com.avito.android.item_map.view.C31075l;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.VideoParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.V2;
import com.avito.android.validation.n1;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nf.InterfaceC44415a;

/* compiled from: ParametersListInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/z;", "Lcom/avito/android/validation/p;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36045z implements InterfaceC36026p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f319441a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f319442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m1 f319443c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f319444d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<ParametersTree, InterfaceC44415a> f319445e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g1 f319446f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q1 f319447g;

    /* renamed from: h, reason: collision with root package name */
    public ParametersTree f319448h;

    /* renamed from: i, reason: collision with root package name */
    public ParametersTree f319449i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC44415a f319450j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, String> f319451k = new HashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C36045z(@Y61.k d1 d1Var, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k m1 m1Var, @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k Y41.l<? super ParametersTree, ? extends InterfaceC44415a> lVar, @Y61.k g1 g1Var, @Y61.k Q1 q12) {
        this.f319441a = d1Var;
        this.f319442b = interfaceC35745a5;
        this.f319443c = m1Var;
        this.f319444d = interfaceC35945t1;
        this.f319445e = lVar;
        this.f319446f = g1Var;
        this.f319447g = q12;
    }

    public static final void i(C36045z c36045z, List list) {
        String str;
        c36045z.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n1 n1Var = (n1) it.next();
            boolean z12 = n1Var instanceof n1.a;
            HashMap<String, String> map = c36045z.f319451k;
            if (z12) {
                String str2 = map.get(n1Var.f319402a);
                n1.a aVar = (n1.a) n1Var;
                String str3 = aVar.f319404c;
                if (!kotlin.jvm.internal.L.f(str2, str3) && (str = aVar.f319405d) != null && str.length() != 0) {
                    ParametersTree parametersTree = c36045z.f319448h;
                    if (parametersTree == null) {
                        parametersTree = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ParameterSlot parameterSlot : parametersTree) {
                        ParameterSlot parameterSlot2 = parameterSlot;
                        if (!(parameterSlot2 instanceof EmailParameter) && !(parameterSlot2 instanceof PhoneParameter)) {
                            arrayList.add(parameterSlot);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ParameterSlot parameterSlot3 = (ParameterSlot) it2.next();
                        if (parameterSlot3 instanceof EditableParameter) {
                            String id2 = parameterSlot3.getId();
                            Object value = ((EditableParameter) parameterSlot3).getValue();
                            String string = value != null ? value.toString() : null;
                            if (string == null) {
                                string = "";
                            }
                            linkedHashMap.put(id2, string);
                        }
                    }
                    c36045z.f319443c.a(str, str3, linkedHashMap);
                }
                map.put(n1Var.f319402a, str3);
            } else if (n1Var instanceof n1.c ? true : n1Var instanceof n1.b) {
                map.put(n1Var.f319402a, null);
            }
        }
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    @Y61.k
    public final C42022u a(@Y61.k Set set) {
        ParametersTree parametersTree = this.f319448h;
        if (parametersTree == null) {
            parametersTree = null;
        }
        return io.reactivex.rxjava3.core.z.c0(parametersTree).U(new com.avito.android.blueprints.publish.reg_number.d(20, C36035u.f319424l)).k0(EditableParameter.class).d0(new com.avito.android.blueprints.publish.reg_number.d(21, new C36037v(set, this))).H0().k(new C31075l(22, new C36039w(this)));
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.B0 b() {
        ParametersTree parametersTree = this.f319448h;
        if (parametersTree == null) {
            parametersTree = null;
        }
        return io.reactivex.rxjava3.core.z.c0(parametersTree).j0(this.f319442b.f()).d0(new com.avito.android.blueprints.publish.reg_number.d(18, new r(this))).d0(new com.avito.android.blueprints.publish.reg_number.d(19, C36031s.f319416l));
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    public final void c(@Y61.k String str, boolean z12) {
        try {
            ParameterSlot parameterSlotL = l(str);
            if (parameterSlotL instanceof BooleanParameter) {
                ((BooleanParameter) parameterSlotL).setValue(Boolean.valueOf(z12));
            } else if (parameterSlotL instanceof SelectParameter) {
                SelectParameter selectParameter = (SelectParameter) parameterSlotL;
                int i12 = 1;
                if (!z12) {
                    i12 = 0;
                }
                selectParameter.setValue(String.valueOf(i12));
            }
        } catch (IllegalArgumentException e12) {
            V2.f318762a.b("Failed to apply value to parameter with id ".concat(str), e12);
        }
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W d(@Y61.k String str, @Y61.l com.avito.android.items.a aVar) {
        return m(str, new C36041x(this, str, aVar));
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    public final void e(@Y61.k String str, @Y61.l com.avito.android.items.a aVar) {
        j(str, aVar != null ? aVar.getF117481f() : null, aVar);
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    @Y61.k
    public final LinkedHashMap f(@Y61.k String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC44415a interfaceC44415a = this.f319450j;
        if (interfaceC44415a == null) {
            interfaceC44415a = null;
        }
        interfaceC44415a.a(new C36033t(this, linkedHashMap), str);
        return linkedHashMap;
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    public final void g(@Y61.k ParametersTree parametersTree, @Y61.l ParametersTree parametersTree2) {
        this.f319448h = parametersTree;
        if (parametersTree2 == null) {
            parametersTree2 = parametersTree;
        }
        this.f319449i = parametersTree2;
        this.f319450j = this.f319445e.invoke(parametersTree);
    }

    @Override // com.avito.android.validation.InterfaceC36026p
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W h(@Y61.k String str) {
        return m(str, null);
    }

    public final void j(String str, String str2, com.avito.android.items.a aVar) {
        ParameterSlot parameterSlotL = l(str);
        if (parameterSlotL instanceof CharParameter) {
            ((CharParameter) parameterSlotL).setValue(str2);
            return;
        }
        if (parameterSlotL instanceof EmailParameter) {
            ((EmailParameter) parameterSlotL).setValue(str2);
            return;
        }
        if (parameterSlotL instanceof PhoneParameter) {
            ((PhoneParameter) parameterSlotL).setValue(this.f319444d.a(str2));
            return;
        }
        if (parameterSlotL instanceof VideoParameter) {
            ((VideoParameter) parameterSlotL).setValue(str2);
            return;
        }
        Double dValueOf = null;
        dValueOf = null;
        try {
            if (parameterSlotL instanceof PriceParameter) {
                EditableParameter editableParameter = (EditableParameter) parameterSlotL;
                if (str2 == null || str2.length() == 0) {
                    editableParameter.setValue(null);
                    return;
                }
                if (!TextUtils.isDigitsOnly(str2)) {
                    str2 = ((PriceParameter) parameterSlotL).getValue();
                }
                editableParameter.setValue(str2);
                return;
            }
            if (parameterSlotL instanceof IntParameter) {
                EditableParameter editableParameter2 = (EditableParameter) parameterSlotL;
                if (str2 == null || str2.length() == 0) {
                    editableParameter2.setValue(null);
                    return;
                } else {
                    editableParameter2.setValue(Long.valueOf(Long.parseLong(str2)));
                    return;
                }
            }
            if (parameterSlotL instanceof NumericParameter) {
                EditableParameter editableParameter3 = (EditableParameter) parameterSlotL;
                if (str2 == null || str2.length() == 0) {
                    editableParameter3.setValue(null);
                    return;
                }
                if (aVar instanceof com.avito.android.items.d) {
                    com.avito.android.items.d dVar = (com.avito.android.items.d) aVar;
                    String f117481f = dVar.getF117481f();
                    if (f117481f != null && f117481f.length() != 0) {
                        MaskParameters maskParameters = dVar.getF117493r().f179302d;
                        Character chValueOf = maskParameters != null ? Character.valueOf(maskParameters.f179379j) : null;
                        if (chValueOf != null) {
                            f117481f = f117481f.replace(chValueOf.charValue(), '.');
                        }
                        dValueOf = Double.valueOf(Double.parseDouble(f117481f));
                    }
                } else {
                    dValueOf = Double.valueOf(Double.parseDouble(str2));
                }
                editableParameter3.setValue(dValueOf);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final EditableParameter<?> k(String str) {
        ParameterSlot parameterSlotL = l(str);
        if (parameterSlotL instanceof EditableParameter) {
            return (EditableParameter) parameterSlotL;
        }
        throw new NotFoundException(str, (Throwable) null, 2, (C42822w) null);
    }

    public final ParameterSlot l(String str) {
        ParametersTree parametersTree = this.f319448h;
        if (parametersTree == null) {
            parametersTree = null;
        }
        ParameterSlot parameterSlotFindParameter = parametersTree.findParameter(str);
        if (parameterSlotFindParameter != null) {
            return parameterSlotFindParameter;
        }
        throw new NotFoundException(str, (Throwable) null, 2, (C42822w) null);
    }

    public final io.reactivex.rxjava3.internal.operators.single.W m(final String str, final Y41.a aVar) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new Callable() { // from class: com.avito.android.validation.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                C36045z c36045z = this.f319411b;
                EditableParameter<?> editableParameterK = c36045z.k(str2);
                Y41.a aVar2 = aVar;
                if (aVar2 != null) {
                    ((C36041x) aVar2).invoke();
                }
                ParametersTree parametersTree = c36045z.f319449i;
                if (parametersTree == null) {
                    parametersTree = null;
                }
                return c36045z.f319441a.b(editableParameterK, parametersTree);
            }
        }).k(new C31075l(21, new C36043y(this))).z(this.f319442b.f());
    }
}
