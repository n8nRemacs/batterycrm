package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collections;
import kotlin.collections.B0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42868l;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes8.dex */
final class f extends N implements Y41.a<C42868l> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f407266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.p f407267m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        super(0);
        this.f407266l = eVar;
        this.f407267m = pVar;
    }

    @Override // Y41.a
    public final C42868l invoke() {
        e eVar = this.f407266l;
        Y41.l<E, InterfaceC42882k> lVar = eVar.f407263b;
        E e12 = eVar.f407262a;
        C42868l c42868l = new C42868l(lVar.invoke(e12), e.f407260g, Modality.f407442f, ClassKind.f407414c, Collections.singletonList(e12.m().e()), b0.f407539a, this.f407267m);
        c42868l.F0(new a(this.f407267m, c42868l), B0.f406639b, null);
        return c42868l;
    }
}
