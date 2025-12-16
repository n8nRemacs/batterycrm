package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.RawParams;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RawParamsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/RawParamsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/RawParams;", "<init>", "()V", "Lcom/google/gson/i;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/g;", "context", "deserialize", "(Lcom/google/gson/i;Ljava/lang/reflect/Type;Lcom/google/gson/g;)Lcom/avito/android/remote/model/RawParams;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RawParamsDeserializer implements h<RawParams> {
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.h
    @k
    public RawParams deserialize(@k i json, @l Type typeOfT, @l g context) {
        if (json instanceof m) {
            m mVarJ = json.j();
            Serializable serializable = mVarJ.f362195b;
            return serializable instanceof Boolean ? new RawParams.BooleanRawParams(mVarJ.d()) : serializable instanceof String ? new RawParams.StringRawParams(mVarJ.s()) : RawParams.UnknownRawParams.INSTANCE;
        }
        if (!(json instanceof f)) {
            return RawParams.UnknownRawParams.INSTANCE;
        }
        f fVarH = json.h();
        boolean z12 = fVarH instanceof Collection;
        ArrayList arrayList = fVarH.f362000b;
        if (!z12 || !((Collection) fVarH).isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                iVar.getClass();
                if (!(iVar instanceof m) || !(iVar.j().f362195b instanceof String)) {
                    return RawParams.UnknownRawParams.INSTANCE;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(fVarH, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((i) it2.next()).s());
        }
        return new RawParams.StringListRawParams(arrayList2);
    }
}
