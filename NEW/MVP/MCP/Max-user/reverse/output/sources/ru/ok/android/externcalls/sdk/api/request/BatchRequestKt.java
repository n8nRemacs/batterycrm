package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.cm0;
import defpackage.dm0;
import defpackage.lm;
import defpackage.mm;
import defpackage.sa9;
import defpackage.we3;
import defpackage.yl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0000\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0001\u0010\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lyl;", "Ldm0;", "toBatchRequest", "(Ljava/util/List;)Lyl;", "R", "T", "requests", "parseBatchResponse", "(Ldm0;Ljava/util/List;)Ljava/util/List;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BatchRequestKt {
    public static final <R extends yl, T> List<T> parseBatchResponse(dm0 dm0Var, List<? extends R> list) {
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            yl ylVar = (yl) it.next();
            for (sa9 sa9Var : dm0Var.a) {
                if (sa9Var.b == ylVar) {
                    Object obj = sa9Var.a;
                    if (obj instanceof mm) {
                        obj = null;
                    }
                    arrayList.add(obj);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return arrayList;
    }

    public static final yl toBatchRequest(List<? extends yl> list) {
        Uri uri = cm0.c;
        ArrayList arrayList = new ArrayList();
        for (yl ylVar : list) {
            arrayList.add(new lm(ylVar, ylVar));
        }
        return new cm0((lm[]) arrayList.toArray(new lm[0]));
    }
}
