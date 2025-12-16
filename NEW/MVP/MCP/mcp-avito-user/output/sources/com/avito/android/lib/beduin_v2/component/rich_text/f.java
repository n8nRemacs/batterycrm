package com.avito.android.lib.beduin_v2.component.rich_text;

import PK0.n;
import Y41.l;
import Y41.p;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.remote.model.text.OnClickListener;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.beduin.v2.avito.component.rich_text.state.m;
import com.avito.beduin.v2.avito.component.rich_text.state.o;
import com.avito.beduin.v2.avito.component.rich_text.state.q;
import com.avito.beduin.v2.avito.component.rich_text.state.v;
import com.avito.beduin.v2.avito.component.rich_text.state.x;
import com.avito.beduin.v2.avito.component.rich_text.state.y;
import com.avito.beduin.v2.avito.component.rich_text.state.z;
import com.avito.beduin.v2.avito.component.text.state.j;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.k;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RichTextConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/rich_text/f;", "Lcom/avito/android/lib/beduin_v2/component/rich_text/d;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_rich-text"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* compiled from: RichTextConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/text/Attribute;", "attribute", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/text/Attribute;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Attribute, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f175880l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f175880l = arrayList;
        }

        @Override // Y41.l
        public final G0 invoke(Attribute attribute) {
            this.f175880l.add(attribute);
            return G0.f406611a;
        }
    }

    /* compiled from: RichTextConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "key", "Lcom/avito/android/remote/model/text/OnClickListener;", "listener", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/OnClickListener;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, OnClickListener, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f175881l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LinkedHashMap linkedHashMap) {
            super(2);
            this.f175881l = linkedHashMap;
        }

        @Override // Y41.p
        public final G0 invoke(String str, OnClickListener onClickListener) {
            this.f175881l.put(str, onClickListener);
            return G0.f406611a;
        }
    }

    /* compiled from: RichTextConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "template", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f175882l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StringBuilder sb2) {
            super(1);
            this.f175882l = sb2;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f175882l.append(str);
            return G0.f406611a;
        }
    }

    @Inject
    public f() {
    }

    public static n b(com.avito.beduin.v2.theme.l lVar, n nVar, k kVar) {
        j jVar = lVar != null ? (j) lVar.a() : null;
        return jVar == null ? nVar : jVar.f335352b != null ? (n) D.a(lVar, kVar) : (n) D.b(lVar, kVar, nVar);
    }

    public static ArrayList c(o oVar, n nVar, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (oVar != null && oVar.f334947b) {
            arrayList.add(FontParameter.UnderlineParameter.INSTANCE);
        }
        if (oVar != null && oVar.f334948c) {
            arrayList.add(FontParameter.StrikethroughParameter.INSTANCE);
        }
        if (nVar != null) {
            arrayList.add(new FontParameter.TextStyleDataParameter(nVar));
        }
        if (z12 && nVar != null) {
            Integer num = nVar.f12993g;
            FontParameter.ColorParameter colorParameter = null;
            if (num != null) {
                int iIntValue = num.intValue();
                colorParameter = new FontParameter.ColorParameter(new Color(iIntValue), new Color(iIntValue), null);
            }
            if (colorParameter != null) {
                arrayList.add(colorParameter);
            }
        }
        return arrayList;
    }

    public static String d(Object obj) {
        return "{{" + obj + "}}";
    }

    @Override // com.avito.android.lib.beduin_v2.component.rich_text.d
    @Y61.k
    public final AttributedText a(@Y61.k q[] qVarArr, @Y61.l String str, @Y61.k k kVar, @Y61.k n nVar) {
        int i12;
        StringBuilder sb2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        int i13;
        Integer numA;
        Integer numA2;
        q[] qVarArr2 = qVarArr;
        int i14 = 1;
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        a aVar = new a(arrayList2);
        c cVar = new c(sb3);
        b bVar = new b(linkedHashMap2);
        int length = qVarArr2.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            q qVar = qVarArr2[i15];
            int i17 = i16 + 1;
            if (qVar instanceof x) {
                x xVar = (x) qVar;
                o oVar = xVar.f334970c;
                n nVarB = b(oVar != null ? oVar.f334946a : null, nVar, kVar);
                Y41.a<G0> aVar2 = xVar.f334969b;
                if (aVar2 != null) {
                    i12 = length;
                    bVar.invoke(String.valueOf(i16), new e(i14, aVar2));
                } else {
                    i12 = length;
                }
                ArrayList arrayListC = c(xVar.f334970c, nVarB, false);
                boolean zIsEmpty = arrayListC.isEmpty();
                String str2 = xVar.f334968a;
                FontAttribute fontAttribute = !zIsEmpty ? new FontAttribute(String.valueOf(i16), str2, arrayListC) : null;
                if (aVar2 != null && fontAttribute == null) {
                    aVar.invoke(new FontAttribute(String.valueOf(i16), str2, C42784z0.f406748b));
                    cVar.invoke(d(Integer.valueOf(i16)));
                } else if (fontAttribute != null) {
                    aVar.invoke(fontAttribute);
                    cVar.invoke(d(Integer.valueOf(i16)));
                } else {
                    cVar.invoke(str2);
                }
                i13 = i14;
                sb2 = sb3;
                arrayList = arrayList2;
                linkedHashMap = linkedHashMap2;
            } else {
                i12 = length;
                if (qVar instanceof y) {
                    y yVar = (y) qVar;
                    o oVar2 = yVar.f334975e;
                    n nVarB2 = b(oVar2 != null ? oVar2.f334946a : null, nVar, kVar);
                    int i18 = yVar.f334972b;
                    if (i18 > 0) {
                        String strG = AK.c.g(i16, "leftSpacer");
                        linkedHashMap = linkedHashMap2;
                        aVar.invoke(new SpacerAttribute(strG, "", null, Integer.valueOf(i18)));
                        cVar.invoke(d(strG));
                    } else {
                        linkedHashMap = linkedHashMap2;
                    }
                    String strValueOf = String.valueOf(i16);
                    String str3 = yVar.f334971a;
                    arrayList = arrayList2;
                    Object objD = kVar.f338363a.d(str3, str);
                    sb2 = sb3;
                    aVar.invoke(new TextIconAttribute(strValueOf, str3, objD instanceof Integer ? (Integer) objD : null, c(yVar.f334975e, nVarB2, false)));
                    cVar.invoke(d(Integer.valueOf(i16)));
                    int i19 = yVar.f334973c;
                    if (i19 > 0) {
                        String strG2 = AK.c.g(i16, "rightSpacer");
                        aVar.invoke(new SpacerAttribute(strG2, "", null, Integer.valueOf(i19)));
                        cVar.invoke(d(strG2));
                    }
                    Y41.a<G0> aVar3 = yVar.f334974d;
                    if (aVar3 != null) {
                        bVar.invoke(String.valueOf(i16), new e(0, aVar3));
                    }
                } else {
                    sb2 = sb3;
                    arrayList = arrayList2;
                    linkedHashMap = linkedHashMap2;
                    if (qVar instanceof z) {
                        z zVar = (z) qVar;
                        o oVar3 = zVar.f334978c;
                        aVar.invoke(new LinkAttribute(String.valueOf(i16), zVar.f334976a, zVar.f334977b, c(zVar.f334978c, b(oVar3 != null ? oVar3.f334946a : null, nVar, kVar), true)));
                        cVar.invoke(d(Integer.valueOf(i16)));
                    } else {
                        if (qVar instanceof v) {
                            v vVar = (v) qVar;
                            m mVar = vVar.f334967c;
                            n nVarB3 = b(mVar != null ? mVar.f334943a : null, nVar, kVar);
                            Y41.a<G0> aVar4 = vVar.f334966b;
                            if (aVar4 != null) {
                                bVar.invoke(String.valueOf(i16), new e(2, aVar4));
                            }
                            m mVar2 = vVar.f334967c;
                            Color color = (mVar2 == null || (numA2 = F.a(mVar2.f334944b, kVar, false)) == null) ? null : new Color(numA2.intValue());
                            aVar.invoke(new FontAttribute(String.valueOf(i16), vVar.f334965a, C42756l.B(new FontParameter[]{new FontParameter.TextStyleDataParameter(nVarB3), new FontParameter.Re23StrikethroughParameter(color, (mVar2 == null || (numA = F.a(mVar2.f334944b, kVar, true)) == null) ? color : new Color(numA.intValue()))})));
                            cVar.invoke(d(Integer.valueOf(i16)));
                        }
                        i13 = 1;
                        i15 += i13;
                        i14 = i13;
                        i16 = i17;
                        length = i12;
                        linkedHashMap2 = linkedHashMap;
                        arrayList2 = arrayList;
                        sb3 = sb2;
                        qVarArr2 = qVarArr;
                    }
                }
                i13 = 1;
            }
            i15 += i13;
            i14 = i13;
            i16 = i17;
            length = i12;
            linkedHashMap2 = linkedHashMap;
            arrayList2 = arrayList;
            sb3 = sb2;
            qVarArr2 = qVarArr;
        }
        AttributedText attributedText = new AttributedText(sb3.toString(), arrayList2, i14);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            attributedText.setOnClickListener((String) entry.getKey(), (OnClickListener) entry.getValue());
        }
        return attributedText;
    }
}
