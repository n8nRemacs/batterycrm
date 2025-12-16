package androidx.credentials.provider.utils;

import Y41.l;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f45298b;

    public /* synthetic */ b(int i12, l lVar) {
        this.f45297a = i12;
        this.f45298b = lVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f45297a) {
        }
        return ((Boolean) this.f45298b.invoke(obj)).booleanValue();
    }
}
