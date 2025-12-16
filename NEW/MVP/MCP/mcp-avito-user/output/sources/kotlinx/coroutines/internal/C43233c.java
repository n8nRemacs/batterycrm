package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/internal/c;", "Lkotlinx/coroutines/internal/k;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.internal.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43233c extends AbstractC43241k {

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001¨\u0006\u0005"}, d2 = {"kotlinx/coroutines/internal/c$a", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.internal.c$a */
    public static final class a extends ClassValue<Y41.l<? super Throwable, ? extends Throwable>> {
        @Override // java.lang.ClassValue
        public final Y41.l<? super Throwable, ? extends Throwable> computeValue(Class cls) {
            return C43249t.a(cls);
        }
    }

    static {
        new C43233c();
        new a();
    }
}
