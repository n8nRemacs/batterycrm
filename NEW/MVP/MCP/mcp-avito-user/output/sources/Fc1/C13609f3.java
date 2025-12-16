package Fc1;

import Fc1.AbstractC13717r4;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;

/* renamed from: Fc1.f3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13609f3 implements kotlin.properties.h<AbstractC13717r4, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Object> f5502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC13717r4.c f5503c;

    public C13609f3(InterfaceC22204y1 interfaceC22204y1, AbstractC13717r4.c cVar) {
        this.f5502b = interfaceC22204y1;
        this.f5503c = cVar;
    }

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, kotlin.reflect.n nVar) {
        throw null;
    }

    @Override // kotlin.properties.h
    public final void setValue(AbstractC13717r4 abstractC13717r4, kotlin.reflect.n nVar, Object obj) {
        AbstractC13717r4.c cVar = this.f5503c;
        if (cVar != null) {
            cVar.invoke(obj);
        }
        ((C22082i3) this.f5502b).setValue(obj);
    }
}
