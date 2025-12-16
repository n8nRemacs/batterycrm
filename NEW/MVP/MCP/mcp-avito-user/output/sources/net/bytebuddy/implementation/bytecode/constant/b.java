package net.bytebuddy.implementation.bytecode.constant;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.s;

/* compiled from: SerializedConstant.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class b extends StackManipulation.a {
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        getClass().hashCode();
        throw null;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        try {
            net.bytebuddy.implementation.bytecode.b bVarG = net.bytebuddy.implementation.bytecode.b.g(TypeDescription.d.A0(ObjectInputStream.class));
            net.bytebuddy.implementation.bytecode.b bVarG2 = net.bytebuddy.implementation.bytecode.b.g(TypeDescription.d.A0(ByteArrayInputStream.class));
            c cVar = new c(null);
            c cVar2 = new c("ISO-8859-1");
            MethodInvocation.e eVarA = MethodInvocation.a(new a.c(String.class.getMethod("getBytes", String.class)));
            MethodInvocation.e eVarA2 = MethodInvocation.a(new a.b(ByteArrayInputStream.class.getConstructor(byte[].class)));
            MethodInvocation.e eVarA3 = MethodInvocation.a(new a.b(ObjectInputStream.class.getConstructor(InputStream.class)));
            MethodInvocation.e eVarA4 = MethodInvocation.a(new a.c(ObjectInputStream.class.getMethod("readObject", new Class[0])));
            Duplication duplication = Duplication.f417792d;
            return new StackManipulation.b(bVarG, duplication, bVarG2, duplication, cVar, cVar2, eVarA, eVarA2, eVarA3, eVarA4).n(sVar, context);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("Could not locate Java API method", e12);
        }
    }
}
