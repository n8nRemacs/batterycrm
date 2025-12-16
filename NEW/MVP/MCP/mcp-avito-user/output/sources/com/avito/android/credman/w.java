package com.avito.android.credman;

import com.avito.android.credman.o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CredmanSaver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credman/w;", "Lcom/avito/android/credman/o;", "<init>", "()V", "_avito_credman_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements o {
    @Inject
    public w() {
    }

    @Override // com.avito.android.credman.o
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k String str2, @Y61.k ContinuationImpl continuationImpl) {
        return new o.a.C3826a(null, new CredmanDisabledException());
    }
}
