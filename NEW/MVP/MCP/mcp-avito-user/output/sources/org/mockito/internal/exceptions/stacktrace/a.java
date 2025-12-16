package org.mockito.internal.exceptions.stacktrace;

import java.io.Serializable;
import java.util.ArrayList;
import org.mockito.internal.configuration.f;

/* compiled from: ConditionalStackTraceFilter.java */
/* loaded from: classes7.dex */
public class a implements Serializable {
    private static final long serialVersionUID = -8085849703510292641L;

    /* renamed from: b, reason: collision with root package name */
    public final f f421635b = new f();

    /* renamed from: c, reason: collision with root package name */
    public final d f421636c = new d();

    public final void a(Throwable th2) {
        if (this.f421635b.b()) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            this.f421636c.getClass();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (d.f421637b.a(stackTraceElement)) {
                    arrayList.add(stackTraceElement);
                }
            }
            th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
        }
    }
}
