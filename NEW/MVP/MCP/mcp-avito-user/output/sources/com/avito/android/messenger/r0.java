package com.avito.android.messenger;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.InterfaceC43057n;

/* compiled from: TextToChunkConverterFixed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/n;", "it", "Lcom/avito/android/messenger/s;", "invoke", "(Lkotlin/text/n;)Lcom/avito/android/messenger/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r0 extends kotlin.jvm.internal.N implements Y41.l<InterfaceC43057n, C32564s> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f196935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f196936m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f196937n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String str, s0 s0Var, l0.f fVar) {
        super(1);
        this.f196935l = str;
        this.f196936m = s0Var;
        this.f196937n = fVar;
    }

    @Override // Y41.l
    public final C32564s invoke(InterfaceC43057n interfaceC43057n) {
        int i12;
        InterfaceC43057n interfaceC43057n2 = interfaceC43057n;
        String strSubstring = this.f196935l.substring(interfaceC43057n2.b().f406905b, interfaceC43057n2.b().f406906c + 1);
        s0 s0Var = this.f196936m;
        boolean z12 = s0Var.f196943c.e(strSubstring) && s0Var.f196942b.e(strSubstring);
        l0.f fVar = this.f196937n;
        if (z12) {
            int i13 = fVar.f406840b;
            i12 = i13 + 1;
            fVar.f406840b = i13 + 2;
        } else {
            i12 = fVar.f406840b;
        }
        return new C32564s(interfaceC43057n2.b().f406905b, interfaceC43057n2.b().f406906c, new C32571t(z12, i12));
    }
}
