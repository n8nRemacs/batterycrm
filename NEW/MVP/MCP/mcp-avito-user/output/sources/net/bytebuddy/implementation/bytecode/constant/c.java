package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* compiled from: TextConstant.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class c extends StackManipulation.a {

    /* renamed from: b, reason: collision with root package name */
    public final String f418031b;

    public c(String str) {
        this.f418031b = str;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418031b.equals(((c) obj).f418031b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418031b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.t(this.f418031b);
        return StackSize.SINGLE.c();
    }
}
