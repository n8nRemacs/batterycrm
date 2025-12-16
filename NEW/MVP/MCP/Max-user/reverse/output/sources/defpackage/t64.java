package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import one.me.android.OneMeApplication;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.Conversation;

/* loaded from: classes2.dex */
public final /* synthetic */ class t64 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ t64(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws InterruptedException {
        switch (this.a) {
            case 0:
                return (Conversation.State) this.b.get();
            case 1:
                AtomicReference atomicReference = this.b;
                rwa rwaVar = OneMeApplication.s0;
                long jNanoTime = System.nanoTime();
                final boolean zA = q5b.a((c0a) ((q5b) y4e.a.getAccessor().c(HttpStatus.SC_LOCKED)).a.getValue(), "loadChats");
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        int i = s65.d;
                        l6bVar.c(lg8Var, "InitialDataTask", "initialDataStorage().loadChats() by ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime, y65.NANOSECONDS))), null);
                    }
                }
                final int i2 = 1;
                atomicReference.getAndUpdate(new UnaryOperator() { // from class: pwa
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i3 = i2;
                        boolean z = true;
                        boolean z2 = zA;
                        Boolean bool = (Boolean) obj;
                        switch (i3) {
                            case 0:
                                rwa rwaVar2 = OneMeApplication.s0;
                                if (!bool.booleanValue() && !z2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            default:
                                rwa rwaVar3 = OneMeApplication.s0;
                                if (!bool.booleanValue() && !z2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                });
                return qqg.a;
            case 2:
                AtomicReference atomicReference2 = this.b;
                rwa rwaVar2 = OneMeApplication.s0;
                long jNanoTime2 = System.nanoTime();
                final boolean zA2 = q5b.a((m0a) ((q5b) y4e.a.getAccessor().c(HttpStatus.SC_LOCKED)).b.getValue(), "loadFolders");
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.d;
                    if (l6bVar2.b(lg8Var2)) {
                        int i3 = s65.d;
                        l6bVar2.c(lg8Var2, "InitialDataTask", "initialDataStorage().loadFolders() by ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime2, y65.NANOSECONDS))), null);
                    }
                }
                final int i4 = 0;
                atomicReference2.getAndUpdate(new UnaryOperator() { // from class: pwa
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i32 = i4;
                        boolean z = true;
                        boolean z2 = zA2;
                        Boolean bool = (Boolean) obj;
                        switch (i32) {
                            case 0:
                                rwa rwaVar22 = OneMeApplication.s0;
                                if (!bool.booleanValue() && !z2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            default:
                                rwa rwaVar3 = OneMeApplication.s0;
                                if (!bool.booleanValue() && !z2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                });
                return qqg.a;
            case 3:
                AtomicReference atomicReference3 = this.b;
                rwa rwaVar3 = OneMeApplication.s0;
                Boolean bool = (Boolean) atomicReference3.get();
                bool.booleanValue();
                return bool;
            default:
                py4 py4Var = (py4) this.b.getAndSet(cd5.a);
                if (py4Var != null) {
                    py4Var.dispose();
                }
                return qqg.a;
        }
    }
}
