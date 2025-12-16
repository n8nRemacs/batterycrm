package com.avito.android.validation;

import com.avito.android.validation.l1;
import com.avito.android.validation.n1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u000624\u0010\u0005\u001a0\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0017\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00040\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/validation/n1;", "kotlin.jvm.PlatformType", "", "Lj41/e;", "warningsOnFlowAndErrors", "Lcom/avito/android/validation/l1$b;", "invoke", "(Ljava/util/List;)Lcom/avito/android/validation/l1$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class E0 extends kotlin.jvm.internal.N implements Y41.l<List<n1>, l1.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(Y0 y02) {
        super(1);
        this.f319253l = y02;
    }

    @Override // Y41.l
    public final l1.b invoke(List<n1> list) {
        List<n1> list2 = list;
        if (list2.isEmpty()) {
            return new l1.b.a();
        }
        this.f319253l.getClass();
        List<n1> list3 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (obj instanceof n1.a.b) {
                arrayList.add(obj);
            }
        }
        boolean z12 = !arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof n1.a.e) {
                arrayList2.add(obj2);
            }
        }
        boolean z13 = !arrayList2.isEmpty();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof n1.a.b) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list3) {
            if (obj4 instanceof n1.a.e) {
                arrayList4.add(obj4);
            }
        }
        return new l1.b.C9896b(C42745f0.h0(arrayList4, arrayList3), z12, z13);
    }
}
