package net.bytebuddy.agent.builder;

import java.lang.instrument.ClassFileTransformer;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: ResettableClassFileTransformer.java */
/* loaded from: classes8.dex */
public interface b extends ClassFileTransformer {

    /* compiled from: ResettableClassFileTransformer.java */
    public static abstract class a implements b {
    }

    /* compiled from: ResettableClassFileTransformer.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.agent.builder.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC11907b extends a {
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
    }
}
