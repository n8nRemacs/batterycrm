package org.koin.core.instance;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.C49177a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;

/* compiled from: InstanceFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lorg/koin/core/instance/e;", "T", "", "Lorg/koin/mp/Lockable;", "a", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final org.koin.core.definition.a<T> f421460a;

    /* compiled from: InstanceFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/koin/core/instance/e$a;", "", "<init>", "()V", "", "ERROR_SEPARATOR", "Ljava/lang/String;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public e(@k org.koin.core.definition.a<T> aVar) {
        this.f421460a = aVar;
    }

    public T a(@k d dVar) throws InstanceCreationException {
        StringBuilder sb2 = new StringBuilder("| (+) '");
        org.koin.core.definition.a<T> aVar = this.f421460a;
        sb2.append(aVar);
        sb2.append('\'');
        String string = sb2.toString();
        Level level = Level.f421465b;
        AbstractC48011b abstractC48011b = dVar.f421457a;
        if (abstractC48011b.b(level)) {
            abstractC48011b.a(level, string);
        }
        try {
            C49177a c49177a = dVar.f421459c;
            if (c49177a == null) {
                c49177a = new C49177a(null, null, 3, null);
            }
            return aVar.f421449d.invoke(dVar.f421458b, c49177a);
        } catch (Exception e12) {
            org.koin.mp.d.f421487a.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e12);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = e12.getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (C43066x.q(stackTraceElement.getClassName(), "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb3.append(C42745f0.O(arrayList, "\n\t", null, null, null, 62));
            String str = "* Instance creation error : could not create instance for '" + aVar + "': " + sb3.toString();
            Level level2 = Level.f421468e;
            if (abstractC48011b.b(level2)) {
                abstractC48011b.a(level2, str);
            }
            throw new InstanceCreationException("Could not create instance for '" + aVar + '\'', e12);
        }
    }

    public abstract T b(@k d dVar);

    public final boolean equals(@l Object obj) {
        e eVar = obj instanceof e ? (e) obj : null;
        return L.f(this.f421460a, eVar != null ? eVar.f421460a : null);
    }

    public final int hashCode() {
        return this.f421460a.hashCode();
    }
}
