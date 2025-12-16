package androidx.datastore.preferences.core;

import Y41.p;
import Y61.l;
import androidx.datastore.core.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/c;", "Landroidx/datastore/core/h;", "Landroidx/datastore/preferences/core/f;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class c implements androidx.datastore.core.h<f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f45562a;

    public c(@Y61.k o oVar) {
        this.f45562a = oVar;
    }

    @Override // androidx.datastore.core.h
    @l
    public final Object a(@Y61.k p pVar, @Y61.k ContinuationImpl continuationImpl) {
        return this.f45562a.a(new b(pVar, null), continuationImpl);
    }

    @Override // androidx.datastore.core.h
    @Y61.k
    public final InterfaceC43160i<f> getData() {
        return this.f45562a.f45440e;
    }
}
