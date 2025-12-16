package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.InterfaceC43057n;

/* compiled from: HandwritingGesture.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/n;", "it", "", "invoke", "(Lkotlin/text/n;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<InterfaceC43057n, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f30983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f30984m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(l0.f fVar, l0.f fVar2) {
        super(1);
        this.f30983l = fVar;
        this.f30984m = fVar2;
    }

    @Override // Y41.l
    public final CharSequence invoke(InterfaceC43057n interfaceC43057n) {
        InterfaceC43057n interfaceC43057n2 = interfaceC43057n;
        l0.f fVar = this.f30983l;
        if (fVar.f406840b == -1) {
            fVar.f406840b = interfaceC43057n2.b().f406905b;
        }
        this.f30984m.f406840b = interfaceC43057n2.b().f406906c + 1;
        return "";
    }
}
