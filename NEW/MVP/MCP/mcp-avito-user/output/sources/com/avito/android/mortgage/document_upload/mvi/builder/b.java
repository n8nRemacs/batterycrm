package com.avito.android.mortgage.document_upload.mvi.builder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.RemoteFile;
import com.avito.android.mortgage.api.model.RemoteValidFile;
import d00.C39479c;
import d00.d;
import e00.C39840a;
import f00.C40196c;
import f00.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentsViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/builder/b;", "Lcom/avito/android/mortgage/document_upload/mvi/builder/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.document_upload.mvi.builder.a
    @k
    public final C40196c a(@k C40196c c40196c) {
        Set<String> set;
        d aVar;
        C39840a c39840a;
        if (!c40196c.f395545e || c40196c.f395544d) {
            List<RemoteValidFile> list = c40196c.f395543c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                set = c40196c.f395558r;
                if (!zHasNext) {
                    break;
                }
                RemoteValidFile remoteValidFile = (RemoteValidFile) it.next();
                arrayList.add(new C39840a(remoteValidFile.getId(), null, remoteValidFile.getName(), remoteValidFile.c(), L.f(remoteValidFile.getIsValid(), Boolean.FALSE), null, set.contains(remoteValidFile.getId()), 2, null));
            }
            List<C39479c> list2 = c40196c.f395542b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (true) {
                Float fValueOf = null;
                if (it2.hasNext()) {
                    C39479c c39479c = (C39479c) it2.next();
                    d00.d dVar = c39479c.f393607d;
                    boolean z12 = dVar instanceof d.b;
                    long j12 = c39479c.f393604a;
                    if (z12) {
                        RemoteFile remoteFile = ((d.b) dVar).f393610a;
                        c39840a = new C39840a(remoteFile.getId(), String.valueOf(j12), remoteFile.getName(), remoteFile.getSizeInBytes(), false, null, set.contains(remoteFile.getId()));
                    } else {
                        String strValueOf = String.valueOf(j12);
                        d00.d dVar2 = c39479c.f393607d;
                        boolean z13 = dVar2 instanceof d.a;
                        if (!z13 && !(dVar2 instanceof d.b)) {
                            if (dVar2 instanceof d.c) {
                                fValueOf = Float.valueOf(((d.c) dVar2).f393611a);
                            } else {
                                if (!dVar2.equals(d.C11004d.f393612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fValueOf = Float.valueOf(0.0f);
                            }
                        }
                        c39840a = new C39840a(null, strValueOf, c39479c.f393605b, c39479c.f393606c, z13, fValueOf, false, 1, null);
                    }
                    arrayList2.add(c39840a);
                } else {
                    ArrayList arrayListH0 = C42745f0.h0(arrayList2, arrayList);
                    for (Object obj : arrayListH0) {
                        C39840a c39840a2 = (C39840a) obj;
                        if (c39840a2.f394247e || c39840a2.f394248f != null || c39840a2.f394249g) {
                            fValueOf = obj;
                            break;
                        }
                    }
                    aVar = new d.a(arrayListH0, c40196c.f395544d, c40196c.f395546f, c40196c.f395547g, c40196c.f395548h, c40196c.f395549i, c40196c.f395550j, c40196c.f395551k, fValueOf == null && !arrayListH0.isEmpty(), c40196c.f395560t);
                }
            }
        } else {
            aVar = new d.c(c40196c.f395546f, c40196c.f395547g, c40196c.f395548h);
        }
        return C40196c.a(c40196c, null, null, false, false, null, null, aVar, 1048575);
    }
}
