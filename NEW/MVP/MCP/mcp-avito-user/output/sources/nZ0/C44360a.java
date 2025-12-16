package nZ0;

/* compiled from: MiddleOutFallbackStrategy.java */
/* renamed from: nZ0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C44360a implements InterfaceC44363d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC44363d[] f415178a;

    /* renamed from: b, reason: collision with root package name */
    public final C44361b f415179b = new C44361b();

    public C44360a(InterfaceC44363d... interfaceC44363dArr) {
        this.f415178a = interfaceC44363dArr;
    }

    @Override // nZ0.InterfaceC44363d
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (InterfaceC44363d interfaceC44363d : this.f415178a) {
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = interfaceC44363d.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? this.f415179b.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
