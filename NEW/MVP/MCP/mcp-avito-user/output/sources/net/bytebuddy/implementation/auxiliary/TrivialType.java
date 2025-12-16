package net.bytebuddy.implementation.auxiliary;

import com.yandex.div2.D8;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.utility.g;

/* loaded from: classes7.dex */
public enum TrivialType implements a {
    SIGNATURE_RELEVANT(true),
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f417553b;

    TrivialType(boolean z12) {
        this.f417553b = z12;
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final String c() {
        return g.a(name().hashCode());
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        List listEmptyList;
        ByteBuddy byteBuddyD = new ByteBuddy(classFileVersion).d();
        MethodGraph.Empty empty = MethodGraph.Empty.f416900b;
        LatentMatcher.f fVar = byteBuddyD.f415279i;
        net.bytebuddy.dynamic.scaffold.subclass.a aVarB = new ByteBuddy(byteBuddyD.f415271a, byteBuddyD.f415272b, byteBuddyD.f415273c, byteBuddyD.f415274d, byteBuddyD.f415275e, byteBuddyD.f415276f, empty, byteBuddyD.f415278h, byteBuddyD.f415280j, byteBuddyD.f415281k, byteBuddyD.f415282l, fVar).b(Object.class, ConstructorStrategy.Default.f417163b);
        if (this.f417553b) {
            TypeDescription typeDescriptionA0 = TypeDescription.d.A0(a.b.class);
            if (!typeDescriptionA0.X()) {
                throw new IllegalArgumentException(D8.o("Not an annotation type: ", typeDescriptionA0));
            }
            listEmptyList = Collections.singletonList(new AnnotationDescription.f(typeDescriptionA0, Collections.emptyMap()));
        } else {
            listEmptyList = Collections.emptyList();
        }
        return ((a.InterfaceC12009a.AbstractC12010a.AbstractC12011a) aVarB.j(listEmptyList)).L(str).y(a.f417587J2).p();
    }
}
