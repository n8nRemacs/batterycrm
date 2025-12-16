package com.avito.android.publish.params_suggest;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.R0;
import dl0.InterfaceC39749a;
import io.reactivex.rxjava3.core.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.Q;
import nl0.C44443b;
import nl0.C44444c;
import yc.C50213a;

/* compiled from: ParamsSuggestionsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/params_suggest/l;", "Lcom/avito/android/publish/params_suggest/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f238220a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f238221b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f238222c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f238223d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f238224e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f238225f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C50213a f238226g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.params_suggest.converter.a f238227h;

    @Inject
    public l(@Y61.k H0 h02, @Y61.k InterfaceC39749a interfaceC39749a, @Y61.k Q1 q12, @Y61.k R0 r02, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k C50213a c50213a, @Y61.k com.avito.android.publish.params_suggest.converter.a aVar) {
        this.f238220a = h02;
        this.f238221b = interfaceC39749a;
        this.f238222c = q12;
        this.f238223d = r02;
        this.f238224e = attributesTreeConverter;
        this.f238225f = categoryParametersConverter;
        this.f238226g = c50213a;
        this.f238227h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.publish.params_suggest.l r4, nl0.C44443b r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.publish.params_suggest.k
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.publish.params_suggest.k r0 = (com.avito.android.publish.params_suggest.k) r0
            int r1 = r0.f238219s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f238219s = r1
            goto L1b
        L16:
            com.avito.android.publish.params_suggest.k r0 = new com.avito.android.publish.params_suggest.k
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f238217q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f238219s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r6)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r6)
            r0.f238219s = r3
            dl0.a r4 = r4.f238221b
            java.lang.Object r6 = r4.n(r5, r0)
            if (r6 != r1) goto L42
            goto L87
        L42:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r4 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto L84
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r4 = r6.getResult()
            nl0.e r4 = (nl0.e) r4
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C42745f0.q(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L65:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r4.next()
            nl0.a r6 = (nl0.C44442a) r6
            com.avito.android.publish.params_suggest.d r0 = new com.avito.android.publish.params_suggest.d
            java.lang.String r1 = r6.getId()
            java.util.List r6 = r6.b()
            r0.<init>(r1, r6)
            r5.add(r0)
            goto L65
        L82:
            r1 = r5
            goto L87
        L84:
            kotlin.collections.z0 r4 = kotlin.collections.C42784z0.f406748b
            r1 = r4
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.params_suggest.l.b(com.avito.android.publish.params_suggest.l, nl0.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.publish.params_suggest.h
    @Y61.k
    public final I<List<d>> a(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters) {
        List<ParameterSlot> parametersExceptOwnedBySlots;
        List<ParameterSlot> parametersExceptOwnedBySlots2;
        String string;
        Q1 q12 = this.f238222c;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[82];
        boolean zBooleanValue = ((Boolean) q12.f67505p0.a().invoke()).booleanValue();
        C50213a c50213a = this.f238226g;
        AttributesTreeConverter attributesTreeConverter = this.f238224e;
        if (!zBooleanValue) {
            Map<String, String> mapConvertToFieldMap = this.f238225f.convertToFieldMap(navigation2);
            if (categoryParameters == null || (parametersExceptOwnedBySlots = categoryParameters.getParametersExceptOwnedBySlots()) == null) {
                parametersExceptOwnedBySlots = C42784z0.f406748b;
            }
            return this.f238220a.S(c50213a.b(), mapConvertToFieldMap, attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToParameterAttributesTree(parametersExceptOwnedBySlots))).r(i.f238213b);
        }
        if (categoryParameters == null || (parametersExceptOwnedBySlots2 = categoryParameters.getParametersExceptOwnedBySlots()) == null) {
            parametersExceptOwnedBySlots2 = C42784z0.f406748b;
        }
        List<AttributeNode> listConvertToParameterAttributesTree = attributesTreeConverter.convertToParameterAttributesTree(parametersExceptOwnedBySlots2);
        this.f238227h.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AttributeNode attributeNode : listConvertToParameterAttributesTree) {
            if (attributeNode instanceof AttributeNode.ListNode) {
                linkedHashMap.put(attributeNode.getId(), com.avito.android.publish.params_suggest.converter.a.a(((AttributeNode.ListNode) attributeNode).getValue()));
            } else if (attributeNode instanceof AttributeNode.StringNode) {
                linkedHashMap.put(attributeNode.getId(), ((AttributeNode.StringNode) attributeNode).getValue());
            }
        }
        List<Map<String, String>> attributes = navigation2.getAttributes();
        if (attributes == null) {
            attributes = C42784z0.f406748b;
        }
        List<Map<String, String>> list = attributes;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new C44444c((String) map.get("id"), (String) map.get("value")));
        }
        String strB = c50213a.b();
        Integer categoryId = navigation2.getCategoryId();
        if (categoryId == null || (string = categoryId.toString()) == null) {
            string = "";
        }
        return Q.a(this.f238223d.a(), new j(this, new C44443b(new nl0.d(arrayList, string), linkedHashMap, strB), null));
    }
}
