package com.avito.android.publish.drafts;

import be0.C25640c;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PublishDraftRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PhotoParameter;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/category_parameters/PhotoParameter;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f235429b;

    public y(x xVar) {
        this.f235429b = xVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhotoParameter photoParameter = (PhotoParameter) obj;
        x xVar = this.f235429b;
        C33842h c33842hA = xVar.f235417b.a();
        if (c33842hA == null) {
            return C41823n.f402260b;
        }
        if (!c33842hA.f235380f) {
            return C41823n.f402260b;
        }
        AttributeNode attributeNode = (AttributeNode) C42745f0.E(xVar.f235419d.convertToParameterAttributesTree(Collections.singletonList(photoParameter)));
        List<AttributeNode> list = c33842hA.f235383i;
        if (list.contains(attributeNode)) {
            return C41823n.f402260b;
        }
        ArrayList arrayList = new ArrayList(list);
        C42745f0.l0(new B(attributeNode), arrayList);
        arrayList.add(attributeNode);
        C33842h c33842hA2 = C33842h.a(c33842hA, 0, null, arrayList, 16127);
        C25640c c25640c = xVar.f235417b;
        synchronized (c25640c) {
            c25640c.f57314a.putString(c33842hA2.f235376b, c25640c.f57315b.l(c33842hA2));
            c25640c.b(c33842hA2);
        }
        return new io.reactivex.rxjava3.internal.operators.completable.v(g1.a(xVar.f(c33842hA2, Boolean.FALSE)));
    }
}
