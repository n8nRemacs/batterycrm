package com.avito.android.publish;

import com.avito.android.remote.model.AIDescription;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AutoDescriptionInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/b;", "Lcom/avito/android/publish/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33540b implements InterfaceC33513a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.llm.data.a f232310b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H0 f232311c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232312d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f232313e;

    @Inject
    public C33540b(@Y61.k com.avito.android.llm.data.a aVar, @Y61.k com.avito.android.remote.H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k AttributesTreeConverter attributesTreeConverter) {
        this.f232310b = aVar;
        this.f232311c = h02;
        this.f232312d = interfaceC35745a5;
        this.f232313e = attributesTreeConverter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static Serializable a(AttributeNode attributeNode) {
        ?? value;
        if (attributeNode instanceof AttributeNode.ListNode) {
            List<AttributeNode> value2 = ((AttributeNode.ListNode) attributeNode).getValue();
            value = new ArrayList(C42745f0.q(value2, 10));
            Iterator it = value2.iterator();
            while (it.hasNext()) {
                value.add(a((AttributeNode) it.next()));
            }
        } else {
            if (!(attributeNode instanceof AttributeNode.StringNode)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((AttributeNode.StringNode) attributeNode).getValue();
        }
        return (Serializable) value;
    }

    @Override // com.avito.android.publish.InterfaceC33513a
    @Y61.l
    public final Object f(@Y61.l CategoryParameters categoryParameters, long j12, @Y61.k Continuation<? super TypedResult<String>> continuation) {
        List<ParameterSlot> parametersExceptOwnedBySlots;
        if (categoryParameters == null || (parametersExceptOwnedBySlots = categoryParameters.getParametersExceptOwnedBySlots()) == null) {
            parametersExceptOwnedBySlots = C42784z0.f406748b;
        }
        List<AttributeNode> listConvertToParameterAttributesTree = this.f232313e.convertToParameterAttributesTree(parametersExceptOwnedBySlots);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AttributeNode attributeNode : listConvertToParameterAttributesTree) {
            linkedHashMap.put(attributeNode.getId(), a(attributeNode));
        }
        return this.f232310b.a(j12, linkedHashMap, (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.publish.InterfaceC33513a
    @Y61.k
    public final io.reactivex.rxjava3.core.I<AIDescription> i(@Y61.l CategoryParameters categoryParameters, @Y61.l String str, @Y61.l String str2) {
        List<ParameterSlot> parametersExceptOwnedBySlots;
        if (categoryParameters == null || (parametersExceptOwnedBySlots = categoryParameters.getParametersExceptOwnedBySlots()) == null) {
            parametersExceptOwnedBySlots = C42784z0.f406748b;
        }
        AttributesTreeConverter attributesTreeConverter = this.f232313e;
        return g1.a(this.f232311c.l(attributesTreeConverter.convertToParameterFieldMap(attributesTreeConverter.convertToParameterAttributesTree(parametersExceptOwnedBySlots)), str, str2).z(this.f232312d.a()));
    }
}
