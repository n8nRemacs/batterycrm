package r51;

import Y61.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ExtensionReceiver.java */
/* loaded from: classes8.dex */
public class d extends AbstractC47495a implements g {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC42871o f429618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k O o12, @l h hVar) {
        super(o12, hVar);
        if (o12 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f429618c = (AbstractC42871o) interfaceC42848a;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f429618c + "}";
    }
}
