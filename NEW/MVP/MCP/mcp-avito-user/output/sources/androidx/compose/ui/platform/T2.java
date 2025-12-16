package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.core.os.C22783k;
import com.avito.android.R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: WindowRecomposer.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f41277a = new LinkedHashMap();

    public static final kotlinx.coroutines.flow.n2 a(Context context) {
        kotlinx.coroutines.flow.n2 n2Var;
        LinkedHashMap linkedHashMap = f41277a;
        synchronized (linkedHashMap) {
            try {
                Object objU = linkedHashMap.get(context);
                if (objU == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C43108m c43108mA = kotlinx.coroutines.channels.A.a(-1, null, null, 6);
                    InterfaceC43160i interfaceC43160iG = C43175k.G(new R2(contentResolver, uriFor, new S2(c43108mA, C22783k.a(Looper.getMainLooper())), c43108mA, context, null));
                    CoroutineContext.Element elementB = kotlinx.coroutines.t1.b();
                    kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
                    objU = C43175k.U(interfaceC43160iG, new C43238h(CoroutineContext.Element.DefaultImpls.plus((kotlinx.coroutines.V0) elementB, kotlinx.coroutines.internal.K.f411877a)), i2.a.b(kotlinx.coroutines.flow.i2.f411430a, 0L, 3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objU);
                }
                n2Var = (kotlinx.coroutines.flow.n2) objU;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n2Var;
    }

    @Y61.l
    public static final androidx.compose.runtime.I b(@Y61.k View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.I) {
            return (androidx.compose.runtime.I) tag;
        }
        return null;
    }
}
