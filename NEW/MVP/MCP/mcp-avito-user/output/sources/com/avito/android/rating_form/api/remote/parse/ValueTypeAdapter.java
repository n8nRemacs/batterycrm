package com.avito.android.rating_form.api.remote.parse;

import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.C34328m0;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ValueTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/api/remote/parse/ValueTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ValueTypeAdapter implements h<RatingFormField.ValueType> {
    @Override // com.google.gson.h
    public final RatingFormField.ValueType deserialize(i iVar, Type type, g gVar) {
        Object bVar;
        Object bVar2;
        Object bVar3;
        Object bVar4;
        boolean z12 = iVar instanceof m;
        if (z12) {
            m mVar = (m) iVar;
            if (mVar.f362195b instanceof Number) {
                return new RatingFormField.ValueType.LongValue(mVar.l());
            }
        }
        if (z12) {
            m mVar2 = (m) iVar;
            if (mVar2.f362195b instanceof String) {
                return new RatingFormField.ValueType.StringValue(mVar2.s());
            }
        }
        if (iVar instanceof f) {
            i iVar2 = (i) C42745f0.F(iVar.h());
            if (iVar2 == null) {
                return new RatingFormField.ValueType.IntArrayValue(C42784z0.f406748b);
            }
            try {
                int i12 = Z.f406624c;
                bVar = C34328m0.b(iVar2);
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (bVar instanceof Z.b) {
                bVar = null;
            }
            if (bVar != null) {
                f fVarH = iVar.h();
                ArrayList arrayList = new ArrayList();
                Iterator it = fVarH.f362000b.iterator();
                while (it.hasNext()) {
                    i iVar3 = (i) it.next();
                    try {
                        int i14 = Z.f406624c;
                        bVar4 = C34328m0.b(iVar3);
                    } catch (Throwable th3) {
                        int i15 = Z.f406624c;
                        bVar4 = new Z.b(th3);
                    }
                    if (bVar4 instanceof Z.b) {
                        bVar4 = null;
                    }
                    Integer num = (Integer) bVar4;
                    if (num != null) {
                        arrayList.add(num);
                    }
                }
                return new RatingFormField.ValueType.IntArrayValue(arrayList);
            }
            try {
                bVar2 = C34328m0.e(iVar2);
            } catch (Throwable th4) {
                int i16 = Z.f406624c;
                bVar2 = new Z.b(th4);
            }
            if (bVar2 instanceof Z.b) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                f fVarH2 = iVar.h();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = fVarH2.f362000b.iterator();
                while (it2.hasNext()) {
                    i iVar4 = (i) it2.next();
                    try {
                        int i17 = Z.f406624c;
                        bVar3 = C34328m0.e(iVar4);
                    } catch (Throwable th5) {
                        int i18 = Z.f406624c;
                        bVar3 = new Z.b(th5);
                    }
                    if (bVar3 instanceof Z.b) {
                        bVar3 = null;
                    }
                    String str = (String) bVar3;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                return new RatingFormField.ValueType.StringArrayValue(arrayList2);
            }
        }
        return null;
    }
}
