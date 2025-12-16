package net.bytebuddy.agent.builder;

import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: LambdaFactory.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class a {
    static {
        new ConcurrentHashMap();
    }

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
