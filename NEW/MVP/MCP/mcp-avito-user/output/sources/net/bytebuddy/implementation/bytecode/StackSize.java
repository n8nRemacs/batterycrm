package net.bytebuddy.implementation.bytecode;

import java.util.Collection;
import java.util.Iterator;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes7.dex */
public enum StackSize {
    ZERO(0),
    SINGLE(1),
    DOUBLE(2);


    /* renamed from: b, reason: collision with root package name */
    public final int f417839b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f417840a;

        static {
            int[] iArr = new int[StackSize.values().length];
            f417840a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f417840a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f417840a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    StackSize(int i12) {
        this.f417839b = i12;
    }

    public static int a(Collection<? extends TypeDefinition> collection) {
        Iterator<? extends TypeDefinition> it = collection.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            i12 += it.next().p().f417839b;
        }
        return i12;
    }

    public final StackManipulation.d b() {
        return new StackManipulation.d(this.f417839b * (-1), 0);
    }

    public final StackManipulation.d c() {
        int i12 = this.f417839b;
        return new StackManipulation.d(i12, i12);
    }
}
