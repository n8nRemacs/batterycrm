package defpackage;

/* loaded from: classes.dex */
public final class bf3 extends u08 implements em6 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf3(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(xc0.h(new StringBuilder("Collection doesn't contain element at index "), this.a, '.'));
    }
}
