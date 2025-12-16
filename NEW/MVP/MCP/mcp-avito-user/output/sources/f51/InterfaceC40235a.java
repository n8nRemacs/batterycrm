package f51;

import Y61.k;
import java.util.Collection;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: AdditionalClassPartsProvider.kt */
/* renamed from: f51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC40235a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: f51.a$a, reason: collision with other inner class name */
    public static final class C11125a implements InterfaceC40235a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11125a f395657a = new C11125a();

        @Override // f51.InterfaceC40235a
        @k
        public final Collection<a0> a(@k f fVar, @k InterfaceC42851d interfaceC42851d) {
            return C42784z0.f406748b;
        }

        @Override // f51.InterfaceC40235a
        @k
        public final Collection<InterfaceC42850c> c(@k InterfaceC42851d interfaceC42851d) {
            return C42784z0.f406748b;
        }

        @Override // f51.InterfaceC40235a
        @k
        public final Collection<O> d(@k InterfaceC42851d interfaceC42851d) {
            return C42784z0.f406748b;
        }

        @Override // f51.InterfaceC40235a
        @k
        public final Collection<f> e(@k InterfaceC42851d interfaceC42851d) {
            return C42784z0.f406748b;
        }
    }

    @k
    Collection<a0> a(@k f fVar, @k InterfaceC42851d interfaceC42851d);

    @k
    Collection<InterfaceC42850c> c(@k InterfaceC42851d interfaceC42851d);

    @k
    Collection<O> d(@k InterfaceC42851d interfaceC42851d);

    @k
    Collection<f> e(@k InterfaceC42851d interfaceC42851d);
}
