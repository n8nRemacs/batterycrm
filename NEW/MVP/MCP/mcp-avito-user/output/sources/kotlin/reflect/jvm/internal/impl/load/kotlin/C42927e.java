package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42927e implements z.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC42926d<Object, AbstractC42926d.a<Object>> f408466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList<Object> f408467b;

    public C42927e(AbstractC42926d<Object, AbstractC42926d.a<Object>> abstractC42926d, ArrayList<Object> arrayList) {
        this.f408466a = abstractC42926d;
        this.f408467b = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.c
    @Y61.l
    public final z.a b(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b bVar2) {
        return this.f408466a.t(bVar, bVar2, this.f408467b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.c
    public final void a() {
    }
}
