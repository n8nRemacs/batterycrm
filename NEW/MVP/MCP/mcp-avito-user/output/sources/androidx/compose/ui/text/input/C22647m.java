package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: EditProcessor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/k;", "it", "", "invoke", "(Landroidx/compose/ui/text/input/k;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.text.input.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22647m extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22645k, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22645k f42454l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22648n f42455m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22647m(InterfaceC22645k interfaceC22645k, C22648n c22648n) {
        super(1);
        this.f42454l = interfaceC22645k;
        this.f42455m = c22648n;
    }

    @Override // Y41.l
    public final CharSequence invoke(InterfaceC22645k interfaceC22645k) {
        String strConcat;
        InterfaceC22645k interfaceC22645k2 = interfaceC22645k;
        StringBuilder sbR = androidx.compose.foundation.H.r(this.f42454l == interfaceC22645k2 ? " > " : "   ");
        this.f42455m.getClass();
        if (interfaceC22645k2 instanceof C22636b) {
            StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
            C22636b c22636b = (C22636b) interfaceC22645k2;
            sb2.append(c22636b.f42413a.f42127c.length());
            sb2.append(", newCursorPosition=");
            strConcat = androidx.appcompat.app.r.t(sb2, c22636b.f42414b, ')');
        } else if (interfaceC22645k2 instanceof U) {
            StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
            U u12 = (U) interfaceC22645k2;
            sb3.append(u12.f42377a.f42127c.length());
            sb3.append(", newCursorPosition=");
            strConcat = androidx.appcompat.app.r.t(sb3, u12.f42378b, ')');
        } else if ((interfaceC22645k2 instanceof T) || (interfaceC22645k2 instanceof C22643i) || (interfaceC22645k2 instanceof C22644j) || (interfaceC22645k2 instanceof V)) {
            strConcat = interfaceC22645k2.toString();
        } else if (interfaceC22645k2 instanceof C22651q) {
            ((C22651q) interfaceC22645k2).getClass();
            strConcat = "FinishComposingTextCommand()";
        } else if (interfaceC22645k2 instanceof C22635a) {
            ((C22635a) interfaceC22645k2).getClass();
            strConcat = "BackspaceCommand()";
        } else if (interfaceC22645k2 instanceof E) {
            ((E) interfaceC22645k2).getClass();
            strConcat = "MoveCursorCommand(amount=0)";
        } else if (interfaceC22645k2 instanceof C22642h) {
            ((C22642h) interfaceC22645k2).getClass();
            strConcat = "DeleteAllCommand()";
        } else {
            String strL0 = m0.f406844a.b(interfaceC22645k2.getClass()).l0();
            if (strL0 == null) {
                strL0 = "{anonymous EditCommand}";
            }
            strConcat = "Unknown EditCommand: ".concat(strL0);
        }
        sbR.append(strConcat);
        return sbR.toString();
    }
}
