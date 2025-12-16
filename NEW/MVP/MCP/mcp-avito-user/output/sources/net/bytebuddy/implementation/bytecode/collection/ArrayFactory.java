package net.bytebuddy.implementation.bytecode.collection;

import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.jar.asm.s;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class ArrayFactory implements net.bytebuddy.implementation.bytecode.collection.a {

    /* renamed from: a, reason: collision with root package name */
    public final TypeDescription.Generic f417941a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayCreator f417942b;

    /* renamed from: c, reason: collision with root package name */
    @HashCodeAndEqualsPlugin.ValueHandling
    public final StackManipulation.d f417943c;

    public interface ArrayCreator extends StackManipulation {

        /* renamed from: N2, reason: collision with root package name */
        public static final StackManipulation.d f417944N2 = StackSize.ZERO.b();

        public enum ForPrimitiveType implements ArrayCreator {
            BOOLEAN(4, 84),
            BYTE(8, 84),
            SHORT(9, 86),
            CHARACTER(5, 85),
            INTEGER(10, 79),
            LONG(11, 80),
            FLOAT(6, 81),
            DOUBLE(7, 82);


            /* renamed from: b, reason: collision with root package name */
            public final int f417954b;

            /* renamed from: c, reason: collision with root package name */
            public final int f417955c;

            ForPrimitiveType(int i12, int i13) {
                this.f417954b = i12;
                this.f417955c = i13;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return true;
            }

            @Override // net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public final int m() {
                return this.f417955c;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.o(188, this.f417954b);
                return ArrayCreator.f417944N2;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a extends StackManipulation.a implements ArrayCreator {

            /* renamed from: b, reason: collision with root package name */
            public final String f417956b;

            public a(TypeDescription typeDescription) {
                this.f417956b = typeDescription.V();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417956b.equals(((a) obj).f417956b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f417956b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public final int m() {
                return 83;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                sVar.I(189, this.f417956b);
                return ArrayCreator.f417944N2;
            }
        }

        int m();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class a implements StackManipulation {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends StackManipulation> f417957b;

        public a(List<? extends StackManipulation> list) {
            this.f417957b = list;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f417957b.equals(aVar.f417957b) && ArrayFactory.this.equals(ArrayFactory.this);
        }

        public final int hashCode() {
            return ArrayFactory.this.hashCode() + H.e(getClass().hashCode() * 31, 31, this.f417957b);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            Iterator<? extends StackManipulation> it = this.f417957b.iterator();
            while (it.hasNext()) {
                if (!it.next().isValid()) {
                    return false;
                }
            }
            return ArrayFactory.this.f417942b.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            List<? extends StackManipulation> list = this.f417957b;
            StackManipulation.d dVarN = IntegerConstant.c(list.size()).n(sVar, context);
            ArrayFactory arrayFactory = ArrayFactory.this;
            ArrayCreator arrayCreator = arrayFactory.f417942b;
            StackManipulation.d dVarA = dVarN.a(arrayCreator.n(sVar, context));
            int i12 = 0;
            for (StackManipulation stackManipulation : list) {
                sVar.m(89);
                StackManipulation.d dVarA2 = dVarA.a(StackSize.SINGLE.c()).a(IntegerConstant.c(i12).n(sVar, context)).a(stackManipulation.n(sVar, context));
                sVar.m(arrayCreator.m());
                dVarA = dVarA2.a(arrayFactory.f417943c);
                i12++;
            }
            return dVarA;
        }
    }

    public ArrayFactory(TypeDescription.Generic generic, ArrayCreator arrayCreator) {
        this.f417941a = generic;
        this.f417942b = arrayCreator;
        this.f417943c = StackSize.DOUBLE.b().a(generic.p().b());
    }

    public static ArrayFactory a(TypeDescription.Generic generic) {
        ArrayCreator aVar;
        if (!generic.w5()) {
            aVar = new ArrayCreator.a(generic.f5());
        } else if (generic.Q2(Boolean.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.BOOLEAN;
        } else if (generic.Q2(Byte.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.BYTE;
        } else if (generic.Q2(Short.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.SHORT;
        } else if (generic.Q2(Character.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.CHARACTER;
        } else if (generic.Q2(Integer.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.INTEGER;
        } else if (generic.Q2(Long.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.LONG;
        } else if (generic.Q2(Float.TYPE)) {
            aVar = ArrayCreator.ForPrimitiveType.FLOAT;
        } else {
            if (!generic.Q2(Double.TYPE)) {
                throw new IllegalArgumentException("Cannot create array of type " + generic);
            }
            aVar = ArrayCreator.ForPrimitiveType.DOUBLE;
        }
        return new ArrayFactory(generic, aVar);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrayFactory arrayFactory = (ArrayFactory) obj;
        return this.f417941a.equals(arrayFactory.f417941a) && this.f417942b.equals(arrayFactory.f417942b);
    }

    public final int hashCode() {
        return this.f417942b.hashCode() + D8.i(this.f417941a, getClass().hashCode() * 31, 31);
    }
}
