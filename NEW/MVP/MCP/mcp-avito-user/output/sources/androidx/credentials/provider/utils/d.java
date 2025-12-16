package androidx.credentials.provider.utils;

import Y41.l;
import androidx.credentials.provider.C22864a;
import androidx.credentials.provider.C22865b;
import androidx.credentials.provider.p;
import androidx.credentials.provider.q;
import androidx.credentials.provider.utils.e;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f45304b;

    public /* synthetic */ d(int i12, l lVar) {
        this.f45303a = i12;
        this.f45304b = lVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f45303a) {
            case 0:
                return a.f(((e.a.C1768a) this.f45304b).invoke(obj));
            case 1:
                return (p) this.f45304b.invoke(obj);
            case 2:
                return (p) this.f45304b.invoke(obj);
            case 3:
                return (C22865b) this.f45304b.invoke(obj);
            case 4:
                return (q) this.f45304b.invoke(obj);
            case 5:
                return (q) this.f45304b.invoke(obj);
            case 6:
                return (C22864a) this.f45304b.invoke(obj);
            case 7:
                return (C22864a) this.f45304b.invoke(obj);
            default:
                return (C22865b) this.f45304b.invoke(obj);
        }
    }
}
