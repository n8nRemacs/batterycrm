package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42991p;
import kotlin.reflect.jvm.internal.impl.types.O;
import u51.InterfaceC48806h;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes8.dex */
public abstract class i extends AbstractC42991p {

    /* compiled from: KotlinTypeRefiner.kt */
    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f410099a = new a();

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42991p
        public final O a(InterfaceC48806h interfaceC48806h) {
            return (O) interfaceC48806h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.i
        @Y61.k
        public final Collection<O> b(@Y61.k InterfaceC42851d interfaceC42851d) {
            return interfaceC42851d.l().C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.i
        @Y61.k
        public final O c(@Y61.k InterfaceC48806h interfaceC48806h) {
            return (O) interfaceC48806h;
        }
    }

    @Y61.k
    public abstract Collection<O> b(@Y61.k InterfaceC42851d interfaceC42851d);

    @Y61.k
    public abstract O c(@Y61.k InterfaceC48806h interfaceC48806h);
}
