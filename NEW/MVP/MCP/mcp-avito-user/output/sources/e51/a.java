package E51;

import android.annotation.SuppressLint;
import com.avito.android.remote.model.ProfileTab;
import java.lang.instrument.ClassFileTransformer;
import kotlin.Metadata;
import kotlin.Z;
import kotlinx.coroutines.debug.internal.i;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AgentPremain.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LE51/a;", "", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({ProfileTab.ALL})
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: AgentPremain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE51/a$a;", "Ljava/lang/instrument/ClassFileTransformer;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E51.a$a, reason: collision with other inner class name */
    public static final class C0215a implements ClassFileTransformer {
        static {
            new C0215a();
        }
    }

    static {
        Object bVar;
        new a();
        try {
            int i12 = Z.f406624c;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            bVar = property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (((Boolean) (bVar instanceof Z.b ? null : bVar)) != null) {
            return;
        }
        i.f411072a.getClass();
    }
}
