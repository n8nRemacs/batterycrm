package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import k51.InterfaceC42520e;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC42894f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42898j extends AbstractC42894f implements InterfaceC42520e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object[] f407859c;

    public C42898j(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Object[] objArr) {
        super(fVar, null);
        this.f407859c = objArr;
    }

    @Override // k51.InterfaceC42520e
    @Y61.k
    public final ArrayList a() {
        Object[] objArr = this.f407859c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC42894f.f407856b.getClass();
            arrayList.add(AbstractC42894f.a.a(obj, null));
        }
        return arrayList;
    }
}
